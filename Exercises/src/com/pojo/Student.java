package com.pojo;

import java.util.Arrays;

public class Student {
	
	private String name;
	private int[] marks;
	private int rollNo;
	private static String institute;
	
	static {
		institute = "Citi";
	}
	
	public Student() {
		name = "Komal";
		rollNo = 37;
		marks = new int[3];
		Arrays.fill(marks, 90);
	}
	
	public Student(int rollNo, String name, int n, int[] marks) {
		this.marks = new int[n];
		this.name = name;
		this.marks = marks;
		this.rollNo = rollNo;
	}
	
	public void display() {
		System.out.print("Roll no: " + rollNo + "\nName: " + name  + "\nInstitute: " + institute + "\nMarks: ");
		for(int i = 0; i < marks.length; i++) {
			System.out.print(marks[i] + " ");
		}
		System.out.println();
	}

}
