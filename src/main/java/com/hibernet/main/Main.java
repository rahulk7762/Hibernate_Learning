package com.hibernet.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernet.entity.Employee;



public class Main {

    public static void main(String[] args) {

 Employee e = new Employee("Rahul thakur kumar", "male", 9999999);
 
 
// method1
 Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
 SessionFactory sf = cfg.buildSessionFactory();
 Session session = sf.openSession();
 Transaction tx = session.beginTransaction();

 //method2
//	StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
//	Metadata metadata = new MetadataSources(ssr).getMetadataBuilder().build();
//	SessionFactory sf = metadata.buildSessionFactory();
//	Session session = sf.openSession();
//	Transaction tx = session.beginTransaction();
//	
	
	session.persist(e);
	tx.commit();
 
    }
}

