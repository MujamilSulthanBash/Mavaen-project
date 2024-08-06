package com.i2it.ems.project.dao;

import java.util.List;

import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.i2it.ems.exception.DataBaseException;
import com.i2it.ems.helper.HibernateManage;
import com.i2it.ems.model.Project;

public class ProjectDaoImpl implements ProjectDao {
    
    @Override
    public void saveOrUpdateProject(Project project) throws DataBaseException {  
        Transaction transaction = null;
        try (Session session = HibernateManage.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            if (project.getId() == 0) {
                session.save(project);
            } else {
                session.saveOrUpdate(project);
            }
            transaction.commit();
        } catch (Exception e) {
            HibernateManage.rollBackTransaction(transaction);
            throw new DataBaseException("Issue while creating the project" + project.getName());
        }
    }

    @Override
    public List<Project> retrieveProjects() throws DataBaseException {  
        try (Session session = HibernateManage.getSessionFactory().openSession()) {
            Query query = session.createQuery("from Project where isactive = true"); 
            return query.list();
        } catch (Exception e) {
            throw new DataBaseException("Issue while retrieve the department");
        }
    }

}