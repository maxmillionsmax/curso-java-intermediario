package com.maximiliano.cursojava.aula67;

public class Teste {

	public static void main(String[] args) {

		MinhaThread thread = new MinhaThread("Minha Thread#_______1", 600);
		//thread.start();

		MinhaThread thread2 = new MinhaThread("minha thread#______2", 900);
		

		MinhaThread thread3 = new MinhaThread("minha thread#______3", 500);
	}

}
