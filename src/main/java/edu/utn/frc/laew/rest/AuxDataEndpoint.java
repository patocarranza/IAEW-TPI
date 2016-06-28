package edu.utn.frc.laew.rest;

import edu.utn.frc.iaew.model.*;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/data")
public class AuxDataEndpoint {    

    @GET
    @Path("/vendedores")
    public List<Vendedor> listarVendedores() {
        
    }
    
    @GET
    @Path("/paises")
    public List<Pais> listarPaises() {
        
    }
    
    @GET
    @Path("/ciudades/{idPais}")
    public List<Pais> listarPaises( @PathParam("idPais") Integer idPais) {
        
    }
    
    @GET
    @Path("/vehiculos/{idCiudad}")
    public List<Pais> listarVehiculos( @PathParam("idCiudad") Integer idCiudad) {
        
    }         
}
