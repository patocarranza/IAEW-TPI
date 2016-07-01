package edu.utn.frc.laew.rest;

import edu.utn.frc.iaew.model.Reserva;
import edu.utn.frc.laew.soap.ReservasSoapService;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.datacontract.schemas._2004._07.wcfreservavehiculos_business.LugarRetiroDevolucion;
import org.datacontract.schemas._2004._07.wcfreservavehiculos_business.ReservaEntity;

@Path("/reservas")
public class ReservasEndpoint {
    
    @GET
    @Path("/listado")
    @Produces(MediaType.APPLICATION_JSON + ";charset=UTF-8")
    public Response getReservasExistentes(@QueryParam("canceladas") boolean incluirCanceladas) {
        try {
            return RestUtils.getCORS200Response(ReservasSoapService.consultarReservas(incluirCanceladas));
        } catch(Exception ex) {
            return RestUtils.getCORS500Response(ex);
        }
    }
    
    @PUT
    @Path("/crear")
    @Produces(MediaType.APPLICATION_JSON + ";charset=UTF-8")    
    public Response crearReserva(@QueryParam("nomCliente") String nomCliente,
                                @QueryParam("docCliente") int docCliente,
                                @QueryParam("fecDevol") String fechaDevolucion,
                                @QueryParam("fecRet") String fechaRetiro,
                                @QueryParam("idVehCiu") String idVehicloCiudad,
                                @QueryParam("lugDev") String lugarDevolucion, 
                                @QueryParam("lugRet") String lugarRetiro, 
                                @QueryParam("idVend") int idVendedor) {
        /*try {
            Reserva res = ReservasSoapService.reservarVehiculo(nomCliente, 
                                                               fechaHoraDevolucion, 
                                                               fechaHoraRetiro, 
                                                               LugarRetiroDevolucion.fromValue(nomCliente), LugarRetiroDevolucion.AEROPUERTO, nomCliente));
        } catch(Exception ex) {
            return RestUtils.getCORS500Response(ex);
        }*/
        return RestUtils.getCORS500Response(null);
    }
    
    @GET
    @Path("/reserva/{codRes}")
    @Produces(MediaType.APPLICATION_JSON + ";charset=UTF-8")
    public Response buscarReserva(@PathParam("codRes") int codRes) {
        return RestUtils.getCORS500Response(null);
    }
    
    @PUT
    @Path("/cancelar/{codRes}")
    @Produces(MediaType.APPLICATION_JSON + ";charset=UTF-8")    
    public Response cancelarReserva(@PathParam("codRes") int codRes) {
        return RestUtils.getCORS500Response(null);    
    }
}
