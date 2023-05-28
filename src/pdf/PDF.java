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
 
 public PDF(String titulo, String asunto, String autor, String creador) {
	this.titulo = titulo;
	this.asunto = asunto;
	this.autor=autor;
	this.creador = creador;
 }

 @Override
 public void imprimir(Empleado emp) {
	 try {
		 Document documento=new Document();
		 PdfWriter.getInstance(documento,new FileOutputStream("información.pdf"));
		 documento.open();
		 documento.addTitle(titulo);
         documento.addSubject(asunto);
         documento.addAuthor(autor);
         documento.addCreator(creador);
         documento.add(new Paragraph("Información de empleados"));
         documento.add(new Paragraph("Nombre: "+emp.getNombre()));
         documento.add(new Paragraph("Sueldo: "+emp.getSueldo()));
         documento.add(new Paragraph("Afiliación: "+emp.getAfiliacion()));
         documento.add(new Paragraph("Años de servicio: "+emp.getAniosServicio()));
         documento.close();
	 }
	 catch(Exception err) {
		 System.out.println("Error de generación de archivo: "+err.getMessage());
	 }
	
 }
 
 
 
}
