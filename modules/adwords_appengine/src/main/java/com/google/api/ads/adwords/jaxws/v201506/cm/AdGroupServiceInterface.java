
package com.google.api.ads.adwords.jaxws.v201506.cm;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * 
 *       Use this service to manage ad groups. An {@linkplain AdGroup ad group}
 *       organizes a set of ads and criteria together, and also provides the
 *       {@linkplain AdGroup#bids default bid} for its criteria. One or more ad groups
 *       belong to a campaign.
 *     
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.1
 * 
 */
@WebService(name = "AdGroupServiceInterface", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201506")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface AdGroupServiceInterface {


    /**
     * 
     *         Returns a list of all the ad groups specified by the selector
     *         from the target customer's account.
     *         
     *         @param serviceSelector The selector specifying the {@link AdGroup}s to return.
     *         @return List of adgroups identified by the selector.
     *         @throws ApiException when there is at least one error with the request.
     *       
     * 
     * @param serviceSelector
     * @return
     *     returns com.google.api.ads.adwords.jaxws.v201506.cm.AdGroupPage
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201506")
    @RequestWrapper(localName = "get", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201506", className = "com.google.api.ads.adwords.jaxws.v201506.cm.AdGroupServiceInterfaceget")
    @ResponseWrapper(localName = "getResponse", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201506", className = "com.google.api.ads.adwords.jaxws.v201506.cm.AdGroupServiceInterfacegetResponse")
    public AdGroupPage get(
        @WebParam(name = "serviceSelector", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201506")
        Selector serviceSelector)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Adds, updates, or removes ad groups.
     *         <p class="note"><b>Note:</b> {@link AdGroupOperation} does not support the
     *         {@code REMOVE} operator. To remove an ad group, set its
     *         {@link AdGroup#status status} to {@code REMOVED}.</p>
     *         
     *         @param operations List of unique operations. The same ad group cannot be
     *         specified in more than one operation.
     *         @return The updated adgroups.
     *       
     * 
     * @param operations
     * @return
     *     returns com.google.api.ads.adwords.jaxws.v201506.cm.AdGroupReturnValue
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201506")
    @RequestWrapper(localName = "mutate", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201506", className = "com.google.api.ads.adwords.jaxws.v201506.cm.AdGroupServiceInterfacemutate")
    @ResponseWrapper(localName = "mutateResponse", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201506", className = "com.google.api.ads.adwords.jaxws.v201506.cm.AdGroupServiceInterfacemutateResponse")
    public AdGroupReturnValue mutate(
        @WebParam(name = "operations", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201506")
        List<AdGroupOperation> operations)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Adds labels to the {@linkplain AdGroup ad group} or removes
     *         {@linkplain com.google.ads.api.services.campaignmgmt.label.Label label}s from the
     *         {@linkplain AdGroup ad group}.
     *         <p>Add - Apply an existing label to an existing
     *         {@linkplain AdGroup ad group}. The {@code adGroupId} must reference an existing
     *         {@linkplain AdGroup ad group}. The {@code labelId} must reference an existing
     *         {@linkplain com.google.ads.api.services.campaignmgmt.label.Label label}.
     *         <p>Remove - Removes the link between the specified
     *         {@linkplain AdGroup ad group} and
     *         {@linkplain com.google.ads.api.services.campaignmgmt.label.Label label}.</p>
     *         @param operations the operations to apply.
     *         @return a list of {@linkplain AdGroupLabel}s where each entry in the list is the result of
     *         applying the operation in the input list with the same index. For an
     *         add operation, the returned AdGroupLabel contains the AdGroupId and the LabelId.
     *         In the case of a remove operation, the returned AdGroupLabel will only have AdGroupId.
     *         @throws ApiException when there are one or more errors with the request.
     *       
     * 
     * @param operations
     * @return
     *     returns com.google.api.ads.adwords.jaxws.v201506.cm.AdGroupLabelReturnValue
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201506")
    @RequestWrapper(localName = "mutateLabel", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201506", className = "com.google.api.ads.adwords.jaxws.v201506.cm.AdGroupServiceInterfacemutateLabel")
    @ResponseWrapper(localName = "mutateLabelResponse", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201506", className = "com.google.api.ads.adwords.jaxws.v201506.cm.AdGroupServiceInterfacemutateLabelResponse")
    public AdGroupLabelReturnValue mutateLabel(
        @WebParam(name = "operations", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201506")
        List<AdGroupLabelOperation> operations)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Returns the list of ad groups that match the query.
     *         
     *         @param query The SQL-like AWQL query string
     *         @return A list of adgroups
     *         @throws ApiException
     *       
     * 
     * @param query
     * @return
     *     returns com.google.api.ads.adwords.jaxws.v201506.cm.AdGroupPage
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201506")
    @RequestWrapper(localName = "query", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201506", className = "com.google.api.ads.adwords.jaxws.v201506.cm.AdGroupServiceInterfacequery")
    @ResponseWrapper(localName = "queryResponse", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201506", className = "com.google.api.ads.adwords.jaxws.v201506.cm.AdGroupServiceInterfacequeryResponse")
    public AdGroupPage query(
        @WebParam(name = "query", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201506")
        String query)
        throws ApiException_Exception
    ;

}
