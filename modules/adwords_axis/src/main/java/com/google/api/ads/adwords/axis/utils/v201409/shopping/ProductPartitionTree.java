// Copyright 2014 Google Inc. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.api.ads.adwords.axis.utils.v201409.shopping;

import com.google.api.ads.adwords.axis.factory.AdWordsServices;
import com.google.api.ads.adwords.axis.utils.v201409.SelectorBuilder;
import com.google.api.ads.adwords.axis.utils.v201409.shopping.ProductPartitionNodeDiffer.NodeDifference;
import com.google.api.ads.adwords.axis.v201409.cm.AdGroup;
import com.google.api.ads.adwords.axis.v201409.cm.AdGroupCriterion;
import com.google.api.ads.adwords.axis.v201409.cm.AdGroupCriterionOperation;
import com.google.api.ads.adwords.axis.v201409.cm.AdGroupCriterionPage;
import com.google.api.ads.adwords.axis.v201409.cm.AdGroupCriterionServiceInterface;
import com.google.api.ads.adwords.axis.v201409.cm.AdGroupPage;
import com.google.api.ads.adwords.axis.v201409.cm.AdGroupServiceInterface;
import com.google.api.ads.adwords.axis.v201409.cm.ApiException;
import com.google.api.ads.adwords.axis.v201409.cm.BidSource;
import com.google.api.ads.adwords.axis.v201409.cm.BiddableAdGroupCriterion;
import com.google.api.ads.adwords.axis.v201409.cm.BiddingStrategyConfiguration;
import com.google.api.ads.adwords.axis.v201409.cm.Bids;
import com.google.api.ads.adwords.axis.v201409.cm.CpcBid;
import com.google.api.ads.adwords.axis.v201409.cm.Money;
import com.google.api.ads.adwords.axis.v201409.cm.Operator;
import com.google.api.ads.adwords.axis.v201409.cm.ProductDimension;
import com.google.api.ads.adwords.axis.v201409.cm.ProductPartition;
import com.google.api.ads.adwords.axis.v201409.cm.ProductPartitionType;
import com.google.api.ads.adwords.axis.v201409.cm.Selector;
import com.google.api.ads.adwords.axis.v201409.cm.UserStatus;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.adwords.lib.selectorfields.v201409.cm.AdGroupCriterionField;
import com.google.api.ads.adwords.lib.selectorfields.v201409.cm.AdGroupField;
import com.google.common.base.Function;
import com.google.common.base.Functions;
import com.google.common.base.Preconditions;
import com.google.common.collect.AbstractSequentialIterator;
import com.google.common.collect.Collections2;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import com.google.common.collect.LinkedListMultimap;
import com.google.common.collect.ListMultimap;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.rmi.RemoteException;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.annotation.Nullable;

/**
 * A ProductPartitionTree is a container for a root {@link ProductPartitionNode} that also handles
 * applying changes made to the tree under the root.
 *
 * @author Josh Radcliff
 */
public class ProductPartitionTree {

  /** A generator for temporary (negative) product partition IDs. */
  private final Iterator<Long> idGenerator;

  /** The ID of the {@link AdGroup} of this tree. */
  private final long adGroupId;

  private final BiddingStrategyConfiguration biddingStrategyConfig;

  /** The root node of this tree. */
  private final ProductPartitionNode root;

  /**
   * The <em>original</em> root node of this tree. This will be null if this tree's ad group
   * originally contained no nodes, e.g., the ad group was created via the API. Otherwise, it will
   * be a deep copy of the ad group's original root node.
   *
   * <p>This root will be used to detect changes made to the tree under {@code root}. See
   * {@link #createMutateOperationPairs()}.
   */
  private final ProductPartitionNode originalRoot;

  private final Comparator<ProductDimension> dimensionComparator;

  /**
   * The page size to use when retrieving ad group criteria.
   */
  private static final int PAGE_SIZE = 100;

