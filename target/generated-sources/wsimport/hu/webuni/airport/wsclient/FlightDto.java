
package hu.webuni.airport.wsclient;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for flightDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="flightDto"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="flightNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="landing" type="{http://xmlws.airport.webuni.hu/}airportDto" minOccurs="0"/&gt;
 *         &lt;element name="takeoff" type="{http://xmlws.airport.webuni.hu/}airportDto" minOccurs="0"/&gt;
 *         &lt;element name="takeoffTime" type="{http://xmlws.airport.webuni.hu/}localDateTime" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "flightDto", propOrder = {
    "flightNumber",
    "id",
    "landing",
    "takeoff",
    "takeoffTime"
})
public class FlightDto {

    protected String flightNumber;
    protected Long id;
    protected AirportDto landing;
    protected AirportDto takeoff;
    protected LocalDateTime takeoffTime;

    /**
     * Gets the value of the flightNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlightNumber() {
        return flightNumber;
    }

    /**
     * Sets the value of the flightNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlightNumber(String value) {
        this.flightNumber = value;
    }

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
     * Gets the value of the landing property.
     * 
     * @return
     *     possible object is
     *     {@link AirportDto }
     *     
     */
    public AirportDto getLanding() {
        return landing;
    }

    /**
     * Sets the value of the landing property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirportDto }
     *     
     */
    public void setLanding(AirportDto value) {
        this.landing = value;
    }

    /**
     * Gets the value of the takeoff property.
     * 
     * @return
     *     possible object is
     *     {@link AirportDto }
     *     
     */
    public AirportDto getTakeoff() {
        return takeoff;
    }

    /**
     * Sets the value of the takeoff property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirportDto }
     *     
     */
    public void setTakeoff(AirportDto value) {
        this.takeoff = value;
    }

    /**
     * Gets the value of the takeoffTime property.
     * 
     * @return
     *     possible object is
     *     {@link LocalDateTime }
     *     
     */
    public LocalDateTime getTakeoffTime() {
        return takeoffTime;
    }

    /**
     * Sets the value of the takeoffTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalDateTime }
     *     
     */
    public void setTakeoffTime(LocalDateTime value) {
        this.takeoffTime = value;
    }

}
