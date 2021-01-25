package clases;

public class Campera extends Ropa{

	private String tipo;
	private Boolean impermeable;
	private Boolean capucha;
	
	public Campera() {
		super();
		this.tipo = "";
		this.impermeable = false;
		this.capucha = false;
	}
	
	public Campera(String marca, String modelo, String color, String talle, String genero, String paraEdad, String tipo, Boolean impermeable, Boolean capucha) {
		super(marca, modelo, color, talle, genero, paraEdad);
		this.tipo = tipo;
		this.impermeable = impermeable;
		this.capucha = capucha;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Boolean getImpermeable() {
		return impermeable;
	}

	public void setImpermeable(Boolean impermeable) {
		this.impermeable = impermeable;
	}

	public Boolean getCapucha() {
		return capucha;
	}

	public void setCapucha(Boolean capucha) {
		this.capucha = capucha;
	}

	@Override
	public String toString() {
		return "Tipo: " + getTipo() + "Impermeable: " + getImpermeable() + "Capucha: " + getCapucha();
		}
	
	
	
}
