
package hu.webuni.airport.wsclient;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for airportDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="airportDto"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="address" type="{http://xmlws.airport.webuni.hu/}addressDto" minOccurs="0"/&gt;
 *         &lt;element name="arrivals" type="{http://xmlws.airport.webuni.hu/}flightDto" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="departures" type="{http://xmlws.airport.webuni.hu/}flightDto" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="iata" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "airportDto", propOrder = {
    "address",
    "arrivals",
    "departures",
    "iata",
    "id",
    "name"
})
public class AirportDto {

    protected AddressDto address;
    @XmlElement(nillable = true)
    protected List<FlightDto> arrivals;
    @XmlElement(nillable = true)
    protected List<FlightDto> departures;
    protected String iata;
    protected Long id;
    protected String name;

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link AddressDto }
     *     
     */
    public AddressDto getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressDto }
     *     
     */
    public void setAddress(AddressDto value) {
        this.address = value;
    }

    /**
     * Gets the value of the arrivals property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the arrivals property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArrivals().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FlightDto }
     * 
     * 
     */
    public List<FlightDto> getArrivals() {
        if (arrivals == null) {
            arrivals = new ArrayList<FlightDto>();
        }
        return this.arrivals;
    }

    /**
     * Gets the value of the departures property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the departures property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDepartures().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FlightDto }
     * 
     * 
     */
    public List<FlightDto> getDepartures() {
        if (departures == null) {
            departures = new ArrayList<FlightDto>();
        }
        return this.departures;
    }

    /**
     * Gets the value of the iata property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIata() {
        return iata;
    }

    /**
     * Sets the value of the iata property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIata(String value) {
        this.iata = value;
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

}
