package com.project.office.service;

import java.time.Year;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.office.dao.EmployeeDao;
import com.project.office.model.Dependent;
import com.project.office.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;

	@Override
	public List<Employee> fetchEmployeeByCrty(String country) {
		// TODO Auto-generated method stub
		
		List<Employee> employeeList=employeeDao.fetchEmployeeByCrty(country);
		List<Employee> result =employeeList.stream().filter(employee->(employee.getDependent().stream().filter(d->ageCheck(d)==d))==employee).sorted(Comparator.comparing(Employee ::getCity)).collect(Collectors.toList());
		return result;
	}

	public Dependent ageCheck(Dependent d) {
		{
			int nowYear = Year.now().getValue();

			int year = Integer.parseInt(d.getDependentDob().split("/")[2]);
			int diff = nowYear - year;
			if (diff <= 5 || diff >= 70)
				return d;
			else
				return null;
		}
	}

}
