
package com.google.api.ads.adwords.jaxws.v201506.cm;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             A setting specifying when and which extensions should serve at a given level (customer, campaign,
 *             or ad group).
 *           
 * 
 * <p>Java class for ExtensionSetting complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExtensionSetting">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="extensions" type="{https://adwords.google.com/api/adwords/cm/v201506}ExtensionFeedItem" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="platformRestrictions" type="{https://adwords.google.com/api/adwords/cm/v201506}ExtensionSetting.Platform" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExtensionSetting", propOrder = {
    "extensions",
    "platformRestrictions"
})
public class ExtensionSetting {

    protected List<ExtensionFeedItem> extensions;
    protected ExtensionSettingPlatform platformRestrictions;

    /**
     * Gets the value of the extensions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extensions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtensions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExtensionFeedItem }
     * 
     * 
     */
    public List<ExtensionFeedItem> getExtensions() {
        if (extensions == null) {
            extensions = new ArrayList<ExtensionFeedItem>();
        }
        return this.extensions;
    }

    /**
     * Gets the value of the platformRestrictions property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionSettingPlatform }
     *     
     */
    public ExtensionSettingPlatform getPlatformRestrictions() {
        return platformRestrictions;
    }

    /**
     * Sets the value of the platformRestrictions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionSettingPlatform }
     *     
     */
    public void setPlatformRestrictions(ExtensionSettingPlatform value) {
        this.platformRestrictions = value;
    }

}
