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
	
	public static void createStudent(String name,String dataOfBirth,String letterClass,String room,
									 String registration,String turn,String year,String modalityCourse,
									 String scholarship) {
			
		Student student = new Student(name,dataOfBirth,letterClass,room,registration,turn,year,modalityCourse,
									  scholarship);
	
		StudentDao.insertStudent(student);
	}

	public static boolean isNumeric(String str) {
		try {
			double d = Double.parseDouble(str);
		} catch (NumberFormatException nfe) {
			return false;
		}
		return true;
	}

	public static void showErrorName(HttpServletRequest request, HttpServletResponse response, String message)
			throws ServletException, IOException {
		request.setAttribute("errorName", message);
		RequestDispatcher dispatcher = request.getRequestDispatcher("RegisterStudent.jsp");
		dispatcher.forward(request, response);
	}
	
	public static void showSucess(HttpServletRequest request, HttpServletResponse response, String message)
			throws ServletException, IOException {
		
		request.setAttribute("sucess", message);
		RequestDispatcher dispatcher = request.getRequestDispatcher("MenuPrincipal.jsp");
		dispatcher.forward(request, response);
	}
}
