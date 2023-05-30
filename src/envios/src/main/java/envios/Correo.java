package envios;

import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

public class Correo implements Envios{//CLASE "Correo" CON UNA IMPLEMENTACION DE LA INTERFAZ "Envios"
	//ATRIBUTOS DE LA CLASE CORREO
	private String usuarioCorreo;
	private String nombreArchivo;
	private String contrasena;
	private String rutaArchivo;
	private String adjunto;
	//CONSTRUCTOR CON PARAMETROS
	public Correo(String usuarioCorreo, String nombreArchivo, String contrasena, String rutaArchivo, String adjunto) {
		this.usuarioCorreo = usuarioCorreo;
		this.nombreArchivo = nombreArchivo;
		this.contrasena = contrasena;
		this.rutaArchivo = rutaArchivo;
		this.adjunto = adjunto;
	}
	//GETTER Y SETTER
	public String getUsuarioCorreo() {
		return usuarioCorreo;
	}
	public void setUsuarioCorreo(String usuarioCorreo) {
		this.usuarioCorreo = usuarioCorreo;
	}
	public String getNombreArchivo() {
		return nombreArchivo;
	}
	public void setNombreArchivo(String nombreArchivo) {
		this.nombreArchivo = nombreArchivo;
	}
	public String getContrasena() {
		return contrasena;
	}
	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
	public String getRutaArchivo() {
		return rutaArchivo;
	}
	public void setRutaArchivo(String rutaArchivo) {
		this.rutaArchivo = rutaArchivo;
	}
	public String getAdjunto() {
		return adjunto;
	}
	public void setAdjunto(String adjunto) {
		this.adjunto = adjunto;
	}
	/*
	 * METODO DE LA INTERFAZ "Envios" CON EL CUAL SE REALIZA LA ACCION DE ENVIAR EL CORREO 
	 * UNA VEZ LLENADO LOS RESPECTIVOS ATRIBUTOS DE LAS INSTANCIAS DE LAS CLASES "Correo",
	 * "Empleado"
	 */
	public String enviar(Empleado sary) {
		try {
			Properties p = new Properties();//Instanciamos un objeto tipo Properties
			p.put("mail.smtp.host", "smtp.gmail.com");//Protocolo a elegir por el servidor, es decir, gmail
			p.setProperty("mail.smtp.starttls.enable", "true");//starttls = extension de protocolo de comunicacion de textos planos a una conexion cifrada
			p.setProperty("mail.smtp.port", "587");//Esfecificar el valor del puerto
			p.setProperty("mail.smtp.user", sary.getCorreo());//Correo de la empresa
			p.setProperty("mail.smtp.auth", "true");//Aqui se obtiene la contraseña
			
			Session s = Session.getDefaultInstance(p, null);
			BodyPart texto = new MimeBodyPart();//Instanciamos de BodyPart
			texto.setText("Nombre: " + sary.getNombre() + "\nEdad: " + sary.getEdad() + "\nSueldo: " + sary.getSueldo()
						+ "\nTelefono: " + sary.getTelefono() + "\nCorreo: " + sary.getCorreo()
						+ "\nAños de servicio: " + sary.getAñosDeSevicio() + "\nAfiliacion: " + sary.getAfiliacion());
			BodyPart adjunto = new MimeBodyPart();
			if(!getRutaArchivo().equals("")) {
				adjunto.setDataHandler(new DataHandler(new FileDataSource(getRutaArchivo())));
				adjunto.setFileName(getNombreArchivo());
			}
			MimeMultipart m = new MimeMultipart();
			m.addBodyPart(texto);
			if(!getRutaArchivo().equals("")) {
				m.addBodyPart(adjunto);
			}
			MimeMessage mensaje = new MimeMessage(s);
			mensaje.setFrom(new InternetAddress(getUsuarioCorreo()));
			mensaje.addRecipient(Message.RecipientType.TO, new InternetAddress(sary.getCorreo()));
			mensaje.setSubject(this.getAdjunto());
			mensaje.setContent(m);
			
			Transport t = s.getTransport("smtp");
			t.connect(usuarioCorreo, contrasena);
			t.sendMessage(mensaje, mensaje.getAllRecipients());
			t.close();
			return "Mensaje enviado";
		}catch (Exception e) {
			return "Error" + e;
		}
	}

}
