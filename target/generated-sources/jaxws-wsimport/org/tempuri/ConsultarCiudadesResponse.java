
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ConsultarCiudadesResult" type="{http://schemas.datacontract.org/2004/07/WCFReservaVehiculos.Business.Entities}ConsultarCiudadesResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "consultarCiudadesResult"
})
@XmlRootElement(name = "ConsultarCiudadesResponse")
public class ConsultarCiudadesResponse {

    @XmlElementRef(name = "ConsultarCiudadesResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<org.datacontract.schemas._2004._07.wcfreservavehiculos_business.ConsultarCiudadesResponse> consultarCiudadesResult;

    /**
     * Obtiene el valor de la propiedad consultarCiudadesResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link org.datacontract.schemas._2004._07.wcfreservavehiculos_business.ConsultarCiudadesResponse }{@code >}
     *     
     */
    public JAXBElement<org.datacontract.schemas._2004._07.wcfreservavehiculos_business.ConsultarCiudadesResponse> getConsultarCiudadesResult() {
        return consultarCiudadesResult;
    }

    /**
     * Define el valor de la propiedad consultarCiudadesResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link org.datacontract.schemas._2004._07.wcfreservavehiculos_business.ConsultarCiudadesResponse }{@code >}
     *     
     */
    public void setConsultarCiudadesResult(JAXBElement<org.datacontract.schemas._2004._07.wcfreservavehiculos_business.ConsultarCiudadesResponse> value) {
        this.consultarCiudadesResult = value;
    }

}
