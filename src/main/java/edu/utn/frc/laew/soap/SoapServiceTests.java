package edu.utn.frc.laew.soap;

import java.util.Date;
import org.datacontract.schemas._2004._07.wcfreservavehiculos_business.LugarRetiroDevolucion;
import org.joda.time.DateTime;
import org.tempuri.IWCFReservaVehiculosConsultarCiudadesStatusResponseFaultFaultMessage;
import org.tempuri.IWCFReservaVehiculosConsultarVehiculosDisponiblesStatusResponseFaultFaultMessage;

/**
 *
 * @author patri_000
 */
public class SoapServiceTests {
    
    public static void main(String[] args) {
        
        //consultarPaises Success
        /*try {
            System.out.println("consultarPaises SUCCESS: " + ReservasSoapService.consultarPaises());
        } catch(Exception ex) {
            //ex.printStackTrace();
            System.out.println("consultarPaises FAIL: " + ex.getMessage());
        }
        
        System.out.println("\n\n");
        
        //consultarCiudades Success
        try {
            System.out.println("consultarCiudades SUCCESS: " + ReservasSoapService.consultarCiudades(1));
        } catch(Exception ex) {
            ex.printStackTrace();
            System.out.println(ex.getMessage());
        }
        
        //consultarCiudades Fails
        try {
            System.out.println(ReservasSoapService.consultarCiudades(0));
        } catch(Exception ex) {
            ex.printStackTrace();
            System.out.println("consultarCiudades FAIL: " + ex.getMessage());
        }*/
        
        System.out.println("\n\n");
        
        //consultarVehiculosDisponibles Success
        /*try {
            System.out.println("consultarVehiculosDisponibles SUCCESS: " + ReservasSoapService.consultarVehiculosDisponibles(2, 
                                                                                                                             new DateTime().plusDays(3).toDate(), 
                                                                                                                             new DateTime().plusDays(5).toDate()));
        } catch(Exception ex) {
            ex.printStackTrace(); 
            System.out.println(ex.getMessage());
        }*/
        
        //consultarVehiculosDisponibles Fails
        /*try {
            System.out.println(ReservasSoapService.consultarVehiculosDisponibles(0, new Date(), new Date()));
        } catch(Exception ex) {
            ex.printStackTrace(); 
            System.out.println("consultarVehiculosDisponibles FAIL: " + ex.getMessage());
        }*/
        
        System.out.println("\n\n");
        
        //consultarReservas Success
        try {
            System.out.println("consultarReservas SUCCESS: " + ReservasSoapService.consultarReservas(true));
        } catch(Exception ex) {
            ex.printStackTrace(); 
            System.out.println(ex.getMessage());
        }   
        
        System.out.println("\n\n");
        
        //reservarVehiculo Success
        /*try {
            System.out.println("reservarVehiculo SUCCESS: " + ReservasSoapService.reservarVehiculo("Patricio Carranza", 
                                                                    new DateTime().plusDays(3).toDate(),
                                                                    new DateTime().plusDays(5).toDate(),
                                                                    4, 
                                                                    LugarRetiroDevolucion.AEROPUERTO, 
                                                                    LugarRetiroDevolucion.HOTEL,
                                                                    "1234"));
        } catch(Exception ex) {
            ex.printStackTrace(); 
            System.out.println(ex.getMessage());
        } */        
        
        //reservarVehiculo Fail
        /*try {
            System.out.println(ReservasSoapService.reservarVehiculo("Patricio Carranza", 
                                                                    new Date(),
                                                                    new Date(),
                                                                    3, 
                                                                    LugarRetiroDevolucion.AEROPUERTO, 
                                                                    LugarRetiroDevolucion.AEROPUERTO,
                                                                    "1234"));
        } catch(Exception ex) {
            ex.printStackTrace(); 
            System.out.println("consultarReservas FAIL: " + ex.getMessage());
        }*/
    }
}
