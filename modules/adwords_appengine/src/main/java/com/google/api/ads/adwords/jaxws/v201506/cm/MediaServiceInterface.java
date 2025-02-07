
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
 *       Use this service to manage media for your template ads. After uploading images and videos
 *       with this service, use the IDs when creating template ads.
 *       <p>
 *       When creating image ads do not use this service to upload images. The AdGroupAdService
 *       allows you to upload image data when creating the image ad.
 *     
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.1
 * 
 */
@WebService(name = "MediaServiceInterface", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201506")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface MediaServiceInterface {


    /**
     * 
     *         Returns a list of media that meet the criteria specified by the selector.
     *         <p class="note"><b>Note:</b> {@code MediaService} will not return any
     *         {@link ImageAd} image files.</p>
     *         
     *         @param serviceSelector Selects which media objects to return.
     *         @return A list of {@code Media} objects.
     *       
     * 
     * @param serviceSelector
     * @return
     *     returns com.google.api.ads.adwords.jaxws.v201506.cm.MediaPage
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201506")
    @RequestWrapper(localName = "get", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201506", className = "com.google.api.ads.adwords.jaxws.v201506.cm.MediaServiceInterfaceget")
    @ResponseWrapper(localName = "getResponse", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201506", className = "com.google.api.ads.adwords.jaxws.v201506.cm.MediaServiceInterfacegetResponse")
    public MediaPage get(
        @WebParam(name = "serviceSelector", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201506")
        Selector serviceSelector)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Returns the list of {@link Media} objects that match the query.
     *         
     *         @param query The SQL-like AWQL query string
     *         @returns A list of {@code Media} objects.
     *         @throws ApiException when the query is invalid or there are errors processing the request.
     *       
     * 
     * @param query
     * @return
     *     returns com.google.api.ads.adwords.jaxws.v201506.cm.MediaPage
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201506")
    @RequestWrapper(localName = "query", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201506", className = "com.google.api.ads.adwords.jaxws.v201506.cm.MediaServiceInterfacequery")
    @ResponseWrapper(localName = "queryResponse", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201506", className = "com.google.api.ads.adwords.jaxws.v201506.cm.MediaServiceInterfacequeryResponse")
    public MediaPage query(
        @WebParam(name = "query", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201506")
        String query)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Uploads new media. Currently, you can only upload {@link Image} files.
     *         
     *         @param media A list of {@code Media} objects, each containing the data to
     *         be uploaded.
     *         @return A list of uploaded media in the same order as the argument list.
     *       
     * 
     * @param media
     * @return
     *     returns java.util.List<com.google.api.ads.adwords.jaxws.v201506.cm.Media>
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201506")
    @RequestWrapper(localName = "upload", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201506", className = "com.google.api.ads.adwords.jaxws.v201506.cm.MediaServiceInterfaceupload")
    @ResponseWrapper(localName = "uploadResponse", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201506", className = "com.google.api.ads.adwords.jaxws.v201506.cm.MediaServiceInterfaceuploadResponse")
    public List<Media> upload(
        @WebParam(name = "media", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201506")
        List<Media> media)
        throws ApiException_Exception
    ;

}
