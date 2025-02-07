// Copyright 2015 Google Inc. All Rights Reserved.
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

package com.google.api.ads.adwords.lib.selectorfields.v201506.cm;

import com.google.api.ads.adwords.lib.selectorfields.EntityField;
import com.google.api.ads.adwords.lib.selectorfields.Filterable;

/**
 * A {@code Enum} to facilitate the selection of fields for {@code Campaign}.
 */
public enum CampaignField implements EntityField {

  // Fields constants definitions

  /**
   * Active View CPM option.
   * When enabled, the advertiser only pays for the impression when the ad is visible on screen.
   */
  @Filterable
  ActiveViewCpmEnabled(true),

  /**
   * Ad serving optimization status.
   */
  AdServingOptimizationStatus(false),

  /**
   * Optional refinement of advertisingChannelType.
   * Must be a valid sub-type of the parent channel type.
   * May only be set for new campaigns and cannot be changed once set.
   */
  @Filterable
  AdvertisingChannelSubType(true),

  /**
   * The primary serving target for ads within this campaign.
   * The targeting options can be refined in NetworkSetting.
   * May only be set for new campaigns.
   * This field is required and should not be {@code null} when it is contained within {@link Operator}s : ADD
   */
  @Filterable
  AdvertisingChannelType(true),

  /**
   * Amount of budget in the local currency for the account.
   */
  @Filterable
  Amount(true),

  /**
   * Ceiling on bids placed by the budget optimizer.
   */
  BidCeiling(false),

  /**
   * Bid type indicates if it is a Target CPA or Max CPA campaign.
   * If the Bid type is not specified it defaults to Target CPA.
   */
  @Filterable
  BidType(true),

  /**
   * Id of the bidding strategy to be associated with the campaign, ad group or ad group criteria.
   * A bidding strategy is created using the BiddingStrategyService ADD operation and is assigned a BiddingStrategyId.
   * The BiddingStrategyId can be shared across campaigns, ad groups and ad group criteria.
   */
  @Filterable
  BiddingStrategyId(true),

  /**
   * Name of the bidding strategy.
   * This is applicable only for flexible bidding strategies.
   */
  @Filterable
  BiddingStrategyName(true),

  /**
   * The type of the bidding strategy to be attached.
   */
  @Filterable
  BiddingStrategyType(true),

  /**
   * A Budget is created using the BudgetService ADD operation and is assigned a BudgetId.
   * The BudgetId is used when modifying the Budget with BudgetService, or associating the Budget to a Campaign with CampaignService.
   * A BudgetId can be shared across different campaigns--the system will then allocate the Budget among the Campaigns to get the optimum result.
   */
  @Filterable
  BudgetId(true),

  /**
   * Name of the Budget.
   * When creating a Budget through BudgetService, every explicitly shared Budget must have a non-null non-empty name.
   * In addition, all explicitly shared Budget names owned by an account must be distinct.
   * Budgets that are not explicitly shared derive their name from the attached Campaign's name.
   */
  BudgetName(false),

  /**
   * Number of campaigns actively using this budget.
   * This field is only populated for Get operations.
   */
  BudgetReferenceCount(false),

  /**
   * 
   */
  @Filterable
  BudgetStatus(true),

  /**
   * Delivery method for the Budget which determines the rate at which the Budget is spent.
   * Defaults to STANDARD and can be changed through BudgetService ADD or SET operations.
   */
  DeliveryMethod(false),

  /**
   * If the campaign is eligible to enter conversion optimizer.
   */
  Eligible(false),

  /**
   * Date the campaign ends.
   * On add, defaults to <code>20371230</code>, which means the campaign will run indefinitely.
   * To set an existing campaign to run indefinitely, set this field to <code>203712<b>30</b></code>.
   * The date's format should be YYYYMMDD.
   */
  @Filterable
  EndDate(true),

  /**
   * The enhanced CPC bidding option for the campaign, which enables bids to be enhanced based on conversion optimizer data.
   * For more information about enhanced CPC, see the <a href="//support.google.com/adwords/bin/answer.py?answer=2464964" >AdWords Help Center</a>.
   */
  @Filterable
  EnhancedCpcEnabled(true),

  /**
   * Maximum number of impressions allowed during the time range by this cap.
   * To remove the frequency cap on a campaign, set this field to {@code 0}.
   */
  @Filterable
  FrequencyCapMaxImpressions(true),

  /**
   * ID of this campaign.
   */
  @Filterable
  Id(true),

