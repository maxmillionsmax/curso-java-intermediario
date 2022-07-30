package com.maximiliano.cursojava.aula73;

public class Teste {

	public static void main(String[] args) {

		MinhaThread t1 = new MinhaThread("#1");
		MinhaThread t2 = new MinhaThread("#2");
		
		System.out.println("Pausando Thread #1");
		
		t1.suspend();
		
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Pausando Thread #2");
		t2.suspend();

		System.out.println("Resumindo Thread #1");
		
		t1.resume();
		
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Resumindo Thread #2");
		t2.resume();
		System.out.println("terminando Thread #2");
		t2.stop();

	}

}
