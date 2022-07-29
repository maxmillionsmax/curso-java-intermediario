package com.maximiliano.cursojava.aula70;

public class Teste3 {

	@SuppressWarnings({ "unused"})
	public static void main(String[] args) {

		MinhaThreadRunnable minhaThreadRunnable1 = new MinhaThreadRunnable("#1", 500);
		MinhaThreadRunnable minhaThreadRunnable2 = new MinhaThreadRunnable("#2", 500);
		MinhaThreadRunnable minhaThreadRunnable3 = new MinhaThreadRunnable("#3", 500);

		Thread t1 = new Thread(minhaThreadRunnable1);
		Thread t2 = new Thread(minhaThreadRunnable2);
		Thread t3 = new Thread(minhaThreadRunnable3);

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
		
		t1.setPriority(5);
		t2.setPriority(3);
		t3.setPriority(1);
		
		//t1.setPriority(Thread.NORM_PRIORITY);

		t1.start();
		t2.start();
		t3.start();


	}

}
