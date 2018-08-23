package com.pojo;

public class Manager extends Employee {
	
	String department;
	int incentives;
	
	public Manager() {
		department = "ISG";
		incentives = 5;
	}
	
	public Manager(int empId, String empName, int age, double salary, String department, int incentives) {
		super(empId, empName, age, salary);
		this.department = department;
		this.incentives = incentives;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getIncentives() {
		return incentives;
	}

	public void setIncentives(int incentives) {
		this.incentives = incentives;
	}
	
	public void display() {
		super.display();
		System.out.println("Department: " + department + "\tIncentives: " + incentives);
	}

}
