package com.maximiliano.cursojava.aula70;

public class Teste {

	@SuppressWarnings({ "unused"})
	public static void main(String[] args) {

		MinhaThreadRunnable minhaThreadRunnable = new MinhaThreadRunnable("#1", 500);
		MinhaThreadRunnable minhaThreadRunnable1 = new MinhaThreadRunnable("#2", 500);
		MinhaThreadRunnable minhaThreadRunnable2 = new MinhaThreadRunnable("#3", 500);
		MinhaThreadRunnable minhaThreadRunnable3 = new MinhaThreadRunnable("#4", 500);
		
		Thread t1 = new Thread(minhaThreadRunnable);
		Thread t2 = new Thread(minhaThreadRunnable1);
		Thread t3 = new Thread(minhaThreadRunnable2);
		Thread t4 = new Thread(minhaThreadRunnable3);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
		for (int i = 0; i < 16; i++) {
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Programa finalizado");
		

	}

}
