import com.pojo.Employee;
import com.pojo.EmployeeIO;

public class DemoInnerClass {

	public static void main(String[] args) {
		
		EmployeeIO empIO = new EmployeeIO() {
			
			@Override
			public void writeEmployee(Employee employee) {
				// TODO Auto-generated method stub
				employee.display();
			}
			
			@Override
			public Employee readEmployee() {
				// TODO Auto-generated method stub
				return new Employee();
			}
		};
		
		Employee emp = empIO.readEmployee();
		empIO.writeEmployee(emp);

	}

}
