package envios;
import static java.lang.System.*;
import java.util.Scanner;

public class Mensajeria {
	@SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args) {
		Empleado xala = new Empleado("Roberto", 19, 164456.99f, "+5212292677486", "migua.garcia.rg21@gmail.com", 4, "ABC512DEF");
		/*
		 * zauron05@gmail.com
		 * alejandroparra442@gmail.com
		 * */
		Scanner tecla = new Scanner(System.in);
		int a;
		out.println("MENU DE OPCIONES DE ENVIO");
		out.println("(1) Correo gmail");
		out.println("(2) WhatsApp");
		out.println("(3) Sms");
		out.println("(4) Salir");
		out.println("Ingrese la opcion deseada para enviar la informacion del empleado: ");
		a = tecla.nextInt();
		switch(a) {
		case 1: 
			//CORREO GMAIL
			Correo c = new Correo("garcia.rg21@gmail.com", "guitar.jpg", "wfsumdrvhemqawjy", "C:\\Users\\Tikroo\\Documents\\Envios\\guitar.jpg", "Datos del empleado: " + xala.getNombre());
			System.out.println(c.enviar(xala));
			break;
		case 2:
			//WHATSAPP
			WhatsApp w = new WhatsApp("AC6176ececdb19871dc434bc41f8cf5726", "24ba4192d57a47a63a4c171dc8cb76f3", "+14155238886");
			System.out.println(w.enviar(xala));
			break;
		case 3:
			//SMS
	        Sms s = new Sms("AC6176ececdb19871dc434bc41f8cf5726", "24ba4192d57a47a63a4c171dc8cb76f3", "+12542766057");
	        System.out.println(s.enviar(xala));
		case 4: break;
		default:
			out.println("Error, no existe esa opcion\nSaliendo...");
		}
	}
}






        /*String messageBody = "Adjunto encontrarás un archivo PDF. Puedes descargarlo desde aquí: " +"https://www.dropbox.com/s/hqza2cmo2kexmkd/Sesion%209.Garc%C3%ADaHernandez_RobertoJoaquin.pdf?dl=0";

        Message message = Message.creator(
                new PhoneNumber(destinationNumber),
                new PhoneNumber(twilioNumber),
                messageBody)
                .create();

        System.out.println("Mensaje enviado. SID del mensaje: " + message.getSid());*/























/*
// Ruta al archivo PDF que deseas enviar
String pdfFilePath = "RUTA_ARCHIVO_PDF";
// Lee el contenido del archivo PDF
byte[] pdfData;
try {
    pdfData = Files.readAllBytes(new File(pdfFilePath).toPath());
} catch (IOException e) {
    System.out.println("Error al leer el archivo PDF: " + e.getMessage());
    return;
}
// Codifica el archivo PDF en Base64
String pdfBase64 = Base64.getEncoder().encodeToString(pdfData);
// Crea el mensaje de WhatsApp con el archivo PDF adjunto
MessageCreator messageCreator = Message.creator(
        new PhoneNumber(toNumber),
        new PhoneNumber(twilioNumber))
        .setMediaUrl(TypeConversions.create("data:application/pdf;base64," + pdfBase64));
try {
    // Envía el mensaje de WhatsApp con el archivo PDF adjunto
    Message message = messageCreator.create();
    // Muestra el SID del mensaje creado
    System.out.println("Mensaje enviado. SID del mensaje: " + message.getSid());
} catch (TwilioRestException e) {
    System.out.println("Error al enviar el mensaje de WhatsApp: " + e.getMessage());
}
*/
