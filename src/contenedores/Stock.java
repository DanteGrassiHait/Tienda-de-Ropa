package contenedores;

import java.util.ArrayList;
import java.util.Iterator;

public class Stock <E>{
	
	private ArrayList<E> stock;
	
	public Stock(ArrayList<E> stock) {
		this.stock = new ArrayList<E>(stock);
	}

	public Stock() {
		this.stock = new ArrayList<E>();
	}
	
	public void agregar(E o) { //EEEEEEEEEEEEOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO Queen reference lol
		stock.add(o);
	}
	
	/*Busca un objeto en el arrayList.
	 * Si lo encuentra, retorna la posici�n en la que se encuentra, si no, retorna -1.
	 */
	public int buscarPosObjeto(E o) {
				//Obtengo dimensi�n del arrayList.
		int dim = stock.size(), i = 0;
		
		//Mientras que hayan objetos y el objeto de la actual posici�n sea distinto al objeto que busco...
		while( (i < dim) && (!stock.get(i).equals(o))) {
			i++;
		}
		
		//En caso que la iteraci�n haya terminado por haber encontrado el objeto, retorno la posici�n donde se encuentra.
		//De lo contrario, retorno -1.
		if(stock.get(i).equals(o)) {
			return i;
		}
		else {
			return -1;
		}
	}

}
