import java.util.Scanner;

import com.pojo.Person;
import com.pojo.Employee;
import com.pojo.Manager;

public class TestEmployee1 {

	public static void main(String[] args) {
	/*
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Employee ID:");
		int empId = scan.nextInt();
		System.out.println("Enter Employee Name:");
		String flush = scan.nextLine();
		String name = scan.nextLine();
		System.out.println("Enter Employee Age:");
		int age = scan.nextInt();
		System.out.println("Enter Employee Salary:");
		double sal = scan.nextDouble();
		System.out.println("Enter Employee Department:");
		String department = scan.next();
		System.out.println("Enter Employee Incentives:");
		int incentives = scan.nextInt();
		Manager emp = new Manager(empId, name, age, sal, department, incentives);
		//emp.display();
		System.out.println(emp);
		*/
		Person p1 = new Person(12, "Komal");
		Person p2 = new Person(12, "Komal");
		System.out.println(p1.equals(p2));
	}

}
