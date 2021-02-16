package colecciones;

import java.util.ArrayList;


public class Inventario <E>
{
	private ArrayList<E> inventario;
	
	public Inventario()
	{
		this.inventario = new ArrayList<E>();
	}

	public ArrayList<E> getInventario()
	{
		return inventario;
	}

	public void setInventario(ArrayList<E> inventario)
	{
		this.inventario = inventario;
	}
	
	public void add(E ropa)
	{
		this.inventario.add(ropa);
	}
	
	public boolean isEmpty()
	{
		if(this.inventario.size() == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean eliminar(E ropa)
	{
		if(!isEmpty())
		{
			if(this.inventario.contains(ropa))
			{
				return this.inventario.remove(ropa);
			}
		}
		return false;
	}
	
	public String listar()
	{
		StringBuilder sb = new StringBuilder();
		for(E aux : this.inventario)
		{
			sb.append(aux);
		}
		String retorno = sb.toString();
		return retorno;
	}
}
