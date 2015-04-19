/**
 * 
 */
package model;

import java.util.List;
import java.util.Scanner;

public class Produtor extends Thread {

    private final String nome;
    private final List<Pessoa> pessoas;
    private int quantidadePessoa;
    private static int sufix = 0;

    public Produtor(List<Pessoa> pessoas, int quantidadePessoas, String nome) {
	super();
	this.pessoas = pessoas;
	this.quantidadePessoa = quantidadePessoas;
	this.nome = nome;
    }

    @Override
    public void run() {
	while (true) {
	    synchronized (pessoas) {
		if (quantidadePessoa > 0) {
		    Pessoa pessoa = new Pessoa("pessoa" + sufix, 10, 200.0);
		    pessoas.add(pessoa);
		    sufix++;
		    quantidadePessoa--;
		    System.out.println("Prod[" + nome + "] - Criando pessa: " + pessoa);

		} else {
		    Scanner in = new Scanner(System.in);
		    String nome = in.nextLine();
		    pessoas.add(new Pessoa(nome, 10, 200.0));
		}
	    }
	    try {
		Thread.sleep(1000); // 1s
	    } catch (InterruptedException e) {
	    }
	}
    }
}
