package com.loops;

import java.util.Scanner;

public class DemoEvenNumbers {

	public static void main(String[] args) {
		
		System.out.println("Enter a number: ");
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		
		for(int i = 2; i <= number; i += 2) {
			System.out.print(i + " ");
		}
		System.out.println();
		
	}

}
