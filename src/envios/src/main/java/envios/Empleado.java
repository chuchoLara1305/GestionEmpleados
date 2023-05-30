package envios;

public class Empleado {
	private String nombre;
	private int edad;
	private float sueldo;
	private String telefono;
	private String correo;
	private int añosDeSevicio;
	private String afiliacion;
	public Empleado(String nombre, int edad, float sueldo, String telefono, String correo, int añosDeSevicio, String afiliacion) {
		this.nombre = nombre;
		this.edad = edad;
		this.sueldo = sueldo;
		this.telefono = telefono;
		this.correo = correo;
		this.añosDeSevicio = añosDeSevicio;
		this.afiliacion = afiliacion;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public float getSueldo() {
		return sueldo;
	}
	public void setSueldo(float sueldo) {
		this.sueldo = sueldo;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public int getAñosDeSevicio() {
		return añosDeSevicio;
	}
	public void setAñosDeSevicio(int añosDeSevicio) {
		this.añosDeSevicio = añosDeSevicio;
	}
	public String getAfiliacion() {
		return afiliacion;
	}
	public void setAfiliacion(String afiliacion) {
		this.afiliacion = afiliacion;
	}
	
}
