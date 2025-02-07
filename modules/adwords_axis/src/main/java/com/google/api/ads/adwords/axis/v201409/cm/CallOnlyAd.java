/**
 * CallOnlyAd.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201409.cm;


/**
 * Represents a CallOnlyAd.
 *             
 *             <p class="caution"><b>Caution:</b> Call only ads do not
 * use {@link #url url},
 *             {@link #finalUrls finalUrls}, {@link #finalMobileUrls
 * finalMobileUrls},
 *             {@link #finalAppUrls finalAppUrls}, {@link #urlCustomParameters
 * urlCustomParameters},
 *             or {@link #trackingUrlTemplate trackingUrlTemplate};
 *             setting these fields on a call only ad will cause an error.
 * <span class="constraint AdxEnabled">This is enabled for AdX.</span>
 */
public class CallOnlyAd  extends com.google.api.ads.adwords.axis.v201409.cm.Ad  implements java.io.Serializable {
    /* Two letter country code for the ad. Examples: 'US', 'GB'. */
    private java.lang.String countryCode;

    /* Phone number string for the ad.
     *                     Examples: '(800) 356-9377', "16502531234", "+442001234567" */
    private java.lang.String phoneNumber;

    /* Business name of the ad. */
    private java.lang.String businessName;

    /* First line of ad text. */
    private java.lang.String description1;

    /* Second line of ad text. */
    private java.lang.String description2;

    /* If set to true, enable call tracking for the creative. Enabling
     * call
     *                     tracking also enables call conversions. */
    private java.lang.Boolean callTracked;

    /* Conversion type to attribute a call conversion to. If not set,
     * then a
     *                     default conversion type id is used. Only in effect
     * if callTracked is also
     *                     set to true otherwise this field is ignored. */
    private java.lang.Long conversionTypeId;

    /* Url to be used for phone number verification. */
    private java.lang.String phoneNumberVerificationUrl;

    public CallOnlyAd() {
    }

    public CallOnlyAd(
           java.lang.Long id,
           java.lang.String url,
           java.lang.String displayUrl,
           java.lang.String[] finalUrls,
           java.lang.String[] finalMobileUrls,
           com.google.api.ads.adwords.axis.v201409.cm.AppUrl[] finalAppUrls,
           java.lang.String trackingUrlTemplate,
           com.google.api.ads.adwords.axis.v201409.cm.CustomParameters urlCustomParameters,
           java.lang.Long devicePreference,
           java.lang.String adType,
           java.lang.String countryCode,
           java.lang.String phoneNumber,
           java.lang.String businessName,
           java.lang.String description1,
           java.lang.String description2,
           java.lang.Boolean callTracked,
           java.lang.Long conversionTypeId,
           java.lang.String phoneNumberVerificationUrl) {
        super(
            id,
            url,
            displayUrl,
            finalUrls,
            finalMobileUrls,
            finalAppUrls,
            trackingUrlTemplate,
            urlCustomParameters,
            devicePreference,
            adType);
        this.countryCode = countryCode;
        this.phoneNumber = phoneNumber;
        this.businessName = businessName;
        this.description1 = description1;
        this.description2 = description2;
        this.callTracked = callTracked;
        this.conversionTypeId = conversionTypeId;
        this.phoneNumberVerificationUrl = phoneNumberVerificationUrl;
    }


    /**
     * Gets the countryCode value for this CallOnlyAd.
     * 
     * @return countryCode   * Two letter country code for the ad. Examples: 'US', 'GB'.
     */
    public java.lang.String getCountryCode() {
        return countryCode;
    }


    /**
     * Sets the countryCode value for this CallOnlyAd.
     * 
     * @param countryCode   * Two letter country code for the ad. Examples: 'US', 'GB'.
     */
    public void setCountryCode(java.lang.String countryCode) {
        this.countryCode = countryCode;
    }


    /**
     * Gets the phoneNumber value for this CallOnlyAd.
     * 
     * @return phoneNumber   * Phone number string for the ad.
     *                     Examples: '(800) 356-9377', "16502531234", "+442001234567"
     */
    public java.lang.String getPhoneNumber() {
        return phoneNumber;
    }


