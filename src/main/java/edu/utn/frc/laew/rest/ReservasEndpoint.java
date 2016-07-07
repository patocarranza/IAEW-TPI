package edu.utn.frc.laew.rest;

import edu.utn.frc.iaew.ORM.DAOImplementacion.*;
import edu.utn.frc.iaew.ORM.DAOInterface.*;
import edu.utn.frc.iaew.misc.Utils;
import edu.utn.frc.iaew.model.*;
import edu.utn.frc.laew.soap.ReservasSoapService;
import java.util.List;
import javax.ws.rs.*;
import javax.ws.rs.core.*;
import org.datacontract.schemas._2004._07.wcfreservavehiculos_business.LugarRetiroDevolucion;

@Path("/reservas")
public class ReservasEndpoint {
    
    @GET
    @Path("/listado")
    @Produces(MediaType.APPLICATION_JSON + ";charset=UTF-8")
    public Response getReservasExistentes() {
        try {                       
            List<Reserva> reservas = (new ReservaDAO()).listarExistentes(true);  
            return RestUtils.getCORS200Response(reservas);
        } catch(Exception ex) {
            return RestUtils.getCORS500Response(ex);
        }
    } 
    
    @GET
    @Path("/crear")
    @Produces(MediaType.APPLICATION_JSON + ";charset=UTF-8")
    @Consumes(MediaType.TEXT_PLAIN)
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
            System.out.println("*******CREACION RESERVA*******8");
            System.out.println("nomCliente = " + nomCliente);
            System.out.println("docCliente = " + docCliente);
            System.out.println("fecDevol = " + fechaDevolucion);
            System.out.println("fecRet = " + fechaRetiro);            
            System.out.println("idVehCiu = " + idVehicloCiudad);
            System.out.println("lugDev = " + lugarDevolucion);
            System.out.println("lugRet = " + lugarRetiro);
            System.out.println("idVend = " + idVendedor);
            System.out.println("idCiudad = " + idCiudad);
            
            Reserva res = ReservasSoapService.reservarVehiculo(nomCliente, 
                                                               Utils.getStringAsDateTime(fechaDevolucion).toDate(), 
                                                               Utils.getStringAsDateTime(fechaRetiro).toDate(),
                                                               idVehicloCiudad,
                                                               LugarRetiroDevolucion.fromValue(lugarDevolucion),
                                                               LugarRetiroDevolucion.fromValue(lugarRetiro), 
                                                               docCliente);
            //Seteamos el vendedor
            IVendedor venDAO = new VendedorDAO();
            List<Vendedor> vendedores = venDAO.listar();
            Vendedor vendedorFinal = null;
            for(Vendedor v : vendedores) {
                if(v.getId() == idVendedor) {
                    vendedorFinal = v;
                    break;
                }
            }
            System.out.println("Vendedor id = " + vendedorFinal.getId());
            System.out.println("Vendedor nombre = " +  vendedorFinal.getNombre());
            res.setVendedor(vendedorFinal);
            
            //Seteamos el vehiculo (ya que viene null en la Reserva creada por el SOAP endpoint)
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
            System.out.println("Vehiculo id = " + vehiculoFinal.getId());
            System.out.println("Vehicuo modelo = " + vehiculoFinal.getModelo());
            System.out.println("Vehiculo ciudad id = " + vehiculoFinal.getCiudad().getId());
            System.out.println("Vehiculo ciudad nombre = " + vehiculoFinal.getCiudad().getNombre());
            res.setVehiculo(vehiculoFinal);
            
            ICiudad ciudadDAO = new CiudadDAO();
            ciudadDAO.guardar(vehiculoFinal.getCiudad());
            ICliente clienteDAO = new ClienteDAO();
            clienteDAO.guardar(res.getCliente());
            IVehiculo vehiculoDAO = new VehiculoDAO();
            vehiculoDAO.guardar(vehiculoFinal);
            
            System.out.println("Reserva completa = " + res.toString());
            IReserva resDao = new ReservaDAO();            
            resDao.guardar(res);
            return RestUtils.getCORS201Response(res);
        } catch(Exception ex) {
            return RestUtils.getCORS500Response(ex);
        }        
    }    
    
    @PUT
    @Path("/cancelar/{codRes}")
    @Produces(MediaType.APPLICATION_JSON + ";charset=UTF-8")    
    public Response cancelarReserva(@PathParam("codRes") String codRes) {
        try {
            System.out.println("********CANCELANDO RESERVA************");
            System.out.println("codRes = " + codRes);
            Reserva res = ReservasSoapService.cancelarReserva(codRes);
            ReservaDAO resDAO = new ReservaDAO();
            res = resDAO.cancelarReserva(codRes);
            return RestUtils.getCORS200Response(res);
        } catch(Exception ex) {
            return RestUtils.getCORS500Response(null);
        }
    }
}
