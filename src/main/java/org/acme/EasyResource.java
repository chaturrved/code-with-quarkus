package org.acme;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/easy")
public class EasyResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "This is really easy!!";
    }


}