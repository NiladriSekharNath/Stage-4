package com.cognizant.springemployee.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class Employee {
	private String id;
	private String name;
	private double salary;
	private Department department;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(Employee.class);
	
	public Employee() {
		super();
		
		LOGGER.info("Employe Object created Successfully");
	}
	public Employee(String id, String name, double salary, Department department) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.department = department;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", department=" + department + "]";
	}

	
}
