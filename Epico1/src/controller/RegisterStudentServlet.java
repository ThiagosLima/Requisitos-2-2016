package controller;

import java.io.IOException;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.plaf.synth.SynthSeparatorUI;

import model.Student;
import services.Services;
import validations.Validations;

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
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String acao = request.getParameter("acao");

		String name = request.getParameter("name_student");
		System.out.println(name);
		String dataOfBirth = request.getParameter("dateOfBirth_student");
		String letterClass = request.getParameter("letterClass_student");
		String room = request.getParameter("room_student");
		String registration = request.getParameter("registration_student");
		String turn = request.getParameter("turn_student");
		String year = request.getParameter("year_student");
		String scholarship = request.getParameter("scholarship_student");
		String modalityCourse = request.getParameter("modalityCourse_student");

		/*try {
			switch (acao) {
			case "Cadastrar":
				boolean validName = Validations.validateName(request, response, name);
				boolean validRegistration = Validations.validateRegistration(request, response, registration);
				boolean validLetterClass = Validations.validateLetterClass(request, response, letterClass);
				boolean validTurn = Validations.validateTurn(request, response, turn);
				boolean validScholarship = Validations.validateScholarship(request, response, scholarship);
				boolean validModalityCourse = Validations.validateModalityCourse(request, response, modalityCourse);

				if (validName == true && validRegistration == true && validLetterClass == true && validTurn == true
						&& validScholarship == true && validModalityCourse == true) {

					Character lettlerValid = letterClass.charAt(0);
					Integer roomValid = Integer.parseInt(room);
					Integer registrationValid = Integer.parseInt(registration);
					Integer yearValid = Integer.parseInt(year);

					Services.createStudent(name, dataOfBirth, lettlerValid, roomValid, registrationValid, turn,
							yearValid, modalityCourse, scholarship);
				}
			}
		} catch (ServletException erro) {

		}*/
		Character lettlerValid = letterClass.charAt(0);
		Integer roomValid = Integer.parseInt(room);
		Integer registrationValid = Integer.parseInt(registration);
		Integer yearValid = Integer.parseInt(year);

		Services.createStudent(name, dataOfBirth, lettlerValid, roomValid, registrationValid, turn,
				yearValid, modalityCourse, scholarship);
	}
}
