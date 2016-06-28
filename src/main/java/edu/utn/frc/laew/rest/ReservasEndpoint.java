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
    public List<Reserva> getReservasExistentes() {
        
    }
    
    @POST
    @Path("/crear")
    @Produces(MediaType.APPLICATION_JSON + ";charset=UTF-8")    
    public List<Reserva> crearReserva(@QueryParam("param1") String param1) {
        
    }

    @GET
    @Path("/calc/{op}/{left}/{right}")
    public Calculation calculate(@PathParam("op") String op, @PathParam("left") Integer left,
            @PathParam("right") Integer right) {
        Calculation result = new Calculation();
        result.setOperation(op);
        result.setLeft(left);
        result.setRight(right);
        return doCalc(result);
    }
     
}
