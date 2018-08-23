import java.io.IOException;
import java.io.InputStreamReader;

public class DemoReadData {

	public static void main(String[] args) {
		
		InputStreamReader ir = new InputStreamReader(System.in);

		try {
			System.out.println("Enter a number:");
			int value = ir.read();
			System.out.println("You entered: " + (char)value);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}

}
