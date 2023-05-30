package Almacenamiento;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class Almacenamiento_BaseDatos implements Almacenamiento_Base{
	public static final String CONTROLADOR = "com.mysql.jdbc.Driver";
	public static final String URL = "jdbc:mysql://localhost:3306/basedatos?autoReconnect=true&useSSL=false";
	public static final String USUARIO = "root";
	public static final String CLAVE = "muse2004";
	Connection conexion = null;
    PreparedStatement ps = null;
    ResultSet re = null;
	Statement st = null;
	
	static {
		try {
		  Class.forName(CONTROLADOR);
		} catch (ClassNotFoundException e) { 
		  System.out.println("Error al cargar el controlador");
		  e.printStackTrace();
	}
	}
	
	public Almacenamiento_BaseDatos() {
		
		try {
			conexion = DriverManager.getConnection(URL, USUARIO, CLAVE);
			System.out.println("Conexion correcta");
			
			
		}   catch (SQLException e){
			System.out.println("Error en la conexion");
			e.printStackTrace();
		}
	}
	
	public void guardarInformacion(Empleado a) throws SQLException {
		st = conexion.createStatement();
		re = st.executeQuery("Select* from tabla");
		int ID = 0;
		while(re.next()) {
			ID = re.getInt(1);
		}
		ps = conexion.prepareStatement("INSERT INTO tabla VALUES(?,?,?,?,?,?,?,?)");
		ps.setInt(1, ID+1);
		ps.setString(2, String.valueOf(a.getNombre()));
		ps.setString(3, String.valueOf(a.getSueldo()));
		ps.setString(4, a.getAfiliacion());
		ps.setString(5, String.valueOf(a.getAñosDeServicio()));
		ps.setString(6, a.getTelefono());
		ps.setString(7, a.getCorreo());
		ps.setString(8, String.valueOf(a.getEdad()));
		ps.executeUpdate();
	}

	public ArrayList<String> buscarUsuario(String nombre) throws SQLException {
		ArrayList<String> usuario = new ArrayList<String>();
		st = conexion.createStatement();
		re = st.executeQuery("Select* from tabla");
		while(re.next()) {
			if (re.getString(2).equals(nombre)) {
			usuario.add(re.getString(2));
			usuario.add(re.getString(3));
			usuario.add(re.getString(4));
			usuario.add(re.getString(5));
			usuario.add(re.getString(6));
			usuario.add(re.getString(7));
			usuario.add(re.getString(8));
			System.out.println("Usuario Encontrado");
			break;
			}
		}
		if(usuario.size()==0) {
			System.out.println("Usuario No Encontrado");
		}
		return usuario;
	}

	
	public ArrayList<ArrayList<String>> devolverAlmacenamiento() throws SQLException {
		ArrayList<ArrayList<String>> data  = new ArrayList<ArrayList<String>>();
		data.clear();
		st = conexion.createStatement();
		re = st.executeQuery("Select* from tabla");
		while(re.next()) {
			ArrayList<String> arreg = new ArrayList<String>();
			arreg.add(re.getString(2));
			arreg.add(re.getString(3));
			arreg.add(re.getString(4));
			arreg.add(re.getString(5));
			arreg.add(re.getString(6));
			arreg.add(re.getString(7));
			arreg.add(re.getString(8));
			data.add(arreg);
		
			
		}
		return data;
	}

	

	
		
	
}
