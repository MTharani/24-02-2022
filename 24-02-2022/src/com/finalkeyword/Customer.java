package com.finalkeyword;
//3.final keyword with Customer
public  class Customer 
{
	//1.final String model;
   String model="Y31";
    String rom;
    String ram;
    public Customer() 
    {
		model="Y21";
		rom="128GB";
		ram="6GB";
		System.out.println("customer buy a mobile");
	}
    //public final void getphone()
     public  void getphone()
    {
   	 System.out.println("Model:"+model);
   	 System.out.println("rom:"+rom);
   	 System.out.println("RAM:"+ram);
    }


}
