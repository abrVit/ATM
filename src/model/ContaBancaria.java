package model;

import usuario.Teclado;

public abstract class ContaBancaria{
    private String nomeCliente; //Pega nome do cliente
    private int numeroConta, numeroAgencia, saque; //Informações com tipo inteiro
    private double saldo, deposito; //Informações do tipo float

    public ContaBancaria(){
        super();
    } //Construtor simples


    //Construtor completo:
    public ContaBancaria(String nomeCliente, int numeroConta, int numeroAgencia, double saldo){
        super();
        this.nomeCliente = nomeCliente;
        this.numeroConta = numeroConta;
        this.numeroAgencia = numeroAgencia;
        this.saldo = saldo;
    }

    //Getters e Setters

    public void setNomeCliente(String nomeCliente){
        this.nomeCliente = nomeCliente;
    }

    public String getNomeCliente(){
        return nomeCliente;
    }

    public void setNumeroConta(int numeroConta){
        this.numeroConta = numeroConta;
    }

    public int getNumeroConta(){
        return numeroConta;
    }

    public void setNumeroAgencia(int numeroAgencia){
        this.numeroAgencia = numeroAgencia;
    }

    public int getNumeroAgencia(){
        return numeroAgencia;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public double getSaldo(){
        return saldo;
    }

    public void setSaque(int saque){
        this.saque = saque;
    }

    public int getSaque(){
        return saque;
    }

    //Funções finais do código

    public void sacar(double saque){
        if(saque > saldo){
            System.out.println("Saldo insuficiente para realizar esssa ação!");
        } else {
            double novoSaldo = saldo - saque;
            this.saldo = novoSaldo;
            System.out.println("Saque realizado!!\nNovo saldo: R$ " + novoSaldo);
        }
    }

    public void depositar(double deposito){
        double novoSaldo = saldo + deposito;
        this.saldo = novoSaldo;
        System.out.println(String.format("Valor depositado: R$ %s\nNovo saldo em conta: R$ %s", deposito, novoSaldo));
    }

    public void mostrarInfo(){
    	Teclado.mensagem("\n-=-=-=-=-=Dados da conta=-=-=-=-=-");
        System.out.println(String.format("-> Nome do cliente: %s", nomeCliente));
        System.out.println(String.format("-> Numero da conta: %s", numeroConta));
        System.out.println(String.format("-> Agencia: %s", numeroAgencia));
        System.out.println(String.format("-> Saldo em conta: R$ %s", saldo));
        Teclado.mensagem("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=\n");
    }
}