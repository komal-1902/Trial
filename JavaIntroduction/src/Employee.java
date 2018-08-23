
public class Employee {
	
	private int empId;
	private String empName, companyName;
	private double salary;
	
	public Employee() {
		empId = 101;
		empName = "Komal";
		salary = 1000;
		companyName = "Citi";
	}

	public Employee(int empId, String empName, double salary) {
		this();
		this.empId = empId;
		this.empName = empName;
		//this.companyName = companyName;
		this.salary = salary;
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

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public void display() {
		System.out.println("Emp Id: " + empId + "\nEmp Name: " + empName + "\nCompany Name: " + companyName + "\nSalary: " + salary);
	}

}
