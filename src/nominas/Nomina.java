package Nomina;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Nomina {
	
	private ArrayList<Empleado> empleados;
	
	public void crearNomina() {
		 try (BufferedWriter writer = new BufferedWriter(new FileWriter("tabla_empleados.txt"))) {
	            writer.write("N° | Nombre       | Sueldo  |");
	            writer.newLine();
	            writer.write("-----------------------------");
	            writer.newLine();

	            for (int i = 0; i < empleados.size(); i++) {
	                Empleado empleado = empleados.get(i);
	                String fila = String.format("%-2d | %-12s | %-7.2f | %-4d | %s",
	                        (i + 1), empleado.getNombre(), empleado.getSueldo());
	                writer.write(fila);
	                writer.newLine();
	            }

	            System.out.println("Tabla de empleados creada con éxito.");
	        } catch (IOException e) {
	            System.out.println("Ocurrió un error al crear la tabla de empleados: " + e.getMessage());
	        }	
	}
