package model;

import static usuario.Teclado.entradaStr;
import static usuario.Teclado.mensagem;

public class ContaEspecial extends ContaBancaria{
    private double limite;

    public ContaEspecial(){
        super();
    }

    public ContaEspecial(String nomeCliente, int numeroConta, int numeroAgencia, double saldo, double limite){
        super(nomeCliente, numeroConta, numeroAgencia, saldo);
        this.limite = limite;
        this.mostrarInfo();
    }

    public void setLimite(double limite){
        this.limite = limite;
    }

    public double getLimite(){
        return  limite;
    }

    @Override
    public void sacar(double valor){
        double novoSaldo;
        mensagem(String.format("Você possui R$ %s de limite em sua conta", limite));
        while (true) {
            if (valor > getSaldo()) {
                mensagem("Você não possui saldo o suficiente, deseja utilizar do seu limite?[S/N]");
                String entradaUsu = entradaStr();
                if (entradaUsu.equalsIgnoreCase("s")) {
                    novoSaldo = valor - getSaldo();
                    if (novoSaldo < limite) {
                        setSaldo(0);
                        System.out.println("Saque realizado!!\nNovo valor de crédito da conta: R$" + novoSaldo);
                        break;
                    } else {
                        System.out.println("O valor excede o seu limite atual!");
                        break;
                    }
                } else if (entradaUsu.equalsIgnoreCase("n")) {
                    System.out.println("Operação não realizada!");
                    System.out.printf("Saldo em conta %s\n", getSaldo());
                    break;
                } else {
                    System.out.println("Selecione uma opção válida!");
                }
            } else {
                novoSaldo = getSaldo() - valor;
                mensagem("Operação realizada!\nNovo saldo disponivel em conta: R$" + novoSaldo);
                break;
            }

        }
    }

    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
    }
}
