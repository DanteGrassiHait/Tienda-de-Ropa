package cliente;

import java.util.concurrent.atomic.AtomicInteger;

public class Persona {
	private String nombreCompleto;
	private int secretID;
	
	//Objeto entero atómico (ver método public int getNextCountValue() )
	private static AtomicInteger at = new AtomicInteger();
	
	//Por cada persona, se genera un id secreto para que nosotros las administremos.
	public Persona(String nombreCompleto, int secretID) {
		this.nombreCompleto = nombreCompleto;
		this.secretID = getNextCountValue();
	}
	
	public Persona() {
		this.nombreCompleto = "";
	}

	//Método en donde se auto incrementa una variable entera.
	public int getNextCountValue() {
		return at.incrementAndGet();
	}
	
	//Getters & Setters
	public String getNombreCompleto() {
		return nombreCompleto;
	}
	
	public int getSecretID() {
		return secretID;
	}
	
	public void setSecretID(int secretID){
		this.secretID = secretID;
	}

	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}
	
	@Override
	public String toString() {
		return "Nombre completo: " + getNombreCompleto();
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	
}
