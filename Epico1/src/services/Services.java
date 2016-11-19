package services;

import java.util.ArrayList;

import model.Student;

public class Services {
	
	public static ArrayList<Student> students = new ArrayList<Student>();
	public static void createStudent(String name,String dataOfBirth,String letterClass,String room,
									 String registration,String turn,String year,String modalityCourse,
									 String scholarship) {
			
		Student student = new Student(name,dataOfBirth,letterClass,room,registration,turn,year,modalityCourse,
									  scholarship);
	
		students.add(student);
	}
}
