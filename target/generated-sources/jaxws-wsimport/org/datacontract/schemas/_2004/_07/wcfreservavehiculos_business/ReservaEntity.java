
package org.datacontract.schemas._2004._07.wcfreservavehiculos_business;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para ReservaEntity complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ReservaEntity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ApellidoNombreCliente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodigoReserva" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Estado" type="{http://schemas.datacontract.org/2004/07/WCFReservaVehiculos.Business.DataBaseModel}EstadoReservaEnum" minOccurs="0"/>
 *         &lt;element name="FechaCancelacion" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="FechaHoraDevolucion" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="FechaHoraRetiro" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="FechaReserva" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="LugarDevolucion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LugarRetiro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NroDocumentoCliente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TotalReserva" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="UsuarioCancelacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UsuarioReserva" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VehiculoPorCiudadEntity" type="{http://schemas.datacontract.org/2004/07/WCFReservaVehiculos.Business.DataBaseModel}VehiculoPorCiudadEntity" minOccurs="0"/>
 *         &lt;element name="VehiculoPorCiudadId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReservaEntity", namespace = "http://schemas.datacontract.org/2004/07/WCFReservaVehiculos.Business.DataBaseModel", propOrder = {
    "apellidoNombreCliente",
    "codigoReserva",
    "estado",
    "fechaCancelacion",
    "fechaHoraDevolucion",
    "fechaHoraRetiro",
    "fechaReserva",
    "id",
    "lugarDevolucion",
    "lugarRetiro",
    "nroDocumentoCliente",
    "totalReserva",
    "usuarioCancelacion",
    "usuarioReserva",
    "vehiculoPorCiudadEntity",
    "vehiculoPorCiudadId"
})
public class ReservaEntity {

