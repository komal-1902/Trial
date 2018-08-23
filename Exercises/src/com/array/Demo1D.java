package com.array;

import java.util.Scanner;

public class Demo1D {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter name of 5 of your friends: ");
		String[] friends = new String[5];
		for(int i = 0; i < 5; i++) {
			friends[i] = scan.next();
		}
		for(String name: friends) {
			System.out.print(name + " ");
		}

	}

}
