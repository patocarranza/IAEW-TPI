package edu.utn.frc.laew.rest;


import edu.utn.frc.iaew.misc.Utils;
import edu.utn.frc.iaew.model.*;
import edu.utn.frc.laew.soap.ReservasSoapService;
import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.datacontract.schemas._2004._07.wcfreservavehiculos_business.LugarRetiroDevolucion;
import org.datacontract.schemas._2004._07.wcfreservavehiculos_business.ObjectFactory;

@Path("/data")
public class AuxDataEndpoint {    
    
    @GET
    @Path("/vendedores") //http://localhost:8680/rest/aux/data/vendedores
    @Produces(MediaType.APPLICATION_JSON + ";charset=UTF-8")
    public Response listarVendedores() {
        List<Vendedor> vendedoresMock = new LinkedList<>();
        vendedoresMock.add(new Vendedor(1, "Juan"));
        vendedoresMock.add(new Vendedor(2, "Pablo"));
        vendedoresMock.add(new Vendedor(3, "Alvaro"));
        return RestUtils.getCORS200Response(vendedoresMock);
    }    
    
    @GET
    @Path("/lugares") //http://localhost:8680/rest/aux/data/lugares
    @Produces(MediaType.APPLICATION_JSON + ";charset=UTF-8")
    public Response getLugares() {
        List<String> lugares = new LinkedList<>();
        for(LugarRetiroDevolucion le : LugarRetiroDevolucion.values())
            lugares.add(le.value());
        return RestUtils.getCORS200Response(lugares);
    } 
    
    @GET
    @Path("/paises") //http://localhost:8680/rest/aux/data/paises
    @Produces(MediaType.APPLICATION_JSON + ";charset=UTF-8")
    public Response listarPaises() {        
        try {
            return RestUtils.getCORS200Response(ReservasSoapService.consultarPaises());
        } catch(Exception ex) {
            return RestUtils.getCORS500Response(ex);
        }        
    }    
    
    @GET
    @Path("/ciudades/{idPais}") //http://localhost:8680/rest/aux/data/ciudades/1
    @Produces(MediaType.APPLICATION_JSON + ";charset=UTF-8")
    public Response listarCiudades( @PathParam("idPais") Integer idPais) {
        try {
            return RestUtils.getCORS200Response(ReservasSoapService.consultarCiudades(idPais));
        } catch(Exception ex) {
            return RestUtils.getCORS500Response(ex);
        }
    }
    
    
    @GET
    @Path("/vehiculos") //http://localhost:8680/rest/aux/data/vehiculos
    @Produces(MediaType.APPLICATION_JSON + ";charset=UTF-8")
    public Response listarVehiculos( @QueryParam("idCiudad") Integer idCiudad,
                                     @QueryParam("fecRet") String fechaRetiro,
                                     @QueryParam("fecDev") String fechaDevolucion) {
        try {
            return RestUtils.getCORS200Response(ReservasSoapService
                    .consultarVehiculosDisponibles(idCiudad, 
                                                   Utils.getStringAsDateTime(fechaRetiro).toDate(), 
                                                   Utils.getStringAsDateTime(fechaDevolucion).toDate()));
        } catch(Exception ex) {
            return RestUtils.getCORS500Response(ex);
        }
    }
        
}
