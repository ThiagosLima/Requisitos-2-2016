package services;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.net.httpserver.spi.HttpServerProvider;

import model.Person;
import model.Student;

public class Services {

	private static ArrayList<Person> newPerson = new ArrayList<Person>();
	
	public static void createStudent (String name,String dataOfBirth,Character letterClass, Integer room, Integer registration, String turn, Integer year,
			String modalityCourse ,Boolean scholarship) {
		Student student = new Student(name,dataOfBirth,letterClass,room,registration,turn,year,modalityCourse
									,scholarship);
		newPerson.add(student);
	}
	
	public static void showErrorName (HttpServletRequest request,HttpServletResponse response,String message) throws ServletException, IOException {
		request.setAttribute("errorName", message);
		RequestDispatcher dispatcher = request.getRequestDispatcher("RegisterStudent.jsp");
		dispatcher.forward(request, response);
	}
	public static void showErrorRegistration (HttpServletRequest request,HttpServletResponse response,String message) throws ServletException, IOException {
		request.setAttribute("errorRegistration", message);
		RequestDispatcher dispatcher = request.getRequestDispatcher("RegisterStudent.jsp");
		dispatcher.forward(request, response);
	}
	
}
