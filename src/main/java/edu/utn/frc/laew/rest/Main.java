package edu.utn.frc.laew.rest;

import edu.utn.frc.laew.database.HerokuPostgresFacade;
import java.io.StringReader;
import javax.xml.namespace.QName;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.ws.Dispatch;
import javax.xml.ws.Service;


/**
 * Entry point of this webservice. Creates a Jetty instance.
 * @author Patricio Carranza
 * @version 1.00.000
 * last update: 06/09/2016
 */
public class Main {
     

    //public static void main(String[] args) throws Exception {                      
        //Creation of the jetty web server on the Heroku provided port.
        /*try {
            HerokuPostgresFacade.initDB();
            System.out.println("initDB() Succeeded");
            final int HEROKU_PORT = Integer.parseInt(System.getenv("PORT"));
            Server server = new Server(HEROKU_PORT);
            ServletContextHandler context = new ServletContextHandler(ServletContextHandler.SESSIONS);
            context.setContextPath("/");
            server.setHandler(context);    
            //context.addServlet(new ServletHolder(new RPCServlet()),"/");   

            server.start();
            System.out.println("SUCCESS: REST Server Listening in HEROKU PORT " + HEROKU_PORT + "...");
            server.join();  
        } catch(Exception ex) {
            ex.printStackTrace();
        }*/
        
        //consultarCiudades();
        //VehiculoModel model = new VehiculoModel();        
    //}
    
    private static void consultarCiudades() {  
        try { // Call Web Service Operation
            org.tempuri.WCFReservaVehiculos service = new org.tempuri.WCFReservaVehiculos();
            org.tempuri.IWCFReservaVehiculos port = service.getWSHttpBindingIWCFReservaVehiculos();
            // TODO process result here
            org.datacontract.schemas._2004._07.wcfreservavehiculos_business.ConsultarPaisesResponse result = port.consultarPaises();
            System.out.println("Result = "+result);
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
        
        try {
            org.tempuri.WCFReservaVehiculos service = new org.tempuri.WCFReservaVehiculos();            
            org.tempuri.IWCFReservaVehiculos serv2 = service.getWSHttpBindingIWCFReservaVehiculos(new javax.xml.ws.soap.AddressingFeature());
            /*ConsultarCiudadesRequest req = new ConsultarCiudadesRequest();
            req.setIdPais(1);
            System.out.println(serv2.consultarCiudades(req).getCiudades());
            System.out.println(serv2.consultarPaises().getPaises());*/
            QName portQName = new QName("http://tempuri.org/", "WSHttpBinding_IWCFReservaVehiculos");
            String req = "<ConsultarCiudades  xmlns=\"http://tempuri.org/\"><consultarCiudadesRequest>ENTER VALUE</consultarCiudadesRequest></ConsultarCiudades>";
            // Call Web Service Operation
            Dispatch<Source> sourceDispatch = null;            
            sourceDispatch = service.createDispatch(portQName, Source.class, Service.Mode.PAYLOAD);
            Source result = sourceDispatch.invoke(new StreamSource(new StringReader(req)));
            System.out.println(result);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
     
}
