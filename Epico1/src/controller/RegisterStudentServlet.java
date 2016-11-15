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
import javax.websocket.MessageHandler.Whole;

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
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String acao = request.getParameter("acao");
		int id = 0;
		String name = request.getParameter("name_student");
		System.out.println("name" + name);
		String dataOfBirth = request.getParameter("dateOfBirth_student");
		String letterClass = request.getParameter("letterClass_student");
		String room = request.getParameter("room_student");
		String registration = request.getParameter("registration_student");
		System.out.println(registration);
		String turn = request.getParameter("turn_student");
		String year = request.getParameter("year_student");
		String scholarship = request.getParameter("scholarship_student");
		String modalityCourse = request.getParameter("modalityCourse_student");
		
		try {
			switch (acao) {
				case "Cadastrar":
					Services.createStudent(id,name, dataOfBirth, letterClass, room, registration, turn,
							year, modalityCourse, scholarship);
					showSucess(request, response);
					break;
					
				default:
					break;
			}
		} catch (Exception error) {
			showError(request, response, "Não foi possível cadastrar o aluno");
		}
	}

	private String validateName(HttpServletRequest request, HttpServletResponse response, String name,
			String registration) throws ServletException, IOException {

		if (name == null || name.isEmpty()) {
			showError(request, response, "Nome Vazio! Por favor preencha o campo do nome.");
		} else if (name.length() < 3) {
			showError(request, response, "Insira um nome com no minimo 3 letras.");
		}
		return name;
	}

	/*
	 * private Integer validateRegistration (HttpServletRequest request,
	 * HttpServletResponse response, String registration) throws
	 * ServletException, IOException {
	 * 
	 * int numberValid = 0; if (registration == null || registration.isEmpty())
	 * { showErrorRegistration(request, response, "Insira a matrícula"); }
	 * 
	 * try { numberValid = Integer.parseInt(registration); } catch (Exception
	 * exception) { throw new ServletException(); } return numberValid; }
	 */

	private void showError(HttpServletRequest request, HttpServletResponse response, String message)
			throws ServletException, IOException {

		request.setAttribute("error", message);
		RequestDispatcher dispatcher = request.getRequestDispatcher("RegisterStudent.jsp");
		dispatcher.forward(request, response);
	}

	private void showSucess(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Services.showSucess(request, response, "Aluno Cadastrado Com Sucesso");
	}
}
