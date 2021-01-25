package clases;

public class Buzo extends Ropa {

	private String tipo;
	private Boolean capucha;
	private Boolean bolsillos;
	
	public Buzo() {
		super();
		this.tipo = "";
		this.capucha = false;
		this.bolsillos = false;
	}
	
	public Buzo(String marca, String modelo, String color, String talle, String genero, String paraEdad, String tipo, Boolean capucha, Boolean bolsillos) {
		super(marca, modelo, color, talle, genero, paraEdad);
		this.tipo = tipo;
		this.capucha = capucha;
		this.bolsillos = bolsillos;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Boolean getCapucha() {
		return capucha;
	}

	public void setCapucha(Boolean capucha) {
		this.capucha = capucha;
	}

	public Boolean getBolsillos() {
		return bolsillos;
	}

	public void setBolsillos(Boolean bolsillos) {
		this.bolsillos = bolsillos;
	}

	@Override
	public String toString() {
		return "Tipo: " + getTipo() + "Capucha: " + getCapucha() + "Bolsillos: " + getBolsillos();
	}
	
	
	
}
