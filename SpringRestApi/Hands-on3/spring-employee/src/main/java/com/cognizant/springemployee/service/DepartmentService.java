package com.cognizant.springemployee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.springemployee.dao.DepartmentDao;
import com.cognizant.springemployee.model.Department;

@Service
public class DepartmentService {

	@Autowired
	DepartmentDao departmentDao;
	
	public List<Department> getAllDepartments()
	{
		return departmentDao.getAllDepartments();
	
	}

	
	
}
