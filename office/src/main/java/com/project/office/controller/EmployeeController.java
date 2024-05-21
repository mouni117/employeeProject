package com.project.office.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.office.model.Employee;
import com.project.office.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("\fetchEmployeeByCrty")
	public List<Employee> fetchEmployeeByCrty(String country) {
		
		return employeeService.fetchEmployeeByCrty(country);
	}
	
	

}
