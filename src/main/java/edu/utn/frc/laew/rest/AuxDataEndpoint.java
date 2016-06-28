package edu.utn.frc.laew.rest;


import edu.utn.frc.iaew.model.*;
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
import org.datacontract.schemas._2004._07.wcfreservavehiculos_business.LugarRetiroDevolucion;
import org.datacontract.schemas._2004._07.wcfreservavehiculos_business.ObjectFactory;
import org.datacontract.schemas._2004._07.wcfreservavehiculos_business.VehiculoModel;

@Path("/data")
public class AuxDataEndpoint {    

    @GET
    @Path("/vendedores") //http://localhost:8680/rest/aux/data/vendedores
    @Produces(MediaType.APPLICATION_JSON + ";charset=UTF-8")
    public List<Vendedor> listarVendedores() {
        List<Vendedor> vendedoresMock = new LinkedList<>();
        vendedoresMock.add(new Vendedor(1, "Juan"));
        vendedoresMock.add(new Vendedor(2, "Pablo"));
        vendedoresMock.add(new Vendedor(3, "Alvaro"));
        return vendedoresMock;
    }
    
    @GET
    @Path("/lugares") //http://localhost:8680/rest/aux/data/lugares
    @Produces(MediaType.APPLICATION_JSON + ";charset=UTF-8")
    public List<String> getLugares() {
        List<String> lugares = new LinkedList<>();
        for(LugarRetiroDevolucion le :LugarRetiroDevolucion.values())
            lugares.add(le.value());
        return lugares;
    } 
    
    @GET
    @Path("/paises") //http://localhost:8680/rest/aux/data/paises
    @Produces(MediaType.APPLICATION_JSON + ";charset=UTF-8")
    public List<Pais> listarPaises() {
        List<Pais> paisesMock = new LinkedList<>();
        paisesMock.add(new Pais(1, "Argentina"));
        paisesMock.add(new Pais(2, "Brasil"));
        paisesMock.add(new Pais(3, "Chile"));
        return paisesMock;
    }
    
    @GET
    @Path("/ciudades/{idPais}") //http://localhost:8680/rest/aux/data/ciudades/1
    @Produces(MediaType.APPLICATION_JSON + ";charset=UTF-8")
    public List<Ciudad> listarCiudades( @PathParam("idPais") Integer idPais) {
        List<Ciudad> ciudades = new LinkedList<>();
        if(idPais == 1) {
            ciudades.add(new Ciudad(1, "Cordoba", idPais));
            ciudades.add(new Ciudad(2, "Buenos Aires", idPais));
        } else if(idPais == 2) {
            ciudades.add(new Ciudad(3, "Rio de Janeiro", idPais));
            ciudades.add(new Ciudad(4, "Sao Paulo", idPais));
        } else if(idPais == 3) {
            ciudades.add(new Ciudad(5, "Viña del mar", idPais));
            ciudades.add(new Ciudad(6, "Valparaiso", idPais));
        }
        return ciudades; 
    }
    
    @GET
    @Path("/vehiculos") //http://localhost:8680/rest/aux/data/vehiculos
    @Produces(MediaType.APPLICATION_JSON + ";charset=UTF-8")
    public List<Vehiculo> listarVehiculos( @QueryParam("idCiudad") Integer idCiudad,
                                                @QueryParam("fecRet") String fechaRetiro,
                                                @QueryParam("fecDev") String fechaDevolucion) {
        List<Vehiculo> vehiculosMock = new LinkedList<>();
        ObjectFactory factory = new ObjectFactory();
        Vehiculo vh1 = new Vehiculo();
        vh1.setCiudadId(idCiudad);
        vh1.setCantidadDisponible(2);
        vh1.setCantidadPuertas(3);
        vh1.setId(1);
        vh1.setMarca("Mazda");
        vh1.setModelo("cañonazo");
        vh1.setPrecioPorDia(new BigDecimal("250.20"));
        vh1.setPuntaje("8");
        vh1.setTieneAireAcon(true);
        vh1.setTieneDireccion(true);
        vh1.setTipoCambio("auto");
        vh1.setVehiculoCiudadId(3);
        vehiculosMock.add(vh1);
        return vehiculosMock;
    }
        
}
