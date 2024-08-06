package com.i2it.ems.department.service;

import java.util.ArrayList;
import java.util.List;

import com.i2it.ems.exception.DataBaseException;
import com.i2it.ems.department.dao.DepartmentDao;
import com.i2it.ems.department.dao.DepartmentDaoImpl;
import com.i2it.ems.department.service.DepartmentService;
import com.i2it.ems.model.Department;

/**
 * <p>
 * Implementation of DepartmentService interface.
 * </p>
 */
public class DepartmentServiceImpl implements DepartmentService {
    
    private DepartmentDao departmentDao = new DepartmentDaoImpl();
    
    @Override
    public void createDepartment(Department department) throws DataBaseException {
        departmentDao.saveOrUpdateDepartment(department);
    }

    @Override
    public List<Department> retrieveDepartments() throws DataBaseException {
        List<Department> allDepartments = departmentDao.retrieveDepartments();
        if (allDepartments.isEmpty()) {
            return null;
        }
        return allDepartments;
    }

    @Override
    public Department retrieveDepartmentById(int id) throws DataBaseException {
        Department getDepartment = null;
        List<Department> departments = departmentDao.retrieveDepartments();
        for (Department department : departments) {
            if (department.getId() == id) {
                getDepartment = department;
            } 
        }
        return getDepartment;
    }

    @Override
    public void updateDepartment(Department department) throws DataBaseException {
        departmentDao.saveOrUpdateDepartment(department);
    }

    @Override
    public void deleteDepartment(Department department) throws DataBaseException {
        departmentDao.saveOrUpdateDepartment(department);
    }
}
