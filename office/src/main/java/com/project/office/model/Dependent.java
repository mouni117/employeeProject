package com.project.office.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "DEPENDENT")
public class Dependent {

	@Id

	@Column(name = "id")
	Integer dependentId;
	@Column(name = "name")
	String dependentName;
	@Column(name = "dob")
	String dependentDob;
	@Column(name = "type")
	String dependentType;
	@ManyToOne
	@JoinColumn(name="employeeId")
	Employee employee;

	public Integer getDependentId() {
		return dependentId;
	}

	public void setDependentId(Integer dependentId) {
		this.dependentId = dependentId;
	}

	public String getDependentName() {
		return dependentName;
	}

	public void setDependentName(String dependentName) {
		this.dependentName = dependentName;
	}

	public String getDependentDob() {
		return dependentDob;
	}

	public void setDependentDob(String dependentDob) {
		this.dependentDob = dependentDob;
	}

	public String getDependentType() {
		return dependentType;
	}

	public void setDependentType(String dependentType) {
		this.dependentType = dependentType;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

}
