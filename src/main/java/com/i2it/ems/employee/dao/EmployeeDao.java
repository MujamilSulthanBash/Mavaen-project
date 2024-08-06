package com.i2it.ems.employee.dao;

import java.util.List;

import com.i2it.ems.exception.DataBaseException;
import com.i2it.ems.model.Employee;

/**
 * <p>
 * Manage the employee records: add, retrieve, update, and delete.
 * </p>
 */
public interface EmployeeDao {
    
    /**
     * <p>
     * Add employe if the employee is not present, otherwise update's the employeee.
     * </p>
     *
     * @param employee
     *     - Employee details 
     * @throws DataBaseException 
     *     - when Exception occurs DataBaseException
     */
    void saveOrUpdateEmployee(Employee employee) throws DataBaseException;

    /**
     * <p>
     * Retrieves all employees.
     * </p>
     * 
     * @return List<Employees>
     *     - List of Employees details
     * @throws DataBaseException 
     *     - when Exception occurs DataBaseException
     */
    List<Employee> retrieveEmployees() throws DataBaseException;

}
