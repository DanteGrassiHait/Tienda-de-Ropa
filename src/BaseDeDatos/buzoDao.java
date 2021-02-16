package BaseDeDatos;

import colecciones.Inventario;
import java.sql.*;
import Interaces.MetodoBBDD;
import clases.Buzo;

public class buzoDao implements MetodoBBDD <Buzo>
{
	@Override
	public Inventario <Buzo> GetAll()
	{
    	String consulta = "CALL Buzo_GetAll";
    	Inventario <Buzo> inventario = new Inventario <Buzo> ();
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
	
	@Override
	public Inventario <Buzo> GetBy(String aBuscar, String tipo) // En "aBuscar" se le pasa el atributo de la ropa a buscar y en "tipo" el contenido de dicho atributo. Ej: "Marca", "Adidas"
	{
    	String consulta = "CALL Buzo_GetBy" + aBuscar + " (?)";
    	Inventario <Buzo> inventario = new Inventario <Buzo> ();
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
	
	public void Add(String marca, String modelo, String color, String talle, String genero, String paraEdad, String tipo, Boolean capucha, Boolean bolsillos) // En "aBuscar" se le pasa el atributo de la ropa a buscar y en "tipo" el contenido de dicho atributo. Ej: "Marca", "Adidas"
	{
    	String consulta = "CALL Buzo_Add (?, ?, ?, ?, ?, ?, ?, ?, ?)";
    	Connection conexion;
    	try
		{
    		conexion = DriverManager.getConnection("jdbc:mysql://localhost/tienda_de_ropa", "root", "");
    		PreparedStatement sentencia= conexion.prepareStatement(consulta);
    		sentencia.setString(1, marca);
    		sentencia.setString(2, modelo);
    		sentencia.setString(3, color);
    		sentencia.setString(4, talle);
    		sentencia.setString(5, genero);
    		sentencia.setString(6, paraEdad);
    		sentencia.setString(7, tipo);
    		sentencia.setBoolean(8, capucha);
    		sentencia.setBoolean(9, bolsillos);
    		sentencia.executeQuery();		
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
	}
}
