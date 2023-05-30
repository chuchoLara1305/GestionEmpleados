package presentacion;

public class OpcionMenu {
    private short idOpcion;
    private String texto;
    private String color;
    
    public OpcionMenu(short idOpcion, String texto, String color){
	    this.idOpcion = idOpcion;
	    this.texto = texto;
        this.color = color;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public short getIdOpcion() {
        return idOpcion;
    }
    
    public void setIdOpcion(short idOpcion) {
        this.idOpcion = idOpcion;
    }
}
