import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.pojo.Student;

public class DemoDeserialization {

	public static void main(String[] args) {
		
		try {
			FileInputStream fi = new FileInputStream("student.txt");
			ObjectInputStream o = new ObjectInputStream(fi);
			Object obj1 = o.readObject();
			Student student1 = (Student) obj1;
			System.out.println("Student 1: " + student1);
			
			Object obj2 = o.readObject();
			Student student2 = (Student) obj2;
			System.out.println("Student 1: " + student2);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}

	}

}
