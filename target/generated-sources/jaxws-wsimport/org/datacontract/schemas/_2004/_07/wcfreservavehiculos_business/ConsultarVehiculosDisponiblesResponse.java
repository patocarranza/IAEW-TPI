
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
 * <p>Clase Java para ConsultarVehiculosDisponiblesResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ConsultarVehiculosDisponiblesResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TimeStamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="VehiculosEncontrados" type="{http://schemas.datacontract.org/2004/07/WCFReservaVehiculos.Business.Entities}ArrayOfVehiculoModel" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsultarVehiculosDisponiblesResponse", propOrder = {
    "timeStamp",
    "vehiculosEncontrados"
})
public class ConsultarVehiculosDisponiblesResponse {

    @XmlElement(name = "TimeStamp")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timeStamp;
    @XmlElementRef(name = "VehiculosEncontrados", namespace = "http://schemas.datacontract.org/2004/07/WCFReservaVehiculos.Business.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfVehiculoModel> vehiculosEncontrados;

    /**
     * Obtiene el valor de la propiedad timeStamp.
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
     * Define el valor de la propiedad timeStamp.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimeStamp(XMLGregorianCalendar value) {
        this.timeStamp = value;
    }

    /**
     * Obtiene el valor de la propiedad vehiculosEncontrados.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfVehiculoModel }{@code >}
     *     
     */
    public JAXBElement<ArrayOfVehiculoModel> getVehiculosEncontrados() {
        return vehiculosEncontrados;
    }

    /**
     * Define el valor de la propiedad vehiculosEncontrados.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfVehiculoModel }{@code >}
     *     
     */
    public void setVehiculosEncontrados(JAXBElement<ArrayOfVehiculoModel> value) {
        this.vehiculosEncontrados = value;
    }

}
