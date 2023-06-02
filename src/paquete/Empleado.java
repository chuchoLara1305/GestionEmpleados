package Almacenamiento;

public class Empleado {
	
	public String nombre = "Miguel Angel Reyes Gonzalez";
	public float sueldo = 150000.00f;
	public String afiliacion = "ABC1234ABC";
	public int añosDeServicio = 4;
	public String telefono = "+522292122412";
	public String correo = "thespot@gmail.com";
	public int edad = 47;
	public Empleado() {
		
	}
	public Empleado(String nombre, int edad, float sueldo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sueldo = sueldo;
    }
	
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
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
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public float getSueldo() {
		return sueldo;
	}
	public void setSueldo(float sueldo) {
		this.sueldo = sueldo;
	}
	public String getAfiliacion() {
		return afiliacion;
	}
	public void setAfiliacion(String afiliacion) {
		this.afiliacion = afiliacion;
	}
	public int getAñosDeServicio() {
		return añosDeServicio;
	}
	public void setAñosDeServicio(int añosDeServicio) {
		this.añosDeServicio = añosDeServicio;
	}
	@Override
	public String toString() {
		return 
		"Nombre: "+
		nombre+"\n"+"Sueldo: "+
		sueldo+"\n"+"Afiliación: "
		+afiliacion+"\n"+"Años de servicio: "+
		añosDeServicio+"\n"+"Teléfono: "+telefono+
		"\n"+"Correo: "+correo+"\n"+"Edad: "+edad;
	}
}
