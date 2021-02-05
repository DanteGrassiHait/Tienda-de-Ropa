package clases;

public class Ropa {

	private String marca;
	private String modelo;
	private String color;
	private String talle;
	private String genero;
	private String paraEdad;
	
	public Ropa() {
		this.marca = "";
		this.modelo = "";
		this.color = "";
		this.talle = "";
		this.genero = "";
		this.paraEdad = "";
	}
	
	public Ropa(String marca, String modelo, String color, String talle, String genero, String paraEdad) {
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.talle = talle;
		this.genero = genero;
		this.paraEdad = paraEdad;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getTalle() {
		return talle;
	}

	public void setTalle(String talle) {
		this.talle = talle;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getParaEdad() {
		return paraEdad;
	}

	public void setParaEdad(String paraEdad) {
		this.paraEdad = paraEdad;
	}

	@Override
	public String toString() {
		return "Marca: " + getMarca() + "\n" + "Modelo: " + getModelo() + "\n" + "Color: " + getColor() + "\n" + "Talle: " + getTalle() + "\n" + "Genero: " + getGenero() + "\n" + "ParaEdad: " + getParaEdad() + "\n";
	}
	
	
	
	
	
	
}
