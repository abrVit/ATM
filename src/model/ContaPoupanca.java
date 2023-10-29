package model;

import usuario.Teclado;

public class ContaPoupanca extends ContaBancaria{
    private double taxaJuros;
    private int diasRendimento;

    public ContaPoupanca(){
        super();
    }

    public ContaPoupanca(String nomeCliente, int numeroConta, int numeroAgencia, double saldo, double taxaJuros, int diasRendimento){
        super(nomeCliente, numeroConta, numeroAgencia, saldo);
        this.diasRendimento = diasRendimento;
        this.taxaJuros = taxaJuros;
        this.mostrarInfo();
    }

    public void setDiasRendimento(int diasRendimento){
        this.diasRendimento = diasRendimento;
    }

    public int getDiasRendimento(){
        return diasRendimento;
    }

    public void setTaxaJuros(double taxaJuros){
        this.taxaJuros = taxaJuros;
    }

    public double getTaxaJuros(){
        return taxaJuros;
    }

    public void novoSaldo(){
        double lucro = getSaldo() * (taxaJuros / 100) * diasRendimento;
        double novoSaldo = getSaldo() + lucro;
        setSaldo(novoSaldo);
        System.out.println(String.format("Lucro gerado em %s dias: R$ %.2f", diasRendimento, lucro));
        System.out.println(String.format("Novo saldo em conta: R$ %.2f", novoSaldo));
    }

    public void mostrarInfo(){
        Teclado.mensagem("\n-=-=-=-=-=Dados da conta=-=-=-=-=-");
        System.out.println(String.format("-> Nome do cliente: %s", getNomeCliente()));
        System.out.println(String.format("-> Numero da conta: %s", getNumeroConta()));
        System.out.println(String.format("-> Agencia: %s", getNumeroAgencia()));
        System.out.println(String.format("-> Saldo em conta: %s", getSaldo()));
        novoSaldo();
        Teclado.mensagem("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\n");
    }

    @Override
    public void sacar(double saque){
        super.sacar(saque);
    }

    @Override
    public void depositar(double deposito){
        super.depositar(deposito);
    }


}