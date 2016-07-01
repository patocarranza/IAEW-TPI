package edu.utn.frc.laew.soap;

import edu.utn.frc.iaew.misc.Utils;
import edu.utn.frc.iaew.model.Ciudad;
import edu.utn.frc.iaew.model.Cliente;
import edu.utn.frc.iaew.model.Reserva;
import edu.utn.frc.iaew.model.Vehiculo;
import java.math.BigDecimal;
import java.math.RoundingMode;
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
        if(res.getVehiculoPorCiudadEntity().getValue() != null &&
           res.getVehiculoPorCiudadEntity().getValue().getVehiculoEntity().getValue() != null) {
            VehiculoEntity vec = res.getVehiculoPorCiudadEntity().getValue().getVehiculoEntity().getValue();            
            Ciudad city = null;
            if(res.getVehiculoPorCiudadEntity().getValue().getCiudadEntity().getValue() != null) {
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
        
        return new Reserva(res.getId(), 
                        res.getCodigoReserva().getValue(), 
                        Utils.toDate(res.getFechaReserva()),
                        Utils.toDate(res.getFechaHoraDevolucion()),
                        Utils.toDate(res.getFechaHoraRetiro()),
                        Utils.toDate(res.getFechaCancelacion().getValue()),
                        res.getEstado(), 
                        LugarRetiroDevolucion.fromValue(res.getLugarRetiro().getValue()), 
                        LugarRetiroDevolucion.fromValue(res.getLugarDevolucion().getValue()), 
                        null,
                        new Cliente(res.getNroDocumentoCliente().getValue(), 
                                    res.getApellidoNombreCliente().getValue()), 
                        res.getUsuarioReserva().getValue(), 
                        res.getUsuarioCancelacion().getValue(),
                        res.getTotalReserva(), 
                        res.getTotalReserva().multiply(new BigDecimal("1.20")).setScale(2, RoundingMode.HALF_UP), 
                        res.getVehiculoPorCiudadId(), 
                        veh);
    }
}
