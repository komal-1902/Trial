
public class TestPerson {

	public static void main(String[] args) {
		
		Person person;			//Create reference, allocated  on stack memory
		person = new Person();	//Create object, allocated on heap memory
		//person.setValues();
		person.display();
		
		Person p = new Person(20, "Citi");
		p.display();
		p.setAge(200);
		p.display();
		
	}

}
