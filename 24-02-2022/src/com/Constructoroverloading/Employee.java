package com.Constructoroverloading;


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
	 public Employee(int id, String name, double salary)
	 {
		 this.id=id;
		 this.name=name;
		 this.salary=salary;
		 
	 }
	 
	 static
	 {
		 orgName = "IBM";
	 }
	 public void getEmployeeInfo()
	 {
		 System.out.println(id);
		 System.out.println(name);
		 System.out.println(salary);
		 System.out.println(orgName);
	 }

	public static void main(String[] args) {
		Employee employee=new Employee();
		employee.getEmployeeInfo();
		System.out.println("************");
		Employee employee1=new Employee(465,"sai",4563.23);
		employee1.getEmployeeInfo();

	}

}
