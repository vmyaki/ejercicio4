package com.imfe.ejercicio4.model;

import java.util.Random;

public class Coche {
	//Atributos
	private String marca;
	private String modelo;
	private double precio;
		
	//Constructores
	public Coche(String modelo) {
		this.marca="seat";
		this.modelo=modelo;
		Random aleatorio =new Random();
		this.precio=(aleatorio.nextInt(20000)+aleatorio.nextDouble());
	}
	
	
	//Métodos
	
	//Getters y Setters
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	//ToString
	public String toString() {
		
		return "Coche [marca="+this.marca+",modelo="+this.modelo+",precio="+this.precio+"]";
		
	}
}
