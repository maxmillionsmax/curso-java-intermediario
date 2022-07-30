package com.maximiliano.cursojava.aula74.labs;

public class SimuladorSemafor {

	public static void main(String[] args) {
		
	 ThreadSemafor semaforo = new ThreadSemafor();
		
		for (int i = 0; i < 10; i++) {
			System.out.println(semaforo.getCor());
			semaforo.esperaCorMudar();
		}
		
		semaforo.desligarSemaforo();
	}
}
