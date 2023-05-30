package presentacion;
import java.util.ArrayList;

public class Menu {
    private ArrayList<OpcionMenu> opciones = new ArrayList<OpcionMenu>();
    private String tituloMenu;
    private char disenoBorde;

    public Menu(String tituloMenu, char disenoBorde) {
        this.tituloMenu = tituloMenu;
        this.disenoBorde = disenoBorde;
    }

    public String getTituloMenu() {
        return tituloMenu;
    }

    public void setTituloMenu(String tituloMenu) {
        this.tituloMenu = tituloMenu;
    }

    public char getDisenoBorde() {
        return disenoBorde;
    }

    public void setDisenoBorde(char disenoBorde) {
        this.disenoBorde = disenoBorde;
    }

    public void agregarOpcion(short idOpcion, String texto, String color) {
        opciones.add(new OpcionMenu(idOpcion, texto, color));
    }

    public void modificarOpcion(short idOpcion) {}

    public void eliminarOpcion(short idOpcion) {
		  opciones.remove(buscarOpcion(idOpcion));
    }

    public OpcionMenu buscarOpcion(short idOpcion){
      for(OpcionMenu opcion : opciones){
        if(opcion.getIdOpcion()==idOpcion){
          return opcion;
        }
      }
      return null;
    }

    private String generarBorde(int longitud){
    	StringBuilder borde = new StringBuilder();
      for(int i=0; i<longitud; i++){
        borde.append(disenoBorde);
      }
      return borde.toString();
    }

    public void desplegar(){
      String bordeSuperior = generarBorde(10)+tituloMenu+generarBorde(10);
      System.out.println(bordeSuperior);

      for(OpcionMenu opcion : opciones){
        System.out.println(opcion.getColor());
        System.out.println(opcion.getIdOpcion()+") -> "+opcion.getTexto());
        System.out.println(Colores.defecto);
      }		

      String bordeInferior = generarBorde(bordeSuperior.length());
      System.out.println(bordeInferior);
    }
}
