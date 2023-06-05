package graficacion;
import Almacenamiento.*;
import java.util.ArrayList;
import java.sql.*;

public class Database {
	
	public ArrayList<Empleado> ObtenerFuenteDatosMySQL(){
		
		ArrayList<Empleado> empleados = new ArrayList<Empleado>();
		try {
		 			
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sys?useSSL=false","root","root"); 
			
	  
			Statement stmt=con.createStatement();  
			ResultSet rs=stmt.executeQuery("select * from tabla");  
			while(rs.next())  {
				Empleado empleado = new Empleado(rs.getString("Nombre"), rs.getInt("Edad"), rs.getFloat("Sueldo")); 	
				//System.out.println(rs.getInt(1)+"  "+rs.getString("Name")+"  "+rs.getInt(4)+"  "+rs.getBigDecimal(5));
				empleados.add(empleado);
			}
			con.close();  
					
			return empleados;

		}catch(Exception e){
			
			System.out.println(e);
			return empleados;
		}
		
	}
}
