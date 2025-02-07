
package com.google.api.ads.adwords.jaxws.v201506.cm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Conversion optimizer bidding strategy helps you maximize your return on investment
 *             (ROI) by automatically getting you the most possible conversions for your budget.
 *             
 *             <p class="warning">{@code pricingMode} currently defaults to {@code CLICKS} and
 *             cannot be changed.</p>
 *             
 *             <p>Note that campaigns must meet <a
 *             href="https://support.google.com/adwords/answer/2471188#CORequirements">
 *             specific eligibility requirements</a> before they can use the
 *             <code>ConversionOptimizer</code> bidding strategy.</p>
 *             
 *             <p>For more information on conversion optimizer, visit the
 *             <a href="https://support.google.com/adwords/answer/2471188"
 *             >Conversion Optimizer help center</a>.</p>
 *             <span class="constraint AdxEnabled">This is disabled for AdX.</span>
 *           
 * 
 * <p>Java class for ConversionOptimizerBiddingScheme complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConversionOptimizerBiddingScheme">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201506}BiddingScheme">
 *       &lt;sequence>
 *         &lt;element name="pricingMode" type="{https://adwords.google.com/api/adwords/cm/v201506}ConversionOptimizerBiddingScheme.PricingMode" minOccurs="0"/>
 *         &lt;element name="bidType" type="{https://adwords.google.com/api/adwords/cm/v201506}ConversionOptimizerBiddingScheme.BidType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConversionOptimizerBiddingScheme", propOrder = {
    "pricingMode",
    "bidType"
})
public class ConversionOptimizerBiddingScheme
    extends BiddingScheme
{

    protected ConversionOptimizerBiddingSchemePricingMode pricingMode;
    protected ConversionOptimizerBiddingSchemeBidType bidType;

    /**
     * Gets the value of the pricingMode property.
     * 
     * @return
     *     possible object is
     *     {@link ConversionOptimizerBiddingSchemePricingMode }
     *     
     */
    public ConversionOptimizerBiddingSchemePricingMode getPricingMode() {
        return pricingMode;
    }

    /**
     * Sets the value of the pricingMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConversionOptimizerBiddingSchemePricingMode }
     *     
     */
    public void setPricingMode(ConversionOptimizerBiddingSchemePricingMode value) {
        this.pricingMode = value;
    }

    /**
     * Gets the value of the bidType property.
     * 
     * @return
     *     possible object is
     *     {@link ConversionOptimizerBiddingSchemeBidType }
     *     
     */
    public ConversionOptimizerBiddingSchemeBidType getBidType() {
        return bidType;
    }

    /**
     * Sets the value of the bidType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConversionOptimizerBiddingSchemeBidType }
     *     
     */
    public void setBidType(ConversionOptimizerBiddingSchemeBidType value) {
        this.bidType = value;
    }

}
