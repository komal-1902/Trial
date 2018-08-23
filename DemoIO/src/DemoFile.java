import java.io.File;
import java.io.IOException;

public class DemoFile {

	public static void main(String[] args) {
		
		File myFile = new File("myFile1.txt");
		try {
			myFile.createNewFile();
			System.out.println("File created successfully");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		

	}

}