  /**
   * If true, this budget was created with the purpose of sharing this budget across one or more campaigns.
   * <p>If false, this budget was created with the intention to be dedicatedly used with a single campaign, and the Budget's name and status will stay in the sync with the associated Campaign's name and status.
   * Attempting to share this budget with a second Campaign will result in an error.</p>
   */
  IsBudgetExplicitlyShared(false),

  /**
   * Labels that are attached to the campaign.
   * To associate an existing {@link Label} to an existing {@link Campaign}, use {@link CampaignService#mutateLabel} with the ADD operator.
   * To remove an associated {@link Label} from the {@link Campaign}, use {@link CampaignService#mutateLabel} with the REMOVE operator.
   * To filter on {@link Label}s, use one of {@link Predicate.Operator#CONTAINS_ALL}, {@link Predicate.Operator#CONTAINS_ANY}, {@link Predicate.Operator#CONTAINS_NONE} operators with a list of {@link Label} ids.
   */
  @Filterable
  Labels(true),

  /**
   * The level on which the cap is to be applied (creative/adgroup).
   * Cap is applied to all the entities of this level in the campaign.
   */
  @Filterable
  Level(true),

  /**
   * Name of this campaign.
   * This field is required and should not be {@code null} for ADD operations.
   * For SET and REMOVE operations, this can be used to address the campaign by name when the campaign is ENABLED or PAUSED.
   * Removed campaigns cannot be addressed by name.
   * If you wish to rename a campaign, you must provide the ID.
   */
  @Filterable
  Name(true),

  /**
   * Period over which to spend the budget.
   * Defaults to DAILY when creating a Budget through BudgetService.
   * <code>MONTHLY</code> is not available to most users.
   */
  Period(false),

  /**
   * <b>Note:</b> The value for this field currently cannot be changed.
   * Pricing model indicates whether it is a pay per clicks or pay per conversions campaign.
   * If the pricing model is not specified it defaults to Clicks.
   */
  @Filterable
  PricingMode(true),

  /**
   * Reason why a campaign would be rejected for conversion optimizer.
   */
  RejectionReasons(false),

  /**
   * Serving status.
   */
  @Filterable
  ServingStatus(true),

  /**
   * List of settings for the campaign.
   */
  Settings(false),

  /**
   * Date the campaign begins.
   * On add, defaults to the current day in the parent account's local timezone.
   * The date's format should be YYYYMMDD.
   */
  @Filterable
  StartDate(true),

  /**
   * Status of this campaign.
   * On add, defaults to {@code ENABLED}.
   */
  @Filterable
  Status(true),

  /**
   * Ads will be served on specified placements in the Google Display Network.
   * Placements are specified using {@code Placement} criteria.
   */
  @Filterable
  TargetContentNetwork(true),

  /**
   * Average CPA target.
   * This target should be greater than or equal to minimum billable unit based on the currency for the account.
   */
  TargetCpa(false),

  /**
   * Maximum cpc bid limit that applies to all keywords managed by the strategy.
   */
  @Filterable
  TargetCpaMaxCpcBidCeiling(true),

  /**
   * Minimum cpc bid limit that applies to all keywords managed by the strategy.
   */
  @Filterable
  TargetCpaMaxCpcBidFloor(true),

  /**
   * Ads will be served with Google.com search results.
   */
  @Filterable
  TargetGoogleSearch(true),

  /**
   * Ads will be served on the Google Partner Network.
   * This is available to only some specific Google partner accounts.
   */
  @Filterable
  TargetPartnerSearchNetwork(true),

  /**
   * Ads will be served on partner sites in the Google Search Network (requires {@code GOOGLE_SEARCH}).
   */
  @Filterable
  TargetSearchNetwork(true),

  /**
   * Unit of time the cap is defined at.
   * Only the Day, Week and Month time units are supported.
   */
  @Filterable
  TimeUnit(true),

  /**
   * URL template for constructing a tracking URL.
   * <p>On update, empty string ("") indicates to clear the field.
   */
  @Filterable
  TrackingUrlTemplate(true),

  /**
   * A list of mappings to be used for substituting URL custom parameter tags in the trackingUrlTemplate, finalUrls, and/or finalMobileUrls.
   */
  UrlCustomParameters(false),

  ;

  private final boolean isFilterable;

  private CampaignField(boolean isFilterable) {
    this.isFilterable = isFilterable;
  }

  public boolean isFilterable() {
    return this.isFilterable;
  }

}
