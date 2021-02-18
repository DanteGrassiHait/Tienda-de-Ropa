package clases;

public class Media extends Ropa
{
	private String tipo;
	private String tela;
	
	public Media()
	{
		super();
		this.tela = "";
		this.tipo = "";
	}
	public Media(String marca, String modelo, String color, String talle, String genero, String paraEdad, String tela, String tipo)
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
