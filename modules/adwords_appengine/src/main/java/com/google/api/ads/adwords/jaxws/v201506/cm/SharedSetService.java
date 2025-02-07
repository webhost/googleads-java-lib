
package com.google.api.ads.adwords.jaxws.v201506.cm;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "SharedSetService", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201506", wsdlLocation = "https://adwords.google.com/api/adwords/cm/v201506/SharedSetService?wsdl")
public class SharedSetService
    extends Service
{

    private final static URL SHAREDSETSERVICE_WSDL_LOCATION;
    private final static WebServiceException SHAREDSETSERVICE_EXCEPTION;
    private final static QName SHAREDSETSERVICE_QNAME = new QName("https://adwords.google.com/api/adwords/cm/v201506", "SharedSetService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("https://adwords.google.com/api/adwords/cm/v201506/SharedSetService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SHAREDSETSERVICE_WSDL_LOCATION = url;
        SHAREDSETSERVICE_EXCEPTION = e;
    }

    public SharedSetService() {
        super(__getWsdlLocation(), SHAREDSETSERVICE_QNAME);
    }

    public SharedSetService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    /**
     * 
     * @return
     *     returns SharedSetServiceInterface
     */
    @WebEndpoint(name = "SharedSetServiceInterfacePort")
    public SharedSetServiceInterface getSharedSetServiceInterfacePort() {
        return super.getPort(new QName("https://adwords.google.com/api/adwords/cm/v201506", "SharedSetServiceInterfacePort"), SharedSetServiceInterface.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SharedSetServiceInterface
     */
    @WebEndpoint(name = "SharedSetServiceInterfacePort")
    public SharedSetServiceInterface getSharedSetServiceInterfacePort(WebServiceFeature... features) {
        return super.getPort(new QName("https://adwords.google.com/api/adwords/cm/v201506", "SharedSetServiceInterfacePort"), SharedSetServiceInterface.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SHAREDSETSERVICE_EXCEPTION!= null) {
            throw SHAREDSETSERVICE_EXCEPTION;
        }
        return SHAREDSETSERVICE_WSDL_LOCATION;
    }

}
