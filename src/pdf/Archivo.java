package pdf;

import paquete.Empleado;
import java.io.*;

public class Archivo implements Impresion {
	private String nombreArchivo;

	 public Archivo(String nombreaArchivo) {
		this.nombreArchivo = nombreaArchivo;
	 }
	 public void imprimir(Empleado emp) {
		 try {
			 FileWriter archivo = new FileWriter(nombreArchivo);
	         BufferedWriter escritor = new BufferedWriter(archivo);
	         escritor.write("Información Empleado");
	         escritor.newLine();
	         escritor.write("Nombre: "+emp.getNombre());
	         escritor.newLine();
	         escritor.write("Sueldo: "+emp.getSueldo());
	         escritor.newLine();
	         escritor.write("Afiliación: "+emp.getAfiliacion());
	         escritor.newLine();
	         escritor.write("Años de servicio: "+emp.getAñosDeServicio());
	         escritor.newLine();
	         escritor.write("Teléfono: "+emp.getTelefono());
	         escritor.newLine();
	         escritor.write("Correo: "+emp.getCorreo());
	         escritor.newLine();
	         escritor.write("Edad: "+emp.getEdad());
	         escritor.close();
		 }
		 catch(Exception err) {
			 System.out.println("Error al generar el bloc de notas"+err.getMessage());
		 }
	 }
}
