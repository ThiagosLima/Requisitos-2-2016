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
	
	public static boolean validateName (HttpServletRequest request, HttpServletResponse response,String name) throws ServletException, IOException {
		
		if (name.isEmpty()) {
			Services.showError(request, response, "Nome Vazio! Por favor preencha o campo do nome.");
			return false;
		} else if (name.length() < 3) {
			Services.showError(request, response, "Insira um nome com no minimo 3 letras.");
			return false;
		} else 
			return true;
	}
}
