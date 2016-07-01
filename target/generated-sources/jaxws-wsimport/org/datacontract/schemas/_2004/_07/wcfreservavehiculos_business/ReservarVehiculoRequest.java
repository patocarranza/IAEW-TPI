
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
 * <p>Clase Java para ReservarVehiculoRequest complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ReservarVehiculoRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ApellidoNombreCliente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FechaHoraDevolucion" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="FechaHoraRetiro" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="IdVehiculoCiudad" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="LugarDevolucion" type="{http://schemas.datacontract.org/2004/07/WCFReservaVehiculos.Business.Entities}LugarRetiroDevolucion" minOccurs="0"/>
 *         &lt;element name="LugarRetiro" type="{http://schemas.datacontract.org/2004/07/WCFReservaVehiculos.Business.Entities}LugarRetiroDevolucion" minOccurs="0"/>
 *         &lt;element name="NroDocumentoCliente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReservarVehiculoRequest", propOrder = {
    "apellidoNombreCliente",
    "fechaHoraDevolucion",
    "fechaHoraRetiro",
    "idVehiculoCiudad",
    "lugarDevolucion",
    "lugarRetiro",
    "nroDocumentoCliente"
})
public class ReservarVehiculoRequest {

    @XmlElementRef(name = "ApellidoNombreCliente", namespace = "http://schemas.datacontract.org/2004/07/WCFReservaVehiculos.Business.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> apellidoNombreCliente;
    @XmlElement(name = "FechaHoraDevolucion")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaHoraDevolucion;
    @XmlElement(name = "FechaHoraRetiro")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaHoraRetiro;
    @XmlElement(name = "IdVehiculoCiudad")
    protected Integer idVehiculoCiudad;
    @XmlElement(name = "LugarDevolucion")
    protected LugarRetiroDevolucion lugarDevolucion;
    @XmlElement(name = "LugarRetiro")
    protected LugarRetiroDevolucion lugarRetiro;
    @XmlElementRef(name = "NroDocumentoCliente", namespace = "http://schemas.datacontract.org/2004/07/WCFReservaVehiculos.Business.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nroDocumentoCliente;

    /**
     * Obtiene el valor de la propiedad apellidoNombreCliente.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getApellidoNombreCliente() {
        return apellidoNombreCliente;
    }

    /**
     * Define el valor de la propiedad apellidoNombreCliente.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setApellidoNombreCliente(JAXBElement<String> value) {
        this.apellidoNombreCliente = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaHoraDevolucion.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaHoraDevolucion() {
        return fechaHoraDevolucion;
    }

    /**
     * Define el valor de la propiedad fechaHoraDevolucion.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaHoraDevolucion(XMLGregorianCalendar value) {
        this.fechaHoraDevolucion = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaHoraRetiro.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaHoraRetiro() {
        return fechaHoraRetiro;
    }

    /**
     * Define el valor de la propiedad fechaHoraRetiro.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaHoraRetiro(XMLGregorianCalendar value) {
        this.fechaHoraRetiro = value;
    }

    /**
     * Obtiene el valor de la propiedad idVehiculoCiudad.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdVehiculoCiudad() {
        return idVehiculoCiudad;
    }

    /**
     * Define el valor de la propiedad idVehiculoCiudad.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdVehiculoCiudad(Integer value) {
        this.idVehiculoCiudad = value;
    }

    /**
     * Obtiene el valor de la propiedad lugarDevolucion.
     * 
     * @return
     *     possible object is
     *     {@link LugarRetiroDevolucion }
     *     
     */
    public LugarRetiroDevolucion getLugarDevolucion() {
        return lugarDevolucion;
    }

    /**
     * Define el valor de la propiedad lugarDevolucion.
     * 
     * @param value
     *     allowed object is
     *     {@link LugarRetiroDevolucion }
     *     
     */
    public void setLugarDevolucion(LugarRetiroDevolucion value) {
        this.lugarDevolucion = value;
    }

    /**
     * Obtiene el valor de la propiedad lugarRetiro.
     * 
     * @return
     *     possible object is
     *     {@link LugarRetiroDevolucion }
     *     
     */
    public LugarRetiroDevolucion getLugarRetiro() {
        return lugarRetiro;
    }

    /**
     * Define el valor de la propiedad lugarRetiro.
     * 
     * @param value
     *     allowed object is
     *     {@link LugarRetiroDevolucion }
     *     
     */
    public void setLugarRetiro(LugarRetiroDevolucion value) {
        this.lugarRetiro = value;
    }

    /**
     * Obtiene el valor de la propiedad nroDocumentoCliente.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNroDocumentoCliente() {
        return nroDocumentoCliente;
    }

    /**
     * Define el valor de la propiedad nroDocumentoCliente.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNroDocumentoCliente(JAXBElement<String> value) {
        this.nroDocumentoCliente = value;
    }

}
