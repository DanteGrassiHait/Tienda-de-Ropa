package BaseDeDatos;

import java.sql.*;
import java.util.Properties;

public class Conexion 
{
	private static final String URL = "jdbc:mysql://localhost/tienda_de_ropa";
	private static final String DRIVER_CLASS_NAME = "com.mysql.jdbc.Driver";
	private Connection con = null;
	PreparedStatement psPrepararSentencia; // Declaramos un objeto de tipo PreparedStatement el cual nos ayudara a
											// preparar los querys que queramos hacer a la BD
	// El objeto de tipo Connection como esta vacio, lo mandamos a null. Si logramos
	// al conexion cambiara su estado

	public Conexion() throws SQLException, ClassNotFoundException 
	{
		Class.forName(DRIVER_CLASS_NAME); // Con el metodo de la clase forName, le pasamos el driver de MySQL para que lo cargue
		Properties props = new Properties();
		props.setProperty("user", "root");
		props.setProperty("password", "");
		con = DriverManager.getConnection(URL, props); // Apuntamos nuestro objeto con a el intento de conectarse con
														// los parametros o las credenciales que tenemos en MYSQL
	}

	public Connection conectado() // Este metodo de tipo Connection nos devuelve el estado del objeto
	{ 
		return con;
	}

	public void desconectar() // Por seguridad, cuando terminemos sentencias, cerramos la conexion o si la necesitamos cerrar por otro caso
	{ 
		con = null; // Ahora de nuevo con sera null
	}

}
