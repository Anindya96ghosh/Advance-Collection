package com.collection.employee;

//b.	MMASaving Account class will have fields accountID, accountholder_name, account_balance, isSalaryAccount
//		with that they will have setter and getter methods

public class MMSavingAcc {
	private int accountID;
	private String accountHolder;
	private double accountBalance;
	private boolean salaryAccount;
	
	//Parameterized Constructor
	public MMSavingAcc(int accountID, String accountHolder, double accountBalance, boolean salaryAccount) {
		this.accountID = accountID;
		this.accountHolder = accountHolder;
		this.accountBalance = accountBalance;
		this.salaryAccount = salaryAccount;
	}
	
	//getters
	public int getAccountID() {
		return accountID;
	}
	
	public String getAccountHolder() {
		return accountHolder;
	}
	
	
	public double getAccountBalance() {
		return accountBalance;
	}
	
	
	public boolean isSalaryAccount() {
		return salaryAccount;
	}
	


	//Overriden toString method
	@Override
	public String toString() {
		return "MMSavingAcc [accountID=" + accountID + ", accountHolder=" + accountHolder + ", accountBalance="
				+ accountBalance + ", salaryAccount=" + salaryAccount + "]";
	}
	
}