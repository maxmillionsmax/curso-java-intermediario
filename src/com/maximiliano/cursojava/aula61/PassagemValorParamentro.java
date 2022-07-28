package com.maximiliano.cursojava.aula61;

public class PassagemValorParamentro {

	public static void main(String[] args) {

		Contato contato = new Contato("Contato_1", "123-456", "contato_1@email.co");
		int valor = 10;
		
		System.out.println("**********valores originais************");
		
		System.out.println(contato);
		System.out.println(valor);
		
		System.out.println("**********valores Exemplo 1 ************");
		testePassagemValorReferencia(valor, contato);
		
		System.out.println(contato);
		System.out.println(valor);
		
		System.out.println("**********valores Exemplo 2************");
        testePassagemValorReferencia2(valor, contato);
		
		System.out.println(contato);
		System.out.println(valor);
				
				
	}
	
	private static void testePassagemValorReferencia(int valor, Contato contato) {
		
		int novoValor = valor + 10 ;
		valor = novoValor;
		
		contato = new Contato("contato_2", "2345-6789", "contato_2@emial.com");
		
	}
	private static void testePassagemValorReferencia2(int valor, Contato contato) {
		
		int novoValor = valor + 10 ;
		valor = novoValor;
		
		contato.setNome("Contato_"+novoValor);;
		
	}

}
