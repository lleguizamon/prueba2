package com.utn.examen;
import com.utn.examen.*;
public class Cajero {
	
	Heladero heladero[] = new Heladero[4];
	
	public void asignar( ){
		if( heladero[0].isDisponible() == false ){
			heladero[0].setDisponible(true);
			heladero[0].setCantidad();
			
			heladero[2].setDisponible(false);
		}
		if( heladero[1].isDisponible() == false ){
			heladero[1].setDisponible(true);
			heladero[1].setCantidad();
			heladero[3].setDisponible(false);			
		}
		if( heladero[2].isDisponible() == false ){
			heladero[2].setDisponible(true);
			heladero[2].setCantidad();
			heladero[0].setDisponible(false);
		}
		if( heladero[3].isDisponible() == false ){
			heladero[3].setDisponible(true);
			heladero[3].setCantidad();
			
			heladero[1].setDisponible(false);
		}
		
	}
	

	
	
	
}
