package com.hibernet.main;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hibernet.configuratgion.HibernateConfig;
import com.hibernet.entity.Address;
import com.hibernet.entity.Employee;

public class Main {

    public static void main(String[] args) {

        // Creating Addresses
        Address add1 = new Address();
        add1.setCity("Noida");
        add1.setState("Uttarpradesh");

        Address add2 = new Address();
        add2.setCity("Ghaziabad");
        add2.setState("Uttarpradesh");

        Address add3 = new Address();
        add3.setCity("Lucknow");
        add3.setState("Uttarpradesh");

        // Creating Employees
        Employee e1 = new Employee();
        e1.setName("Rahul");
        e1.setGender("Male");
        e1.setSalary(30000);

        Employee e2 = new Employee();
        e2.setName("Rohit");
        e2.setGender("Male");
        e2.setSalary(50000);

        Employee e3 = new Employee();
        e3.setName("Deepak");
        e3.setGender("Male");
        e3.setSalary(70000);

        // Many-to-Many Relationship

        List<Address> addressList1 = new ArrayList<>();
        addressList1.add(add1);
        addressList1.add(add2);
        addressList1.add(add3);

      
        e1.setAddresses(addressList1);
   

        // Setting reverse side

        List<Employee> empList1 = new ArrayList<>();
        empList1.add(e1);
        empList1.add(e2);
       

        add1.setEmployees(empList1);

        // Hibernate Code
        SessionFactory sf = HibernateConfig.sessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();

        session.persist(e1);
        session.persist(e2);
        session.persist(e3);
        tx.commit();
        
        Employee emp = session.find(Employee.class, 1);
        System.out.println(emp);
        System.out.println(emp.getAddresses());
        
        Address add = session.find(Address.class,1);
        System.err.println(add);
        
      
        session.close();
    }
}