package BaseDeDatos;

import java.sql.*;


public class Conexion 
{
	private final String url = "jdbc:mysql://localhost/tienda_de_ropa";
    PreparedStatement psPrepararSentencia;                    //Declaramos un objeto de tipo PreparedStatement el cual nos ayudara a preparar los querys que queramos hacer a la BD
    Connection con = null;                                     //El objeto de tipo Connection como esta vacio, lo mandamos a null. Si logramos al conexion cambiara su estado
    
    public Conexion() 
    {
        try
        { 
            Class.forName("com.mysql.jdbc.Driver");     //Con el metodo de la clase forName, le pasamos el driver de MySQL para que lo cargue    
            con = DriverManager.getConnection(url,"root","");    //Apuntamos nuestro objeto con a el intento de conectarse con los parametros o las credenciales que tenemos en MYSQL
         }
            catch(SQLException e)        //Agarramos excepciones de tipo SQL
            {
            System.out.println(e);          //las mostramos en consola
            }
            catch(ClassNotFoundException e)       //agarramos excepciones de tipo clase en java
            {
             System.out.println(e);               //las mostramos en consola
            }
       }
    
    public Connection conectado(){  //Este metodo de tipo Connection nos devuelve el estado del objeto
        return con;
  }

    public void desconectar(){     //Por seguridad, cuando terminemos sentencias, cerramos la conexion o si la necesitamos cerrar por otro caso
        con = null;                  //Ahora de nuevo con sera null
    } 
    
    
}
