
public class TestDate {

	public static void main(String[] args) {
		
		Date date1, date2;
		date1 = new Date();
		System.out.print("Default values:\t\t\t");
		date1.display();
		date1.setDay(2);
		date1.setMonth(8);
		date1.setYear(2018);
		System.out.print("Setting new date:\t\t");
		date1.display();
		
		date2 = new Date(19, 2, 1997);
		System.out.print("Parameterised constructors:\t");
		date2.display();
		
	}

}
