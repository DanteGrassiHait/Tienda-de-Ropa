package ejecutable;

import BaseDeDatos.Conexion;
import BaseDeDatos.buzoDao;
import clases.Buzo;
import colecciones.Inventario;

public class main {

	public static void main(String[] args) 
	{
		//Conexion a la base de datos
		Conexion con = new Conexion();
		con.conectado();
		//Creacion de objetos necesarios
		buzoDao bDao = new buzoDao();
		Inventario <Buzo> inventario = new Inventario <Buzo> ();
		
		//	Traer absolutamente todos los Buzos que haya en la Base de Datos
		inventario = bDao.GetAll();
		//System.out.println(inventario.listar());
		
		//	Traer todos los Buzos talle L que haya en la Base de Datos
		inventario = bDao.GetBy("talle", "L");
		//System.out.println(inventario.listar());
		
		//	Cargar un Buzo a la base de datos (Hay que corregir un problema con los id)
		bDao.Add("DC", "Shoes", "Verde", "M", "Masculino", "Niños", "Canguro", true, false);
		

	}

}
