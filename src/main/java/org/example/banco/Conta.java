package org.example.banco;

public abstract class Conta {
    protected int numero;
    protected double saldo;
    protected Cliente cliente;
    protected Banco banco;

    private static int SEQUENCIA = 1;

    public Conta(Banco banco, double saldo, Cliente cliente) {
        this.banco = banco;
        this.numero = SEQUENCIA++;
        this.saldo = saldo;
        this.cliente = cliente;
    }

    public boolean sacar(double valor) {
        if (this.saldo - valor >= 0) {
            this.saldo -= valor;
            return true;
        }

        System.out.println("Não foi possível realizar a transação, saldo insuficiente");
        return false;
    }

    public boolean depositar(double valor) {
        this.saldo += valor;
        return true;
    }

    public boolean transferir(double valor, Conta conta) {
        if(this.sacar(valor)) {
            conta.depositar(valor);
            return true;
        }

        return false;
    }

    public void imprimirInformacoes() {
        System.out.println("cliente nome: " + this.cliente.getNome());
        System.out.println("banco.......: " + this.banco.getNome());
        System.out.println("agência.....: " + this.banco.getAgencia());
        System.out.println("numero......: " + this.numero);
        System.out.println("saldo.......: " + this.saldo);
        System.out.println();
    }

    public Banco getBanco() {
        return banco;
    }

    public int getAgencia() {
        return banco.getAgencia();
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }
}
