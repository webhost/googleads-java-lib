
package com.google.api.ads.adwords.jaxws.v201506.ch;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import com.google.api.ads.adwords.jaxws.v201506.cm.ApiException;
import com.google.api.ads.adwords.jaxws.v201506.cm.SoapHeader;
import com.google.api.ads.adwords.jaxws.v201506.cm.SoapResponseHeader;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.google.api.ads.adwords.jaxws.v201506.ch package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ApiExceptionFault_QNAME = new QName("https://adwords.google.com/api/adwords/ch/v201506", "ApiExceptionFault");
    private final static QName _RequestHeader_QNAME = new QName("https://adwords.google.com/api/adwords/ch/v201506", "RequestHeader");
    private final static QName _ResponseHeader_QNAME = new QName("https://adwords.google.com/api/adwords/ch/v201506", "ResponseHeader");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.google.api.ads.adwords.jaxws.v201506.ch
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CustomerSyncSelector }
     * 
     */
    public CustomerSyncSelector createCustomerSyncSelector() {
        return new CustomerSyncSelector();
    }

    /**
     * Create an instance of {@link FeedChangeData }
     * 
     */
    public FeedChangeData createFeedChangeData() {
        return new FeedChangeData();
    }

    /**
     * Create an instance of {@link CustomerChangeData }
     * 
     */
    public CustomerChangeData createCustomerChangeData() {
        return new CustomerChangeData();
    }

    /**
     * Create an instance of {@link CustomerSyncError }
     * 
     */
    public CustomerSyncError createCustomerSyncError() {
        return new CustomerSyncError();
    }

    /**
     * Create an instance of {@link CampaignChangeData }
     * 
     */
    public CampaignChangeData createCampaignChangeData() {
        return new CampaignChangeData();
    }

    /**
     * Create an instance of {@link AdGroupChangeData }
     * 
     */
    public AdGroupChangeData createAdGroupChangeData() {
        return new AdGroupChangeData();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApiException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://adwords.google.com/api/adwords/ch/v201506", name = "ApiExceptionFault")
    public JAXBElement<ApiException> createApiExceptionFault(ApiException value) {
        return new JAXBElement<ApiException>(_ApiExceptionFault_QNAME, ApiException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SoapHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://adwords.google.com/api/adwords/ch/v201506", name = "RequestHeader")
    public JAXBElement<SoapHeader> createRequestHeader(SoapHeader value) {
        return new JAXBElement<SoapHeader>(_RequestHeader_QNAME, SoapHeader.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SoapResponseHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://adwords.google.com/api/adwords/ch/v201506", name = "ResponseHeader")
    public JAXBElement<SoapResponseHeader> createResponseHeader(SoapResponseHeader value) {
        return new JAXBElement<SoapResponseHeader>(_ResponseHeader_QNAME, SoapResponseHeader.class, null, value);
    }

}
