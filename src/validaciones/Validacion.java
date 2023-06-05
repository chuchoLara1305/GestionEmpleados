package validacion;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Validacion {

	//BLOQUE DE AÑOS DE SERVICIO
	public static boolean validarAntiguedad(String entrada) {
		String regex = "^(?:[1-6]?[0-9]|70|0)$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(entrada);
		if(matcher.matches()) {
			return true;}
		else {
			System.out.println("Dato ingresado incorrectamente");
			return false;
		}
	}
	//TERMINA BLOQUE DE AÑOS DE SERVICIO

	//BLOQUE DE NOMBRE
	public static boolean ValidarNombre(String entrada){
		//String regex = "^(?!.*\s{2,})[A-ZÁÉÍÓÚÜÑ]+(?: [A-ZÁÉÍÓÚÜÑ]+)*$";
		String regex = "^[A-Za-zÁÉÍÓÚÜÑáéíóúüñ][A-Za-zÁÉÍÓÚÜÑáéíóúüñ ]*[A-Za-zÁÉÍÓÚÜÑáéíóúüñ]$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(entrada);
		if(matcher.matches()) {
			return true;}
		else {
			System.out.println("Dato ingresado incorrectamente, ingrese nuevamente");
			return false;
		}
	}
	//TERMINA BLOQUE DE NOMBRE

	//BLOQUE DE EDAD
	public static boolean validarEdad(String entrada) {
		String regex = "^(?:1[89]|[2-8][0-9]|90)$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(entrada);
		if(matcher.matches()) {
			return true;}
		else {
			System.out.println("Dato ingresado incorrectamente");
			return false;
		}
	}
	//TERMINA BLOQUE DE EDAD

	//BLOQUE DE AFILIACION
	public static boolean validarAfiliacion(String entrada) {
		String regex = "^[A-Za-z]{3}[0-9]{4}[A-Za-z]{3}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(entrada);
		if(matcher.matches()) {
			return true;}
		else {
			System.out.println("Dato ingresado incorrectamente");
			return false;
		}
	}
	//TERMINA BLOQUE DE AFILIACION

	//BLOQUE DE CORREO
	public static boolean validarCorreo(String entrada) {
		String regex = "^[a-zA-Z0-9._%+-]+@gmail\\.com$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(entrada);
		if (matcher.matches()) {
			return true;
		} else {
			System.out.println("Dato ingresado incorrectamente");
			return false;
		}
	}
	//TERMINA BLOQUE DE CORREO

	//BLOQUE DE TELEFONO
	public static boolean validarTelefono(String entrada) {
		String regex = "^+52\\d{10}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(entrada);
		if (matcher.matches()) {
			return true;}
		else {
			return false;
		}
	}

	//TERMINA BLOQUE DE TELEFONO

	//BLOQUE DE SUELDO
	public static boolean validarSueldo(String entrada) {	        

		String regex = "\\d+(\\.\\d{0,2})?";

		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(entrada);
		if (matcher.matches()) {
			return true;}
		else {
			System.out.println("Dato ingresado incorrectamente, ingrese nuevamente");
			return false;
		}
	}
