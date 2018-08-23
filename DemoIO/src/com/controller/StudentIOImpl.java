package com.controller;

import java.util.Scanner;

import com.myinterfaces.StudentIO;
import com.pojo.Student;

public class StudentIOImpl implements StudentIO {

	@Override
	public Student[] readFromUser() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of students: ");
		int num = scan.nextInt();
		int rollno, total;
		String name, flush;
		Student[] students = new Student[num];
		for(int i = 0; i < num; i++) {
			System.out.println("Enter details for Student " + (i+1) + ":\n");
			System.out.println("Roll No: ");
			rollno = scan.nextInt();
			System.out.println("Total marks: ");
			total = scan.nextInt();
			System.out.println("Name: ");
			flush = scan.nextLine();
			name = scan.nextLine();
			students[i] = new Student(rollno, total, name);
			System.out.println("Student " + (i+1) + " entered!");
		}
		return students;
	}

	@Override
	public void writeToUser(Student[] student) {
		System.out.println("Student Information:\n");
		for(Student s : student) {
			System.out.println(s);
		}
	}

}
