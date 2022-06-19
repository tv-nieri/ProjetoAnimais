package br.com.tvn.models;

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

    public void printInfo() {
        System.out.println();
        System.out.println("Nome: " + this.getNome());
        System.out.println("Idade: " + this.getIdade());
    }
}
