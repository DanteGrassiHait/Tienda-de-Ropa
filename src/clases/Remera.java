package clases;

public class Remera extends Ropa{

	private String tipo;
	private String tela;
	private String cuello; // Si el cuello es del tipo V o circular
	private Boolean estampado;
	
	
	public Remera() 
	{
		super();
		this.tipo = "";
		this.tela = "";
		this.cuello = "";
		this.estampado = false;
	}
	public Remera(String marca, String modelo, String color, String talle, String genero, String paraEdad, String tipo, String tela, String cuello, Boolean estampado) 
	{
		super(marca, modelo, color, talle, genero, paraEdad);
		this.tipo = tipo;
		this.tela = tela;
		this.cuello = cuello;
		this.estampado = estampado;		
	}
	public String getTipo()
	{
		return tipo;
	}
	public void setTipo(String tipo)
	{
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
	public String getCuello()
	{
		return cuello;
	}
	public void setCuello(String cuello)
	{
		this.cuello = cuello;
	}
	public Boolean getEstampado()
	{
		return estampado;
	}
	public void setEstampado(Boolean estampado)
	{
		this.estampado = estampado;
	}
	@Override
	public String toString()
	{
		return super.toString() + "Tipo: " + getTipo() + "\n" + "Tela: " + getTela() + "\n" + "Cuello: " + getCuello() + "\n" + "Estampado: " + getEstampado() + "\n";
	}
	
	
	
	
	
	
}
