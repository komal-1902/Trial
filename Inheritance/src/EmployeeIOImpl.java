import java.util.Scanner;

import com.pojo.Employee;
import com.pojo.EmployeeIO;

public class EmployeeIOImpl implements EmployeeIO {

	@Override
	public Employee readEmployee() {
		// TODO Auto-generated method stub
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
		return (new Employee(empId, name, age, sal));
	}

	@Override
	public void writeEmployee(Employee employee) {
		
		employee.display();

	}

}
