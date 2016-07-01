
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.wcfreservavehiculos_business.ConsultarCiudadesRequest;


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
 *         &lt;element name="ConsultarCiudadesRequest" type="{http://schemas.datacontract.org/2004/07/WCFReservaVehiculos.Business.Entities}ConsultarCiudadesRequest" minOccurs="0"/>
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
    "consultarCiudadesRequest"
})
@XmlRootElement(name = "ConsultarCiudades")
public class ConsultarCiudades {

    @XmlElementRef(name = "ConsultarCiudadesRequest", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ConsultarCiudadesRequest> consultarCiudadesRequest;

    /**
     * Obtiene el valor de la propiedad consultarCiudadesRequest.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ConsultarCiudadesRequest }{@code >}
     *     
     */
    public JAXBElement<ConsultarCiudadesRequest> getConsultarCiudadesRequest() {
        return consultarCiudadesRequest;
    }

    /**
     * Define el valor de la propiedad consultarCiudadesRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ConsultarCiudadesRequest }{@code >}
     *     
     */
    public void setConsultarCiudadesRequest(JAXBElement<ConsultarCiudadesRequest> value) {
        this.consultarCiudadesRequest = value;
    }

}
