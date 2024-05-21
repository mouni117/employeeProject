package com.project.office.dao;

import java.util.List;

import com.project.office.model.Employee;

public interface EmployeeDao {
	public List<Employee> fetchEmployeeByCrty(String country);

}
