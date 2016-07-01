
package org.datacontract.schemas._2004._07.wcfreservavehiculos_business;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para VehiculoEntity complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="VehiculoEntity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CantidadPuertas" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Marca" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Modelo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrecioPorDia" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Puntaje" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TieneAireAcon" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="TieneDireccion" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="TipoCambio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehiculoEntity", namespace = "http://schemas.datacontract.org/2004/07/WCFReservaVehiculos.Business.DataBaseModel", propOrder = {
    "cantidadPuertas",
    "id",
    "marca",
    "modelo",
    "precioPorDia",
    "puntaje",
    "tieneAireAcon",
    "tieneDireccion",
    "tipoCambio"
})
public class VehiculoEntity {

    @XmlElement(name = "CantidadPuertas")
    protected Integer cantidadPuertas;
    @XmlElement(name = "Id")
    protected Integer id;
    @XmlElementRef(name = "Marca", namespace = "http://schemas.datacontract.org/2004/07/WCFReservaVehiculos.Business.DataBaseModel", type = JAXBElement.class, required = false)
    protected JAXBElement<String> marca;
    @XmlElementRef(name = "Modelo", namespace = "http://schemas.datacontract.org/2004/07/WCFReservaVehiculos.Business.DataBaseModel", type = JAXBElement.class, required = false)
    protected JAXBElement<String> modelo;
    @XmlElement(name = "PrecioPorDia")
    protected BigDecimal precioPorDia;
    @XmlElementRef(name = "Puntaje", namespace = "http://schemas.datacontract.org/2004/07/WCFReservaVehiculos.Business.DataBaseModel", type = JAXBElement.class, required = false)
    protected JAXBElement<String> puntaje;
    @XmlElement(name = "TieneAireAcon")
    protected Boolean tieneAireAcon;
    @XmlElement(name = "TieneDireccion")
    protected Boolean tieneDireccion;
    @XmlElementRef(name = "TipoCambio", namespace = "http://schemas.datacontract.org/2004/07/WCFReservaVehiculos.Business.DataBaseModel", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tipoCambio;

    /**
     * Obtiene el valor de la propiedad cantidadPuertas.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCantidadPuertas() {
        return cantidadPuertas;
    }

    /**
     * Define el valor de la propiedad cantidadPuertas.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCantidadPuertas(Integer value) {
        this.cantidadPuertas = value;
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
     * Obtiene el valor de la propiedad marca.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMarca() {
        return marca;
    }

    /**
     * Define el valor de la propiedad marca.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMarca(JAXBElement<String> value) {
        this.marca = value;
    }

    /**
     * Obtiene el valor de la propiedad modelo.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getModelo() {
        return modelo;
    }

    /**
     * Define el valor de la propiedad modelo.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setModelo(JAXBElement<String> value) {
        this.modelo = value;
    }

    /**
     * Obtiene el valor de la propiedad precioPorDia.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrecioPorDia() {
        return precioPorDia;
    }

    /**
     * Define el valor de la propiedad precioPorDia.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPrecioPorDia(BigDecimal value) {
        this.precioPorDia = value;
    }

    /**
     * Obtiene el valor de la propiedad puntaje.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPuntaje() {
        return puntaje;
    }

    /**
     * Define el valor de la propiedad puntaje.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPuntaje(JAXBElement<String> value) {
        this.puntaje = value;
    }

    /**
     * Obtiene el valor de la propiedad tieneAireAcon.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTieneAireAcon() {
        return tieneAireAcon;
    }

    /**
     * Define el valor de la propiedad tieneAireAcon.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTieneAireAcon(Boolean value) {
        this.tieneAireAcon = value;
    }

    /**
     * Obtiene el valor de la propiedad tieneDireccion.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTieneDireccion() {
        return tieneDireccion;
    }

    /**
     * Define el valor de la propiedad tieneDireccion.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTieneDireccion(Boolean value) {
        this.tieneDireccion = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoCambio.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTipoCambio() {
        return tipoCambio;
    }

    /**
     * Define el valor de la propiedad tipoCambio.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTipoCambio(JAXBElement<String> value) {
        this.tipoCambio = value;
    }

}
