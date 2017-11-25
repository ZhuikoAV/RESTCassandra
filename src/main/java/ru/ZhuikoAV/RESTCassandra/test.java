package ru.ZhuikoAV.RESTCassandra;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/test")
public class test {

    @GET
    @Path("/helloworld")
    public String helloworld() {
        return "Hello World!";
    }
}
