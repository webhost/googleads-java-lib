
package com.google.api.ads.adwords.jaxws.v201506.cm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Represents a field in a template element.
 *           
 * 
 * <p>Java class for TemplateElementField complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TemplateElementField">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="type" type="{https://adwords.google.com/api/adwords/cm/v201506}TemplateElementField.Type" minOccurs="0"/>
 *         &lt;element name="fieldText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fieldMedia" type="{https://adwords.google.com/api/adwords/cm/v201506}Media" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TemplateElementField", propOrder = {
    "name",
    "type",
    "fieldText",
    "fieldMedia"
})
public class TemplateElementField {

    protected String name;
    protected TemplateElementFieldType type;
    protected String fieldText;
    protected Media fieldMedia;

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
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link TemplateElementFieldType }
     *     
     */
    public TemplateElementFieldType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link TemplateElementFieldType }
     *     
     */
    public void setType(TemplateElementFieldType value) {
        this.type = value;
    }

    /**
     * Gets the value of the fieldText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFieldText() {
        return fieldText;
    }

    /**
     * Sets the value of the fieldText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFieldText(String value) {
        this.fieldText = value;
    }

    /**
     * Gets the value of the fieldMedia property.
     * 
     * @return
     *     possible object is
     *     {@link Media }
     *     
     */
    public Media getFieldMedia() {
        return fieldMedia;
    }

    /**
     * Sets the value of the fieldMedia property.
     * 
     * @param value
     *     allowed object is
     *     {@link Media }
     *     
     */
    public void setFieldMedia(Media value) {
        this.fieldMedia = value;
    }

}