  /**
   * Required fields for any {@link Selector} used to fetch {@link AdGroupCriterion} objects used by
   * an instance of this class.
   */
  public static final List<AdGroupCriterionField> REQUIRED_SELECTOR_FIELD_ENUMS = ImmutableList.of(
      AdGroupCriterionField.AdGroupId,
      AdGroupCriterionField.Id,
      AdGroupCriterionField.ParentCriterionId,
      AdGroupCriterionField.PartitionType,
      AdGroupCriterionField.CriteriaType,
      AdGroupCriterionField.CaseValue,
      AdGroupCriterionField.CpcBid,
      AdGroupCriterionField.CpcBidSource,
      AdGroupCriterionField.Status);

  /**
   * Required fields for any {@link Selector} used to fetch {@link AdGroupCriterion} objects used by
   * an instance of this class.
   *
   * @deprecated Use the {@code REQUIRED_SELECTOR_FIELD_ENUMS} instead.
   */
  @Deprecated
  public static final List<String> REQUIRED_SELECTOR_FIELDS = ImmutableList.copyOf(
      Collections2.transform(REQUIRED_SELECTOR_FIELD_ENUMS, Functions.toStringFunction()));

  /**
   * Constructor that initializes the temp ID generator based on the ID of the root node.
   *
   * @param adGroupId the ID of the ad group
   * @param biddingStrategyConfig the bidding strategy configuration of the ad group
   * @param rootNode the root node of the tree
   */
  private ProductPartitionTree(long adGroupId, BiddingStrategyConfiguration biddingStrategyConfig,
      ProductPartitionNode rootNode) {
    this.adGroupId = adGroupId;
    this.biddingStrategyConfig =
        Preconditions.checkNotNull(biddingStrategyConfig, "Null bidding strategy configuration");
    this.root = Preconditions.checkNotNull(rootNode, "Null root node");

    long startingTempId;
    this.dimensionComparator = new ProductDimensionComparator();
    if (this.root.getProductPartitionId() < 0L) {
      // The root has a temporary ID, so all changes made to this tree should result in ADD
      // operations.
      originalRoot = null;
      startingTempId = -1L;
    } else {
      // Set originalRoot to a deep copy of the root node.
      originalRoot =
          new ProductPartitionNode(null, root.getDimension(), root.getProductPartitionId(),
              this.dimensionComparator);
      long minimumId = cloneChildrenToNewParent(originalRoot, root.getChildren(),
          originalRoot.getProductPartitionId());
      // The starting temp ID should be -1 if all nodes are non-temporary (have positive IDs),
      // else start at one less than the lowest ID found in the tree.
      startingTempId = minimumId >= 0L ? -1L : minimumId - 1L;
    }
    this.idGenerator = new AbstractSequentialIterator<Long>(startingTempId) {
      @Override
      protected Long computeNext(Long previous) {
        return Long.MIN_VALUE == previous.longValue() ? null : previous - 1;
      }
    };
  }

  /**
   * Deeply clones each child in {@code children} and attaches it to {@code newParent}.
   *
   * @param newParent the new parent to which the cloned children will be added
   * @param children the children to clone
   * @param minimumId the minimum ID to compare to - may be null
   *
   * @return the minimum product partition ID found within the subtrees under {@code children}
   */
  private static long cloneChildrenToNewParent(ProductPartitionNode newParent,
      Iterable<ProductPartitionNode> children, final Long minimumId) {
    long updatedMinimumId = minimumId == null ? Long.MAX_VALUE : minimumId;
    for (ProductPartitionNode childNode : children) {
      newParent.asSubdivision();
      // Clone the child and add it to newParent's collection of children.
      ProductPartitionNode newChild = newParent.addChild(childNode.getDimension());
      newChild = ProductPartitionNode.copyProperties(childNode, newChild);
      updatedMinimumId =
          Math.min(updatedMinimumId, newChild.getProductPartitionId() == null ? Long.MAX_VALUE
              : newChild.getProductPartitionId());
      // Recursively clone the child's children.
      updatedMinimumId =
          cloneChildrenToNewParent(newChild, childNode.getChildren(), updatedMinimumId);
    }
    return updatedMinimumId;
  }

