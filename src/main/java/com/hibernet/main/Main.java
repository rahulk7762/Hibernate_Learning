package com.hibernet.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.hibernet.entity.Employee;



public class Main {

    public static void main(String[] args) {

 Employee e = new Employee("Rahul thakur kumar", "male", 9999999);
 

	StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
	Metadata metadata = new MetadataSources(ssr).getMetadataBuilder().build();
	SessionFactory sf = metadata.buildSessionFactory();
	Session session = sf.openSession();
	Transaction tx = session.beginTransaction();
	
	
	session.persist(e);
	tx.commit();
 
    }
}

