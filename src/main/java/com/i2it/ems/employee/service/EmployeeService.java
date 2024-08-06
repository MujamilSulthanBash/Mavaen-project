package com.i2it.ems.employee.service;

import java.util.List;

import com.i2it.ems.exception.DataBaseException;
import com.i2it.ems.model.Department;
import com.i2it.ems.model.Employee;
import com.i2it.ems.model.Project;

/**
 * Managing employee records like add, retrieve, retrieve by id,update and delete.
 */
public interface EmployeeService {

    /**
     * <p>
     * Creates a new employee record.
     * </p>
     *
     * @param employee 
     *     - Employee details
     * @throws DataBaseException 
     *     - When Exception occurs
     */
    public void createEmployee(Employee employee) throws DataBaseException; 

    /**
     * <p>
     * Retrieve employees.
     * </p>
     *
     * @return List<Employee> 
     *     - List of employee details
     * @throws DataBaseException 
     *     - When Exception occurs
     */
    public List<Employee> retrieveEmployees() throws DataBaseException;

    /**
     * <p>
     * Retrieve employee by their ID.
     * </p>
     *
     * @param id 
     *     - Employee ID
     * @return Employee 
     *     - Employee details
     * @throws DataBaseException 
     *     - When Exception occurs
     */
    public Employee retrieveEmployeeById(int id) throws DataBaseException;

    /**
     * <p>
     * Updates employee based on their ID.
     * </p>
     *
     * @param employee 
     *     - Updated employee details
     * @throws DataBaseException 
     *     - When Exception occurs
     */
    public void updateEmployee(Employee employee) throws DataBaseException;

    /**
     * <p>
     * Deletes employee based on their ID.
     * </p>
     *
     * @param employee 
     *     - Updated employee details
     * @throws DataBaseException 
     *     - When Exception occurs
     */
    public void deleteEmployee(Employee employee) throws DataBaseException;

    /**
     * <p>
     * Retrieve employee by their ID.
     * </p>
     *
     * @param id 
     *     - Department ID
     * @return Department 
     *     - Employee details
     * @throws DataBaseException 
     *     - When Exception occurs
     */
    public Department retrieveDepartmentById(int id) throws DataBaseException;

    /**
     * <p>
     * Retrieve employee by their ID.
     * </p>
     *
     * @param id 
     *     - project ID
     * @return Project 
     *     - project details
     * @throws DataBaseException 
     *     - When Exception occurs
     */
    public Project retrieveProjectById(int id) throws DataBaseException;

}