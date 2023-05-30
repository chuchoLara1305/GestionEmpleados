package pdf;

import paquete.Empleado;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Impresora imp;
		Empleado emp=new Empleado();
		Scanner sc= new Scanner(System.in);
		/*
		emp.setNombre("Darío Méndez");
		emp.setSueldo(120000.00f);
		emp.setAfiliacion("AIo1987pqw");
		emp.setAniosServicio(15);
		*/
		System.out.println("Ingrese nombre del empleado: ");
		String nombre=sc.nextLine();
		System.out.println("Seleccione una opción para imprimir los datos: ");
		System.out.println("a) PDF");
		System.out.println("b) Bloc de notas");
		System.out.println("c) En pantalla");
		char op=sc.next().toUpperCase().charAt(0);
		switch(op) {
			case 'A':
				imp=new Impresora(new PDF(
						"Información Empleado", 
						"Usando iText", 
						"autor 1",
						"creador 1"));
				imp.ejecutarImpresion(emp);
			break;
			
			case 'B':
				imp=new Impresora(new Archivo("información.txt"));
				imp.ejecutarImpresion(emp);
			break;
			
			case 'C':
				imp=new Impresora(new Pantalla());
				imp.ejecutarImpresion(emp);
			break;
			
			default:
				System.out.println("Opción incorrecta");
		}
	}

}
