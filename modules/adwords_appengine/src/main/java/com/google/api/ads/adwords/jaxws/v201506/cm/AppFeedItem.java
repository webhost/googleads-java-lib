
package com.google.api.ads.adwords.jaxws.v201506.cm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Represents an App extension.
 *           
 * 
 * <p>Java class for AppFeedItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AppFeedItem">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201506}ExtensionFeedItem">
 *       &lt;sequence>
 *         &lt;element name="appStore" type="{https://adwords.google.com/api/adwords/cm/v201506}AppFeedItem.AppStore" minOccurs="0"/>
 *         &lt;element name="appId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="appLinkText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="appUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="appFinalUrls" type="{https://adwords.google.com/api/adwords/cm/v201506}UrlList" minOccurs="0"/>
 *         &lt;element name="appFinalMobileUrls" type="{https://adwords.google.com/api/adwords/cm/v201506}UrlList" minOccurs="0"/>
 *         &lt;element name="appTrackingUrlTemplate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="appUrlCustomParameters" type="{https://adwords.google.com/api/adwords/cm/v201506}CustomParameters" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AppFeedItem", propOrder = {
    "appStore",
    "appId",
    "appLinkText",
    "appUrl",
    "appFinalUrls",
    "appFinalMobileUrls",
    "appTrackingUrlTemplate",
    "appUrlCustomParameters"
})
public class AppFeedItem
    extends ExtensionFeedItem
{

    protected AppFeedItemAppStore appStore;
    protected String appId;
    protected String appLinkText;
    protected String appUrl;
    protected UrlList appFinalUrls;
    protected UrlList appFinalMobileUrls;
    protected String appTrackingUrlTemplate;
    protected CustomParameters appUrlCustomParameters;

    /**
     * Gets the value of the appStore property.
     * 
     * @return
     *     possible object is
     *     {@link AppFeedItemAppStore }
     *     
     */
    public AppFeedItemAppStore getAppStore() {
        return appStore;
    }

    /**
     * Sets the value of the appStore property.
     * 
     * @param value
     *     allowed object is
     *     {@link AppFeedItemAppStore }
     *     
     */
    public void setAppStore(AppFeedItemAppStore value) {
        this.appStore = value;
    }

    /**
     * Gets the value of the appId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppId() {
        return appId;
    }

    /**
     * Sets the value of the appId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppId(String value) {
        this.appId = value;
    }

    /**
     * Gets the value of the appLinkText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppLinkText() {
        return appLinkText;
    }

    /**
     * Sets the value of the appLinkText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppLinkText(String value) {
        this.appLinkText = value;
    }

    /**
     * Gets the value of the appUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppUrl() {
        return appUrl;
    }

    /**
     * Sets the value of the appUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppUrl(String value) {
        this.appUrl = value;
    }

    /**
     * Gets the value of the appFinalUrls property.
     * 
     * @return
     *     possible object is
     *     {@link UrlList }
     *     
     */
    public UrlList getAppFinalUrls() {
        return appFinalUrls;
    }

    /**
     * Sets the value of the appFinalUrls property.
     * 
     * @param value
     *     allowed object is
     *     {@link UrlList }
     *     
     */
    public void setAppFinalUrls(UrlList value) {
        this.appFinalUrls = value;
    }

    /**
     * Gets the value of the appFinalMobileUrls property.
     * 
     * @return
     *     possible object is
     *     {@link UrlList }
     *     
     */
    public UrlList getAppFinalMobileUrls() {
        return appFinalMobileUrls;
    }

    /**
     * Sets the value of the appFinalMobileUrls property.
     * 
     * @param value
     *     allowed object is
     *     {@link UrlList }
     *     
     */
    public void setAppFinalMobileUrls(UrlList value) {
        this.appFinalMobileUrls = value;
    }

    /**
     * Gets the value of the appTrackingUrlTemplate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppTrackingUrlTemplate() {
        return appTrackingUrlTemplate;
    }

    /**
     * Sets the value of the appTrackingUrlTemplate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppTrackingUrlTemplate(String value) {
        this.appTrackingUrlTemplate = value;
    }

    /**
     * Gets the value of the appUrlCustomParameters property.
     * 
     * @return
     *     possible object is
     *     {@link CustomParameters }
     *     
     */
    public CustomParameters getAppUrlCustomParameters() {
        return appUrlCustomParameters;
    }

    /**
     * Sets the value of the appUrlCustomParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomParameters }
     *     
     */
    public void setAppUrlCustomParameters(CustomParameters value) {
        this.appUrlCustomParameters = value;
    }

}
