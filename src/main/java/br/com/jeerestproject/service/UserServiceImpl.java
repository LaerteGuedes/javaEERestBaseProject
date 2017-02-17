package br.com.jeerestproject.service;

import br.com.jeerestproject.dao.Dao;
import br.com.jeerestproject.dao.UserDao;
import br.com.jeerestproject.domain.User;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

/**
 * Created by laerteguedes on 16/02/17.
 */
@Stateless
public class UserServiceImpl extends BaseServiceImpl<User> implements UserService {

    @Inject
    private UserDao userDao;

    @Override
    public Dao<User> getDao() {
        return userDao;
    }
}
