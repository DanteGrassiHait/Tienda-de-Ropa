package ejecutable;

import java.io.InputStream;
import java.util.Scanner;


public class Menu {
	Scanner sn = new Scanner(System.in);
	int opcion, flag = 0;
	
	public void menuCliente() {

		
		while(flag == 0) {
			System.out.println("1- Registrarse\n2-Iniciar sesion\3- Salir.");
		}
	}
	
	public void menuAdmin() {
		
	}
}
