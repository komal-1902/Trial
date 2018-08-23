
public class Demo1DObjects {
	
	public static void main(String args[]) {
		
		Person[] persons;
		
		persons = new Person[5]; 
		
		persons[0] = new Person();
		persons[1] = new Person(22, "Kanika");
		persons[2] = new Person(20, "Riti");
		persons[3] = new Person(21, "Sonali");
		persons[4] = new Person(22, "Eesha");
		
		persons[3].display();

	}

}
