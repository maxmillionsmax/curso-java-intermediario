package com.maximiliano.cursojava.aula53;

public class Teste {

	public static void main(String[] args) {

		usandoConstantes();
		System.out.println();
		usandoEnum();
	}
	
	private static void usandoConstantes() {
		
		int segunda = DiaSemanaConstantes.SEGUNDA;
		int terca = DiaSemanaConstantes.TERCA;
		int quarta = DiaSemanaConstantes.QUARTA;
		int quinta = DiaSemanaConstantes.QUINTA;
		int sexta = DiaSemanaConstantes.SEXTA;
		int sabado = DiaSemanaConstantes.SABADO;
		int domingo = DiaSemanaConstantes.DOMINGO;
		
		System.out.println("TesteEnum utilizando constantes no Java:\n");
		
		imprimeDiaSemana(segunda);
		imprimeDiaSemana(terca);
		imprimeDiaSemana(quarta);
		imprimeDiaSemana(quinta);
		imprimeDiaSemana(sexta);
		imprimeDiaSemana(sabado);
		imprimeDiaSemana(domingo);
	
	}
	
	private static void imprimeDiaSemana(int dia) {
		
		switch (dia) {
		case 1: 
			System.out.println("segunda feira");
			break;
		case 2: 
			System.out.println("ter�a feira");
			break;
		case 3: 
			System.out.println("quarta feira");
			break;
		case 4: 
			System.out.println("quinta feira");
			break;
		case 5: 
			System.out.println("sexta feira");
			break;
		case 6: 
			System.out.println("sabado");
			break;
		case 7: 
			System.out.println("domingo");
			break;
		
		}
	}
	
	private static void usandoEnum() {
		
		System.out.println("TesteEnum utilizando Enum :");
		DiaSemana segunda = DiaSemana.SEGUNDA;
		DiaSemana terca = DiaSemana.TERCA;
		DiaSemana quarta= DiaSemana.QUARTA;
		DiaSemana quinta = DiaSemana.QUINTA;
		DiaSemana sexta = DiaSemana.SEXTA;
		DiaSemana sabado = DiaSemana.SABADO;
		DiaSemana domingo = DiaSemana.DOMINGO;
		
		imprimeDiaSemana(segunda);
		imprimeDiaSemana(terca);
		imprimeDiaSemana(quarta);
		imprimeDiaSemana(quinta);
		imprimeDiaSemana(sexta);
		imprimeDiaSemana(sabado);
		imprimeDiaSemana(domingo);
		
		
	}
	
    private static void imprimeDiaSemana(DiaSemana dia) {
		
		switch (dia) {
		case SEGUNDA: 
			System.out.println("segunda feira");
			break;
		case TERCA: 
			System.out.println("ter�a feira");
			break;
		case QUARTA: 
			System.out.println("quarta feira");
			break;
		case QUINTA: 
			System.out.println("quinta feira");
			break;
		case SEXTA: 
			System.out.println("sexta feira");
			break;
		case SABADO: 
			System.out.println("sabado");
			break;
		case DOMINGO: 
			System.out.println("domingo");
			break;
		
		}
	}

}
