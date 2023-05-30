package graficacion;
import java.util.ArrayList;

public class Main{
	
	public static void main(String[] args) {
		//creacion de instancias de la clase tipo "Empleado"(prueba)
		Empleado empleado01 = new Empleado("Arturo", 33, 500000); 	
		Empleado empleado02 = new Empleado("Taylor", 22, 130131);
		Empleado empleado03 = new Empleado("Paola", 20, 5455);
		Empleado empleado04 = new Empleado("Daniel", 55, 45513);
		Empleado empleado05 = new Empleado("Harry", 28, 400000.13);
		Empleado empleado06 = new Empleado("George", 35, 120300.25);
		Empleado empleado07 = new Empleado("Charlotte", 39, 400001);
		
		//creacion de la lista de la clase tipo "Empleado"
		ArrayList<Empleado> empleados = new ArrayList<Empleado>();
		empleados.add(empleado01);
		empleados.add(empleado02);
		empleados.add(empleado03);
		empleados.add(empleado04);
		empleados.add(empleado05);
		empleados.add(empleado06);
		empleados.add(empleado07);

		Graficar miGrafica = new Graficar();
		miGrafica.graficarEdad(empleados);
		miGrafica.graficarSueldo(empleados);
		miGrafica.graficarTodo(empleados);
		
	}

}
