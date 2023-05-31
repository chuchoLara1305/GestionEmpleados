package Nomina;
import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		
		//Lista Temporal
		ArrayList<String> listaTemp = new ArrayList<>();
		listaTemp.add("Nombre");
		listaTemp.add("Sueldo");
		
		//Lista de Archivo
		ArrayList<String> listaArchivo = new ArrayList<>();
		listaArchivo.add("Nombre");
		listaArchivo.add("Sueldo");
		
		//Lista de Base de Datos
		ArrayList<String> listaBaseDatos = new ArrayList<>();
		listaBaseDatos.add("Nombre");
		listaBaseDatos.add("Sueldo");
		
		System.out.println(listaTemp);
		System.out.println("-------|------");
		System.out.println(listaArchivo);
		System.out.println("-------|------");
		System.out.println(listaBaseDatos);
		System.out.println("-------|------");
		System.out.println("Sumatoria:");
		
	}

}
