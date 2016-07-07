package edu.utn.frc.laew.soap;

import edu.utn.frc.iaew.misc.Utils;
import edu.utn.frc.iaew.model.Ciudad;
import edu.utn.frc.iaew.model.Cliente;
import edu.utn.frc.iaew.model.Reserva;
import edu.utn.frc.iaew.model.Vehiculo;
import java.math.BigDecimal;
import java.math.RoundingMode;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.namespace.QName;
import org.datacontract.schemas._2004._07.wcfreservavehiculos_business.CiudadEntity;
import org.datacontract.schemas._2004._07.wcfreservavehiculos_business.LugarRetiroDevolucion;
import org.datacontract.schemas._2004._07.wcfreservavehiculos_business.ReservaEntity;
import org.datacontract.schemas._2004._07.wcfreservavehiculos_business.VehiculoEntity;

/**
 *
 * @author patri_000
 */
public class ModelAdapters {
    
    public static Reserva toReserva(ReservaEntity res) {
        Vehiculo veh = null;        
        //Nunca va a entrar a este if lamentablemente, la referencia VehiculoPorCiudad
        //viene null del servidor.            
        if(res.getVehiculoPorCiudadEntity() != null 
           && res.getVehiculoPorCiudadEntity().getValue() != null) {
            VehiculoEntity vec = res.getVehiculoPorCiudadEntity().getValue().getVehiculoEntity().getValue();      
            //System.out.println("VehCit NOT NULL");
            Ciudad city = null;            
            if(res.getVehiculoPorCiudadEntity().getValue().getCiudadEntity() != null 
               && res.getVehiculoPorCiudadEntity().getValue().getCiudadEntity().getValue() != null) {
                //System.out.println("CITY NOT NULL");
                CiudadEntity cit = res.getVehiculoPorCiudadEntity().getValue().getCiudadEntity().getValue();
                city = new Ciudad(cit.getId(), 
                                  cit.getNombre().getValue(), 
                                  cit.getPaisId());
            }
            
            veh = new Vehiculo(vec.getId(), 
                               vec.getCantidadPuertas(), 
                               vec.getMarca().getValue(), 
                               vec.getModelo().getValue(), 
                               vec.getPrecioPorDia(), 
                               vec.getPuntaje().getValue(), 
                               vec.isTieneAireAcon(), 
                               vec.isTieneDireccion(), 
                               vec.getTipoCambio().getValue(), 
                               city, 
                               1, 
                               res.getVehiculoPorCiudadId());
        }
        
//        System.out.println("id = " + res.getId());
//        System.out.println(" = " + res.getId());
//        
//        System.out.println("to string " + res.toString());
//        System.out.println("costo " + res.getTotalReserva());
//        
        return new Reserva(res.getId(), 
                        res.getCodigoReserva().getValue(), 
                        Utils.toDate(res.getFechaReserva()),
                        Utils.toDate(res.getFechaHoraDevolucion()),
                        Utils.toDate(res.getFechaHoraRetiro()),
                        null,//fecha de cancelacion viene null, falla el unwrapping de JAXBElement<XMLGregorianCalendar>
                        res.getEstado(), 
                        LugarRetiroDevolucion.fromValue(res.getLugarRetiro().getValue()), 
                        LugarRetiroDevolucion.fromValue(res.getLugarDevolucion().getValue()), 
                        null,
                        new Cliente(res.getNroDocumentoCliente().getValue(), 
                                    res.getApellidoNombreCliente().getValue()), 
                        res.getUsuarioReserva().getValue(), 
                        null,//usuario cancelacion viene null, falla el unwrapping de JAXBElement<String>
                        res.getTotalReserva(), 
                        res.getTotalReserva().multiply(new BigDecimal("1.20")).setScale(2, RoundingMode.HALF_UP), 
                        res.getVehiculoPorCiudadId(), 
                        veh);
    }
    
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WCFReservaVehiculos.Business.Entities", name = "string")
    public static JAXBElement<String> createJAXBString(String paramName, String value) {
        return new JAXBElement<String>(new QName("http://schemas.datacontract.org/2004/07/WCFReservaVehiculos.Business.Entities", paramName), String.class, value);
    }
}
