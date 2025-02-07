
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
 *       Use this service to manage labels. The light weight label, once created, can be attached
 *       to campaign management entities such as campaigns, ad groups, creatives, criterion and etc.
 *     
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.1
 * 
 */
@WebService(name = "LabelServiceInterface", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201506")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface LabelServiceInterface {


    /**
     * 
     *         Returns a list of {@link Label}s.
     *         
     *         @param serviceSelector The selector specifying the {@link Label}s to return.
     *         @return The page containing the {@link Label}s which meet the criteria specified by the
     *         selector.
     *         @throws ApiException when there is at least one error with the request
     *       
     * 
     * @param serviceSelector
     * @return
     *     returns com.google.api.ads.adwords.jaxws.v201506.cm.LabelPage
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201506")
    @RequestWrapper(localName = "get", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201506", className = "com.google.api.ads.adwords.jaxws.v201506.cm.LabelServiceInterfaceget")
    @ResponseWrapper(localName = "getResponse", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201506", className = "com.google.api.ads.adwords.jaxws.v201506.cm.LabelServiceInterfacegetResponse")
    public LabelPage get(
        @WebParam(name = "serviceSelector", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201506")
        Selector serviceSelector)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Applies the list of mutate operations.
     *         
     *         @param operations The operations to apply. The same {@link Label} cannot be specified in
     *         more than one operation.
     *         @return The applied {@link Label}s.
     *         @throws ApiException when there is at least one error with the request
     *       
     * 
     * @param operations
     * @return
     *     returns com.google.api.ads.adwords.jaxws.v201506.cm.LabelReturnValue
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201506")
    @RequestWrapper(localName = "mutate", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201506", className = "com.google.api.ads.adwords.jaxws.v201506.cm.LabelServiceInterfacemutate")
    @ResponseWrapper(localName = "mutateResponse", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201506", className = "com.google.api.ads.adwords.jaxws.v201506.cm.LabelServiceInterfacemutateResponse")
    public LabelReturnValue mutate(
        @WebParam(name = "operations", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201506")
        List<LabelOperation> operations)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Returns the list of {@link Label}s that match the query.
     *         
     *         @param query The SQL-like AWQL query string
     *         @returns  The page containing the {@link Label}s which match the query.
     *         @throws ApiException when the query is invalid or there are errors processing the request.
     *       
     * 
     * @param query
     * @return
     *     returns com.google.api.ads.adwords.jaxws.v201506.cm.LabelPage
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201506")
    @RequestWrapper(localName = "query", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201506", className = "com.google.api.ads.adwords.jaxws.v201506.cm.LabelServiceInterfacequery")
    @ResponseWrapper(localName = "queryResponse", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201506", className = "com.google.api.ads.adwords.jaxws.v201506.cm.LabelServiceInterfacequeryResponse")
    public LabelPage query(
        @WebParam(name = "query", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201506")
        String query)
        throws ApiException_Exception
    ;

}
