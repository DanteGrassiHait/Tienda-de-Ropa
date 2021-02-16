package ejecutable;

import BaseDeDatos.Conexion;
import BaseDeDatos.buzoDao;

import colecciones.Inventario;

public class main {

	public static void main(String[] args) 
	{
		
		//Conexion a la base de datos
		//Conexion con = new Conexion();
		//con.conectado();
		//Creacion de objetos necesarios
		//buzoDao bDao = new buzoDao();
		//Inventario inventario = new Inventario();
		
		//inventario = bDao.GetAll();
		//System.out.println(inventario.listar());
		
		//inventario = bDao.GetBy("talle", "L");
		//System.out.println(inventario.listar());
		
		//con.desconectar();
		
		Menu menu = new Menu();
		menu.menuAdmin();
		
	}

}
