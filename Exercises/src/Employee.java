
public class Employee {
	
	private int empId;
	private String empName;
	
	private static int empCount;
	
	static {
		empCount = 0;
	}

	public Employee() {
		empId = 101;
		empName = "Abcd";
		empCount++;
	}

	public Employee(int empId, String empName) {
		this.empId = empId;
		this.empName = empName;
		empCount++;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	public void displayEmployee() {
		System.out.println("EmpID: " + empId + "\tEmp Name: " + empName);
	}
	
	public static void showCount() {
		System.out.println("Employee count: " + empCount);
	}

}
