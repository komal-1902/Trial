import java.util.Scanner;

public class EmployeeArray {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of employees:");
		int num = scan.nextInt();
		int empID;
		String ename;
		
		Employee[] employees = new Employee[num];
		
		System.out.println("Enter details:\n");
		for(int i = 0; i < num; i++) {
			System.out.println("For employee " + (i+1));
			System.out.println("Enter emp ID:");
			empID = scan.nextInt();
			System.out.println("Enter emp name:");
			ename = scan.next();
			employees[i] = new Employee(empID, ename);
			System.out.println("Employee inserted");
		}
		
		for(Employee e : employees) {
			e.displayEmployee();
		}

	}

}
