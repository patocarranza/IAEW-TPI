
package org.datacontract.schemas._2004._07.wcfreservavehiculos_business;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConsultarReservasRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
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
     * Gets the value of the incluirCanceladas property.
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
     * Sets the value of the incluirCanceladas property.
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
