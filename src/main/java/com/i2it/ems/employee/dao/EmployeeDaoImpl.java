package com.i2it.ems.employee.dao;

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
import com.i2it.ems.model.Employee;

public class EmployeeDaoImpl implements EmployeeDao {

    private static final Logger logger = LogManager.getLogger(EmployeeDaoImpl.class);
    
    @Override
    public void saveOrUpdateEmployee(Employee employee) throws DataBaseException {  
        Transaction transaction = null;
        try (Session session = HibernateManage.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.saveOrUpdate(employee);
            transaction.commit();
        } catch (Exception e) {
            HibernateManage.rollBackTransaction(transaction);
            logger.error("Issue while creating the employee " + employee.getName());
            throw new DataBaseException("Issue while creating the employee");
        }
    }

    @Override
    public List<Employee> retrieveEmployees() throws DataBaseException {  
        try (Session session = HibernateManage.getSessionFactory().openSession()) {
            Query query = session.createQuery("from Employee where isActive = true"); 
            return query.list();
        } catch (Exception e) {
            logger.error("Issue while retrieve the employee");
            throw new DataBaseException("Issue while retrieve the employee"); 
        }
    }

    @Override
    public Employee retrieveEmployeeById(int id) throws DataBaseException {  
        try (Session session = HibernateManage.getSessionFactory().openSession()) {
            return session.get(Employee.class, id); 
        } catch (Exception e) {
            logger.error("Issue while retrieve the employee with id " + id);
            throw new DataBaseException("Issue while retrieve the employee with id " + id); 
        }
    }

}