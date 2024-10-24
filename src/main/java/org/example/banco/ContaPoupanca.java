package org.example.banco;

import org.example.banco.Banco;
import org.example.banco.Cliente;
import org.example.banco.Conta;

public class ContaPoupanca extends Conta {
    public ContaPoupanca(Banco banco, double saldo, Cliente cliente) {
        super(banco, saldo, cliente);
    }

    public void render(double porcentagem) {
        this.saldo+= saldo*porcentagem;
    }
}
