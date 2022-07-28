package com.maximiliano.cursojava.aula68;

public class MinhaThreadRunnable implements Runnable{

	private String nome;
	private int tempo;

	public MinhaThreadRunnable(String nome, int tempo) {
		this.nome = nome;
		this.tempo = tempo;
		Thread t = new Thread(this);
		t.start();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {

		try {

			for (int i = 0; i < 6; i++) {
				System.out.println(nome+" contador " +i);
				Thread.sleep(tempo);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(nome+ " Terminou a execução!!!...");
	}
}
