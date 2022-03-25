package com.Superkeyword;



public class Customer 
{
	long accno;
	String name;
	static String branchName;
	public Customer() 
	{
		accno=46231285;
		name="Valli";
		
	}
	static
	{
		branchName="SBI";
	}
	public void getInfo()
	{
		System.out.println(accno);
		System.out.println(name);
		System.out.println(branchName);
		
	}
}
