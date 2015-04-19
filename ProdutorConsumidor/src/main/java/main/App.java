/**
 * 
 */
package main;

import java.util.ArrayList;
import java.util.List;

import model.Pessoa;

public class App {

    private final static List<Pessoa> pessoas = new ArrayList<Pessoa>();
    private static int sufix = 0;
    private static int quantidadePessoa = 0;

    public static void mainsemuso(String[] args) {
	final int length = 5;

	Thread produtor = new Thread() {
	    @Override
	    public void run() {
		while (true && quantidadePessoa < 10) {
		    pessoas.add(new Pessoa("pessoa" + sufix, 10, 200.0));
		    sufix += 1;
		    quantidadePessoa++;
		    System.out.println("Produtor: " + pessoas);

		    try {
			Thread.sleep(2000); // 2s
		    } catch (InterruptedException e) {
		    }
		}
	    }
	};

	produtor.start();

	Thread consumidor = new Thread() {
	    @Override
	    public void run() {
		while (true) {
		    if (!pessoas.isEmpty()) {
			System.out.println("Consumidor: " + pessoas);
			Pessoa p = pessoas.remove(0);
			p.setDinheiro(p.getDinheiro() + 50);
			System.out.println("Pessoa do momento: " + p);
		    }

		    try {
			Thread.sleep(3000); // 3s
		    } catch (InterruptedException e) {
		    }
		}
	    }
	};

	consumidor.start();

    }

    public static void loop(int length) {
	for (int i = 0; i < length; i++) {
	    System.out.println(String.format("Step (%s).", i));
	}
    }

}