  /**
   * Returns a new instance of this class by retrieving the product partitions of the
   * specified ad group. All parameters are required.
   */
  public static ProductPartitionTree createAdGroupTree(AdWordsServices services,
      AdWordsSession session, Long adGroupId) throws ApiException, RemoteException {
    // Get the AdGroupCriterionService.
    AdGroupCriterionServiceInterface criterionService =
        services.get(session, AdGroupCriterionServiceInterface.class);

    SelectorBuilder selectorBuilder = new SelectorBuilder()
        .fields(REQUIRED_SELECTOR_FIELD_ENUMS.toArray(
            new AdGroupCriterionField[REQUIRED_SELECTOR_FIELD_ENUMS.size()]))
        .equals(AdGroupCriterionField.AdGroupId, adGroupId.toString())
        .equals(AdGroupCriterionField.CriteriaType, "PRODUCT_PARTITION")
        .in(
            AdGroupCriterionField.Status,
            UserStatus.ENABLED.getValue(),
            UserStatus.PAUSED.getValue())
        .limit(PAGE_SIZE);

    AdGroupCriterionPage adGroupCriterionPage;

    // A multimap from each product partition ID to its direct children.
    ListMultimap<Long, AdGroupCriterion> parentIdMap = LinkedListMultimap.create();
    int offset = 0;
    do {
      // Get the next page of results.
      adGroupCriterionPage = criterionService.get(selectorBuilder.build());

      if (adGroupCriterionPage != null && adGroupCriterionPage.getEntries() != null) {
        for (AdGroupCriterion adGroupCriterion : adGroupCriterionPage.getEntries()) {
          ProductPartition partition = (ProductPartition) adGroupCriterion.getCriterion();
          parentIdMap.put(partition.getParentCriterionId(), adGroupCriterion);
        }
        offset += adGroupCriterionPage.getEntries().length;
        selectorBuilder.increaseOffsetBy(offset);
      }
    } while (offset < adGroupCriterionPage.getTotalNumEntries());

    // Construct the ProductPartitionTree from the parentIdMap.
    if (!parentIdMap.containsKey(null)) {
      Preconditions.checkState(parentIdMap.isEmpty(),
          "No root criterion found in the tree but the tree is not empty");
      return createEmptyAdGroupTree(adGroupId,
          getAdGroupBiddingStrategyConfiguration(services, session, adGroupId));
    }

    return createNonEmptyAdGroupTree(adGroupId, parentIdMap);
  }

  /**
   * Returns a new instance of this class based on the collection of ad group criteria provided.
   * <p>NOTE: If retrieving existing criteria for use with this method, you must include all of the
   * fields in {@link #REQUIRED_SELECTOR_FIELDS} in your {@link Selector}.
   *
   * @param adGroupId the ID of the ad group
   * @param biddingStrategyConfig the {@link BiddingStrategyConfiguration} for the ad group
   * @param adGroupCriteria the non-null (but possibly empty) list of ad group criteria
   *
   * @throws NullPointerException if any argument is null, any element in {@code adGroupCriteria} is
   *         null, or any required field from {@link #REQUIRED_SELECTOR_FIELDS} is missing from an
   *         element in {@code adGroupCriteria}
   * @throws IllegalArgumentException if {@code adGroupCriteria} does not include the root criterion
   *         of the product partition tree
   */
  public static ProductPartitionTree createAdGroupTree(Long adGroupId,
      BiddingStrategyConfiguration biddingStrategyConfig, List<AdGroupCriterion> adGroupCriteria) {
    Preconditions.checkNotNull(adGroupId, "Null ad group ID");
    Preconditions.checkNotNull(biddingStrategyConfig, "Null bidding strategy configuration");
    Preconditions.checkNotNull(adGroupCriteria, "Null criteria list");
    if (adGroupCriteria.isEmpty()) {
      return createEmptyAdGroupTree(adGroupId, biddingStrategyConfig);
    }

    ListMultimap<Long, AdGroupCriterion> parentIdMap = LinkedListMultimap.create();
    for (AdGroupCriterion adGroupCriterion : adGroupCriteria) {
      Preconditions.checkNotNull(adGroupCriterion.getCriterion(),
          "AdGroupCriterion has a null criterion");
      if (adGroupCriterion instanceof BiddableAdGroupCriterion) {
        BiddableAdGroupCriterion biddableCriterion = (BiddableAdGroupCriterion) adGroupCriterion;
        Preconditions.checkNotNull(biddableCriterion.getUserStatus(),
            "User status is null for criterion ID %s", biddableCriterion.getCriterion().getId());
        if (UserStatus.REMOVED.equals(biddableCriterion.getUserStatus())) {
          // Skip REMOVED criteria.
          continue;
        }
      }
      if (adGroupCriterion.getCriterion() instanceof ProductPartition) {
        ProductPartition partition = (ProductPartition) adGroupCriterion.getCriterion();
        parentIdMap.put(partition.getParentCriterionId(), adGroupCriterion);
      }
    }

    return createNonEmptyAdGroupTree(adGroupId, parentIdMap);
  }

