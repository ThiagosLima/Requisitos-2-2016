package controller;

import java.io.IOException;
import java.util.Date;

import javax.servlet.RequestDispatcher;
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
public class ValidateStudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ValidateStudentServlet() {
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
		String criou = null;
		String name = request.getParameter("name_student");
		String dataOfBirth = request.getParameter("dateOfBirth_student");
		String letterClass = request.getParameter("letterClass_student");
		String room = request.getParameter("room_student");
		String registration = request.getParameter("registration_student");
		String turn = request.getParameter("turn_student");
		String year = request.getParameter("year_student");
		String scholarship = request.getParameter("scholarship_student");
		String modalityCourse = request.getParameter("modalityCourse_student");
		
		boolean validName = Validations.validateName(request, response, name);
		boolean validRegistration = Validations.validateRegistration(request, response, registration);
		
		
		if (validName && validRegistration){
		
			criou = "mensagem" ; 
			request.setAttribute("criou", criou);
			RequestDispatcher dispatcher = request.getRequestDispatcher("MenuPrincipal.jsp");
			dispatcher.forward(request, response);
			
		}
		
	}
	
}
