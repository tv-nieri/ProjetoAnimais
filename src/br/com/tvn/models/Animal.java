package br.com.tvn.models;

/**
 * Um modelo genérico de animal
 */
public abstract class Animal {
    private String nome;
    private int idade;

    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    /**
     * Método de informações.
     * É usado pelos "filhos" da classe Animal para mostrar seus atributos.
     */
    public void printInfo() {
        System.out.println();//Apenas pula uma linha antes de qualquer exibição.
        System.out.println("Nome: " + this.getNome());
        System.out.println("Idade: " + this.getIdade());
    }
}
