package edu.utn.frc.laew.rest;

import java.net.URI;
import java.net.URL;
import java.security.ProtectionDomain;

import javax.ws.rs.core.UriBuilder;

import org.eclipse.jetty.server.Handler;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.handler.ContextHandler;
import org.eclipse.jetty.server.handler.DefaultHandler;
import org.eclipse.jetty.server.handler.HandlerCollection;
import org.eclipse.jetty.server.handler.ResourceHandler;
import org.glassfish.jersey.jetty.JettyHttpContainerFactory;
import org.glassfish.jersey.server.ResourceConfig;

public final class EmbeddedServer {

	private static final int SERVER_PORT = 8680;

	private EmbeddedServer() {
	}

	public static void main(String[] args) throws Exception {
		URI baseUri = UriBuilder.fromUri("http://localhost").port(SERVER_PORT).build();
                ResourceHandler resourceHandler = new ResourceHandler();
                ProtectionDomain protectionDomain = EmbeddedServer.class.getProtectionDomain();
		URL location = protectionDomain.getCodeSource().getLocation();
		resourceHandler.setWelcomeFiles(new String[] { "index.html" });
		resourceHandler.setResourceBase(location.toExternalForm());
		System.out.println(location.toExternalForm());
                
		ResourceConfig config = new ResourceConfig(ReservasEndpoint.class, AuxDataEndpoint.class);                                
		Server server = JettyHttpContainerFactory.createServer(baseUri, config, false);                
		ContextHandler contextHandler = new ContextHandler("/rest/ops");
		contextHandler.setHandler(server.getHandler());
                ContextHandler contextHandler2 = new ContextHandler("/rest/aux");
		contextHandler2.setHandler(server.getHandler());
						
		
		HandlerCollection handlerCollection = new HandlerCollection();
		handlerCollection.setHandlers(new Handler[] { resourceHandler,
                                                             contextHandler, 
                                                             contextHandler2,
                                                             new DefaultHandler() });
		server.setHandler(handlerCollection);
		server.start();                
		server.join(); 
	}
}
