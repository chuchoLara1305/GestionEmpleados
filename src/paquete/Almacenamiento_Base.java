package Almacenamiento;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;

import org.xml.sax.SAXException;

public interface Almacenamiento_Base {
	public ArrayList<String> buscarUsuario(String nombre) throws SQLException, SAXException, IOException;
	public ArrayList<ArrayList<String>> devolverAlmacenamiento() throws SQLException;
	public void guardarInformacion(Empleado a) throws SQLException, TransformerException, ParserConfigurationException, SAXException, IOException;
	
}
