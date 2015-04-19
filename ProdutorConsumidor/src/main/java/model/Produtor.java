/**
 * 
 */
package model;

import java.util.List;
import java.util.Scanner;

public class Produtor extends Thread {

    private final List<Pessoa> pessoas;
    private int quantidadePessoa;
    private int sufix = 0;

    public Produtor(List<Pessoa> pessoas, int quantidadePessoas) {
	super();
	this.pessoas = pessoas;
	this.quantidadePessoa = quantidadePessoas;
    }

    @Override
    public void run() {
	while (true) {
	    if (quantidadePessoa > 0) {
		pessoas.add(new Pessoa("pessoa" + sufix, 10, 200.0));
		sufix++;
		quantidadePessoa--;
		System.out.println("Produtor: " + pessoas);

	    } else {
		Scanner in = new Scanner(System.in);
		String nome = in.nextLine();
		pessoas.add(new Pessoa(nome, 10, 200.0));
	    }

	    try {
		Thread.sleep(2000); // 2s
	    } catch (InterruptedException e) {
	    }
	}
    }
}
