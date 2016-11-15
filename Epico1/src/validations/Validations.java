package validations;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import services.Services;

public class Validations {

	public static boolean validateName(HttpServletRequest request, HttpServletResponse response, String name)
			throws ServletException, IOException {

		if (name.isEmpty()) {
			Services.showErrorName(request, response, "Nome Vazio! Por favor preencha o campo do nome.");
			return false;
		} else if (name.length() < 3) {
			Services.showErrorName(request, response, "Insira um nome com no minimo 3 letras.");
			return false;
		} else
			return true;
	}

	public static boolean validateRegistration(HttpServletRequest request, HttpServletResponse response,
			String registration) throws ServletException, IOException {

		int numberValid;

		if (registration.trim().isEmpty()) {
			Services.showErrorRegistration(request, response, "Insira a matrícula");
			return false;
		}

		try {
			numberValid = Integer.parseInt(registration);
			return true;
		} catch (Exception error) {
			Services.showErrorRegistration(request, response, "Apenas números na matrícula");
			return false;
		}
	}

	public static boolean validateLetterClass(HttpServletRequest request, HttpServletResponse response,
			String letterClass) throws ServletException, IOException {

		Character lettlerValid;
		boolean letterValid;

		if (letterClass.trim().isEmpty()) {
			Services.showErrorLettlerClass(request, response, "Insira a letra da sala");
			return false;
		}

		try {
			letterValid = Services.isNumeric(letterClass);
			if (letterValid == true) {
				lettlerValid = letterClass.charAt(0);
				return true;
			} else {
				return false;
			}
		} catch (Exception error) {
			Services.showErrorLettlerClass(request, response, "Apenas letras");
		}
		return true;
	}

	public static boolean validateTurn(HttpServletRequest request, HttpServletResponse response, String turn)
			throws ServletException, IOException {

		if (turn != "morning_student" && turn != "afternoon_student") {
			Services.showErrorTurn(request, response, "Escolha o turno do aluno");
			return false;
		} else {
			return true;
		}
	}

	public static boolean validateScholarship(HttpServletRequest request, HttpServletResponse response, String scholarship)
			throws ServletException, IOException {

		if (scholarship != "yes" && scholarship != "no") {
			Services.showErrorScholarship(request, response, "O aluno é bolsista ou não?");
			return false;
		} else {
			return true;
		}
	}
	
	public static boolean validateModalityCourse(HttpServletRequest request, HttpServletResponse response, String modality)
			throws ServletException, IOException {

		if (modality != "normal_student" && modality != "eja_student") {
			Services.showErrorScholarship(request, response, "Qual é o tipo de curso do aluno??");
			return false;
		} else {
			return true;
		}
	}
}
