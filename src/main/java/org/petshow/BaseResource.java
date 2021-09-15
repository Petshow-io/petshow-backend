package org.petshow;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/test")
public class BaseResource {

    @GET
    public String testing() {
        return "Hey";
    }
}
