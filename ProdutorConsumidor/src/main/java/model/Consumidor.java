/**
 * 
 */
package model;

import java.util.List;

public class Consumidor extends Thread {

    private final List<Pessoa> pessoas;

    public Consumidor(List<Pessoa> pessoas) {
	super();
	this.pessoas = pessoas;
    }

    @Override
    public void run() {
	while (true) {
	    synchronized (pessoas) {
		if (!pessoas.isEmpty()) {
		    Pessoa p = pessoas.remove(0);
		    p.setDinheiro(p.getDinheiro() + 50);
		    System.out.println("Processou pessoa: " + p);
		}
	    }

	    try {
		Thread.sleep(500); // 0.5s
	    } catch (InterruptedException e) {
	    }
	}
    }
}
