package com.array;

import java.util.Scanner;

public class ArraySearch {

	public static void main(String[] args) {
		
		int[] numbers = {5, 10, 15, 24, 45};
		int searchKey = 0;
		boolean flag = false;
		Scanner scan = new Scanner(System.in);
		do {
			System.out.println("Enter a number between 1 and 50:");
			searchKey = scan.nextInt();
		}while((searchKey < 1) || (searchKey > 50));
		for(int i : numbers) {
			if (i == searchKey) {
				flag = true;
				break;
			}
		}
		if(flag == false) {
			System.out.println("Number not present");
		}
		else {
			System.out.println("Number present");
		}
	}

}
