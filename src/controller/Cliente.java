package controller;

import model.ContaPoupanca;
import model.ContaEspecial;

public class Cliente {

    public static void main(String[] args) {

        ContaEspecial contaE = new ContaEspecial("João", 18765, 9877, 1765.50, 550);
        ContaPoupanca contaP = new ContaPoupanca("Vitor", 18707, 7765, 1260, 2.5, 6);
    }
}