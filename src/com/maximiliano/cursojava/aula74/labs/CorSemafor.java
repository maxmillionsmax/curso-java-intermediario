package com.maximiliano.cursojava.aula74.labs;

public enum CorSemafor {

	VERDE(1000), AMARELO(300), VERMELHO(2000);
	
	private int tempoEspera;
	
	private CorSemafor(int tempoEspera) {
		this.tempoEspera = tempoEspera;
	}
	
	public int getTempoEspera() {
		return tempoEspera;
	}
	
}
