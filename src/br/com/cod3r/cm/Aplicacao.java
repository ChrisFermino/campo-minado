package br.com.cod3r.cm;

import br.com.cod3r.cm.models.Tabuleiro;
import br.com.cod3r.cm.view.TabuleiroConsole;

public class Aplicacao {

    public static void main(String[] args) {

        Tabuleiro tabuleiro = new Tabuleiro(6,6,1);
        new TabuleiroConsole(tabuleiro);

    }
}
