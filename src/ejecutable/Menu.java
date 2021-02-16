package ejecutable;

import contenedores.Stock;
import java.io.InputStream;
import java.util.Scanner;
import java.util.ArrayList;
import clases.Bermuda;
import clases.Ropa;


public class Menu {
	Stock <Ropa> stock = new Stock <Ropa>();
	Scanner sn = new Scanner(System.in);
	int opcion, flag = 0;
	String carga; //variable de almacenamiento temporal.
	
	public void menuCliente() {
		
		while(flag == 0) {
			System.out.println("1- Registrarse\n2-Iniciar sesion\3- Salir.");
		}
		
	}
	//Menu admin 1
	public void menuAdmin() {
		
		while(flag == 0) {
			System.out.println("1- Agregar producto.\n2- Eliminar producto.\n3- Ver stock.\n0- Salir.");
			opcion = sn.nextInt();
			switch(opcion) {
			case 1:
				menuCargaRopaAdmin();
				break;
			case 2:
				break;
			
			case 3:
				stock.listar();
				break;
				
			case 0:
				flag++;
				break;
				
			default:
				System.out.println("Ingresa una opcion correcta.\n");
				break;
			}
		}
		
	}
	
	//Menu carga de ropa para admin
	public void menuCargaRopaAdmin() {
		while(flag == 0) {
			System.out.println("\t\tSELECCIONES EL PRODUCTO A CARGAR: \n");
			System.out.println("\n1- Bermuda\n2- Buzo\n3- Campera\n0-Salir");
			opcion = sn.nextInt();
			switch(opcion) {
				case 1:
					menuCargaBermuda();
					break;
				case 2:
					break;
				case 3:
					break;
				case 0:
					flag++;
					break;
				default:
					System.out.println("Por favor, ingrese una opción correcta. . .\n");
					break;
			}
		}
	}
	
	public void menuCargaBermuda() {
		
		Bermuda bermuda = new Bermuda();
		
		System.out.println("Ingrese marca de la bermuda: ");
		carga = sn.nextLine();
		bermuda.setMarca(carga);
		
		System.out.println("Ingrese modelo de la bermuda: ");
		carga = sn.nextLine();
		bermuda.setModelo(carga);
		
		System.out.println("Ingrese color de la bermuda: ");
		carga = sn.nextLine();
		bermuda.setColor(carga);
		
		System.out.println("Ingrese talle de la bermuda: ");
		carga = sn.nextLine();
		bermuda.setTalle(carga);
		
		System.out.println("Ingrese genero de la bermuda: ");
		carga = sn.nextLine();
		bermuda.setGenero(carga);
		
		System.out.println("Ingrese para qué edad es la bermuda: ");
		carga = sn.nextLine();
		bermuda.setParaEdad(carga);
		
		System.out.println("Ingrese tipo de la bermuda: ");
		carga = sn.nextLine();
		bermuda.setTipo(carga);
		
		System.out.println("Ingrese corte de la bermuda: ");
		carga = sn.nextLine();
		bermuda.setCorte(carga);
		
		stock.agregar(bermuda);
		
	}
	
	public void menuCargaBuzo() {
		
	}
	
	public void menuCargaCampera() {
		
	}
		
	
}
