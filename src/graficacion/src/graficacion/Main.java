package graficacion;
import java.util.ArrayList;

public class Main{
	
	public static void main(String[] args) {
		
				case 4:
				crearSubMenuGraficacion();
				graficarEmpleados();
				break;

	//menu de graficacion 
	public static void crearSubMenuGraficacion() {
		Menu menu = new Menu("Graficar datos de empleados", '*');
		menu.agregarOpcion((short)1, "Graficar edades", Colores.magenta);
		menu.agregarOpcion((short)2, "Graficar sueldos", Colores.amarillo);
		menu.agregarOpcion((short)3, "Graficar edades y sueldos", Colores.azul);
		menu.desplegar();
	}
	public static void graficarEmpleados() {
		Scanner read = new Scanner(System.in);
		System.out.println("Seleccione la opcion:");
		int opcion = read.nextInt();
		read.nextLine();
		Database db = new Database();
		ArrayList<Empleado> empleados = db.ObtenerFuenteDatosMySQL();
		Graficar miGrafica = new Graficar();
		switch(opcion) {
		case 1:
			miGrafica.graficarEdad(empleados);
			break;
		case 2:
			miGrafica.graficarSueldo(empleados);
			break;
		case 3:
			miGrafica.graficarTodo(empleados);
			break;
		}
	}	
	}

}
