package br.com.jeerestproject.dao;

import br.com.jeerestproject.domain.Employee;

import javax.enterprise.inject.Model;
import javax.inject.Named;
import java.util.List;

/**
 * Created by laerteguedes on 14/12/16.
 */
@Named
public class EmployeeDaoImpl extends DaoImpl<Employee> implements EmployeeDao {
}
