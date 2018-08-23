package com.array;

import java.util.Scanner;

public class ArrayAvg {

	public static void main(String[] args) {
		
		int[] numbers;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter size of your array:");
		int size = scan.nextInt();
		numbers = new int[size];
		
		System.out.println("Enter elements of your array: ");
		for(int i = 0; i < size; i++) {
			numbers[i] = scan.nextInt();
		}
		
		int sum = 0;
		System.out.println("Your array: ");
		for(int n : numbers) {
			System.out.print(n + " ");
			sum += n;
		}
		System.out.println();
		
		double avg = sum/size;
		
		System.out.println("Sum: " + sum + "\t\tAverage:" + avg);
		
		System.out.println("\nNumbers less than average:");
		for(int n : numbers) {
			if(n < avg) {
				System.out.print(n + " ");
			}
		}
		System.out.println();
		
	}

}
