package com.manipal.demo.day9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingListDemo2 {

	public static void main(String[] args) {
		Employee emp1 = new Employee("Ramu", 12340.00);
		Employee emp2 = new Employee("Shyamu", 42345.00);
		Employee emp3 = new Employee("Anu", 30000.00);
		
		ArrayList<Employee> employeeList = new ArrayList<>();
		employeeList.add(emp1);
		employeeList.add(emp2);
		employeeList.add(emp3);
				
		for(Employee emp : employeeList) {
			System.out.println(emp);
		}
		
		Collections.sort(employeeList, new EmpNameComparator()); // 
		System.out.println("After Sorting on the basis of employee name :----");
		for(Employee emp : employeeList) {
			System.out.println(emp);
		}
		
		Collections.sort(employeeList, new SalaryComparator()); 
		
		
		
		System.out.println("After Sorting on the basis of employee salary :----");
		for(Employee emp : employeeList) {
			System.out.println(emp);
		
		
		
	}

}
}
