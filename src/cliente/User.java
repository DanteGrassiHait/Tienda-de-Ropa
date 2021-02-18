package cliente;

public class User extends Persona
{
	private String pin; //contraseña 4 digitos
	
	public User(String pin, String nombreCompleto, int secretID) 
	{
		super(nombreCompleto, secretID);
		this.pin = pin;
	}
	
	//Getters & Setters
	public String getPin() 
	{
		return pin;
	}

	public void setPin(String pin) 
	{
		this.pin = pin;
	}
	
	@Override
	public String toString() 
	{		
		return super.toString() + "\nContraseña PIN: " + getPin();
	}
}
