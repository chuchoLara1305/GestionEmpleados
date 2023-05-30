package Almacenamiento;

import java.util.*;
public class Almacenamiento_Temporal implements Almacenamiento_Base{

	public ArrayList<ArrayList<String>> datosTemporales;

	public Almacenamiento_Temporal() {
		this.datosTemporales = new ArrayList<>();
	}
	
	public void guardarInformacion(Empleado a) {
		
		ArrayList<String> arreglo = new ArrayList<>();
		arreglo.add(a.getNombre());
		arreglo.add(String.valueOf(a.getSueldo()));
		arreglo.add(a.getAfiliacion());
		arreglo.add(String.valueOf(a.getAñosDeServicio()));
		arreglo.add(a.getTelefono());
		arreglo.add(a.getCorreo());
		arreglo.add(String.valueOf(a.getEdad()));
		datosTemporales.add(arreglo);
	}
	

	public ArrayList<String> buscarUsuario(String nombre) {
		ArrayList<String> arre = new ArrayList<String>();
		for(int i = 0; i < datosTemporales.size(); i++) {
			if((datosTemporales.get(i)).get(0) == nombre) {
				arre = datosTemporales.get(i);
				System.out.println("Usuario Encontrado");
				break;
			}
		}
		if(arre.size()==0) {
			System.out.println("Usuario No Encontrado");
		}
		return arre;
	}

	public ArrayList<ArrayList<String>> devolverAlmacenamiento() {
		return datosTemporales;
	}

	

}