    /**
     * Sets the phoneNumber value for this CallOnlyAd.
     * 
     * @param phoneNumber   * Phone number string for the ad.
     *                     Examples: '(800) 356-9377', "16502531234", "+442001234567"
     */
    public void setPhoneNumber(java.lang.String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    /**
     * Gets the businessName value for this CallOnlyAd.
     * 
     * @return businessName   * Business name of the ad.
     */
    public java.lang.String getBusinessName() {
        return businessName;
    }


    /**
     * Sets the businessName value for this CallOnlyAd.
     * 
     * @param businessName   * Business name of the ad.
     */
    public void setBusinessName(java.lang.String businessName) {
        this.businessName = businessName;
    }


    /**
     * Gets the description1 value for this CallOnlyAd.
     * 
     * @return description1   * First line of ad text.
     */
    public java.lang.String getDescription1() {
        return description1;
    }


    /**
     * Sets the description1 value for this CallOnlyAd.
     * 
     * @param description1   * First line of ad text.
     */
    public void setDescription1(java.lang.String description1) {
        this.description1 = description1;
    }


    /**
     * Gets the description2 value for this CallOnlyAd.
     * 
     * @return description2   * Second line of ad text.
     */
    public java.lang.String getDescription2() {
        return description2;
    }


    /**
     * Sets the description2 value for this CallOnlyAd.
     * 
     * @param description2   * Second line of ad text.
     */
    public void setDescription2(java.lang.String description2) {
        this.description2 = description2;
    }


    /**
     * Gets the callTracked value for this CallOnlyAd.
     * 
     * @return callTracked   * If set to true, enable call tracking for the creative. Enabling
     * call
     *                     tracking also enables call conversions.
     */
    public java.lang.Boolean getCallTracked() {
        return callTracked;
    }


    /**
     * Sets the callTracked value for this CallOnlyAd.
     * 
     * @param callTracked   * If set to true, enable call tracking for the creative. Enabling
     * call
     *                     tracking also enables call conversions.
     */
    public void setCallTracked(java.lang.Boolean callTracked) {
        this.callTracked = callTracked;
    }


    /**
     * Gets the conversionTypeId value for this CallOnlyAd.
     * 
     * @return conversionTypeId   * Conversion type to attribute a call conversion to. If not set,
     * then a
     *                     default conversion type id is used. Only in effect
     * if callTracked is also
     *                     set to true otherwise this field is ignored.
     */
    public java.lang.Long getConversionTypeId() {
        return conversionTypeId;
    }


    /**
     * Sets the conversionTypeId value for this CallOnlyAd.
     * 
     * @param conversionTypeId   * Conversion type to attribute a call conversion to. If not set,
     * then a
     *                     default conversion type id is used. Only in effect
     * if callTracked is also
     *                     set to true otherwise this field is ignored.
     */
    public void setConversionTypeId(java.lang.Long conversionTypeId) {
        this.conversionTypeId = conversionTypeId;
    }


    /**
     * Gets the phoneNumberVerificationUrl value for this CallOnlyAd.
     * 
     * @return phoneNumberVerificationUrl   * Url to be used for phone number verification.
     */
    public java.lang.String getPhoneNumberVerificationUrl() {
        return phoneNumberVerificationUrl;
    }


    /**
     * Sets the phoneNumberVerificationUrl value for this CallOnlyAd.
     * 
     * @param phoneNumberVerificationUrl   * Url to be used for phone number verification.
     */
    public void setPhoneNumberVerificationUrl(java.lang.String phoneNumberVerificationUrl) {
        this.phoneNumberVerificationUrl = phoneNumberVerificationUrl;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CallOnlyAd)) return false;
        CallOnlyAd other = (CallOnlyAd) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.countryCode==null && other.getCountryCode()==null) || 
             (this.countryCode!=null &&
              this.countryCode.equals(other.getCountryCode()))) &&
            ((this.phoneNumber==null && other.getPhoneNumber()==null) || 
             (this.phoneNumber!=null &&
              this.phoneNumber.equals(other.getPhoneNumber()))) &&
            ((this.businessName==null && other.getBusinessName()==null) || 
             (this.businessName!=null &&
              this.businessName.equals(other.getBusinessName()))) &&
            ((this.description1==null && other.getDescription1()==null) || 
             (this.description1!=null &&
              this.description1.equals(other.getDescription1()))) &&
            ((this.description2==null && other.getDescription2()==null) || 
             (this.description2!=null &&
              this.description2.equals(other.getDescription2()))) &&
            ((this.callTracked==null && other.getCallTracked()==null) || 
             (this.callTracked!=null &&
              this.callTracked.equals(other.getCallTracked()))) &&
            ((this.conversionTypeId==null && other.getConversionTypeId()==null) || 
             (this.conversionTypeId!=null &&
              this.conversionTypeId.equals(other.getConversionTypeId()))) &&
            ((this.phoneNumberVerificationUrl==null && other.getPhoneNumberVerificationUrl()==null) || 
             (this.phoneNumberVerificationUrl!=null &&
              this.phoneNumberVerificationUrl.equals(other.getPhoneNumberVerificationUrl())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getCountryCode() != null) {
            _hashCode += getCountryCode().hashCode();
        }
        if (getPhoneNumber() != null) {
            _hashCode += getPhoneNumber().hashCode();
        }
        if (getBusinessName() != null) {
            _hashCode += getBusinessName().hashCode();
        }
        if (getDescription1() != null) {
            _hashCode += getDescription1().hashCode();
        }
        if (getDescription2() != null) {
            _hashCode += getDescription2().hashCode();
        }
        if (getCallTracked() != null) {
            _hashCode += getCallTracked().hashCode();
        }
        if (getConversionTypeId() != null) {
            _hashCode += getConversionTypeId().hashCode();
        }
        if (getPhoneNumberVerificationUrl() != null) {
            _hashCode += getPhoneNumberVerificationUrl().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CallOnlyAd.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201409", "CallOnlyAd"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countryCode");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201409", "countryCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phoneNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201409", "phoneNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("businessName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201409", "businessName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description1");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201409", "description1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description2");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201409", "description2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callTracked");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201409", "callTracked"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("conversionTypeId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201409", "conversionTypeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phoneNumberVerificationUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201409", "phoneNumberVerificationUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
