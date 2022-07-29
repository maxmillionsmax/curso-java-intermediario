package com.maximiliano.cursojava.aula69;

public class Teste2 {

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
		
		
		while(t1.isAlive() || t2.isAlive() || t3.isAlive()) {
			
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
