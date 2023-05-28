package pdf;

import paquete.Empleado;

public class Impresora {
  private Impresion impresion;

  public Impresora(Impresion impresion) {
	this.impresion = impresion;
  }
  
  public void ejecutarImpresion(Empleado emp) {
	  impresion.imprimir(emp);
  }
}