  /**
   * Returns a new tree based on a non-empty collection of ad group criteria. All parameters
   * required.
   *
   * @param adGroupId the ID of the ad group
   * @param parentIdMap the multimap from parent product partition ID to child criteria
   * @return a new ProductPartitionTree
   */
  private static ProductPartitionTree createNonEmptyAdGroupTree(Long adGroupId,
      ListMultimap<Long, AdGroupCriterion> parentIdMap) {
    Preconditions.checkNotNull(adGroupId, "Null ad group ID");
    Preconditions.checkArgument(!parentIdMap.isEmpty(),
        "parentIdMap passed for ad group ID %s is empty", adGroupId);
    Preconditions.checkArgument(parentIdMap.containsKey(null),
        "No root criterion found in the list of ad group criteria for ad group ID %s", adGroupId);

    AdGroupCriterion rootCriterion = Iterables.getOnlyElement(parentIdMap.get(null));

    Preconditions.checkState(rootCriterion instanceof BiddableAdGroupCriterion,
        "Root criterion for ad group ID %s is not a BiddableAdGroupCriterion", adGroupId);
    BiddableAdGroupCriterion biddableRootCriterion = (BiddableAdGroupCriterion) rootCriterion;

    BiddingStrategyConfiguration biddingStrategyConfig =
        biddableRootCriterion.getBiddingStrategyConfiguration();
    Preconditions.checkState(biddingStrategyConfig != null,
        "Null bidding strategy config on the root node of ad group ID %s", adGroupId);
    ProductPartitionNode rootNode = new ProductPartitionNode(null, (ProductDimension) null,
        rootCriterion.getCriterion().getId(), new ProductDimensionComparator());

    // Set the root's bid if a bid exists on the BiddableAdGroupCriterion.
    Money rootNodeBid = getBid(biddableRootCriterion);
    if (rootNodeBid != null) {
      rootNode = rootNode.asBiddableUnit().setBid(rootNodeBid.getMicroAmount());
    }

    addChildNodes(rootNode, parentIdMap);

    return new ProductPartitionTree(adGroupId, biddingStrategyConfig, rootNode);
  }

  /**
   * Returns a new empty tree.
   *
   * @param adGroupId the ID of the ad group
   * @param biddingStrategyConfig the bidding strategy configuration of the ad group
   */
  private static ProductPartitionTree createEmptyAdGroupTree(Long adGroupId,
      BiddingStrategyConfiguration biddingStrategyConfig) {
    Preconditions.checkNotNull(adGroupId, "Null ad group ID");
    Preconditions.checkNotNull(biddingStrategyConfig, "Null bidding strategy configuration");
    ProductPartitionNode rootNode =
        new ProductPartitionNode(null, null, -1L, new ProductDimensionComparator());
    return new ProductPartitionTree(adGroupId, biddingStrategyConfig, rootNode);
  }

  /**
   * Returns the ID of the ad group for this tree.
   */
  public Long getAdGroupId() {
    return adGroupId;
  }

  /**
   * Returns the root node of this tree. This <em>will not be null</em>.
   */
  public ProductPartitionNode getRoot() {
    return root;
  }

  @Override
  public String toString() {
    return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
        .append("adGroupId", adGroupId)
        .append("biddingStrategyConfig", biddingStrategyConfig)
        .append("originalRoot is empty", originalRoot == null)
        // Add a newline before the root so that the tree levels all line up.
        .append("root", String.format("%n%s", root.toDetailedString()))
        .toString();
  }

