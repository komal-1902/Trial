import java.util.Scanner;

import com.controller.StudentFileIOImpl;
import com.controller.StudentIOImpl;
import com.pojo.Student;

public class Test {

	public static void main(String[] args) {
		
		int choice = 1, option = 0;
		Scanner scan = new Scanner(System.in);
		StudentFileIOImpl fileIO = new StudentFileIOImpl();
		StudentIOImpl userIO = new StudentIOImpl();
		Student[] students = userIO.readFromUser();
		fileIO.writeStudents(students);
		do {
			System.out.println("----------Menu----------\n1.Find student\n2.Display all students");
			System.out.println("Enter your choice: ");
			option = scan.nextInt();
			switch(option) {
			case 1:	boolean flag = false;
					System.out.println("Enter roll number of student: ");
					int rollno = scan.nextInt();
					students = fileIO.readStudents();
					for(Student s : students) {
						if(s.getRollNo() == rollno) {
							System.out.println(s);
							flag = true;
							break;
						}
					}
					if(!flag) {
						System.out.println("Student not found");
					}
					break;
			case 2: userIO.writeToUser(fileIO.readStudents());
					break;
			default: System.out.println("Incorrect choice\n");
					 break;
			}
			System.out.println("Go again?\n1.Yes\n2.No");
			choice = scan.nextInt();
		}while(choice == 1);

	}

}
