
package org.datacontract.schemas._2004._07.wcfreservavehiculos_business;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ConsultarReservasRequest complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ConsultarReservasRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IncluirCanceladas" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsultarReservasRequest", propOrder = {
    "incluirCanceladas"
})
public class ConsultarReservasRequest {

    @XmlElement(name = "IncluirCanceladas")
    protected Boolean incluirCanceladas;

    /**
     * Obtiene el valor de la propiedad incluirCanceladas.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncluirCanceladas() {
        return incluirCanceladas;
    }

    /**
     * Define el valor de la propiedad incluirCanceladas.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncluirCanceladas(Boolean value) {
        this.incluirCanceladas = value;
    }

}
