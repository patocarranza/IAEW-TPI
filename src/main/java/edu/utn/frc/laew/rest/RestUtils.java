
package edu.utn.frc.laew.rest;

import javax.ws.rs.core.Response;

/**
 *
 * @author patri_000
 */
public class RestUtils {
    
    public static Response getCORS200Response(Object entity) {
        return Response.status(200)
                       .header("Access-Control-Allow-Origin", "*")
                       .header("Access-Control-Allow-Headers", "origin, content-type, accept, authorization")
                       .header("Access-Control-Allow-Credentials", "true")
                       .header("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS, HEAD")
                       .header("Access-Control-Max-Age", "1209600")
                       .entity(entity)
                       .build();
    }
    
    public static Response getCORS201Response(Object entity) {
        return Response.status(201)
                       .header("Access-Control-Allow-Origin", "*")
                       .header("Access-Control-Allow-Headers", "origin, content-type, accept, authorization")
                       .header("Access-Control-Allow-Credentials", "true")
                       .header("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS, HEAD")
                       .header("Access-Control-Max-Age", "1209600")
                       .entity(entity)
                       .build();
    }
    
    public static Response getCORS500Response(Exception entity) {
        return Response.status(500)
                       .header("Access-Control-Allow-Origin", "*")
                       .header("Access-Control-Allow-Headers", "origin, content-type, accept, authorization")
                       .header("Access-Control-Allow-Credentials", "true")
                       .header("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS, HEAD")
                       .header("Access-Control-Max-Age", "1209600")
                       .entity(entity)
                       .build();
    }
}
