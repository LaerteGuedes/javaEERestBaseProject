package br.com.jeerestproject.service;

import br.com.jeerestproject.domain.Employee;

import javax.ejb.Local;

/**
 * Created by laerteguedes on 14/12/16.
 */
@Local
public interface EmployeeService extends BaseService<Employee> {
}
