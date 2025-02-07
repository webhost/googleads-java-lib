
package com.google.api.ads.adwords.jaxws.v201506.cm;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             The base class of all ad types. {@code Ad} objects themselves cannot be modified. If you want to
 *             make a change to an {@code Ad} object, you must REMOVE its AdGroupAd and ADD a new AdGroupAd with
 *             the new {@code Ad}. This will result in a new {@code Ad} ID, so stats for the original {@code Ad}
 *             and the new {@code Ad} will appear under separate IDs in reports.
 *             
 *             <p>When calling {@code AdGroupAdService} to update the {@code status} of an {@code AdGroupAd},
 *             you can construct an {@code Ad} object (instead of the {@code Ad}'s concrete type) with the
 *             {@link #id} field set.
 *             <span class="constraint AdxEnabled">This is enabled for AdX.</span>
 *           
 * 
 * <p>Java class for Ad complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Ad">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="displayUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="finalUrls" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="finalMobileUrls" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="finalAppUrls" type="{https://adwords.google.com/api/adwords/cm/v201506}AppUrl" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="trackingUrlTemplate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="urlCustomParameters" type="{https://adwords.google.com/api/adwords/cm/v201506}CustomParameters" minOccurs="0"/>
 *         &lt;element name="devicePreference" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="Ad.Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Ad", propOrder = {
    "id",
    "url",
    "displayUrl",
    "finalUrls",
    "finalMobileUrls",
    "finalAppUrls",
    "trackingUrlTemplate",
    "urlCustomParameters",
    "devicePreference",
    "adType"
})
@XmlSeeAlso({
    CallOnlyAd.class,
    DynamicSearchAd.class,
    ProductAd.class,
    TextAd.class,
    ImageAd.class,
    TemplateAd.class,
    DeprecatedAd.class,
    RichMediaAd.class
})
public class Ad {

    protected Long id;
    protected String url;
    protected String displayUrl;
    protected List<String> finalUrls;
    protected List<String> finalMobileUrls;
    protected List<AppUrl> finalAppUrls;
    protected String trackingUrlTemplate;
    protected CustomParameters urlCustomParameters;
    protected Long devicePreference;
    @XmlElement(name = "Ad.Type")
    protected String adType;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrl() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrl(String value) {
        this.url = value;
    }

    /**
     * Gets the value of the displayUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayUrl() {
        return displayUrl;
    }

    /**
     * Sets the value of the displayUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayUrl(String value) {
        this.displayUrl = value;
    }

    /**
     * Gets the value of the finalUrls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the finalUrls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFinalUrls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getFinalUrls() {
        if (finalUrls == null) {
            finalUrls = new ArrayList<String>();
        }
        return this.finalUrls;
    }

    /**
     * Gets the value of the finalMobileUrls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the finalMobileUrls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFinalMobileUrls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getFinalMobileUrls() {
        if (finalMobileUrls == null) {
            finalMobileUrls = new ArrayList<String>();
        }
        return this.finalMobileUrls;
    }

    /**
     * Gets the value of the finalAppUrls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the finalAppUrls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFinalAppUrls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AppUrl }
     * 
     * 
     */
    public List<AppUrl> getFinalAppUrls() {
        if (finalAppUrls == null) {
            finalAppUrls = new ArrayList<AppUrl>();
        }
        return this.finalAppUrls;
    }

    /**
     * Gets the value of the trackingUrlTemplate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrackingUrlTemplate() {
        return trackingUrlTemplate;
    }

    /**
     * Sets the value of the trackingUrlTemplate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrackingUrlTemplate(String value) {
        this.trackingUrlTemplate = value;
    }

    /**
     * Gets the value of the urlCustomParameters property.
     * 
     * @return
     *     possible object is
     *     {@link CustomParameters }
     *     
     */
    public CustomParameters getUrlCustomParameters() {
        return urlCustomParameters;
    }

    /**
     * Sets the value of the urlCustomParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomParameters }
     *     
     */
    public void setUrlCustomParameters(CustomParameters value) {
        this.urlCustomParameters = value;
    }

    /**
     * Gets the value of the devicePreference property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDevicePreference() {
        return devicePreference;
    }

    /**
     * Sets the value of the devicePreference property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDevicePreference(Long value) {
        this.devicePreference = value;
    }

    /**
     * Gets the value of the adType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdType() {
        return adType;
    }

    /**
     * Sets the value of the adType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdType(String value) {
        this.adType = value;
    }

}
