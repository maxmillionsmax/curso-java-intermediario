package com.maximiliano.cursojava.aula64;

public class Anonima {

	public void imprimeTexto() {
		System.out.println("Qualquer texto");
	}

	public static void main(String[] args) {
		
		Anonima anonima = new Anonima(){
			public void imprimeTexto() {
				System.out.println("Qualquer texto que foi sobreescrito");
		
		}
	  };
	  anonima.imprimeTexto();
	  
	  Texto texto = new Texto() {
		  
		  public void imprimeTexto() {
			  System.out.println("Qualquer texto - interface");
		  }
	  };
	  
	  texto.imprimeTexto();
	}
}
	
