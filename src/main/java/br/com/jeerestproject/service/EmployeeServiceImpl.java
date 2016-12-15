package br.com.jeerestproject.service;

import br.com.jeerestproject.dao.Dao;
import br.com.jeerestproject.dao.EmployeeDao;
import br.com.jeerestproject.domain.Employee;

import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 * Created by laerteguedes on 14/12/16.
 */
@Stateless
public class EmployeeServiceImpl extends BaseServiceImpl<Employee> implements EmployeeService {

    @Inject
    private EmployeeDao dao;

    @Override
    public EmployeeDao getDao() {
        return dao;
    }
}
