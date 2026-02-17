package com.hibernet.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

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
//	Query query = session.createQuery("update myemp set name=:n where id=:i");
//	query.setParameter("n", "Aman Kumar");
//	query.setParameter("i",4);
//	int status = query.executeUpdate();
//	System.out.println(status);
//	
	
	//-------------------------4---------------------
//	Query query = session.createQuery("delete from myemp where id=:i");
//	query.setParameter("i", 1);
//	int result = query.executeUpdate();
//	System.out.println("Row Deleted"+result);
//	tx.commit();
//	
	
//	-------------------------5----------------------------
//	Query query = session.createQuery("select sum(salary) from myemp");
//	List<Integer> list= query.list();
//	System.out.println(list.get(0));
	
	
// --------------------------- 6. To Assingn the Alias-------------------------------
//	String alias = "from myemp as e";
//	Query query = session.createQuery(alias);
//	List list = query.list();
//	System.out.println(list);
	
	
	
	
	// select
//	String hql = "select e.name from myemp e";
//	Query query = session.createQuery(hql);
//	List list = query.list();
//	System.out.println(list);
	
	
//	Select multiple items and show them using the list
//	String hql = "select e.name, e.gender from myemp e";
//	Query query = session.createQuery(hql);
//	List list = query.list();
//	System.out.println(list);
//	System.out.println(list.get(0));
	
	
//	
//	
//	String hql = "from myemp e where e.id = :id"; // or select e from MyEmp e where e.id = :id  :- Both are same
//
//	Query query = session.createQuery(hql);
//	query.setParameter("id", 1);
//
//	List list = query.list();
//	System.out.println(list);
	
	
//	Named Parameters
//	String hql = "from myemp e where e.id=:id";
//	Query query = session.createQuery(hql);
//	query.setParameter("id",1);
//	List list = query.list();
//	System.out.println(list);
	
	
//	Aggregate functions
//	String hql = "select sum(salary) from myemp";
//	String hql = "select count(distinct e.name) from myemp e";
//	String hql = "select count(distinct e.salary) from myemp e";
//	String hql = "select sum(distinct e.salary) from myemp e";
//	Query query = session.createQuery(hql);
//	List list = query.list();
//	System.out.println(list);
	
	
	
	
//	session.persist(e);
//	tx.commit();
 
    }
}

