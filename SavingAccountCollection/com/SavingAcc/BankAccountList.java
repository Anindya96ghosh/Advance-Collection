package com.SavingAcc;

import java.util.Set;
import java.util.TreeSet;

public class BankAccountList  {


	//Creation of set
	Set<SavingAccount> set=new TreeSet<>();
	
	//function to add accounts to the set
	public void addAccount(SavingAccount savAcc)
	{
		if(savAcc.getAccountHolderName() !=null)
		{
			set.add(savAcc);
		}
	}
	
	//function to remove account from the set
	public void removeAccount(SavingAccount savAcc)
	{
		set.remove(savAcc);
	}
}
	

