
package com.google.api.ads.adwords.jaxws.v201506.cm;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Represents an ad group.
 *           
 * 
 * <p>Java class for AdGroup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdGroup">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="campaignId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="campaignName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{https://adwords.google.com/api/adwords/cm/v201506}AdGroup.Status" minOccurs="0"/>
 *         &lt;element name="settings" type="{https://adwords.google.com/api/adwords/cm/v201506}Setting" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="experimentData" type="{https://adwords.google.com/api/adwords/cm/v201506}AdGroupExperimentData" minOccurs="0"/>
 *         &lt;element name="labels" type="{https://adwords.google.com/api/adwords/cm/v201506}Label" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="forwardCompatibilityMap" type="{https://adwords.google.com/api/adwords/cm/v201506}String_StringMapEntry" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="biddingStrategyConfiguration" type="{https://adwords.google.com/api/adwords/cm/v201506}BiddingStrategyConfiguration" minOccurs="0"/>
 *         &lt;element name="contentBidCriterionTypeGroup" type="{https://adwords.google.com/api/adwords/cm/v201506}CriterionTypeGroup" minOccurs="0"/>
 *         &lt;element name="trackingUrlTemplate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="urlCustomParameters" type="{https://adwords.google.com/api/adwords/cm/v201506}CustomParameters" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdGroup", propOrder = {
    "id",
    "campaignId",
    "campaignName",
    "name",
    "status",
    "settings",
    "experimentData",
    "labels",
    "forwardCompatibilityMap",
    "biddingStrategyConfiguration",
    "contentBidCriterionTypeGroup",
    "trackingUrlTemplate",
    "urlCustomParameters"
})
public class AdGroup {

    protected Long id;
    protected Long campaignId;
    protected String campaignName;
    protected String name;
    protected AdGroupStatus status;
    protected List<Setting> settings;
    protected AdGroupExperimentData experimentData;
    protected List<Label> labels;
    protected List<StringStringMapEntry> forwardCompatibilityMap;
    protected BiddingStrategyConfiguration biddingStrategyConfiguration;
    protected CriterionTypeGroup contentBidCriterionTypeGroup;
    protected String trackingUrlTemplate;
    protected CustomParameters urlCustomParameters;

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
     * Gets the value of the campaignId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCampaignId() {
        return campaignId;
    }

    /**
     * Sets the value of the campaignId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCampaignId(Long value) {
        this.campaignId = value;
    }

    /**
     * Gets the value of the campaignName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCampaignName() {
        return campaignName;
    }

    /**
     * Sets the value of the campaignName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCampaignName(String value) {
        this.campaignName = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link AdGroupStatus }
     *     
     */
    public AdGroupStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdGroupStatus }
     *     
     */
    public void setStatus(AdGroupStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the settings property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the settings property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSettings().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Setting }
     * 
     * 
     */
    public List<Setting> getSettings() {
        if (settings == null) {
            settings = new ArrayList<Setting>();
        }
        return this.settings;
    }

    /**
     * Gets the value of the experimentData property.
     * 
     * @return
     *     possible object is
     *     {@link AdGroupExperimentData }
     *     
     */
    public AdGroupExperimentData getExperimentData() {
        return experimentData;
    }

    /**
     * Sets the value of the experimentData property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdGroupExperimentData }
     *     
     */
    public void setExperimentData(AdGroupExperimentData value) {
        this.experimentData = value;
    }

    /**
     * Gets the value of the labels property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the labels property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLabels().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Label }
     * 
     * 
     */
    public List<Label> getLabels() {
        if (labels == null) {
            labels = new ArrayList<Label>();
        }
        return this.labels;
    }

    /**
     * Gets the value of the forwardCompatibilityMap property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the forwardCompatibilityMap property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getForwardCompatibilityMap().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StringStringMapEntry }
     * 
     * 
     */
    public List<StringStringMapEntry> getForwardCompatibilityMap() {
        if (forwardCompatibilityMap == null) {
            forwardCompatibilityMap = new ArrayList<StringStringMapEntry>();
        }
        return this.forwardCompatibilityMap;
    }

    /**
     * Gets the value of the biddingStrategyConfiguration property.
     * 
     * @return
     *     possible object is
     *     {@link BiddingStrategyConfiguration }
     *     
     */
    public BiddingStrategyConfiguration getBiddingStrategyConfiguration() {
        return biddingStrategyConfiguration;
    }

    /**
     * Sets the value of the biddingStrategyConfiguration property.
     * 
     * @param value
     *     allowed object is
     *     {@link BiddingStrategyConfiguration }
     *     
     */
    public void setBiddingStrategyConfiguration(BiddingStrategyConfiguration value) {
        this.biddingStrategyConfiguration = value;
    }

    /**
     * Gets the value of the contentBidCriterionTypeGroup property.
     * 
     * @return
     *     possible object is
     *     {@link CriterionTypeGroup }
     *     
     */
    public CriterionTypeGroup getContentBidCriterionTypeGroup() {
        return contentBidCriterionTypeGroup;
    }

    /**
     * Sets the value of the contentBidCriterionTypeGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link CriterionTypeGroup }
     *     
     */
    public void setContentBidCriterionTypeGroup(CriterionTypeGroup value) {
        this.contentBidCriterionTypeGroup = value;
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

}
