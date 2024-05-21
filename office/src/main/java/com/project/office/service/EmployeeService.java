package com.project.office.service;

import java.util.List;

import com.project.office.model.Employee;

public interface EmployeeService {
	
	public List<Employee> fetchEmployeeByCrty(String country);
}
