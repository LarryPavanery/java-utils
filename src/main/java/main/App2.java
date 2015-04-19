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

	// Cria o produtor e manda ele criar 10 pessoas e esperar por mais
	Produtor produtor = new Produtor(pessoas, 10);
	// Cria o consumidor e manda ele processar como fila as pessoas
	Consumidor consumidor = new Consumidor(pessoas);

	// inicia os processos
	produtor.start();
	consumidor.start();
    }
}
