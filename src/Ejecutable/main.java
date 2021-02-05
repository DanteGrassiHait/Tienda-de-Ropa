package Ejecutable;

import BaseDeDatos.Conexion;
import BaseDeDatos.ropaDao;
import colecciones.Inventario;

public class main {

	public static void main(String[] args) 
	{
		//Conexion a la base de datos
		Conexion con = new Conexion();
		con.conectado();
		//Creacion de objetos necesarios
		ropaDao dao = new ropaDao();
		Inventario inventario = new Inventario();
		
		inventario = dao.GetAll();
		System.out.println(inventario.listar());

	}

}
