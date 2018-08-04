package com.SavingAcc;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Test {

	static ArrayList<SavingAccount> list=new ArrayList<>();
	public static void main(String[] args) {
		SavingAccount sa[]=new SavingAccount[5];

		sa[0]=new SavingAccount(1_00_000, 101, "Anindya", true);
		sa[1]=new SavingAccount(2_00_000, 102, "Drishti", false);
		sa[2]=new SavingAccount(3_00_000, 103, "Mahek", true);
		sa[3]=new SavingAccount(4_00_000, 104, "Nishad", false);
		sa[4]=new SavingAccount(5_00_000, 105, "Sayali", true);
		
		//adding accounts to the list
		for(int i=0;i<5;i++)
		{
			list.add(sa[i]);
		}
		
		//printing the list
		for(SavingAccount ans:list)
		{
			System.out.println(ans);
		}


	}
	

}
