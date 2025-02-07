
package com.google.api.ads.adwords.jaxws.v201506.cm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Represents a Proximity Criterion.
 *             
 *             A proximity is an area within a certain radius of a point with the center point being described
 *             by a lat/long pair. The caller may also alternatively provide address fields which will be
 *             geocoded into a lat/long pair. Note: If a geoPoint value is provided, the address is not
 *             used for calculating the lat/long to target.
 *             <p> A criterion of this type is only targetable.
 *             <span class="constraint AdxEnabled">This is enabled for AdX.</span>
 *           
 * 
 * <p>Java class for Proximity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Proximity">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201506}Criterion">
 *       &lt;sequence>
 *         &lt;element name="geoPoint" type="{https://adwords.google.com/api/adwords/cm/v201506}GeoPoint" minOccurs="0"/>
 *         &lt;element name="radiusDistanceUnits" type="{https://adwords.google.com/api/adwords/cm/v201506}Proximity.DistanceUnits" minOccurs="0"/>
 *         &lt;element name="radiusInUnits" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="address" type="{https://adwords.google.com/api/adwords/cm/v201506}Address" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Proximity", propOrder = {
    "geoPoint",
    "radiusDistanceUnits",
    "radiusInUnits",
    "address"
})
public class Proximity
    extends Criterion
{

    protected GeoPoint geoPoint;
    protected ProximityDistanceUnits radiusDistanceUnits;
    protected Double radiusInUnits;
    protected Address address;

    /**
     * Gets the value of the geoPoint property.
     * 
     * @return
     *     possible object is
     *     {@link GeoPoint }
     *     
     */
    public GeoPoint getGeoPoint() {
        return geoPoint;
    }

    /**
     * Sets the value of the geoPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeoPoint }
     *     
     */
    public void setGeoPoint(GeoPoint value) {
        this.geoPoint = value;
    }

    /**
     * Gets the value of the radiusDistanceUnits property.
     * 
     * @return
     *     possible object is
     *     {@link ProximityDistanceUnits }
     *     
     */
    public ProximityDistanceUnits getRadiusDistanceUnits() {
        return radiusDistanceUnits;
    }

    /**
     * Sets the value of the radiusDistanceUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProximityDistanceUnits }
     *     
     */
    public void setRadiusDistanceUnits(ProximityDistanceUnits value) {
        this.radiusDistanceUnits = value;
    }

    /**
     * Gets the value of the radiusInUnits property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRadiusInUnits() {
        return radiusInUnits;
    }

    /**
     * Sets the value of the radiusInUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRadiusInUnits(Double value) {
        this.radiusInUnits = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setAddress(Address value) {
        this.address = value;
    }

}
