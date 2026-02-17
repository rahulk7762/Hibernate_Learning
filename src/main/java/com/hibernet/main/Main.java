package com.hibernet.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.hibernet.configuratgion.HibernateConfig;
import com.hibernet.entity.Employee;



public class Main {

    public static void main(String[] args) {

 Employee e = new Employee("Sandeep kumar", "male", 222255);
 
 SessionFactory sf = HibernateConfig.sessionFactory();
	
	Session session = sf.openSession();
	Transaction tx = session.beginTransaction();
	
	
//	-------------------------------------------------1.------------------------------------------
//	Query query = session.createQuery("from myemp");  //or
//	Query query = session.createQuery("from myemp",Employee.class);
//	
//	List list = query.list();
//	System.out.println(list);
	
//---------------------------------2.---------------------------------------------------------------
//	Query query = session.createQuery("from myemp",Employee.class);
//	query.setFirstResult(1);
//	query.setMaxResults(2);
//	List list = query.list();
//	System.out.println(list);
	
	
	//----------------------------------------3--------------------------
	Query query = session.createQuery("update myemp set name=:n where id=:i");
	query.setParameter("n", "Aman Kumar");
	query.setParameter("i",4);
	int status = query.executeUpdate();
	System.out.println(status);
//	
	
	//-------------------------4---------------------
//	Query query = session.createQuery("delete from myemp where id=:i");
//	query.setParameter("i", 7);
//	int result = query.executeUpdate();
//	System.out.println("Row Deleted"+result);
//	tx.commit();
	
	
//	-------------------------5----------------------------
//	Query query = session.createQuery("select sum(salary) from myemp");
//	List<Integer> list= query.list();
//	System.out.println(list.get(0));
	
//	session.persist(e);
//	tx.commit();
 
    }
}

