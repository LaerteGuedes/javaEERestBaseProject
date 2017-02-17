package br.com.jeerestproject.rest;

import br.com.jeerestproject.domain.User;
import br.com.jeerestproject.service.BaseService;
import br.com.jeerestproject.service.UserService;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.util.List;

/**
 * Created by laerteguedes on 16/02/17.
 */
@Path("/user")
public class UserController extends BaseController<User>{

    @Inject
    private UserService userService;

    @Override
    public BaseService<User> getService() {
        return userService;
    }
}
