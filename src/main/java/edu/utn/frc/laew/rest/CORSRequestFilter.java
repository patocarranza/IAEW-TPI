
package edu.utn.frc.laew.rest;

import java.io.IOException;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;
import javax.ws.rs.container.PreMatching;
import javax.ws.rs.ext.Provider;

@Provider
@PreMatching
public class CORSRequestFilter implements ContainerRequestFilter {
    @Override
    public void filter(ContainerRequestContext containerRequestContext) throws IOException {
        containerRequestContext.setMethod("POST");

        containerRequestContext.getHeaders().add("Access-Control-Allow-Origin", "*");
        containerRequestContext.getHeaders().add("Access-Control-Allow-Headers","Authorization");
        containerRequestContext.getHeaders().add("Access-Control-Allow-Headers","Authorization");

        String override = containerRequestContext.getHeaders().getFirst( "X-HTTP-Method-Override");
        if (override != null) {
            containerRequestContext.setMethod(override);
        }        
    }   
}