  /**
   * Returns the {@code AdGroupCriterionOperation}s that will apply the changes made to this tree.
   */
  public List<AdGroupCriterionOperation> getMutateOperations() {
    return Lists.transform(createMutateOperationPairs(),
        new Function<OperationPair, AdGroupCriterionOperation>() {
          @Override
          public AdGroupCriterionOperation apply(OperationPair input) {
            return input.operation;
          }
        });
  }

  /**
   * Creates and returns the pairs of node/operation that will apply the changes made to this tree.
   */
  private List<OperationPair> createMutateOperationPairs() {
    List<OperationPair> ops = Lists.newArrayList();

    if (originalRoot == null) {
      // The original tree was empty, so treat all nodes in this tree as ADDs.
      return createAddOperations(root);
    }

    // Add the mutate operations required to apply changes to the root node.
    Set<ProductDimension> dimensionsToProcess = addMutateOperations(originalRoot, root, ops);

    // Add additional mutate operations for the remaining child dimensions to process.
    addMutateOperationsByParent(originalRoot, root, dimensionsToProcess, ops);
    return ops;
  }

  /**
   * Adds to the operations list all operations required to mutate the children of
   * {@code originalParentNode} to {@code newParentNode}.
   *
   * @param originalParentNode required - must not be null
   * @param newParentNode required - must not be null
   * @param childDimensionsToProcess the child dimensions to process
   * @param ops the operations list to add to
   */
  private void addMutateOperationsByParent(ProductPartitionNode originalParentNode,
      ProductPartitionNode newParentNode, Set<ProductDimension> childDimensionsToProcess,
      List<OperationPair> ops) {
    for (ProductDimension dimensionToProcess : childDimensionsToProcess) {
      ProductPartitionNode originalChild = originalParentNode.hasChild(dimensionToProcess)
              ? originalParentNode.getChild(dimensionToProcess)
              : null;
      ProductPartitionNode newChild = newParentNode.hasChild(dimensionToProcess)
              ? newParentNode.getChild(dimensionToProcess)
              : null;
      Set<ProductDimension> grandchildDimensionsToProcess =
          addMutateOperations(originalChild, newChild, ops);
      if (!grandchildDimensionsToProcess.isEmpty()) {
        // Logic check - the only condition where further processing of children is required
        // is when the parent exists in both trees. If the parent is null in one tree but
        // not the other, then the node for dimensionToProcess was either:
        // 1) removed from the original OR
        // 2) added to the new tree
        // In both cases, the call to addMutateOperations above will have already added all of the
        // necessary operations to handle the node and all of its children.
        Preconditions.checkState(originalChild != null,
            "Original child should not be null if there are children to process");
        Preconditions.checkState(newChild != null,
            "New child should not be null if there are children to process");
        addMutateOperationsByParent(originalChild, newChild, grandchildDimensionsToProcess, ops);
      }
    }
  }

