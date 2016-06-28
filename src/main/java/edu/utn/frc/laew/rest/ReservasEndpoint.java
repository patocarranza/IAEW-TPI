package edu.utn.frc.laew.rest;

import edu.utn.frc.iaew.model.Reserva;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import org.datacontract.schemas._2004._07.wcfreservavehiculos_business.ReservaEntity;

@Path("/reservas")
public class ReservasEndpoint {
    
    @GET
    @Path("/listado")
    @Produces(MediaType.APPLICATION_JSON + ";charset=UTF-8")
    public List<Reserva> getReservasExistentes(@QueryParam("canceladas") boolean incluirCanceladas) {
        
    }
    
    @POST
    @Path("/crear")
    @Produces(MediaType.APPLICATION_JSON + ";charset=UTF-8")    
    public Reserva crearReserva(@QueryParam("nomCliente") String nomCliente,
                                @QueryParam("docCliente") int docCliente,
                                @QueryParam("fecDevol") String fechaDevolucion,
                                @QueryParam("fecRet") String fechaRetiro,
                                @QueryParam("idVehCiu") String idVehicloCiudad,
                                @QueryParam("lugDev") String lugarDevolucion, 
                                @QueryParam("lugRet") String lugarRetiro) {
        //POST /create?nomCliente=Juancito&docCliente=125...        
    }
    
    @GET
    @Path("/reserva/{codRes}")
    @Produces(MediaType.APPLICATION_JSON + ";charset=UTF-8")
    public Reserva buscarReserva(@PathParam("codRes") int codRes) {
        
    }
    
    @POST
    @Path("/cancelar/{codRes}")
    @Produces(MediaType.APPLICATION_JSON + ";charset=UTF-8")    
    public Reserva cancelarReserva(@PathParam("codRes") int codRes) {
              
    }

}
