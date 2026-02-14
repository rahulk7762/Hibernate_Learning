package com.hibernet.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hibernet.configuratgion.HibernateConfig;
import com.hibernet.entity.Employee;



public class Main {

    public static void main(String[] args) {

 Employee e = new Employee("Rahul thakur kumar", "male", 9999999);
 
 SessionFactory sf = HibernateConfig.sessionFactory();
	
	Session session = sf.openSession();
	Transaction tx = session.beginTransaction();
	session.persist(e);
	tx.commit();
 
    }
}

