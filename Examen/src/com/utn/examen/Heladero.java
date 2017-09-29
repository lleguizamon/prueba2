package com.utn.examen;

public class Heladero {
	private boolean disponible = false;
	private int cantidad = 0;
	
	
	public boolean isDisponible() {
		return disponible;
	}
	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad() {
		this.cantidad = cantidad+1;
	}
	
	

}
