package org.gerson;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.jboss.resteasy.annotations.jaxrs.PathParam;

@Path("/hello")
public class ExampleResource {

    @ConfigProperty(name="greeting")
    private String greeting;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello RESTEasy";
    }


    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/{name}")
    public String customHello(@PathParam("name") String name){
        return greeting + name + " how are You?";
    }
}
