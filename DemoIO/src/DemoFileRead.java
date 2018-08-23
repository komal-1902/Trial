import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DemoFileRead {

	public static void main(String[] args) {
		
		try {
			FileReader r = new FileReader("abc.txt");
			byte value = 0;
			do {
				int data = r.read();
				System.out.print((char)data);
				value = (byte)data;
			}while(value != -1);
		}
		catch(FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}

	}

}
