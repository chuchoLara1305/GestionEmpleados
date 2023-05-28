package paquete;

public class Empleado {
	private String nombre;
	private float sueldo;
	private String afiliacion;
	private int aniosServicio;
	
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
	public int getAniosServicio() {
		return aniosServicio;
	}
	public void setAniosServicio(int aniosServicio) {
		this.aniosServicio = aniosServicio;
	}
	
	@Override
	public String toString() {
		return "Nombre: "+nombre+"\n"+"Sueldo: "+sueldo+"\n"+"Afiliación: "+afiliacion+"\n"+"Años de servicio: "+aniosServicio;
	}
	
}
