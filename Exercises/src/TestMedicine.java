
public class TestMedicine {

	public static void main(String[] args) {

		Medicine m1 = new Medicine();
		Medicine m2 = new Medicine("Paracetemol", 90);
		
		m1.displayMedicine();
		m2.displayMedicine();
		
		m2.setMedicinePrice(120);
		m2.displayMedicine();

	}

}
