
public class DemoStringBuilder {

	public static void main(String[] args) {
		
		StringBuilder builder = new StringBuilder("Citi");
		System.out.println("Initial value: " + builder);
		
		builder.append(", EON");
		System.out.println("New value: " + builder);

	}

}
