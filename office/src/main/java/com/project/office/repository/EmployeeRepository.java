package com.project.office.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.office.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer>{
	List<Employee> findByCountry(String country);
	
	

}
