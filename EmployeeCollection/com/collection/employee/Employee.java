
package com.collection.employee;

import java.util.Set;

public class Employee {
	public static void main(String[] args) {
		//adding information of employees via constructor
		Employee_Information employee1 = new Employee_Information(100, "Anindya", "Analyst", 3_00_000, "Capgemini");
		Employee_Information employee2 = new Employee_Information(101, "Sayali", "Analyst", 4_00_000, "L&T");
		Employee_Information employee3 = new Employee_Information(102, "Drishti", "Analyst", 5_00_000, "Accenture");
		Employee_Information employee4 = new Employee_Information(103, "Nishad", "Analyst", 6_00_000, "Wipro");
		Employee_Information employee5 = new Employee_Information(104, "Mehek", "Analyst", 7_00_000, "Infosys");
		
		

		//adding information of accounts of employees via constructor
		MMSavingAcc savingAcc1 = new MMSavingAcc(100, employee1.getEmployeeName(), employee1.getEmployeeSalary(), true);
		MMSavingAcc savingAcc2 = new MMSavingAcc(101, employee2.getEmployeeName(), employee2.getEmployeeSalary(), true);
		MMSavingAcc savingAcc3 = new MMSavingAcc(102, employee3.getEmployeeName(), employee3.getEmployeeSalary(), true);
		MMSavingAcc savingAcc4 = new MMSavingAcc(103, employee4.getEmployeeName(), employee4.getEmployeeSalary(), true);
		MMSavingAcc savingAcc5 = new MMSavingAcc(104, employee5.getEmployeeName(), employee5.getEmployeeSalary(), true);
		MMSavingAcc savingAcc6 = new MMSavingAcc(104, employee1.getEmployeeName(), employee1.getEmployeeSalary(), false);
		MMSavingAcc savingAcc7 = new MMSavingAcc(104, employee5.getEmployeeName(), employee5.getEmployeeSalary(), false);
		
		
		employee1.addAccount(savingAcc1);
		employee1.addAccount(savingAcc6);
		employee2.addAccount(savingAcc2);
		employee3.addAccount(savingAcc3);
		employee4.addAccount(savingAcc4);
		employee5.addAccount(savingAcc5);
		employee5.addAccount(savingAcc7);
		
		
		
		Set<MMSavingAcc> accounts = employee1.getAccounts();
		
		
		System.out.println(employee1+""+accounts);
		
	}
	
}