package org.example.banco;

import org.example.banco.Banco;
import org.example.banco.Cliente;
import org.example.banco.Conta;

public class ContaCorrente extends Conta {
    public ContaCorrente(Banco banco, double saldo, Cliente cliente) {
        super(banco, saldo, cliente);
    }
}
