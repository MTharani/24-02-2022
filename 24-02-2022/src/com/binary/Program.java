package com.binary;

import java.util.Scanner;

public class Program extends Converter
{
	public static void main(String[] args) 
	{ 
		Scanner s=new Scanner(System.in);
		System.out.println("ENTER THE NUMBER:");
		int x=s.nextInt();
		System.out.println("BINARY NUMBER IS:");
		System.out.println(Converter.toBinary(x));
		s.close();


	}

}
