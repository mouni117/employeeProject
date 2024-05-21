package com.project.office.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.office.model.Employee;
import com.project.office.repository.EmployeeRepository;

@Service
public class EmployeeDaoImpl implements EmployeeDao  {
	
	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public List<Employee> fetchEmployeeByCrty(String country) {
		// TODO Auto-generated method stub
		List<Employee> employeeList=employeeRepository.findByCountry(country);
	
		return null;
	}

}
