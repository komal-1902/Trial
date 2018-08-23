package com.pojo;

public class Employee extends Person {
	
	private int empId;
	private double empSalary;
	
	public Employee() {
		//super();
		empId = 0;
		empSalary = 1000d;
	}

	public Employee(int empId, String name, int age, double empSalary) {
		super(age, name);
		this.empId = empId;
		this.empSalary = empSalary;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
	
	public void display(int x) {
		super.display();
		System.out.println("Employee ID: " + empId + "\t\tSalary: " + empSalary);
	}
	
	public String toString() {
		return super.toString() + " " + empId + " " + empSalary;
	}

}
