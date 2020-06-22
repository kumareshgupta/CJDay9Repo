package com.manipal.demo.day9;


public class Employee   {
	private String empName;
	private double salary;

	public Employee() {
		System.out.println("Default constructor....");
	}
	public Employee(String empName, double salary) {
		super();
		this.empName = empName;
		this.salary = salary;
	}

	
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return  "Employee Details : \n"+ empName + " - " + salary;
	}
	
}
