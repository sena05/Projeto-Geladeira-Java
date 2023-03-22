package br.com.fiap;

public class Geladeira {
	//atributos
	public int temperatura;
	public String modo;
	
	//métodos 
	
	public void aumentarTemperatura() {
		this.temperatura++;
	}

	public void abaixarTemperatura() {
		this.temperatura--;
	}
	public void alterarModo(String modo) {
		this.modo =  modo;
	}
	public void mostrar() {
		System.out.println("Temperatura atual: " + this.temperatura
				+ "\nModo atual: " + this.modo);
	}
	
}
