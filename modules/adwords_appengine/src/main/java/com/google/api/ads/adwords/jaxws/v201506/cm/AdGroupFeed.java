
package com.google.api.ads.adwords.jaxws.v201506.cm;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             AdGroupFeeds are used to link a feed to an adgroup using a matching function,
 *             making the feed's feed items available in the adgroup's ads for substitution.
 *           
 * 
 * <p>Java class for AdGroupFeed complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdGroupFeed">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="feedId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="adGroupId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="matchingFunction" type="{https://adwords.google.com/api/adwords/cm/v201506}Function" minOccurs="0"/>
 *         &lt;element name="placeholderTypes" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="status" type="{https://adwords.google.com/api/adwords/cm/v201506}AdGroupFeed.Status" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdGroupFeed", propOrder = {
    "feedId",
    "adGroupId",
    "matchingFunction",
    "placeholderTypes",
    "status"
})
public class AdGroupFeed {

    protected Long feedId;
    protected Long adGroupId;
    protected Function matchingFunction;
    @XmlElement(type = Integer.class)
    protected List<Integer> placeholderTypes;
    protected AdGroupFeedStatus status;

    /**
     * Gets the value of the feedId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFeedId() {
        return feedId;
    }

    /**
     * Sets the value of the feedId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFeedId(Long value) {
        this.feedId = value;
    }

    /**
     * Gets the value of the adGroupId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAdGroupId() {
        return adGroupId;
    }

    /**
     * Sets the value of the adGroupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAdGroupId(Long value) {
        this.adGroupId = value;
    }

    /**
     * Gets the value of the matchingFunction property.
     * 
     * @return
     *     possible object is
     *     {@link Function }
     *     
     */
    public Function getMatchingFunction() {
        return matchingFunction;
    }

    /**
     * Sets the value of the matchingFunction property.
     * 
     * @param value
     *     allowed object is
     *     {@link Function }
     *     
     */
    public void setMatchingFunction(Function value) {
        this.matchingFunction = value;
    }

    /**
     * Gets the value of the placeholderTypes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the placeholderTypes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPlaceholderTypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getPlaceholderTypes() {
        if (placeholderTypes == null) {
            placeholderTypes = new ArrayList<Integer>();
        }
        return this.placeholderTypes;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link AdGroupFeedStatus }
     *     
     */
    public AdGroupFeedStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdGroupFeedStatus }
     *     
     */
    public void setStatus(AdGroupFeedStatus value) {
        this.status = value;
    }

}
