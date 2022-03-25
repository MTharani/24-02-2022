package com.Superkeyword;

public class Account extends Customer
{
	int accno;
    String name;
    double amount;
    String ifsc;
    static String  branchName;
    
    public Account()
    {
	    accno=459313;
	    name="Devi";
	    amount=56239.16;
	    ifsc="IFSC1932N";
	    
	}
    static
    {
   	 branchName="SBI";
    }
    public void getInfo()
    {
   	 System.out.println("ACCOUNT NUMBER:"+accno);
   	 System.out.println("NAME:"+name);
   	 System.out.println("BALANCE:"+amount);
   	 System.out.println("IFSC:"+ifsc);
   	 System.out.println("BRANCH NAME:"+branchName);
   	 System.out.println("ANOTHER ACCOUNT NUMBER:"+super.accno); //super keyword
   	 System.out.println("ANOTHER NAME"+super.name);
    }
	public static void main(String[] args)
	{
		Account a=new Account();
		a.getInfo();
		

	}

}
