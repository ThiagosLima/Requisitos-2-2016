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

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/RegisterServlet")
public class RegisterStudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public RegisterStudentServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String name = request.getParameter("name_student");
		System.out.println("Nome: "+name);
		String dataOfBirth = request.getParameter("dateOfBirth_student");
		System.out.println("Data de Nascimento: "+dataOfBirth);
		String letterClass = request.getParameter("letter_class_student");
		System.out.println("Letra da Sala: "+letterClass);
		String room = request.getParameter("room_student");
		System.out.println("Sala: "+room);
		String registration = request.getParameter("registration");
		System.out.println("Matricula: "+registration);
		String turn = request.getParameter("turn_student");
		System.out.println("Turno: "+turn);
		String year = request.getParameter("year_student");
		System.out.println("Ano: "+year);
		String scholarship = request.getParameter("scholarship_student");
		System.out.println("Bolsista? "+scholarship);
		String modalityCourse = request.getParameter("modalityCourse_student");
		System.out.println("Modalidade: "+modalityCourse);
		
		try {
			Services.createStudent(name, dataOfBirth, letterClass, room, registration, turn, year, modalityCourse,
									scholarship);			

		} catch (Exception error) {
			showError(request, response, "Não foi possível cadastrar o aluno");
		}
	}

	private void showError(HttpServletRequest request, HttpServletResponse response, String message)
			throws ServletException, IOException {

		request.setAttribute("error", message);
		RequestDispatcher dispatcher = request.getRequestDispatcher("RegisterStudent.jsp");
		dispatcher.forward(request, response);
	}
}
