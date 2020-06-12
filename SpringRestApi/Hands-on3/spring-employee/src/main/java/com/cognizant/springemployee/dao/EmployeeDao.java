package com.cognizant.springemployee.dao;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Repository;

import com.cognizant.springemployee.model.Employee;


@Repository
public class EmployeeDao {

	private static List<Employee> EMPLOYEE_LIST;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeDao.class);
	
	public EmployeeDao()
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("employee.xml");
		
		
		EMPLOYEE_LIST = (List<Employee>) context.getBean("employeeList");
		LOGGER.debug("Employes:{}",EMPLOYEE_LIST);
		
		
		
		
	}
	
	public List<Employee> getAllEmployees()
	{
		return EMPLOYEE_LIST;
	}
	
}
