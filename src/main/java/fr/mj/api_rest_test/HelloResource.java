package fr.mj.api_rest_test;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;

@Path("/hello-world")
public class HelloResource {
    @GET
    @Produces("text/plain")
    public String hello() {
        return "Hello ";
    }

    @GET
    @Produces("text/plain")
    @Path("{nom}")
    public String hello(@PathParam("nom") String nom)
    {
        return "hello " + nom;
    }
}

