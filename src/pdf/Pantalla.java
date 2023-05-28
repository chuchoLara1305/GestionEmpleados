package pdf;

import paquete.Empleado;

public class Pantalla implements Impresion {
	
  public void imprimir(Empleado emp) {
	  System.out.println(emp.toString());
  }
}
