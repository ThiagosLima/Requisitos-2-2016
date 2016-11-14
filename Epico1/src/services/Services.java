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

public class Services {

	private static ArrayList<Person> newPerson = new ArrayList<Person>();
	
	public static void createStudent (String name,String dateOfBirth) {
		
	}
	
	public static void showError (HttpServletRequest request,HttpServletResponse response,String message) throws ServletException, IOException {
		request.setAttribute("Error", message);
		RequestDispatcher dispatcher = request.getRequestDispatcher("register.jsp");
		dispatcher.forward(request, response);
	}
}
