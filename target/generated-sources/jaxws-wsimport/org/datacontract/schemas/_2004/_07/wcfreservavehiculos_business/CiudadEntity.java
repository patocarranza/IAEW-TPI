
package org.datacontract.schemas._2004._07.wcfreservavehiculos_business;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CiudadEntity complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CiudadEntity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaisEntity" type="{http://schemas.datacontract.org/2004/07/WCFReservaVehiculos.Business.DataBaseModel}PaisEntity" minOccurs="0"/>
 *         &lt;element name="PaisId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CiudadEntity", namespace = "http://schemas.datacontract.org/2004/07/WCFReservaVehiculos.Business.DataBaseModel", propOrder = {
    "id",
    "nombre",
    "paisEntity",
    "paisId"
})
public class CiudadEntity {

    @XmlElement(name = "Id")
    protected Integer id;
    @XmlElementRef(name = "Nombre", namespace = "http://schemas.datacontract.org/2004/07/WCFReservaVehiculos.Business.DataBaseModel", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nombre;
    @XmlElementRef(name = "PaisEntity", namespace = "http://schemas.datacontract.org/2004/07/WCFReservaVehiculos.Business.DataBaseModel", type = JAXBElement.class, required = false)
    protected JAXBElement<PaisEntity> paisEntity;
    @XmlElement(name = "PaisId")
    protected Integer paisId;

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
     * Obtiene el valor de la propiedad nombre.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNombre() {
        return nombre;
    }

    /**
     * Define el valor de la propiedad nombre.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNombre(JAXBElement<String> value) {
        this.nombre = value;
    }

    /**
     * Obtiene el valor de la propiedad paisEntity.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PaisEntity }{@code >}
     *     
     */
    public JAXBElement<PaisEntity> getPaisEntity() {
        return paisEntity;
    }

    /**
     * Define el valor de la propiedad paisEntity.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PaisEntity }{@code >}
     *     
     */
    public void setPaisEntity(JAXBElement<PaisEntity> value) {
        this.paisEntity = value;
    }

    /**
     * Obtiene el valor de la propiedad paisId.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPaisId() {
        return paisId;
    }

    /**
     * Define el valor de la propiedad paisId.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPaisId(Integer value) {
        this.paisId = value;
    }

}
