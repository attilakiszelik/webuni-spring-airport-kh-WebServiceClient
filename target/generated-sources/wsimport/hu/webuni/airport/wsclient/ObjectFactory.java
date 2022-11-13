
package hu.webuni.airport.wsclient;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the hu.webuni.airport.wsclient package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetFlightDelay_QNAME = new QName("http://xmlws.airport.webuni.hu/", "getFlightDelay");
    private final static QName _GetHistoryById_QNAME = new QName("http://xmlws.airport.webuni.hu/", "getHistoryById");
    private final static QName _GetHistoryByIdResponse_QNAME = new QName("http://xmlws.airport.webuni.hu/", "getHistoryByIdResponse");
    private final static QName _GetFlightDelayResponse_QNAME = new QName("http://xmlws.airport.webuni.hu/", "getFlightDelayResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: hu.webuni.airport.wsclient
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetFlightDelay }
     * 
     */
    public GetFlightDelay createGetFlightDelay() {
        return new GetFlightDelay();
    }

    /**
     * Create an instance of {@link GetHistoryById }
     * 
     */
    public GetHistoryById createGetHistoryById() {
        return new GetHistoryById();
    }

    /**
     * Create an instance of {@link GetHistoryByIdResponse }
     * 
     */
    public GetHistoryByIdResponse createGetHistoryByIdResponse() {
        return new GetHistoryByIdResponse();
    }

    /**
     * Create an instance of {@link HistoryDataAirportDto }
     * 
     */
    public HistoryDataAirportDto createHistoryDataAirportDto() {
        return new HistoryDataAirportDto();
    }

    /**
     * Create an instance of {@link AirportDto }
     * 
     */
    public AirportDto createAirportDto() {
        return new AirportDto();
    }

    /**
     * Create an instance of {@link AddressDto }
     * 
     */
    public AddressDto createAddressDto() {
        return new AddressDto();
    }

    /**
     * Create an instance of {@link FlightDto }
     * 
     */
    public FlightDto createFlightDto() {
        return new FlightDto();
    }

    /**
     * Create an instance of {@link LocalDateTime }
     * 
     */
    public LocalDateTime createLocalDateTime() {
        return new LocalDateTime();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFlightDelay }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetFlightDelay }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlws.airport.webuni.hu/", name = "getFlightDelay")
    public JAXBElement<GetFlightDelay> createGetFlightDelay(GetFlightDelay value) {
        return new JAXBElement<GetFlightDelay>(_GetFlightDelay_QNAME, GetFlightDelay.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetHistoryById }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetHistoryById }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlws.airport.webuni.hu/", name = "getHistoryById")
    public JAXBElement<GetHistoryById> createGetHistoryById(GetHistoryById value) {
        return new JAXBElement<GetHistoryById>(_GetHistoryById_QNAME, GetHistoryById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetHistoryByIdResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetHistoryByIdResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlws.airport.webuni.hu/", name = "getHistoryByIdResponse")
    public JAXBElement<GetHistoryByIdResponse> createGetHistoryByIdResponse(GetHistoryByIdResponse value) {
        return new JAXBElement<GetHistoryByIdResponse>(_GetHistoryByIdResponse_QNAME, GetHistoryByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlws.airport.webuni.hu/", name = "getFlightDelayResponse")
    public JAXBElement<Integer> createGetFlightDelayResponse(Integer value) {
        return new JAXBElement<Integer>(_GetFlightDelayResponse_QNAME, Integer.class, null, value);
    }

}
