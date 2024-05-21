package com.project.office.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "EMPLOYEE")
public class Employee {
	@OneToMany
	@JoinColumn(name="dependentId")
	List<Dependent> dependent;
	@Id
	@Column(name = "id")
	Integer employeeId;
	@Column(name = "name")
	String employeeName;
	@Column(name = "dob")
	String employeeDob;
	@Column(name = "country")
	String country;
	@Column(name = "city")
	String city;
	
	
	public List<Dependent> getDependent() {
		return dependent;
	}
	public void setDependent(List<Dependent> dependent) {
		this.dependent = dependent;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Integer getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeeDob() {
		return employeeDob;
	}
	public void setEmployeeDob(String employeeDob) {
		this.employeeDob = employeeDob;
	}
	

}
