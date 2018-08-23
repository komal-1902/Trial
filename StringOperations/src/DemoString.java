import java.util.Scanner;

public class DemoString {

	public static void main(String[] args) {
		
		String name = "Citi";
		System.out.println("Initial value of name: "+ name);
		name.concat(", Pune");
		System.out.println("Value after concatenation: " + name);
		
		Scanner scan = new Scanner(System.in);
		System.out.println("\nEnter new string:");
		String input = scan.next();
		
		System.out.println("String: " + input);
		input = input.substring(0, input.length() - 2);
		System.out.println("Performing substring: " + input);
		input = input.concat(" Hello");
		System.out.println("Performing concatenation: " + input);
		input = input.toLowerCase();
		System.out.println("Converting to lower case: " + input);
		input = input.replace("e", "r");
		System.out.println("Performing replace operation: " + input);
		char ch = input.charAt(0);
		System.out.println("Printing 1st character: " + ch);
		
		
	}

}
