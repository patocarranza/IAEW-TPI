
package org.datacontract.schemas._2004._07.wcfreservavehiculos_business;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfReservaEntity complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfReservaEntity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ReservaEntity" type="{http://schemas.datacontract.org/2004/07/WCFReservaVehiculos.Business.DataBaseModel}ReservaEntity" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfReservaEntity", namespace = "http://schemas.datacontract.org/2004/07/WCFReservaVehiculos.Business.DataBaseModel", propOrder = {
    "reservaEntity"
})
public class ArrayOfReservaEntity {

    @XmlElement(name = "ReservaEntity", nillable = true)
    protected List<ReservaEntity> reservaEntity;

    /**
     * Gets the value of the reservaEntity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reservaEntity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReservaEntity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReservaEntity }
     * 
     * 
     */
    public List<ReservaEntity> getReservaEntity() {
        if (reservaEntity == null) {
            reservaEntity = new ArrayList<ReservaEntity>();
        }
        return this.reservaEntity;
    }

}
