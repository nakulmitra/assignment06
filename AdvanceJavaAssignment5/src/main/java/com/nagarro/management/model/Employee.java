package com.nagarro.management.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	
	@Id
	private String empId;
	
	private String empName;
	private String empLocation;
	private String empDOB;
	private String empEmail;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String empId, String empName, String empLocataion, String empDOB, String empEmail) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empLocation = empLocation;
		this.empDOB = empDOB;
		this.empEmail = empEmail;
	}

	public String getEmpId() {
		return empId;
	}

	public String getEmpName() {
		return empName;
	}

	public String getEmpLocation() {
		return empLocation;
	}

	public String getEmpDOB() {
		return empDOB;
	}

	public String getEmpEmail() {
		return empEmail;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public void setEmpLocataion(String empLocation) {
		this.empLocation = empLocation;
	}

	public void setEmpDOB(String empDOB) {
		this.empDOB = empDOB;
	}

	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empLocation=" + empLocation + ", empDOB="
				+ empDOB + ", empEmail=" + empEmail + "]";
	}
}
