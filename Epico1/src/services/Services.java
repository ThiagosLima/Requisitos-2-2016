package services;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.net.httpserver.spi.HttpServerProvider;

import dao.StudentDao;
import model.Person;
import model.Student;

public class Services {
	
	private static ArrayList<Student> students = new ArrayList<Student>();

	public static void createStudent(String name,String dataOfBirth,String letterClass,String room,
									 String registration,String turn,String year,String modalityCourse,
									 String scholarship) {
		Student student = new Student(name, dataOfBirth, letterClass, room, registration, turn, 
										year, modalityCourse, scholarship);
		students.add(student);
	}
}
