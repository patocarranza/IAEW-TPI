package edu.utn.frc.laew.soap;

import edu.utn.frc.iaew.misc.Utils;
import edu.utn.frc.iaew.model.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.xml.bind.JAXBElement;
import org.datacontract.schemas._2004._07.wcfreservavehiculos_business.*;
import org.tempuri.*;

/**
 *
 * @author patri_000
 */
public class ReservasSoapService {
    
    /**
     * Comunicación contra endpoint sin seguridad.
     * @return 
     */
    private static IWCFReservaVehiculos getBasicHTTPServiceEndpoint() {        
        return new org.tempuri.WCFReservaVehiculos().getBasicHttpBindingIWCFReservaVehiculos();
    }
    
    /**
     * Comunicación contra endpoint con WS-security
     * @return 
     */
    private static IWCFReservaVehiculos getWSHTTPServiceEndpoint() {        
        return new org.tempuri.WCFReservaVehiculos().getWSHttpBindingIWCFReservaVehiculos();
        //return new org.tempuri.WCFReservaVehiculos().getWSHttpBindingIWCFReservaVehiculos(new javax.xml.ws.soap.AddressingFeature());
    }
    
    public static List<Pais> consultarPaises() 
            throws Exception { 
        try { 
            List<PaisEntity> countries = getBasicHTTPServiceEndpoint().consultarPaises().
                    getPaises().getValue().getPaisEntity();
            ArrayList<Pais> paises = new ArrayList<>();
            for(PaisEntity ct : countries) 
                paises.add(new Pais(ct.getId(), ct.getNombre().getValue()));
            return paises;
        } catch(IWCFReservaVehiculosConsultarPaisesStatusResponseFaultFaultMessage ex) {
            throw new Exception(ex.getFaultInfo().getErrorDescription().getValue(), ex);
        }
    }
    
    public static List<Ciudad> consultarCiudades(int idPais) 
            throws Exception {
        ConsultarCiudadesRequest consultarCiudadesRequest = new ConsultarCiudadesRequest();
        consultarCiudadesRequest.setIdPais(idPais);
        try {
            List<CiudadEntity> cities = getBasicHTTPServiceEndpoint().consultarCiudades(consultarCiudadesRequest)
                    .getCiudades().getValue().getCiudadEntity();
            ArrayList<Ciudad> ciudades = new ArrayList<>();
            for(CiudadEntity city : cities) 
                ciudades.add(new Ciudad(city.getId(), city.getNombre().getValue(), idPais));
            return ciudades;
        } catch(IWCFReservaVehiculosConsultarCiudadesStatusResponseFaultFaultMessage ex) {
            throw new Exception(ex.getFaultInfo().getErrorDescription().getValue(), ex);
        }
    }
    
    public static List<Vehiculo> consultarVehiculosDisponibles(int idCiudad, 
                                                                  Date fechaRetiro, 
                                                                  Date fechaDevolucion) 
            throws Exception {          
        ConsultarVehiculosRequest consultarVehiculosRequest = new ConsultarVehiculosRequest();
        consultarVehiculosRequest.setIdCiudad(idCiudad);
        consultarVehiculosRequest.setFechaHoraRetiro(Utils.toXMLGregorianCalendar(fechaRetiro));
        consultarVehiculosRequest.setFechaHoraDevolucion(Utils.toXMLGregorianCalendar(fechaDevolucion));
        try {
            List<VehiculoModel> models = getBasicHTTPServiceEndpoint()
                    .consultarVehiculosDisponibles(consultarVehiculosRequest)
                    .getVehiculosEncontrados().getValue().getVehiculoModel();
            List<Vehiculo> vehiculos = new ArrayList<>();
            for(VehiculoModel veh : models)
                vehiculos.add(new Vehiculo(veh.getId(), 
                                           veh.getCantidadPuertas(),
                                           veh.getMarca().getValue(), 
                                           veh.getModelo().getValue(),                         
                                           veh.getPrecioPorDia(),
                                           veh.getPuntaje().getValue(), 
                                           veh.isTieneAireAcon(),
                                           veh.isTieneDireccion(),
                                           veh.getTipoCambio().getValue(), 
                                           new Ciudad(veh.getCiudadId()),
                                           veh.getCantidadDisponible(), 
                                           veh.getVehiculoCiudadId()));
            return vehiculos;
        } catch(IWCFReservaVehiculosConsultarVehiculosDisponiblesStatusResponseFaultFaultMessage ex) {
            throw new Exception(ex.getFaultInfo().getErrorDescription().getValue(), ex);
        }
    }
    
