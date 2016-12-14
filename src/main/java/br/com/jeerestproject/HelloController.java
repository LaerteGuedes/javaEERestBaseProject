package br.com.jeerestproject;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

/**
 * Created by laerteguedes on 14/12/16.
 */
@Path("/")
public class HelloController {

    @GET
    @Path("/helloworld")
    public Response home(){
        return Response.status(200).entity("Hello world!").build();
    }

}
