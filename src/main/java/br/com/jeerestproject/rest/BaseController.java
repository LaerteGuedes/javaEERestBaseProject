package br.com.jeerestproject.rest;

import br.com.jeerestproject.domain.AbstractEntity;
import br.com.jeerestproject.domain.User;
import br.com.jeerestproject.service.BaseService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
import java.net.URI;
import java.util.List;

/**
 * Created by laerteguedes on 16/02/17.
 */
public abstract class BaseController<T extends AbstractEntity> {

    public abstract BaseService<T> getService();

    public abstract UriInfo getUriInfo();

    @GET
    @Path("/")
    @Produces(MediaType.APPLICATION_JSON)
    public List<T> show(){
        return getService().findAll();
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response find(@PathParam("id") long id){
        T t = getService().findById(id);

        return Response.status(Response.Status.OK).entity(t).build();
    }

    @POST
    @Path("/")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response add(T t){
        getService().add(t);

        return Response.created(getUriPath(t.getId())).build();
    }

    @PUT
    @Path("/")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response update(T t){
        if (t.getId() == null)
            return Response.status(Response.Status.BAD_REQUEST).build();

        getService().update(t);

        return Response.status(Response.Status.CREATED).build();
    }

    @DELETE
    @Path("/{id}")
    public Response delete(@PathParam("id") long id){
        T t = getService().findById(id);

        if (t == null)
            return Response.status(Response.Status.NOT_FOUND).build();

        getService().remove(t);

        return Response.status(Response.Status.OK).build();
    }

    private URI getUriPath(Long id){
        return getUriInfo().getAbsolutePathBuilder().path(id.toString()).build();
    }

}
