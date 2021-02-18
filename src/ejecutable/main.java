package ejecutable;

import java.sql.SQLException;

import BaseDeDatos.Conexion;
import BaseDeDatos.buzoDao;
import clases.Buzo;
import colecciones.Inventario;

public class main {

	public static void main(String[] args) 
	{
		
		//Conexion a la base de datos
		Conexion con;
		try 
		{
			con = new Conexion();
			con.conectado();
		} 
		catch (ClassNotFoundException | SQLException e) 
		{
			e.printStackTrace();
		}
		
		//Creacion de objetos necesarios
		buzoDao bDao = new buzoDao();
		Inventario <Buzo> inventario = new Inventario<>();
		
		inventario = bDao.GetAll();
		System.out.println(inventario.listar());
		
		inventario = bDao.GetBy("talle", "L");
		System.out.println(inventario.listar());
		
		//bDao.Add("Rebook", "Fire", "Negro", "XS", "Femenino", "Adulto", "Con Cierre", false, true);
		//con.desconectar();
		
		//Menu menu = new Menu();
		//menu.menuAdmin();
		
	}

}
