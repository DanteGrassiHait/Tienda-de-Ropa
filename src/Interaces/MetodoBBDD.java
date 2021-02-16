package Interaces;

import colecciones.Inventario;

public interface MetodoBBDD <E>
{
	public Inventario <E> GetAll();
	public Inventario <E> GetBy(String aBuscar, String tipo);
}
