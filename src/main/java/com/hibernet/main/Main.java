package com.hibernet.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hibernet.configuratgion.HibernateConfig;
import com.hibernet.entity.Address;
import com.hibernet.entity.Employee;



public class Main {

    public static void main(String[] args) {
Address add1 = new Address();
add1.setCity("Noida");
add1.setState("Uttarpradesh");

    	
 Employee e = new Employee();
 e.setName("Rahul");
 e.setGender("male");
 e.setSalary(30000);
 e.setAddress(add1);
 
 
 add1.setEmp(e);
 
 SessionFactory sf = HibernateConfig.sessionFactory();
	
	Session session = sf.openSession();
	Transaction tx = session.beginTransaction();
	
	session.persist(e);
	session.persist(add1);
	tx.commit();
	
	
	Employee employee = session.find(Employee.class,1);
	System.out.println(employee);
	System.out.println(employee.getAddress());
	
	Address ad = session.find(Address.class, 1);
	System.out.println(ad);
	System.out.println(ad.getEmp());
 
    }
}

