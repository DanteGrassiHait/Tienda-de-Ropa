package clases;

public class Bermuda extends Ropa{

	private String tipo;
	private String corte;
	
	public Bermuda() 
	{
		super();
		this.tipo = "";
		this.corte = "";
	}
	
	public Bermuda(String marca, String modelo, String color, String talle, String genero, String paraEdad, String tipo, String corte) 
	{
		super(marca, modelo, color, talle, genero, paraEdad);
		this.tipo = tipo;
		this.corte = corte;
	}

	public String getTipo() 
	{
		return tipo;
	}

	public void setTipo(String tipo) 
	{
		this.tipo = tipo;
	}

	public String getCorte() 
	{
		return corte;
	}

	public void setCorte(String corte) 
	{
		this.corte = corte;
	}

	@Override
	public String toString() 
	{
		return super.toString() + "Tipo: " + getTipo() + "\n" + "Corte: " + getCorte() + "\n";
	}
	
	
}
