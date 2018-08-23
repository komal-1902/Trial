import java.util.Scanner;

public class DemoScanner {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int number1 = scan.nextInt();
		System.out.println("Enter second number: ");
		int number2 = scan.nextInt();
		
		System.out.println("Addition of the two numbers is: " + (number1 + number2));

	}

}
