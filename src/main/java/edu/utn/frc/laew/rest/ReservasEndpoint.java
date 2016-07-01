package edu.utn.frc.laew.rest;

import edu.utn.frc.iaew.ORM.DAOImplementacion.*;
import edu.utn.frc.iaew.misc.Utils;
import edu.utn.frc.iaew.model.Reserva;
import edu.utn.frc.iaew.model.Vehiculo;
import edu.utn.frc.iaew.model.Vendedor;
import edu.utn.frc.laew.soap.ReservasSoapService;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.datacontract.schemas._2004._07.wcfreservavehiculos_business.LugarRetiroDevolucion;

@Path("/reservas")
public class ReservasEndpoint {
    
    @GET
    @Path("/listado")
    @Produces(MediaType.APPLICATION_JSON + ";charset=UTF-8")
    public Response getReservasExistentes(@QueryParam("canceladas") boolean incluirCanceladas) {
        try {
            //return RestUtils.getCORS200Response(ReservasSoapService.consultarReservas(incluirCanceladas));
            return RestUtils.getCORS200Response((new ReservaDAO()).listarExistentes(incluirCanceladas));
        } catch(Exception ex) {
            return RestUtils.getCORS500Response(ex);
        }
    }
    
    @PUT
    @Path("/crear")
    @Produces(MediaType.APPLICATION_JSON + ";charset=UTF-8")    
    public Response crearReserva(@QueryParam("nomCliente") String nomCliente,
                                @QueryParam("docCliente") String docCliente,
                                @QueryParam("fecDevol") String fechaDevolucion,
                                @QueryParam("fecRet") String fechaRetiro,
                                @QueryParam("idVehCiu") int idVehicloCiudad,
                                @QueryParam("lugDev") String lugarDevolucion, 
                                @QueryParam("lugRet") String lugarRetiro, 
                                @QueryParam("idVend") int idVendedor, 
                                @QueryParam("idCiudad") int idCiudad) {
        try {
            Reserva res = ReservasSoapService.reservarVehiculo(nomCliente, 
                                                               Utils.getStringAsDateTime(fechaDevolucion).toDate(), 
                                                               Utils.getStringAsDateTime(fechaRetiro).toDate(),
                                                               idVehicloCiudad,
                                                               LugarRetiroDevolucion.fromValue(lugarDevolucion),
                                                               LugarRetiroDevolucion.fromValue(lugarRetiro), 
                                                               docCliente);
            //Seteamos el vendedor
            VendedorDAO venDAO = new VendedorDAO();
            List<Vendedor> vendedores = venDAO.listar();
            Vendedor vendedorFinal = null;
            for(Vendedor v : vendedores) {
                if(v.getId() == idVendedor) {
                    vendedorFinal = v;
                    break;
                }
            }
            res.setVendedor(vendedorFinal);
            
            //Seteamos el vehiculo (ya que viene null del SOAP endpoint)
            List<Vehiculo> vehiculos = ReservasSoapService.consultarVehiculosDisponibles(idCiudad, 
                                                       Utils.getStringAsDateTime(fechaRetiro).toDate(), 
                                                       Utils.getStringAsDateTime(fechaDevolucion).toDate());
            Vehiculo vehiculoFinal = null;
            for(Vehiculo v : vehiculos) {
                if(v.getVehiculoPorCiudadId() == idVehicloCiudad) {
                    vehiculoFinal = v;
                    break;
                }
            }
            res.setVehiculo(vehiculoFinal);
            
            return RestUtils.getCORS200Response(res);
        } catch(Exception ex) {
            return RestUtils.getCORS500Response(ex);
        }        
    }    
    
    @PUT
    @Path("/cancelar/{codRes}")
    @Produces(MediaType.APPLICATION_JSON + ";charset=UTF-8")    
    public Response cancelarReserva(@PathParam("codRes") String codRes) {
        try {
            Reserva res = ReservasSoapService.cancelarReserva(codRes);
            ReservaDAO resDAO = new ReservaDAO();
            res = resDAO.cancelarReserva(codRes);
            return RestUtils.getCORS200Response(res);
        } catch(Exception ex) {
            return RestUtils.getCORS500Response(null);
        }
    }
}
