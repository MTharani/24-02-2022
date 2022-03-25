package com.supermethod;

public class Phonesell extends Customer
{
	double rate;
	String model;
	String rom;
	String ram;
	static String brand;
	public Phonesell() 
	{
		super();
		rate=46241;
		model="Y93";
		rom="64GB";
		ram="4GB";					
	}
	static
	{
		brand="VIVO";
	}
public void getphone()
{
	System.out.println(rate);
	System.out.println(model);
	System.out.println(rom);
	System.out.println(ram);
	System.out.println(brand);
}
	public static void main(String[] args) {
		Phonesell phone=new Phonesell();
		phone.getphone();
		Customer cus=new Customer();
		cus.getphone();

	}

}
