package BaseDeDatos;

import colecciones.Inventario;
import java.sql.*;
import clases.Buzo;

public class buzoDao 
{
	public Inventario GetAll()
	{
    	String consulta = "CALL Buzo_GetAll";
    	Inventario inventario = new Inventario();
    	Buzo buzo = null;
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
				inventario.add(buzo = new Buzo(rs.getString("marca"), rs.getString("modelo"), rs.getString("color"), rs.getString("talle"), rs.getString("genero"), rs.getString("paraEdad"), rs.getString("tipo"), rs.getBoolean("capucha"), rs.getBoolean("bolsillos")));
			}			
		} 
    	catch(SQLTimeoutException e)
    	{
    		e.printStackTrace();
    	}
    	catch(SQLException e)
    	{
    		e.printStackTrace();
    	}
    	catch (Exception e)
		{
    		e.printStackTrace();
		}
    	return inventario;
	}
	
	public Inventario GetBy(String aBuscar, String tipo) // En "aBuscar" se le pasa el atributo de la ropa a buscar y en "tipo" el contenido de dicho atributo. Ej: "Marca", "Adidas"
	{
    	String consulta = "CALL Buzo_GetBy" + aBuscar + " (?)";
    	Inventario inventario = new Inventario();
    	Buzo buzo = null;
    	Connection conexion;
    	ResultSet rs;
    	try
		{
    		conexion = DriverManager.getConnection("jdbc:mysql://localhost/tienda_de_ropa", "root", "");
    		PreparedStatement sentencia= conexion.prepareStatement(consulta);
    		sentencia.setString(1, tipo);
    		rs = sentencia.executeQuery();
			while(rs.next())
			{
				inventario.add(buzo = new Buzo(rs.getString("marca"), rs.getString("modelo"), rs.getString("color"), rs.getString("talle"), rs.getString("genero"), rs.getString("paraEdad"), rs.getString("tipo"), rs.getBoolean("capucha"), rs.getBoolean("bolsillos")));
			}			
		}
    	catch(SQLTimeoutException e)
    	{
    		e.printStackTrace();
    	}
    	catch(SQLException e)
    	{
    		e.printStackTrace();
    	}
    	catch (Exception e)
		{
    		e.printStackTrace();
		}
    	return inventario;
	}
}
