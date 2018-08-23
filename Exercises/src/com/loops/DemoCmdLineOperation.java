package com.loops;

public class DemoCmdLineOperation {

	public static void main(String[] args) {

		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		double result = 0;
		switch(args[2]) {
		case "+":result = num1 + num2;
				 break;
		case "-":result = num1 - num2;
				 break;
		case "*":result = num1 * num2;
				 break;
		case "/":result = num1 / num2;
				 break;
		default: System.out.println("Incorrect operator entered");
				 break;
		}
		System.out.println("Result: " + result);

	}

}
