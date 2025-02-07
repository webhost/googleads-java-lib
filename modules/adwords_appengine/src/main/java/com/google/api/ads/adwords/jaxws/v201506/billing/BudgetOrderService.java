
package com.google.api.ads.adwords.jaxws.v201506.billing;

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
@WebServiceClient(name = "BudgetOrderService", targetNamespace = "https://adwords.google.com/api/adwords/billing/v201506", wsdlLocation = "https://adwords.google.com/api/adwords/billing/v201506/BudgetOrderService?wsdl")
public class BudgetOrderService
    extends Service
{

    private final static URL BUDGETORDERSERVICE_WSDL_LOCATION;
    private final static WebServiceException BUDGETORDERSERVICE_EXCEPTION;
    private final static QName BUDGETORDERSERVICE_QNAME = new QName("https://adwords.google.com/api/adwords/billing/v201506", "BudgetOrderService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("https://adwords.google.com/api/adwords/billing/v201506/BudgetOrderService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        BUDGETORDERSERVICE_WSDL_LOCATION = url;
        BUDGETORDERSERVICE_EXCEPTION = e;
    }

    public BudgetOrderService() {
        super(__getWsdlLocation(), BUDGETORDERSERVICE_QNAME);
    }

    public BudgetOrderService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    /**
     * 
     * @return
     *     returns BudgetOrderServiceInterface
     */
    @WebEndpoint(name = "BudgetOrderServiceInterfacePort")
    public BudgetOrderServiceInterface getBudgetOrderServiceInterfacePort() {
        return super.getPort(new QName("https://adwords.google.com/api/adwords/billing/v201506", "BudgetOrderServiceInterfacePort"), BudgetOrderServiceInterface.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns BudgetOrderServiceInterface
     */
    @WebEndpoint(name = "BudgetOrderServiceInterfacePort")
    public BudgetOrderServiceInterface getBudgetOrderServiceInterfacePort(WebServiceFeature... features) {
        return super.getPort(new QName("https://adwords.google.com/api/adwords/billing/v201506", "BudgetOrderServiceInterfacePort"), BudgetOrderServiceInterface.class, features);
    }

    private static URL __getWsdlLocation() {
        if (BUDGETORDERSERVICE_EXCEPTION!= null) {
            throw BUDGETORDERSERVICE_EXCEPTION;
        }
        return BUDGETORDERSERVICE_WSDL_LOCATION;
    }

}
