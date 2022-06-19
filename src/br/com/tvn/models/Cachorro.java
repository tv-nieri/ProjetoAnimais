package br.com.tvn.models;

import br.com.tvn.actions.Cumprimenta;

public class Cachorro extends Animal implements Cumprimenta {
    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void cumprimenta() {
        System.out.println("Auau auau auau!");
    }
}
