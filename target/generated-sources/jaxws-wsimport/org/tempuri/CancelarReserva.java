
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.wcfreservavehiculos_business.CancelarReservaRequest;


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
 *         &lt;element name="CancelarReservaRequest" type="{http://schemas.datacontract.org/2004/07/WCFReservaVehiculos.Business.Entities}CancelarReservaRequest" minOccurs="0"/>
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
    "cancelarReservaRequest"
})
@XmlRootElement(name = "CancelarReserva")
public class CancelarReserva {

    @XmlElementRef(name = "CancelarReservaRequest", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<CancelarReservaRequest> cancelarReservaRequest;

    /**
     * Obtiene el valor de la propiedad cancelarReservaRequest.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CancelarReservaRequest }{@code >}
     *     
     */
    public JAXBElement<CancelarReservaRequest> getCancelarReservaRequest() {
        return cancelarReservaRequest;
    }

    /**
     * Define el valor de la propiedad cancelarReservaRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CancelarReservaRequest }{@code >}
     *     
     */
    public void setCancelarReservaRequest(JAXBElement<CancelarReservaRequest> value) {
        this.cancelarReservaRequest = value;
    }

}
