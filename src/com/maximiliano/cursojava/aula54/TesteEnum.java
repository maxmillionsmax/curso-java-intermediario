package com.maximiliano.cursojava.aula54;

public class TesteEnum {

	public static void main(String[] args) {

		DiaSemana dia = DiaSemana.SEGUNDA;
		
		System.out.println(dia.toString()+ " - "+dia.getValor());
		
		@SuppressWarnings("unused")
		Data data = new Data(27, 8, 2022, DiaSemana.TERCA);
	}
}
