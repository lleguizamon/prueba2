package com.utn.examen;

public class Pedido {
	
	private String sabor1;
	private String sabor2;
	private String sabor3;
	private String sabor4;
	private String adicional1;
	private boolean adicional;

	
	public  Pedido( String sabor1, String sabor2 ){//cono
		this.sabor1 = sabor1;
		this.sabor2 = sabor2;
		
	}
	public  Pedido( String sabor1, String sabor2, String sabor3 ){//cuarto
		this.sabor1 = sabor1;
		this.sabor2 = sabor2;
		this.sabor3 = sabor3;
	}
	public  Pedido( String sabor1, String sabor2, String sabor3, String sabor4 ){//kilo
		this.sabor1 = sabor1;
		this.sabor2 = sabor2;
		this.sabor3 = sabor3;
		this.sabor4 = sabor4;
	}
	public boolean isAdicional() {
		return adicional;
	}
	public void setAdicional(boolean adicional) {
		this.adicional = adicional;
	}
	
	
	public String getSaborAdicional( int num ){
		switch( num ){
		case 1:
			return "crema vainilla";
			
		case 2:
			return "chocolate fundido";
			
		default:
			return "no debe pasar"; 
		
		}
		
	}
	public String getSaborAdicional2( int num ){
		switch( num ){
		case 1:
			return "chocolate fundido";
			
		case 2:
			return "almendras";
		case 3:
			return "crema vainilla";
		default:
			return "no debe pasar"; 
		
		}
		
	}

}
