package validations;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import services.Services;

public class Validations {

	public static boolean validateName(HttpServletRequest request, HttpServletResponse response, String name)
			throws ServletException, IOException {

		boolean valid = true;
		if (name == null || name.isEmpty()) {
			showError(request, response, "Nome Vazio! Por favor preencha o campo do nome.");
			valid = false;
		} else if (name.length() < 3) {
			showError(request, response, "Insira um nome com no minimo 3 letras.");
			valid = false;
		}
		return valid;
	}

	public static boolean validateRegistration(HttpServletRequest request, HttpServletResponse response, 
												String registration) throws ServletException, IOException {

		boolean valid = true;
		if (registration == null || registration.isEmpty()) {
			showError(request, response, "Matrícula vazia! Por favor preencha o campo da matrícula.");
			valid = false;
		} else if (registration.length() < 6) {
			showError(request, response, "Insira uma matrícula com no minimo 6 digitos.");
			valid = false;
		}
		return valid;
	}

	public static void showError(HttpServletRequest request, HttpServletResponse response, String message)
			throws ServletException, IOException {

		request.setAttribute("error", message);
		RequestDispatcher dispatcher = request.getRequestDispatcher("RegisterStudent.jsp");
		dispatcher.forward(request, response);
	}
}
