package br.com.jeerestproject.rest;

import br.com.jeerestproject.domain.AbstractEntity;
import br.com.jeerestproject.domain.User;
import br.com.jeerestproject.service.BaseService;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.util.List;

/**
 * Created by laerteguedes on 16/02/17.
 */
public abstract class BaseController<T extends AbstractEntity> {

    public abstract BaseService<T> getService();

    @GET
    @Path("/")
    @Produces("application/json")
    public List<T> list(){
        return getService().findAll();
    }

    @GET
    @Path("/{id}")
    @Produces("application/json")
    public Response find(@PathParam("id") long id){
        T t = getService().findById(id);

        if (t == null)
            return Response.status(Response.Status.NOT_FOUND).build();

        return Response.status(Response.Status.OK).entity(t).build();
    }

    @POST
    @Path("/")
    @Produces("application/json")
    public Response add(T t){
        getService().add(t);

        return Response.status(Response.Status.CREATED).build();
    }

    @PUT
    @Path("/")
    @Produces
    public Response update(T t){
        if (t.getId() == null)
            return Response.status(Response.Status.NOT_FOUND).build();

        getService().update(t);

        return Response.status(Response.Status.CREATED).build();
    }

    @DELETE
    @Path("/{id}")
    @Produces
    public Response delete(@PathParam("id") long id){
        T t = getService().findById(id);

        if (t == null)
            return Response.status(Response.Status.NOT_FOUND).build();

        getService().remove(t);

        return Response.status(Response.Status.OK).build();
    }

}
