
public class Person {
	
	private int age;
	private String name;
	
	public Person() {
		age = 21;
		name = "Komal";
	}
	
	public Person(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	//Mutator (setters) and accessor (getters) functions

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void display() {
		System.out.println("Name: " + name + "\tAge: " + age);
	}
	
}
