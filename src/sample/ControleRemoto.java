package sample;

import java.util.concurrent.Callable;

public class ControleRemoto {
    public static void main(String[] args) {
    Controller c = new Controller();
    c.ligar();
    c.maisVolume();
    c.abrirMenu();
    c.fecharMenu();
    c.play();
    c.ligarMudo();
    c.abrirMenu();
    c.fecharMenu();
    c.desligarMudo();
    c.maisVolume();
    c.abrirMenu();
    c.fecharMenu();

    }

}