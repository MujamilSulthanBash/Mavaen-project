package com.i2it.ems.department.service;

import java.util.List;

import com.i2it.ems.exception.DataBaseException;
import com.i2it.ems.model.Department;

/**
 * <p>
 * Managing department records, add, retrieve, retrieve by id,update and delete.
 * </p>
 */
public interface DepartmentService {

    /**
     * <p>
     * Creates a new department record.
     * </p>
     *
     * @param department 
     *     - department details
     * @throws DataBaseException 
     *     - When Exception occurs
     */
    public void createDepartment(Department department) throws DataBaseException;                      

    /**
     * <p>
     * Retrieves departments.
     * </p>
     *
     * @return List<Department> 
     *     - List of department details
     * @throws DataBaseException 
     *     - When Exception occurs 
     */
    public List<Department> retrieveDepartments() throws DataBaseException;

    /**
     * <p>
     * Retrieves an department by their ID.
     * </p>
     *
     * @param id 
     *     - Department ID
     * @return department 
     *     - department details
     * @throws DataBaseException 
     *     - When Exception occurs
     */
    public Department retrieveDepartmentById(int id) throws DataBaseException;

    /**
     * <p>
     * Updates an department based on their ID.
     * </p>
     *
     * @param department 
     *     - Updated department details
     * @throws DataBaseException 
     *     - When Exception occurs
     */
    public void updateDepartment(Department department) throws DataBaseException;

    /**
     * <p>
     * Deletes an department based on their ID.
     * </p>
     *
     * @param department 
     *     - Updated department details
     * @throws DataBaseException 
     *     - When Exception occurs
     */
    public void deleteDepartment(Department department) throws DataBaseException;
}