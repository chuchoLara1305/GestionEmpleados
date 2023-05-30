package Proyecto01;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validacion {

	//Bloque de antiguedad Alejandro 1
	
	public static boolean validarAntiguedad(String entrada) {
		entrada = entrada.trim();
		try {
		if (Integer.valueOf(entrada) < 0 || Integer.valueOf(entrada) > 70) {
			System.out.println("El dato ingresado es incorrecto");
			return false;
		} else {
		

				System.out.println("El dato ingresado ha sido registrado");
				return true;
			}
		}
			catch (NumberFormatException e) {
				System.out.println("El formato ingresado es incorrecto");
				return false;
			}
		}
	
	//Termina Bloque de antiguedad

	//Bloque de Nombre Alejandro 2
	
	public static boolean ValidarNombre(String entrada) {
		if (entrada == "") {
			System.out.println("El dato ingresado es incorrecto");
			return false;
		} else
			for (char c : entrada.toCharArray()) {
				if (!Character.isLetter(c) && !Character.isWhitespace(c)) {
					System.out.println("El dato ingresado es incorrecto");
					return false;
				}
			}
		System.out.println("El dato ingresado ha sido registrado");
		return true;
	}
	//Termina Bloque de Nombre
	
	//Bloque de Edad Alejandro 3
		public static boolean validarEdad(String entrada) {
			try {
				if (Integer.valueOf(entrada) < 0 || Integer.valueOf(entrada) > 90) {
					System.out.println("El dato ingresado es incorrecto");
					return false;
				}
				System.out.println("El dato ingresado se ha registrado");
				return true;
			} catch (NumberFormatException e) {
				System.out.println("El formato ingresado es incorrecto");
				return false;
			}
		}

     //Termina Bloque de Edad
		
		//Bloque de Afiliacion Zuleyma 4
		public static boolean validarAfiliacion(String entrada) {
			entrada = entrada.trim();
			if (entrada.length() != 10) {
				System.out.println("El formato ingresado es incorrecto");
				return false;
			}
			if (!Character.isLetter(entrada.charAt(0)) || !Character.isLetter(entrada.charAt(1))
					|| !Character.isLetter(entrada.charAt(2))) {
				System.out.println("El dato ingresado es incorrecto");
				return false;
			}

			for (int i = 3; i < 6; i++) {
				if (!Character.isDigit(entrada.charAt(i))) {
					System.out.println("El dato ingresado es incorrecto");
					return false;
				}
			}

			if (!Character.isLetter(entrada.charAt(7)) || !Character.isLetter(entrada.charAt(8))
					|| !Character.isLetter(entrada.charAt(9))) {
				System.out.println("El dato ingresado es incorrecto");
				return false;
			}
			System.out.println("El dato ingresado ha sido registrado");
			return true;
		}
		
	//Termina Bloque de Afiliacion

	//Bloque de Correo Lolis 5
	public static boolean validarCorreo(String entrada) {
       
        if (entrada.indexOf('@') != entrada.lastIndexOf('@')) {
            return false;
        }
        String[] parts = entrada.split("@");
        if (parts.length != 2) {
            return false;
        }

        String username = parts[0];
        String domain = parts[1];

        if (!domain.equalsIgnoreCase("gmail.com")) {
            return false;
        }
        return true;
    }

	//Termina Bloque de Correo

	//Bloque de Telefono Lolis 6
	
	  public static boolean validarTelefono(String entrada) {
	        // Expresión regular para verificar el formato del número de teléfono
	        String regex = "\\+52-(\\d{2}-\\d{4}-\\d{4}|\\d{3}-\\d{3}-\\d{4})";

	        // Verificar si el número de teléfono coincide con el formato
	        if (entrada.matches(regex)) {
	            return true;
	        } else {
	            return false;
	        }
	    }
	
	//Termina Bloque de Telefono
	  
	//Bloque de Sueldo Zuleyma 7
	  
	  public static float validarSueldo(String entrada) {	        
	        // Definir el patrón de la expresión regular
	        String patron = "\\d+(\\.\\d{0,2})?";
	        
	        // Crear el objeto Pattern y Matcher
	        Pattern pattern = Pattern.compile(patron);
	        Matcher matcher = pattern.matcher(entrada);
	        
	        // Verificar si la cadena coincide con el patrón
	        if (matcher.matches()) {
	            // Obtener el valor flotante redondeado a dos decimales
	            float valorFloat = Float.parseFloat(entrada);
	            float valorRedondeado = Math.round(valorFloat * 100.0f) / 100.0f;
	            
	            return valorRedondeado;
	        } else {
	            System.out.println("La cadena no es un número válido con decimal.");
	            return 0;
	        }
	    }
	}