    public static List<Reserva> consultarReservas(boolean incluirCanceladas) 
            throws Exception {
        ConsultarReservasRequest consultarReservasRequest = new ConsultarReservasRequest();
        consultarReservasRequest.setIncluirCanceladas(incluirCanceladas);
        try {
            List<ReservaEntity> rEnts = getBasicHTTPServiceEndpoint().consultarReservas(consultarReservasRequest).
                    getReservas().getValue().getReservaEntity();

            ArrayList<Reserva> reservas = new ArrayList<>();
            for(ReservaEntity res : rEnts) 
                reservas.add(ModelAdapters.toReserva(res));

            return reservas;         
        } catch(IWCFReservaVehiculosConsultarReservasStatusResponseFaultFaultMessage ex) {
            throw new Exception(ex.getFaultInfo().getErrorDescription().getValue(), ex);
        }
    }
    
    public static Reserva reservarVehiculo(String apellidoNombreCliente, 
                                        Date fechaHoraDevolucion, 
                                        Date fechaHoraRetiro, 
                                        int vehiculoPorCiudadId, 
                                        LugarRetiroDevolucion lugarDevolucion, 
                                        LugarRetiroDevolucion lugarRetiro, 
                                        String nroDocumentoCliente) 
            throws Exception {
        ReservarVehiculoRequest reservarVehiculoRequest = new ReservarVehiculoRequest();
        reservarVehiculoRequest.setApellidoNombreCliente((new com.microsoft.schemas._2003._10.serialization.ObjectFactory())
                                                            .createString(apellidoNombreCliente));
        reservarVehiculoRequest.setFechaHoraDevolucion(Utils.toXMLGregorianCalendar(fechaHoraDevolucion));
        reservarVehiculoRequest.setFechaHoraRetiro(Utils.toXMLGregorianCalendar(fechaHoraRetiro));
        reservarVehiculoRequest.setIdVehiculoCiudad(vehiculoPorCiudadId);
        reservarVehiculoRequest.setLugarDevolucion(lugarDevolucion);
        reservarVehiculoRequest.setLugarRetiro(lugarRetiro);
        reservarVehiculoRequest.setNroDocumentoCliente((new com.microsoft.schemas._2003._10.serialization.ObjectFactory())
                                                            .createString(nroDocumentoCliente));
        try { 
            ReservaEntity res = getBasicHTTPServiceEndpoint().reservarVehiculo(reservarVehiculoRequest).getReserva().getValue();
            return ModelAdapters.toReserva(res);
        } catch(IWCFReservaVehiculosReservarVehiculoStatusResponseFaultFaultMessage ex) {
            throw new Exception(ex.getFaultInfo().getErrorDescription().getValue(), ex);
        }
    }
    
    public static Reserva cancelarReserva(String codReserva) 
            throws Exception {
        CancelarReservaRequest cancelarReservaRequest = new CancelarReservaRequest();
        JAXBElement<String> codJax = (new com.microsoft.schemas._2003._10.serialization.ObjectFactory()).createString(codReserva);
        cancelarReservaRequest.setCodigoReserva(codJax);
        try {
            ReservaEntity res = getBasicHTTPServiceEndpoint().cancelarReserva(cancelarReservaRequest).getReserva().getValue();
            return ModelAdapters.toReserva(res);
        } catch(IWCFReservaVehiculosCancelarReservaStatusResponseFaultFaultMessage ex) {
            throw new Exception(ex.getFaultInfo().getErrorDescription().getValue(), ex);
        }
    }        
}
