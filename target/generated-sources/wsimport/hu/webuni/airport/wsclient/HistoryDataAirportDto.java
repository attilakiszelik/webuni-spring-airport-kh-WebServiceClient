
package hu.webuni.airport.wsclient;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for historyDataAirportDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="historyDataAirportDto"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="data" type="{http://xmlws.airport.webuni.hu/}airportDto" minOccurs="0"/&gt;
 *         &lt;element name="date" type="{http://xmlws.airport.webuni.hu/}localDateTime" minOccurs="0"/&gt;
 *         &lt;element name="revType" type="{http://xmlws.airport.webuni.hu/}revTypeEnum" minOccurs="0"/&gt;
 *         &lt;element name="revision" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "historyDataAirportDto", propOrder = {
    "data",
    "date",
    "revType",
    "revision"
})
public class HistoryDataAirportDto {

    protected AirportDto data;
    protected LocalDateTime date;
    @XmlSchemaType(name = "string")
    protected RevTypeEnum revType;
    protected Integer revision;

    /**
     * Gets the value of the data property.
     * 
     * @return
     *     possible object is
     *     {@link AirportDto }
     *     
     */
    public AirportDto getData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirportDto }
     *     
     */
    public void setData(AirportDto value) {
        this.data = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link LocalDateTime }
     *     
     */
    public LocalDateTime getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalDateTime }
     *     
     */
    public void setDate(LocalDateTime value) {
        this.date = value;
    }

    /**
     * Gets the value of the revType property.
     * 
     * @return
     *     possible object is
     *     {@link RevTypeEnum }
     *     
     */
    public RevTypeEnum getRevType() {
        return revType;
    }

    /**
     * Sets the value of the revType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RevTypeEnum }
     *     
     */
    public void setRevType(RevTypeEnum value) {
        this.revType = value;
    }

    /**
     * Gets the value of the revision property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRevision() {
        return revision;
    }

    /**
     * Sets the value of the revision property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRevision(Integer value) {
        this.revision = value;
    }

}