    @XmlElementRef(name = "ApellidoNombreCliente", namespace = "http://schemas.datacontract.org/2004/07/WCFReservaVehiculos.Business.DataBaseModel", type = JAXBElement.class, required = false)
    protected JAXBElement<String> apellidoNombreCliente;
    @XmlElementRef(name = "CodigoReserva", namespace = "http://schemas.datacontract.org/2004/07/WCFReservaVehiculos.Business.DataBaseModel", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codigoReserva;
    @XmlElement(name = "Estado")
    protected EstadoReservaEnum estado;
    @XmlElementRef(name = "FechaCancelacion", namespace = "http://schemas.datacontract.org/2004/07/WCFReservaVehiculos.Business.DataBaseModel", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> fechaCancelacion;
    @XmlElement(name = "FechaHoraDevolucion")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaHoraDevolucion;
    @XmlElement(name = "FechaHoraRetiro")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaHoraRetiro;
    @XmlElement(name = "FechaReserva")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaReserva;
    @XmlElement(name = "Id")
    protected Integer id;
    @XmlElementRef(name = "LugarDevolucion", namespace = "http://schemas.datacontract.org/2004/07/WCFReservaVehiculos.Business.DataBaseModel", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lugarDevolucion;
    @XmlElementRef(name = "LugarRetiro", namespace = "http://schemas.datacontract.org/2004/07/WCFReservaVehiculos.Business.DataBaseModel", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lugarRetiro;
    @XmlElementRef(name = "NroDocumentoCliente", namespace = "http://schemas.datacontract.org/2004/07/WCFReservaVehiculos.Business.DataBaseModel", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nroDocumentoCliente;
    @XmlElement(name = "TotalReserva")
    protected BigDecimal totalReserva;
    @XmlElementRef(name = "UsuarioCancelacion", namespace = "http://schemas.datacontract.org/2004/07/WCFReservaVehiculos.Business.DataBaseModel", type = JAXBElement.class, required = false)
    protected JAXBElement<String> usuarioCancelacion;
    @XmlElementRef(name = "UsuarioReserva", namespace = "http://schemas.datacontract.org/2004/07/WCFReservaVehiculos.Business.DataBaseModel", type = JAXBElement.class, required = false)
    protected JAXBElement<String> usuarioReserva;
    @XmlElementRef(name = "VehiculoPorCiudadEntity", namespace = "http://schemas.datacontract.org/2004/07/WCFReservaVehiculos.Business.DataBaseModel", type = JAXBElement.class, required = false)
    protected JAXBElement<VehiculoPorCiudadEntity> vehiculoPorCiudadEntity;
    @XmlElement(name = "VehiculoPorCiudadId")
    protected Integer vehiculoPorCiudadId;

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
     * Obtiene el valor de la propiedad codigoReserva.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodigoReserva() {
        return codigoReserva;
    }

    /**
     * Define el valor de la propiedad codigoReserva.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodigoReserva(JAXBElement<String> value) {
        this.codigoReserva = value;
    }

    /**
     * Obtiene el valor de la propiedad estado.
     * 
     * @return
     *     possible object is
     *     {@link EstadoReservaEnum }
     *     
     */
    public EstadoReservaEnum getEstado() {
        return estado;
    }

    /**
     * Define el valor de la propiedad estado.
     * 
     * @param value
     *     allowed object is
     *     {@link EstadoReservaEnum }
     *     
     */
    public void setEstado(EstadoReservaEnum value) {
        this.estado = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaCancelacion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getFechaCancelacion() {
        return fechaCancelacion;
    }

    /**
     * Define el valor de la propiedad fechaCancelacion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setFechaCancelacion(JAXBElement<XMLGregorianCalendar> value) {
        this.fechaCancelacion = value;
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
     * Obtiene el valor de la propiedad fechaReserva.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaReserva() {
        return fechaReserva;
    }

    /**
     * Define el valor de la propiedad fechaReserva.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaReserva(XMLGregorianCalendar value) {
        this.fechaReserva = value;
    }

    /**
     * Obtiene el valor de la propiedad id.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setId(Integer value) {
        this.id = value;
    }

    /**
     * Obtiene el valor de la propiedad lugarDevolucion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLugarDevolucion() {
        return lugarDevolucion;
    }

    /**
     * Define el valor de la propiedad lugarDevolucion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLugarDevolucion(JAXBElement<String> value) {
        this.lugarDevolucion = value;
    }

    /**
     * Obtiene el valor de la propiedad lugarRetiro.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLugarRetiro() {
        return lugarRetiro;
    }

    /**
     * Define el valor de la propiedad lugarRetiro.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLugarRetiro(JAXBElement<String> value) {
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

    /**
     * Obtiene el valor de la propiedad totalReserva.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalReserva() {
        return totalReserva;
    }

    /**
     * Define el valor de la propiedad totalReserva.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalReserva(BigDecimal value) {
        this.totalReserva = value;
    }

    /**
     * Obtiene el valor de la propiedad usuarioCancelacion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUsuarioCancelacion() {
        return usuarioCancelacion;
    }

    /**
     * Define el valor de la propiedad usuarioCancelacion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUsuarioCancelacion(JAXBElement<String> value) {
        this.usuarioCancelacion = value;
    }

    /**
     * Obtiene el valor de la propiedad usuarioReserva.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUsuarioReserva() {
        return usuarioReserva;
    }

    /**
     * Define el valor de la propiedad usuarioReserva.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUsuarioReserva(JAXBElement<String> value) {
        this.usuarioReserva = value;
    }

    /**
     * Obtiene el valor de la propiedad vehiculoPorCiudadEntity.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link VehiculoPorCiudadEntity }{@code >}
     *     
     */
    public JAXBElement<VehiculoPorCiudadEntity> getVehiculoPorCiudadEntity() {
        return vehiculoPorCiudadEntity;
    }

    /**
     * Define el valor de la propiedad vehiculoPorCiudadEntity.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link VehiculoPorCiudadEntity }{@code >}
     *     
     */
    public void setVehiculoPorCiudadEntity(JAXBElement<VehiculoPorCiudadEntity> value) {
        this.vehiculoPorCiudadEntity = value;
    }

    /**
     * Obtiene el valor de la propiedad vehiculoPorCiudadId.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getVehiculoPorCiudadId() {
        return vehiculoPorCiudadId;
    }

    /**
     * Define el valor de la propiedad vehiculoPorCiudadId.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setVehiculoPorCiudadId(Integer value) {
        this.vehiculoPorCiudadId = value;
    }

}
