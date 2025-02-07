
package com.google.api.ads.adwords.jaxws.v201506.cm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Represents a FeedItem schedule, which specifies a time interval on a given day
 *             when the feed item may serve. The FeedItemSchedule times are in the account's time zone.
 *           
 * 
 * <p>Java class for FeedItemSchedule complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FeedItemSchedule">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dayOfWeek" type="{https://adwords.google.com/api/adwords/cm/v201506}DayOfWeek" minOccurs="0"/>
 *         &lt;element name="startHour" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="startMinute" type="{https://adwords.google.com/api/adwords/cm/v201506}MinuteOfHour" minOccurs="0"/>
 *         &lt;element name="endHour" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="endMinute" type="{https://adwords.google.com/api/adwords/cm/v201506}MinuteOfHour" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FeedItemSchedule", propOrder = {
    "dayOfWeek",
    "startHour",
    "startMinute",
    "endHour",
    "endMinute"
})
public class FeedItemSchedule {

    protected DayOfWeek dayOfWeek;
    protected Integer startHour;
    protected MinuteOfHour startMinute;
    protected Integer endHour;
    protected MinuteOfHour endMinute;

    /**
     * Gets the value of the dayOfWeek property.
     * 
     * @return
     *     possible object is
     *     {@link DayOfWeek }
     *     
     */
    public DayOfWeek getDayOfWeek() {
        return dayOfWeek;
    }

    /**
     * Sets the value of the dayOfWeek property.
     * 
     * @param value
     *     allowed object is
     *     {@link DayOfWeek }
     *     
     */
    public void setDayOfWeek(DayOfWeek value) {
        this.dayOfWeek = value;
    }

    /**
     * Gets the value of the startHour property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStartHour() {
        return startHour;
    }

    /**
     * Sets the value of the startHour property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStartHour(Integer value) {
        this.startHour = value;
    }

    /**
     * Gets the value of the startMinute property.
     * 
     * @return
     *     possible object is
     *     {@link MinuteOfHour }
     *     
     */
    public MinuteOfHour getStartMinute() {
        return startMinute;
    }

    /**
     * Sets the value of the startMinute property.
     * 
     * @param value
     *     allowed object is
     *     {@link MinuteOfHour }
     *     
     */
    public void setStartMinute(MinuteOfHour value) {
        this.startMinute = value;
    }

    /**
     * Gets the value of the endHour property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEndHour() {
        return endHour;
    }

    /**
     * Sets the value of the endHour property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEndHour(Integer value) {
        this.endHour = value;
    }

    /**
     * Gets the value of the endMinute property.
     * 
     * @return
     *     possible object is
     *     {@link MinuteOfHour }
     *     
     */
    public MinuteOfHour getEndMinute() {
        return endMinute;
    }

    /**
     * Sets the value of the endMinute property.
     * 
     * @param value
     *     allowed object is
     *     {@link MinuteOfHour }
     *     
     */
    public void setEndMinute(MinuteOfHour value) {
        this.endMinute = value;
    }

}
