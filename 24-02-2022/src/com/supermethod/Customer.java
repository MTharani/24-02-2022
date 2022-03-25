package com.supermethod;

public class Customer 
{
     String model;
     String rom;
     String ram;
     public Customer() 
     {
		model="Y21";
		rom="128GB";
		ram="6GB";
		System.out.println("customer buy a mobile");
	}
     public void getphone()
     {
    	 System.out.println(model);
    	 System.out.println(rom);
    	 System.out.println(ram);
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
