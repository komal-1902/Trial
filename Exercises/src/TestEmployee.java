
public class TestEmployee {

	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		Employee e2 = new Employee(102, "A");
		Employee e3 = new Employee(103, "B");
		Employee e4 = new Employee(104, "C");
		
		e1.displayEmployee();
		e2.displayEmployee();
		e3.displayEmployee();
		e4.displayEmployee();
		
		Employee.showCount();

	}

}
