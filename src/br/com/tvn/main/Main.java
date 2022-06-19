package br.com.tvn.main;

import br.com.tvn.models.Cachorro;
import br.com.tvn.models.Gato;

public class Main {
    public static void main(String[] args) {
        Cachorro c = new Cachorro("Lola", 2);
        Gato g = new Gato("Kira", 1);

        c.printInfo();
        c.cumprimenta();

        g.printInfo();
        g.cumprimenta();

    }
}
