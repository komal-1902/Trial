package com.controller;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.myinterfaces.StudentFileIO;
import com.pojo.Student;

public class StudentFileIOImpl implements StudentFileIO {
	
	final String FILENAME = "studentData.txt";

	@Override
	public Student[] readStudents() {
		
		try {
			FileInputStream fin = new FileInputStream(FILENAME);
			ObjectInputStream in = new ObjectInputStream(fin);
			return (Student[])in.readObject();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public int writeStudents(Student[] student) {
		
		try {
			FileOutputStream fout = new FileOutputStream(FILENAME);
			ObjectOutputStream out = new ObjectOutputStream(fout);
			out.writeObject(student);
			System.out.println("Object written to file");
			out.close();
			fout.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return 0;
	}

}
