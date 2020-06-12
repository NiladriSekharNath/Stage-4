package com.cognizant.springemployee.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Department {

	private String id;
	private String name;
	private String location;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(Department.class);
	
	public Department() {
		super();
		LOGGER.info("Deapartment Object created Successfully");
		
	}
	public Department(String id, String name, String location) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
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
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + ", location=" + location + "]";
	}
	
	
}
