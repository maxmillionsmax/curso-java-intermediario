package com.maximiliano.cursojava.aula74.labs;

public class ThreadSemafor implements Runnable{

	private CorSemafor cor;
	private boolean parar;
	private boolean corMudou;


	public ThreadSemafor() {

		this.cor = CorSemafor.VERMELHO;
		this.parar = false;
		this.corMudou = false;
		new Thread(this).start();
	}

	@Override
	public void run() {
		while (!parar) {
			try {
				/*switch (this.cor) {
				case VERMELHO:
					Thread.sleep(2000);
					break;
				case AMARELO:
					Thread.sleep(300);
					break;
				case VERDE:
					Thread.sleep(1000);
					break;

				default:
					break;
				}*/
			
			Thread.sleep(this.cor.getTempoEspera());
				this.mudarCor();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	private synchronized void mudarCor() {
		
		switch (this.cor) {
		case VERMELHO:
			this.cor = CorSemafor.VERDE;
			break;
		case VERDE:
			this.cor = CorSemafor.AMARELO;
			break;
		case AMARELO:
			this.cor = CorSemafor.VERMELHO;
			break;

		default:
			break;
		}
		this.corMudou = true;
		notify();
	}
	
	public synchronized void esperaCorMudar() {
		
		while (!this.corMudou) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.corMudou = false;
	}
	
	public synchronized void desligarSemaforo() {
		
		this.parar = true;
	}
	
	public CorSemafor getCor() {
		return cor;
	}
}
