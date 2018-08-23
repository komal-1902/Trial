import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

import com.pojo.Student;

public class DemoSerialization {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int rollno, total;
		String name;
		Student student1 = null, student2 = null;
		for(int i = 0; i < 2; i++) {
			System.out.println("For Student " + (i+1) + ":\n");
			System.out.println("Enter rollno: ");
			rollno = scan.nextInt();
			System.out.println("Enter total marks: ");
			total = scan.nextInt();
			System.out.println("Enter name: ");
			name = scan.next();
			if(i == 0) {
				student1 = new Student(rollno, total, name);
			}
			else {
				student2 = new Student(rollno, total, name);
			}
		}
		
		
		try {
			FileOutputStream fo = new FileOutputStream("student.txt");
			ObjectOutputStream o = new ObjectOutputStream(fo);
			o.writeObject(student1);
			o.writeObject(student2);
			o.close();
			fo.close();
			
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
