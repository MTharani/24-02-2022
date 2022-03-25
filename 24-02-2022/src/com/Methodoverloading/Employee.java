package com.Methodoverloading;


public class Employee
{
	int id;
	String name;
	double salary;
	static String orgName;
	 
	 public Employee() 
	 {
		id=4896;
		name="divi";
		salary=45000.65;
	}
	 
	 static
	 {
		 orgName = "IBM";
	 }
	 //without parameter
	 public void getEmployeeInfo()
	 {
		 System.out.println(id);
		 System.out.println(name);
		 System.out.println(salary);
		 System.out.println(orgName);
	 }
	 //with parameter
	 public void getEmloyeeInfo(int id, String name, double salary)
	 {
		 this.id=id;
		 this.name=name;
		 this.salary=salary;
		 System.out.println(id);
		 System.out.println(name);
		 System.out.println(salary);
		 System.out.println(orgName);
	 }
	public static void main(String[] args)
	{
		Employee employee=new Employee();
		employee.getEmployeeInfo();
		System.out.println("****************");
        employee.getEmloyeeInfo(56823,"Sai", 69319.56);

	}

}
