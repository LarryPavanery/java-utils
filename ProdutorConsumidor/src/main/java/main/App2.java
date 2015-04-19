/**
 * 
 */
package main;

import java.util.ArrayList;
import java.util.List;

import model.Consumidor;
import model.Pessoa;
import model.Produtor;

public class App2 {

    private final static List<Pessoa> pessoas = new ArrayList<Pessoa>();

    public static void main(String[] args) {

	int quantidadeProdutor = 500;
	// Cria 500 produtores e manda cada um criar 10 pessoas e esperar por
	// mais,
	// através de entradas pelo terminal/console
	for (int i = 0; i < quantidadeProdutor; i++) {
	    new Produtor(pessoas, 10, "prod-" + i).start();
	}

	// Cria uma quantidade da metade de produtores, a de consumidores e
	// manda ele processar como fila as pessoas na ordem de fila
	for (int i = 0; i < quantidadeProdutor / 2; i++) {
	    new Consumidor(pessoas).start();
	}
    }
}