  /**
   * Adds to the operations list all operations required to mutate {@code originalNode} to the state
   * of {@code newNode}.
   *
   * <p>The returned set of child product dimensions will only <em>potentially</em> be non-empty if
   * both {@code originalNode != null} and {@code newNode != null}.
   *
   * @param originalNode may be null
   * @param newNode may be null
   * @param ops the operations list to add to
   *
   * @return the set of child product dimensions that require further processing
   */
  private Set<ProductDimension> addMutateOperations(@Nullable ProductPartitionNode originalNode,
      @Nullable ProductPartitionNode newNode, List<OperationPair> ops) {
    Set<ProductDimension> childDimensionsToProcess =
        Sets.newTreeSet(dimensionComparator);

    NodeDifference nodeDifference =
        ProductPartitionNodeDiffer.diff(originalNode, newNode, dimensionComparator);
    boolean isProcessChildren;
    switch (nodeDifference) {
      case NEW_NODE:
        ops.addAll(createAddOperations(newNode));
        // No need to further process children. The ADD operations above will include operations
        // for all children of newNode.
        isProcessChildren = false;
        break;
      case REMOVED_NODE:
        ops.add(createRemoveOperation(originalNode));
        // No need to further process children. The REMOVE operation above will perform a
        // cascading delete of all children of newNode.
        isProcessChildren = false;
        break;
      case PARTITION_TYPE_CHANGE:
      case EXCLUDED_UNIT_CHANGE:
        ops.add(createRemoveOperation(originalNode));
        ops.addAll(createAddOperations(newNode));
        // No need to further process children. The ADD operations above will include operations
        // for all children of newNode.
        isProcessChildren = false;
        break;
      case BID_CHANGE:
        // Ensure that the new node has the proper ID (this may have been lost if the node
        // was removed and then re-added).
        newNode = newNode.setProductPartitionId(originalNode.getProductPartitionId());
        ops.add(createSetBidOperation(newNode));
        // Process the children of newNode. The SET operation above will only handle changes
        // made to newNode, not its children.
        isProcessChildren = true;
        break;
      case NONE:
        // Ensure that the new node has the proper ID (this may have been lost if the node
        // was removed and then re-added).
        newNode = newNode.setProductPartitionId(originalNode.getProductPartitionId());
        // This node does not have changes, but its children may.
        isProcessChildren = true;
        break;
      default:
        throw new IllegalStateException("Unrecognized difference: " + nodeDifference);
    }

    if (isProcessChildren) {
      for (ProductPartitionNode childNode :
          Iterables.concat(originalNode.getChildren(), newNode.getChildren())) {
        childDimensionsToProcess.add(childNode.getDimension());
      }
    }

    return childDimensionsToProcess;
  }


  /**
   * Returns a SET operation for the specified node.
   */
  private OperationPair createSetBidOperation(ProductPartitionNode node) {
    Preconditions.checkNotNull(node.getProductPartitionId(),
        "Node for SET operation has no partition ID: %s", node);
    Preconditions.checkArgument(node.getProductPartitionId().longValue() >= 0L,
        "Node for SET operation has a negative partition ID: %s", node);
    AdGroupCriterionOperation setOp = new AdGroupCriterionOperation();
    setOp.setOperator(Operator.SET);
    setOp.setOperand(ProductPartitionNodeAdapter.createCriterionForSetBid(node, adGroupId,
        getBiddingStrategyConfiguration()));

    return new OperationPair(node, setOp);
  }

  /**
   * Creates ADD operations for the node and ALL of its children and adds them to the provided
   * operations list.
   */
  private List<OperationPair> createAddOperations(ProductPartitionNode node) {
    AdGroupCriterionOperation addOp = new AdGroupCriterionOperation();
    addOp.setOperator(Operator.ADD);

    // Set the node's ID to a new temporary ID.
    node.setProductPartitionId(idGenerator.next());

    addOp.setOperand(ProductPartitionNodeAdapter.createCriterionForAdd(node, adGroupId,
        getBiddingStrategyConfiguration()));

    List<OperationPair> operationsList = Lists.newArrayList();
    operationsList.add(new OperationPair(node, addOp));

    // Recursively add all of this node's children to the operations list.
    for (ProductPartitionNode child : node.getChildren()) {
      operationsList.addAll(createAddOperations(child));
    }
    return operationsList;
  }

  /**
   * Returns a REMOVE operation for the specified node.
   */
  private OperationPair createRemoveOperation(ProductPartitionNode node) {
    Preconditions.checkNotNull(node.getProductPartitionId(),
        "Node for REMOVE operation has no partition ID: %s", node);
    Preconditions.checkArgument(node.getProductPartitionId().longValue() >= 0L,
        "Node for REMOVE operation has a negative partition ID: %s", node);

    AdGroupCriterionOperation removeOp = new AdGroupCriterionOperation();
    removeOp.setOperator(Operator.REMOVE);
    removeOp.setOperand(ProductPartitionNodeAdapter.createCriterionForRemove(node, adGroupId));

    return new OperationPair(node, removeOp);
  }

  /**
   * Returns a copy of this tree's bidding strategy configuration.
   */
  private BiddingStrategyConfiguration getBiddingStrategyConfiguration() {
    // Create a copy of the config.
    BiddingStrategyConfiguration copy = new BiddingStrategyConfiguration();

    return copy;
  }

