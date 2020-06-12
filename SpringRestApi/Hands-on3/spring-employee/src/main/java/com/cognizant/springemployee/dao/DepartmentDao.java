package com.cognizant.springemployee.dao;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Repository;

import com.cognizant.springemployee.model.Department;
import com.cognizant.springemployee.model.Employee;

@Repository
public class DepartmentDao {

	private static List<Department> DEPARTMENT_LIST;
	private static final Logger LOGGER = LoggerFactory.getLogger(DepartmentDao.class);
	
	
	public DepartmentDao()
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("employee.xml");
		DEPARTMENT_LIST = (List<Department>) context.getBean("departmentList");
	
		
		
	}
	
	public List<Department> getAllDepartments()
	{
		LOGGER.debug("Departments:{}",DEPARTMENT_LIST);
		return DEPARTMENT_LIST;
	}
}
