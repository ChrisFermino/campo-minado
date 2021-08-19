package cm;

import cm.models.Tabuleiro;
import cm.view.TabuleiroConsole;

public class Aplicacao {

    public static void main(String[] args) {

        Tabuleiro tabuleiro = new Tabuleiro(6,6,1);
        new TabuleiroConsole(tabuleiro);

    }
}
