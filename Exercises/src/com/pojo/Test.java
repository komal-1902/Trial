package com.pojo;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter roll no: ");
		int rollNo = scan.nextInt();
		System.out.println("Enter name: ");
		String name = scan.nextLine();
		name = scan.next();
		System.out.println("Enter number of subjects for entering marks: ");
		int markSize = scan.nextInt();
		System.out.println("Enter marks for your subjects: ");
		int[] marks = new int[markSize];
		int temp;
		for(int i = 0; i < markSize; i++) {
			marks[i] = scan.nextInt();
		}
		
		Student student = new Student(rollNo, name, markSize, marks);
		student.display();
		
	}

}
