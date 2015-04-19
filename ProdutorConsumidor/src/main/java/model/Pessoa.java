/**
 * 
 */
package model;

/**
 * @author larrypavanery
 *
 */
public class Pessoa {

    private String nome;
    private int idade;
    private double dinheiro;

    /**
     * 
     */
    public Pessoa(String nome, int idade, double dinheiro) {
	this.nome = nome;
	this.idade = idade;
	this.dinheiro = dinheiro;
    }

    /**
     * @return the nome
     */
    public final String getNome() {
	return nome;
    }

    /**
     * @param nome
     *            the nome to set
     */
    public final void setNome(String nome) {
	this.nome = nome;
    }

    /**
     * @return the idade
     */
    public final int getIdade() {
	return idade;
    }

    /**
     * @param idade
     *            the idade to set
     */
    public final void setIdade(int idade) {
	this.idade = idade;
    }

    /**
     * @return the dinheiro
     */
    public final double getDinheiro() {
	return dinheiro;
    }

    /**
     * @param dinheiro
     *            the dinheiro to set
     */
    public final void setDinheiro(double dinheiro) {
	this.dinheiro = dinheiro;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
	return nome + ", dinheiro: " + dinheiro;
    }
}
