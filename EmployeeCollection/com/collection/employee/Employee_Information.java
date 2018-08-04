package com.collection.employee;

import java.util.HashSet;
import java.util.Set;

//4)	Create two classes Employee_information and MMASaving_Account 
//	a.	Employee_information class will have fields empID, Employee_name, employee_designation , Employee_salary,
//		employee_comm with that they will have setter getter methods 
		
//	c.	Employee_information object and MMASaving_Account object belongs to a same entity assuming there are more than 
 // 	5 entities how will you store the objects preserving the relation between them. 


public class Employee_Information {
	private int empID;
	private String employeeName;
	private String employeeDesignation;
	private double employeeSalary;
	private String employeeComm;
	private HashSet<MMSavingAcc> accounts = new HashSet<>();
	
	//Parameterized Constructor
	public Employee_Information(int empID, String employeeName, String employeeDesignation, double employeeSalary,
			String employeeComm) {
		this.empID = empID;
		this.employeeName = employeeName;
		this.employeeDesignation = employeeDesignation;
		this.employeeSalary = employeeSalary;
		this.employeeComm = employeeComm;
	}
	
	public void addAccount(MMSavingAcc account) {
		accounts.add(account);
	}
	
	
	
	public Set<MMSavingAcc> getAccounts() {
	    return accounts;
	}
	
	// getters 
	public int getEmpID() {
		return empID;
	}
	
	public String getEmployeeName() {
		return employeeName;
	}
	
	public String getEmployeeDesignation() {
		return employeeDesignation;
	}


	public double getEmployeeSalary() {
		return employeeSalary;
	}
	
	
	public String getEmployeeComm() {
		return employeeComm;
	}
	
	//Overriden toString method
	@Override
	public String toString() {
		return "Employee_Information [empID=" + empID + ", employeeName=" + employeeName + ", employeeDesignation="
				+ employeeDesignation + ", employeeSalary=" + employeeSalary + ", employeeComm=" + employeeComm + "]";
	}
	
}
