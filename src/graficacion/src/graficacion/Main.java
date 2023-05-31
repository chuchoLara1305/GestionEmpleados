package graficacion;
import java.util.ArrayList;

public class Main{
	
	public static void main(String[] args) {
		
		Database db = new Database();
		
		ArrayList<Empleado> empleados = db.ObtenerFuenteDatosManual();
		Graficar miGrafica = new Graficar();
		miGrafica.graficarEdad(empleados);
		miGrafica.graficarSueldo(empleados);
		miGrafica.graficarTodo(empleados);
		
	}

}
