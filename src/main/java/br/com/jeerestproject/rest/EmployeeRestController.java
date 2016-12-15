package br.com.jeerestproject.rest;

import br.com.jeerestproject.service.EmployeeService;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import java.util.List;

/**
 * Created by laerteguedes on 14/12/16.
 */
@Path("/employee")
public class EmployeeRestController {

    @Inject
    private EmployeeService service;

    @GET
    @Path("/list")
    @Produces("application/json")
    public List findAll(){
        return service.findAll();
    }
}
