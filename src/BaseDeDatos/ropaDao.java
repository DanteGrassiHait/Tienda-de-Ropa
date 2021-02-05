package BaseDeDatos;

import clases.Ropa;
import colecciones.Inventario;
import java.sql.*;

public class ropaDao 
{
	public Inventario GetAll()
    {
    	String consulta = "SELECT * FROM Ropa";
    	Inventario inventario = new Inventario();
    	Ropa ropa = null;
    	Connection conexion;
    	Statement st;
    	ResultSet rs;
    	try
		{
    		conexion = DriverManager.getConnection("jdbc:mysql://localhost/tienda_de_ropa", "root", "");
			st = conexion.createStatement();
			rs = st.executeQuery(consulta);
			while(rs.next())
			{
				inventario.add(ropa = new Ropa(rs.getString("marca"), rs.getString("modelo"), rs.getString("color"), rs.getString("talle"), rs.getString("genero"), rs.getString("paraEdad")));
			}
			
		} 
    	catch (Exception e)
		{
			// TODO: handle exception
		}
    	return inventario;
    }
}
