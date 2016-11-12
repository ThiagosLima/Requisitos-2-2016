package validations;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Validations {
	
	public static boolean validateName (String name) {
		
		if (name.isEmpty()) {
			//MOSTRAR MENSAGEM DE ERRO = NOME VAZIO
			return false;
		} else if (name.length() < 3) {
			// MOSTRAR MENSAGEM DE ERRO = QUANTIDADE DE CARACTERES INSUFICIENTE
			return false;
		} else 
			return true;
	}
}
