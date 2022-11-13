
package hu.webuni.airport.wsclient;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for revTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="revTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ADD"/&gt;
 *     &lt;enumeration value="MOD"/&gt;
 *     &lt;enumeration value="DEL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "revTypeEnum")
@XmlEnum
public enum RevTypeEnum {

    ADD,
    MOD,
    DEL;

    public String value() {
        return name();
    }

    public static RevTypeEnum fromValue(String v) {
        return valueOf(v);
    }

}
