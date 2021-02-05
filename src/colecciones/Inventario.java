package colecciones;

import java.util.ArrayList;

import clases.Ropa;

public class Inventario 
{
	private ArrayList<Ropa> inventario;
	
	public Inventario()
	{
		this.inventario = new ArrayList<Ropa>();
	}

	public ArrayList<Ropa> getInventario()
	{
		return inventario;
	}

	public void setInventario(ArrayList<Ropa> inventario)
	{
		this.inventario = inventario;
	}
	
	public void add(Ropa ropa)
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
	
	public boolean eliminar(Ropa ropa)
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
		for(Ropa aux : this.inventario)
		{
			sb.append(aux);
		}
		String retorno = sb.toString();
		return retorno;
	}
}
