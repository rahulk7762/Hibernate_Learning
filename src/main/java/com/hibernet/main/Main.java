package com.hibernet.main;

import java.util.ArrayList;

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


Address add2 = new Address();
add2.setCity("GHZ");
add2.setState("Uttarpradesh");


Address add3 = new Address();
add3.setCity("LuckNow");
add3.setState("Uttarpradesh");
    	

ArrayList<Address> listOfAddresses = new ArrayList<>();

listOfAddresses.add(add1);
listOfAddresses.add(add2);
listOfAddresses.add(add3);

 Employee e = new Employee();
 e.setName("Rahul");
 e.setGender("male");
 e.setSalary(30000);
 e.setAddress(listOfAddresses);
 
 
// add1.setEmp(e);
 
 SessionFactory sf = HibernateConfig.sessionFactory();
	
	Session session = sf.openSession();
	Transaction tx = session.beginTransaction();
	session.persist(e);
//	session.persist(add1);
//	session.persist(add2);
//	session.persist(add3);
	tx.commit();

	
	Employee e1 = session.find(Employee.class,1);
System.out.println(e1);
System.out.println(e1.getAddress());
			
    }
}

