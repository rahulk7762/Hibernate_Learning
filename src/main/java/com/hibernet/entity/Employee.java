package com.hibernet.entity;

public class Employee {
	private int id;
private String name;
	private String gender;
private int salary;

public Employee() {
	super();
}

public Employee(String name,String gender,int salary) {
	super();
	this.name = name;
	this.gender = gender;
	this.salary = salary;
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
	return "Employee [name=" + name + ", gender=" + gender + ", salary=" + salary + "]";
}






}
