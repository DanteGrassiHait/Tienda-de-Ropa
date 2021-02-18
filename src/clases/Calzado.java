package clases;

public class Calzado extends Ropa
{
	private String tela;
	private String tipo; // Para correr y demas, 
	
	public Calzado()
	{
		super();
		this.tela = "";
		this.tipo = "";
	}
	public Calzado(String marca, String modelo, String color, String talle, String genero, String paraEdad, String tela, String tipo)
	{
		super(marca, modelo, color, talle, genero, paraEdad);
		this.tela = tela;
		this.tipo = tipo;
	}
	public String getTela()
	{
		return tela;
	}
	public void setTela(String tela)
	{
		this.tela = tela;
	}
	public String getTipo()
	{
		return tipo;
	}
	public void setTipo(String tipo)
	{
		this.tipo = tipo;
	}
	@Override
	public String toString()
	{
		return super.toString() + "Tela: " + getTela() + "\n" + "Tipo: " + getTipo() + "\n";
	}
	
	
	
	
	
	
}
