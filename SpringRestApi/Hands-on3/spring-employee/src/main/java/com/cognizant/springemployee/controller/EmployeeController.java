package com.cognizant.springemployee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.springemployee.model.Employee;
import com.cognizant.springemployee.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;
	
	@GetMapping("/employees")
	public List<Employee> getAllEmployee()
	{
		List<Employee> list= employeeService.getAllEmployees();
		
		return list;
	}
}
