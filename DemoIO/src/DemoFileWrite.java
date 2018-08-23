import java.io.FileWriter;

public class DemoFileWrite {

	public static void main(String[] args) {
		
		try {
			FileWriter filewr = new FileWriter("abc.txt", true);
			filewr.write("Citi, Pune");
			System.out.println("File created and data inserted");
			filewr.close();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
