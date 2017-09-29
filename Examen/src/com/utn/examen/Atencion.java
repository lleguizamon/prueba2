package com.utn.examen;
import com.utn.examen.*;
import java.util.Scanner;

public class Atencion {
	
	Scanner scanner = new Scanner(System.in);
	//Cajero cajero = new Cajero();
	public String pedido1;
	public String pedido2;
	public String pedido3;
	public String pedido4;
	public String adicional1;
	public String adicional2;
	public int numero;

	
	public void recibePedido( String pedido, Cajero cajero ){
		
		if( pedido.equalsIgnoreCase("cono") ){
			System.out.println("ingrese los sabores del cono (solo 2)");
			pedido1 = scanner.nextLine();
			pedido2 = scanner.nextLine();
			Pedido p = new Pedido( pedido1, pedido2 );
			
			cajero.asignar();
						
		}
		if( pedido.equalsIgnoreCase("cuarto") ){
			System.out.println("ingrese los sabores del cuarto (solo 3)");
			pedido1 = scanner.nextLine();
			pedido2 = scanner.nextLine();
			pedido3 = scanner.nextLine();
			Pedido p = new Pedido( pedido1, pedido2, pedido3 );
			System.out.println("desea adicional?");
			pedido3 = scanner.nextLine();
			if( pedido3.equalsIgnoreCase("si") ){
				//p.setAdicional(true);
				System.out.println("elija\n1.crema vainilla\n2.chocolate fundido(ingrese 1o2)");
				numero = scanner.nextInt();
				pedido3 = p.getSaborAdicional(numero);
				
				
			}
			cajero.asignar();
		}

		if( pedido.equalsIgnoreCase("kilo") ){
			System.out.println("ingrese los sabores del kilo (solo 4)");
			pedido1 = scanner.nextLine();
			pedido2 = scanner.nextLine();
			pedido3 = scanner.nextLine();
			pedido4 = scanner.nextLine();
			Pedido p = new Pedido( pedido1, pedido2, pedido3, pedido4 );
			System.out.println("desea adicional?");
			pedido3 = scanner.nextLine();
			if( pedido3.equalsIgnoreCase("si") ){
				//p.setAdicional(true);
				System.out.println("elija\n1.chocolate fundido\n2.almendras");
				System.out.println("3.crema vainilla");
				numero = scanner.nextInt();
				pedido3 = p.getSaborAdicional(numero);
				
				
			}
			cajero.asignar();
		}
		
		
	
	}

}
