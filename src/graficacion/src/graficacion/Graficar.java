package graficacion;
import Almacenamiento.*;
import java.util.ArrayList;

public class Graficar extends Graficacion {
	
	public void graficarEdad(ArrayList<Empleado> empleados) {
		
		ArrayList<Grupo> grupoEdades = agruparEdades(empleados);
		
		setTitulo("Gr\u00e1fica de edades");
		setTituloGrupo("Rango de edades");
		setNombreArchivo("Grafica_Edades");
		
		graficar(grupoEdades);
	}
	public void graficarSueldo(ArrayList<Empleado> empleados) {
		
		ArrayList<Grupo> grupoSueldos = agruparSueldos(empleados);
		
		setTitulo("Gr\u00e1fica de sueldos");
		setTituloGrupo("Rango de sueldos");
		setNombreArchivo("Grafica_Sueldos");
			
		graficar(grupoSueldos);
	}
	
	public void graficarTodo(ArrayList<Empleado> empleados) {
		
		ArrayList<Grupo> grupoEdades = agruparEdades(empleados);
		ArrayList<Grupo> grupoSueldos = agruparSueldos(empleados);
		
		setNombreArchivo("Grafica_Sueldos_Edades");
		graficar(grupoEdades, grupoSueldos);
	}
	
	private ArrayList<Grupo> agruparEdades(ArrayList<Empleado> empleados) {
		
		int gruposEdades[]; 
		gruposEdades = new int[8]; 
		
		for(Empleado employees: empleados) {
			if(employees.getEdad()>=20 && employees.getEdad()<=25) {
				gruposEdades[0]++;
			}
			else if(employees.getEdad()>=26 && employees.getEdad()<=30) {
				gruposEdades[1]++;
			}
			else if(employees.getEdad()>=31 && employees.getEdad()<=35) {
				gruposEdades[2]++;
			}
			else if(employees.getEdad()>=36 && employees.getEdad()<=40) {
				gruposEdades[3]++;
			}
			else if(employees.getEdad()>=41 && employees.getEdad()<=45) {
				gruposEdades[4]++;
			}
			else if(employees.getEdad()>=46 && employees.getEdad()<=50) {
				gruposEdades[5]++;
			}
			else if(employees.getEdad()>=51 && employees.getEdad()<=55) {
				gruposEdades[6]++;
			}
			else if(employees.getEdad()>=56 && employees.getEdad()<=60) {
				gruposEdades[7]++;
			}
		}
		
		//Creacion de instancias de la clase tipo "Grupo". En este caso es el de las edades
		Grupo grupoEdad1 = new Grupo("20-25", gruposEdades[0]);
		Grupo grupoEdad2 = new Grupo("26-30", gruposEdades[1]);
		Grupo grupoEdad3 = new Grupo("31-35", gruposEdades[2]);
		Grupo grupoEdad4 = new Grupo("36-40", gruposEdades[3]);
		Grupo grupoEdad5 = new Grupo("41-45", gruposEdades[4]);
		Grupo grupoEdad6 = new Grupo("46-50", gruposEdades[5]);
		Grupo grupoEdad7 = new Grupo("51-55", gruposEdades[6]);
		Grupo grupoEdad8 = new Grupo("56-60", gruposEdades[7]);
		
		//Creacion de la lista de los grupos de los rangos de las edades
		ArrayList<Grupo> gruposEdad = new ArrayList<Grupo>();
		gruposEdad.add(grupoEdad1);
		gruposEdad.add(grupoEdad2);
		gruposEdad.add(grupoEdad3);
		gruposEdad.add(grupoEdad4);
		gruposEdad.add(grupoEdad5);
		gruposEdad.add(grupoEdad6);
		gruposEdad.add(grupoEdad7);
		gruposEdad.add(grupoEdad8);
		
		return gruposEdad;
	}
	
	private ArrayList<Grupo>agruparSueldos(ArrayList<Empleado> empleados) {
		int gruposSueldos[]; 
		gruposSueldos = new int[6]; 
		for(Empleado employees:empleados) {
			if(employees.getSueldo()>=0 && employees.getSueldo()<=50000) {
				gruposSueldos[0]++;
			}
			else if(employees.getSueldo()>50000 && employees.getSueldo()<=100000) {
				gruposSueldos[1]++;
			}
			else if(employees.getSueldo()>100000 && employees.getSueldo()<=200000) {
				gruposSueldos[2]++;
			}
			else if(employees.getSueldo()>200000 && employees.getSueldo()<=300000) {
				gruposSueldos[3]++;
			}
			else if(employees.getSueldo()>300000 && employees.getSueldo()<=400000) {
				gruposSueldos[4]++;
			}
			else if(employees.getSueldo()>400000 && employees.getSueldo()<=500000) {
				gruposSueldos[5]++;
			}
		}
		
		//Creacion de instancias de la clase tipo "Grupo". En este caso es el de los sueldos
		Grupo grupoSueldo1 = new Grupo("$0-$50,000", gruposSueldos[0]);
		Grupo grupoSueldo2 = new Grupo("$50,001-100,000", gruposSueldos[1]);
		Grupo grupoSueldo3 = new Grupo("$100,001-$200,000", gruposSueldos[2]);
		Grupo grupoSueldo4 = new Grupo("$200,001-$300,000", gruposSueldos[3]);
		Grupo grupoSueldo5 = new Grupo("$300,001-$400,000", gruposSueldos[4]);
		Grupo grupoSueldo6 = new Grupo("$400,001-$500,000", gruposSueldos[5]);
		
		//Creacion de la lista de los grupos de los rangos de los sueldos de los  empleados
		ArrayList<Grupo> grupoSueldos = new ArrayList<Grupo>();
		grupoSueldos.add(grupoSueldo1);
		grupoSueldos.add(grupoSueldo2);
		grupoSueldos.add(grupoSueldo3);
		grupoSueldos.add(grupoSueldo4);
		grupoSueldos.add(grupoSueldo5);
		grupoSueldos.add(grupoSueldo6);
		
		return grupoSueldos;
		
	}
}
