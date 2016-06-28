package edu.utn.frc.laew.rest;

import edu.utn.frc.iaew.model.*;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import org.datacontract.schemas._2004._07.wcfreservavehiculos_business.VehiculoModel;

@Path("/data")
public class AuxDataEndpoint {    

    @GET
    @Path("/vendedores")
    @Produces(MediaType.APPLICATION_JSON + ";charset=UTF-8")
    public List<Vendedor> listarVendedores() {
        
    }
    
    @GET
    @Path("/lugares")
    @Produces(MediaType.APPLICATION_JSON + ";charset=UTF-8")
    public List<String> getLugares() {
        
    } 
    
    @GET
    @Path("/paises")
    @Produces(MediaType.APPLICATION_JSON + ";charset=UTF-8")
    public List<Pais> listarPaises() {
        
    }
    
    @GET
    @Path("/ciudades/{idPais}")
    @Produces(MediaType.APPLICATION_JSON + ";charset=UTF-8")
    public List<Pais> listarCiudades( @PathParam("idPais") Integer idPais) {
        
    }
    
    @GET
    @Path("/vehiculos")
    @Produces(MediaType.APPLICATION_JSON + ";charset=UTF-8")
    public List<VehiculoModel> listarVehiculos( @QueryParam("idCiudad") Integer idCiudad,
                                                @QueryParam("fecRet") String fechaRetiro,
                                                @QueryParam("fecDev") String fechaDevolucion) {
        
    }
        
}
