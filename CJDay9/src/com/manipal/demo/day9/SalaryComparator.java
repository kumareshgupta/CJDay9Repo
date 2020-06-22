package com.manipal.demo.day9;

import java.util.Comparator;

public class SalaryComparator implements Comparator<Employee> {
	@Override
	public int compare(Employee emp1, Employee emp2) {
		Double sal1 = emp1.getSalary();
		Double sal2 = emp2.getSalary();
		return sal1.compareTo(sal2);
	}

}
