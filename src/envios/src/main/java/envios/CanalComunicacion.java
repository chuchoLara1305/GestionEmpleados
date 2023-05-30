package envios;

public class CanalComunicacion {
	protected String account_Sid;
	protected String auth_Token;
	protected String numero_Telefonico;
    
	public CanalComunicacion(String account_Sid, String auth_Token, String numero_Telefonico) {
		this.account_Sid = account_Sid;
		this.auth_Token = auth_Token;
		this.numero_Telefonico = numero_Telefonico;
	}
	public String getAccount_Sid() {
		return account_Sid;
	}
	public void setAccount_Sid(String account_Sid) {
		this.account_Sid = account_Sid;
	}
	public String getAuth_Token() {
		return auth_Token;
	}
	public void setAuth_Token(String auth_Token) {
		this.auth_Token = auth_Token;
	}
	public String getNumero_Telefonico() {
		return numero_Telefonico;
	}
	public void setNumero_Telefonico(String numero_Telefonico) {
		this.numero_Telefonico = numero_Telefonico;
	}
}




/*public static void main(String[] args) {
// Inicializar Twilio
Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
// Número de teléfono de origen (tu número de WhatsApp Business)
String fromPhoneNumber = "whatsapp:+14155238886";
// Obtener el número de teléfono de destino desde el teclado
@SuppressWarnings("resource")
Scanner scanner = new Scanner(System.in);
System.out.print("Ingrese el número de teléfono de destino (formato: +521): ");
String toPhoneNumber = scanner.nextLine();
System.out.println("Introduce el mensaje:");
String mensaje = scanner.nextLine();
// Mensaje a enviar
//String messageText = "glugluglu";   
// Enviar el mensaje
Message message = Message.creator(new PhoneNumber("whatsapp:" + toPhoneNumber), new PhoneNumber(fromPhoneNumber), mensaje).create();
// Imprimir el ID del mensaje
System.out.println("Mensaje enviado. ID del mensaje: "); //+ message.getSid());
}*/
