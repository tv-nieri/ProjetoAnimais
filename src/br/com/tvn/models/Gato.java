package br.com.tvn.models;

import br.com.tvn.actions.Cumprimenta;

/**
 * Um modelo especializado de animal.
 */
public class Gato extends Animal implements Cumprimenta {
    public Gato(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void cumprimenta() {
        System.out.println("Miau miau miau!");
    }
}
