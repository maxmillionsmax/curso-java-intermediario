package com.maximiliano.cursojava.aula68;

public class Teste {

	@SuppressWarnings({ "unused"})
	public static void main(String[] args) {

		MinhaThreadRunnable minhaThreadRunnable = new MinhaThreadRunnable("#1", 200);
		MinhaThreadRunnable minhaThreadRunnable1 = new MinhaThreadRunnable("#2", 900);
		MinhaThreadRunnable minhaThreadRunnable2 = new MinhaThreadRunnable("#3", 600);
		MinhaThreadRunnable minhaThreadRunnable3 = new MinhaThreadRunnable("#4", 400);
		//Thread t1 = new Thread(minhaThreadRunnable);

	}

}
