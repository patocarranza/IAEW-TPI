
package org.datacontract.schemas._2004._07.wcfreservavehiculos_business;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ConsultarReservasResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConsultarReservasResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Reservas" type="{http://schemas.datacontract.org/2004/07/WCFReservaVehiculos.Business.DataBaseModel}ArrayOfReservaEntity" minOccurs="0"/>
 *         &lt;element name="TimeStamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsultarReservasResponse", propOrder = {
    "reservas",
    "timeStamp"
})
public class ConsultarReservasResponse {

    @XmlElementRef(name = "Reservas", namespace = "http://schemas.datacontract.org/2004/07/WCFReservaVehiculos.Business.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfReservaEntity> reservas;
    @XmlElement(name = "TimeStamp")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timeStamp;

    /**
     * Gets the value of the reservas property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfReservaEntity }{@code >}
     *     
     */
    public JAXBElement<ArrayOfReservaEntity> getReservas() {
        return reservas;
    }

    /**
     * Sets the value of the reservas property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfReservaEntity }{@code >}
     *     
     */
    public void setReservas(JAXBElement<ArrayOfReservaEntity> value) {
        this.reservas = value;
    }

    /**
     * Gets the value of the timeStamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimeStamp() {
        return timeStamp;
    }

    /**
     * Sets the value of the timeStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimeStamp(XMLGregorianCalendar value) {
        this.timeStamp = value;
    }

}
