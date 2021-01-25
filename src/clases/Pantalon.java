package clases;

public class Pantalon extends Ropa{

	private String tipo;
	private Boolean impermeable;
	private String corte; // Ejemplo: clasico, chino, skinny

	public Pantalon() {
		super();
		this.tipo = "";
		this.impermeable = false;
		this.corte = "";
	}

	public Pantalon(String marca, String modelo, String color, String talle, String genero, String paraEdad, String tipo, Boolean impermeable, String corte) {
		super(marca, modelo, color, talle, genero, paraEdad);
		this.tipo = tipo;
		this.impermeable = impermeable;
		this.corte = corte;
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

	public String getCorte() {
		return corte;
	}

	public void setCorte(String corte) {
		this.corte = corte;
	}

	@Override
	public String toString() {
		return "Tipo: " + getTipo() + "Impermeable: " + getImpermeable() + "Corte: " + getCorte();
	}
	
	
	
	
	
}
