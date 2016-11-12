package controller;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import services.Services;
import validations.Validations;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doService(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doService(request, response);
	}

	private void doService(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		String name = request.getParameter("name");
		String sdateOfBirth = request.getParameter("dateOfBirth");
		String letterClass = request.getParameter("letterClass");
		String room = request.getParameter("room");
		String registration = request.getParameter("registration");
		String turn = request.getParameter("turn");
		String year = request.getParameter("year");
		String scholarship = request.getParameter("scholarship");
		boolean nameValid = false;
		boolean dateOfBirthValid = false;
		boolean letterClassValid = false;
		boolean roomValid = false;
		boolean registrationValid = false;
		boolean turnValid = false;
		boolean yearValid = false;
		boolean scholarShipValid = false;
		
		nameValid = Validations.validateName(name);
		dateOfBirthValid = Validations.validateDate(sdateOfBirth);
		
		if (nameValid == true && dateOfBirthValid == true) {
			Services.createStudent(name,sdateOfBirth);
		}
	}
	
}
