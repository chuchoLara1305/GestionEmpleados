package pdf;

import java.io.*;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chapter;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.draw.LineSeparator;
import paquete.Empleado;

public class PDF implements Impresion{
	private String titulo;
	 private String asunto;
	 private String autor;
	 private String creador;
	 private String nombreArchivo;
	 
	 public PDF(String titulo, String asunto, String autor, String creador,String nombreArchivo) {
		this.titulo = titulo;
		this.asunto = asunto;
		this.autor=autor;
		this.creador = creador;
		this.nombreArchivo=nombreArchivo;
	 }

	 @Override
	 public void imprimir(Empleado emp) {
		 try {
			 Document documento=new Document();
			 PdfWriter.getInstance(documento,new FileOutputStream(nombreArchivo));
			 documento.open();
			 documento.addTitle(titulo);
	         documento.addSubject(asunto);
	         documento.addAuthor(autor);
	         documento.addCreator(creador);
	         documento.add(new Paragraph("Información de empleados"));
	         documento.add(new Paragraph("Nombre: "+emp.getNombre()));
	         documento.add(new Paragraph("Sueldo: "+emp.getSueldo()));
	         documento.add(new Paragraph("Afiliación: "+emp.getAfiliacion()));
	         documento.add(new Paragraph("Años de servicio: "+emp.getAñosDeServicio()));
	         documento.add(new Paragraph("Teléfono: "+emp.getTelefono()));
	         documento.add(new Paragraph("Correo: "+emp.getCorreo()));
	         documento.add(new Paragraph("Edad: "+emp.getEdad()));
	         documento.close();
		 }
		 catch(Exception err) {
			 System.out.println("Error de generación de archivo: "+err.getMessage());
		 }
		
	 }
}
