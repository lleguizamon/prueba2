package com.utn.examen;

import java.util.Scanner;
import com.utn.examen.*;
public class Test {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Atencion a = new Atencion();
		Cajero c0 = new Cajero();
		Cajero c1 = new Cajero();
		Cajero c2 = new Cajero();
		String  atencion;
		
		
		for( int i = 0; i < 10; i++ ){
			System.out.println("atiende cajero 1");
			System.out.println("realice pedido");
			
			atencion = scanner.nextLine();
			
			a.recibePedido(atencion, c0);
		}
		 
		for( int i = 0; i < 5; i++ ){
			System.out.println("atiende cajero 2");			
			System.out.println("realice pedido ");
			
			atencion = scanner.nextLine();
			
			a.recibePedido(atencion, c1);
		}
		
		for( int i = 0; i < 15; i++ ){
			System.out.println("atiende cajero 3");
			System.out.println("realice pedido");
			
			atencion = scanner.nextLine();
			
			a.recibePedido(atencion, c2);
		}
		
		
		
	}

}