  /**
   * An OperartionPair associates a ProductPartitionNode with an AdGroupCriterionOperation that
   * mutates the node.
   */
  private static class OperationPair {
    final ProductPartitionNode node;
    final AdGroupCriterionOperation operation;

    OperationPair(ProductPartitionNode node, AdGroupCriterionOperation operation) {
      this.node = node;
      this.operation = operation;
    }

    @Override
    public String toString() {
      return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("node", node)
          .append("operation", operation).toString();
    }
  }

  /**
   * Retrieves the {@link BiddingStrategyConfiguration} of an ad group.
   *
   * @param services the AdWordsServices
   * @param session the session to use for the request
   * @param adGroupId the ad group ID
   * @return the non-null BiddingStrategyConfiguration of the ad group
   */
  private static BiddingStrategyConfiguration getAdGroupBiddingStrategyConfiguration(
      AdWordsServices services, AdWordsSession session, Long adGroupId) throws ApiException,
      RemoteException {
    AdGroupServiceInterface adGroupService = services.get(session, AdGroupServiceInterface.class);

    Selector selector = new SelectorBuilder()
        .fields(
            AdGroupField.Id,
            AdGroupField.BiddingStrategyType,
            AdGroupField.BiddingStrategyId,
            AdGroupField.BiddingStrategyName)
        .equalsId(adGroupId).build();

    AdGroupPage adGroupPage = adGroupService.get(selector);

    if (adGroupPage.getEntries() == null || adGroupPage.getEntries().length == 0) {
      throw new IllegalArgumentException("No ad group found with ID " + adGroupId);
    }

    AdGroup adGroup = adGroupPage.getEntries(0);

    Preconditions.checkState(adGroup.getBiddingStrategyConfiguration() != null,
        "Unexpected state - ad group ID %s has a null BiddingStrategyConfiguration", adGroupId);
    return adGroup.getBiddingStrategyConfiguration();
  }

  /**
   * Using the criteria in {@code parentIdMap}, recursively adds all children under the partition ID
   * of {@code parentNode} to {@code parentNode}.
   *
   * @param parentNode required
   * @param parentIdMap the multimap from parent partition ID to list of child criteria
   */
  private static void addChildNodes(ProductPartitionNode parentNode,
      ListMultimap<Long, AdGroupCriterion> parentIdMap) {
    if (parentIdMap.containsKey(parentNode.getProductPartitionId())) {
      parentNode = parentNode.asSubdivision();
    }
    for (AdGroupCriterion adGroupCriterion : parentIdMap.get(parentNode.getProductPartitionId())) {
      ProductPartition partition = (ProductPartition) adGroupCriterion.getCriterion();
      ProductPartitionNode childNode = parentNode.addChild(partition.getCaseValue());
      childNode = childNode.setProductPartitionId(partition.getId());
      if (ProductPartitionType.SUBDIVISION.equals(partition.getPartitionType())) {
        childNode = childNode.asSubdivision();
      } else {
        if (adGroupCriterion instanceof BiddableAdGroupCriterion) {
          childNode = childNode.asBiddableUnit();
          Money cpcBidAmount = getBid((BiddableAdGroupCriterion) adGroupCriterion);
          if (cpcBidAmount != null) {
            childNode = childNode.setBid(cpcBidAmount.getMicroAmount());
          }
        } else {
          childNode = childNode.asExcludedUnit();
        }
      }
      addChildNodes(childNode, parentIdMap);
    }
  }

  /**
   * Returns the criterion-level bid, or null if no such bid exists.
   */
  private static Money getBid(BiddableAdGroupCriterion biddableCriterion) {
    BiddingStrategyConfiguration biddingConfig =
        biddableCriterion.getBiddingStrategyConfiguration();
    Money cpcBidAmount = null;
    if (biddingConfig.getBids() != null) {
      for (Bids bid : biddingConfig.getBids()) {
        if (bid instanceof CpcBid) {
          CpcBid cpcBid = (CpcBid) bid;
          if (BidSource.CRITERION.equals(cpcBid.getCpcBidSource())) {
            cpcBidAmount = cpcBid.getBid();
            break;
          }
        }
      }
    }
    return cpcBidAmount;
  }
}
