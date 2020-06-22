package com.manipal.demo.day9;

import java.util.Comparator;

public class EmpNameComparator implements Comparator<Employee> {
	@Override
	public int compare(Employee emp1, Employee emp2) {
		return emp1.getEmpName().compareTo(emp2.getEmpName());
	}

}
