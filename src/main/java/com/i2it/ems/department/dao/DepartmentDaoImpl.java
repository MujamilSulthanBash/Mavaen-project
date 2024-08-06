package com.i2it.ems.department.dao;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.i2it.ems.exception.DataBaseException;
import com.i2it.ems.helper.HibernateManage;
import com.i2it.ems.model.Department;

public class DepartmentDaoImpl implements DepartmentDao {

    private static final Logger logger = LogManager.getLogger(DepartmentDaoImpl.class);
    
    @Override
    public void saveOrUpdateDepartment(Department department) throws DataBaseException {  
        Transaction transaction = null;
        try (Session session = HibernateManage.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            if (department.getId() == 0) {
                session.save(department);
            } else {
                session.saveOrUpdate(department);
            }
            transaction.commit();
        } catch (Exception e) {
            HibernateManage.rollBackTransaction(transaction);
            logger.error("Issue while creating the department" + department.getName());
            throw new DataBaseException("Issue while creating the department" + department.getName());
        }
    }

    @Override
    public List<Department> retrieveDepartments() throws DataBaseException {  
        try (Session session = HibernateManage.getSessionFactory().openSession()) {
            Query query = session.createQuery("from Department where isactive = true"); 
            return query.list();
        } catch (Exception e) {
            logger.error("Issue while retrieve the department");
            throw new DataBaseException("Issue while retrieve the department");
        }
    }

    @Override
    public Department retrieveDepartmentById(int id) throws DataBaseException {  
        try (Session session = HibernateManage.getSessionFactory().openSession()) {
            return session.get(Department.class, id); 
        } catch (Exception e) {
            logger.error("Issue while retrieve the department with id " + id);
            throw new DataBaseException("Issue while retrieve the department with id " + id);
        }
    }

}