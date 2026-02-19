package com.hibernet.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity(name="myemp")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="empName")
private String name;
	private String gender;
private int salary;

@OneToOne
Address address;

public Employee() {
	super();
}

public Employee(String name,String gender,int salary,Address adress) {
	super();
	this.name = name;
	this.gender = gender;
	this.salary = salary;
	this.address = address;
}



public Address getAddress() {
	return address;
}

public void setAddress(Address address) {
	this.address = address;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public void setName(String name) {
	this.name = name;
}
public String getName() {
	return name;
}
	
public void setGender(String gender) {
	this.gender = gender;
}
public String getGender() {
	return gender;
}

public void setSalary(int salary) {
	this.salary = salary;
}

public int getSalary() {
	return salary;
}

@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", gender=" + gender + ", salary=" + salary + "]";
}






}
