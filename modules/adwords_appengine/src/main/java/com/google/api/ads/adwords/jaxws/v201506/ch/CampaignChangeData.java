
package com.google.api.ads.adwords.jaxws.v201506.ch;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Holds information about a changed campaign and any ad groups under
 *             that have changed.
 *           
 * 
 * <p>Java class for CampaignChangeData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CampaignChangeData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="campaignId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="campaignChangeStatus" type="{https://adwords.google.com/api/adwords/ch/v201506}ChangeStatus" minOccurs="0"/>
 *         &lt;element name="changedAdGroups" type="{https://adwords.google.com/api/adwords/ch/v201506}AdGroupChangeData" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="addedCampaignCriteria" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="removedCampaignCriteria" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="addedAdExtensions" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="removedAdExtensions" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="changedFeeds" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="removedFeeds" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CampaignChangeData", propOrder = {
    "campaignId",
    "campaignChangeStatus",
    "changedAdGroups",
    "addedCampaignCriteria",
    "removedCampaignCriteria",
    "addedAdExtensions",
    "removedAdExtensions",
    "changedFeeds",
    "removedFeeds"
})
public class CampaignChangeData {

    protected Long campaignId;
    protected ChangeStatus campaignChangeStatus;
    protected List<AdGroupChangeData> changedAdGroups;
    @XmlElement(type = Long.class)
    protected List<Long> addedCampaignCriteria;
    @XmlElement(type = Long.class)
    protected List<Long> removedCampaignCriteria;
    @XmlElement(type = Long.class)
    protected List<Long> addedAdExtensions;
    @XmlElement(type = Long.class)
    protected List<Long> removedAdExtensions;
    @XmlElement(type = Long.class)
    protected List<Long> changedFeeds;
    @XmlElement(type = Long.class)
    protected List<Long> removedFeeds;

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
     * Gets the value of the campaignChangeStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ChangeStatus }
     *     
     */
    public ChangeStatus getCampaignChangeStatus() {
        return campaignChangeStatus;
    }

    /**
     * Sets the value of the campaignChangeStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChangeStatus }
     *     
     */
    public void setCampaignChangeStatus(ChangeStatus value) {
        this.campaignChangeStatus = value;
    }

    /**
     * Gets the value of the changedAdGroups property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the changedAdGroups property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChangedAdGroups().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdGroupChangeData }
     * 
     * 
     */
    public List<AdGroupChangeData> getChangedAdGroups() {
        if (changedAdGroups == null) {
            changedAdGroups = new ArrayList<AdGroupChangeData>();
        }
        return this.changedAdGroups;
    }

    /**
     * Gets the value of the addedCampaignCriteria property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addedCampaignCriteria property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddedCampaignCriteria().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getAddedCampaignCriteria() {
        if (addedCampaignCriteria == null) {
            addedCampaignCriteria = new ArrayList<Long>();
        }
        return this.addedCampaignCriteria;
    }

    /**
     * Gets the value of the removedCampaignCriteria property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the removedCampaignCriteria property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRemovedCampaignCriteria().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getRemovedCampaignCriteria() {
        if (removedCampaignCriteria == null) {
            removedCampaignCriteria = new ArrayList<Long>();
        }
        return this.removedCampaignCriteria;
    }

    /**
     * Gets the value of the addedAdExtensions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addedAdExtensions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddedAdExtensions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getAddedAdExtensions() {
        if (addedAdExtensions == null) {
            addedAdExtensions = new ArrayList<Long>();
        }
        return this.addedAdExtensions;
    }

    /**
     * Gets the value of the removedAdExtensions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the removedAdExtensions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRemovedAdExtensions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getRemovedAdExtensions() {
        if (removedAdExtensions == null) {
            removedAdExtensions = new ArrayList<Long>();
        }
        return this.removedAdExtensions;
    }

    /**
     * Gets the value of the changedFeeds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the changedFeeds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChangedFeeds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getChangedFeeds() {
        if (changedFeeds == null) {
            changedFeeds = new ArrayList<Long>();
        }
        return this.changedFeeds;
    }

    /**
     * Gets the value of the removedFeeds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the removedFeeds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRemovedFeeds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getRemovedFeeds() {
        if (removedFeeds == null) {
            removedFeeds = new ArrayList<Long>();
        }
        return this.removedFeeds;
    }

}
