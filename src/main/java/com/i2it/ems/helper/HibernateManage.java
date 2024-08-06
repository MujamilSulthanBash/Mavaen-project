package com.i2it.ems.helper;

import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.HibernateException;

public class HibernateManage {
    private static final SessionFactory sessionFactory;
    
    static {
        sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public static void rollBackTransaction(Transaction transaction) {
        if (transaction != null) {
                transaction.rollback();
        }
    }
}