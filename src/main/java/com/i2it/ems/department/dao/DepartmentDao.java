package com.i2it.ems.department.dao;

import java.util.List;

import com.i2it.ems.exception.DataBaseException;
import com.i2it.ems.model.Department;

/**
 * <p>
 * Manages department records: add, retrieve, update, and delete.
 * </p>
 */
public interface DepartmentDao {

    /**
     * <p>
     * Add department if the department is not present, otherwise update's the department.
     * </p>
     *
     * @param department
     *     - Department details.
     * @throws DataBaseException 
     *     - When Exception occurs.
     */
     void saveOrUpdateDepartment(Department department) throws DataBaseException;
  
    /**
     * <p>
     * Retrieves all department.
     * </p>
     *
     * @retuen List<Department>
     *     - List of Departments detail
     * @throws DataBaseException 
     *     - When Exception occurs.
     */
    public List<Department> retrieveDepartments() throws DataBaseException;

}
