package com.maximiliano.cursojava.aula60;

public class EscopoVariaveis {

	private int valor;
	
	public int getValor() {
		return valor;
		
	}
	public void setValor(int valor) {
		this.valor = valor;
		
	}
	
	public int calcularValor(int valor) {
		
		valor = valor +10 ;
		
		//this.valor =valor;
		
		return valor;
	}
	
	public int teste() {
		
		int valor = 5;
		
		if (true) {
			valor--;
		}
		
		//this.valor =valor;
		return valor;
	}
	
	public void outroTeste() {
	
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		
		int j;
		for (j = 0; j < 10; j++) {
			System.out.println(j);
		}
		System.out.println(j);
	}
	
	public void maisUmteste() {
		
		boolean flag = true;
		if (flag) {
			int umaVariavel = 10;
			umaVariavel =10;
			umaVariavel++;
			System.out.println(umaVariavel);
			
		}
	}
	public void maisOutroTeste(int num) {
		
		int total = 0;
		
		try {
			
			int outroNum = 0;
			
			total = num/outroNum;
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
		} finally {
			
			total++;
		}
		num++;
	}
	
}

