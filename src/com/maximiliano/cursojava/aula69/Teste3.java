package com.maximiliano.cursojava.aula69;

public class Teste3 {

	@SuppressWarnings({ "unused"})
	public static void main(String[] args) {

		MinhaThreadRunnable minhaThreadRunnable1 = new MinhaThreadRunnable("#2", 500);
		MinhaThreadRunnable minhaThreadRunnable2 = new MinhaThreadRunnable("#3", 600);
		MinhaThreadRunnable minhaThreadRunnable3 = new MinhaThreadRunnable("#4", 700);

		Thread t2 = new Thread(minhaThreadRunnable1);
		Thread t3 = new Thread(minhaThreadRunnable2);
		Thread t4 = new Thread(minhaThreadRunnable3);

		/*	try {
			t1.join(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		/*	try {
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/

		t2.start();
		t3.start();
		t4.start();

		try {
			t2.join();
			t3.join();
			t4.join();

		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("Programa finalizado");

	}

}
