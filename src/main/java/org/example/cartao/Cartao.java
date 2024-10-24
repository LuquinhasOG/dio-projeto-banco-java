package org.example.cartao;

import org.example.banco.Conta;

import java.util.ArrayList;

public abstract class Cartao {
    protected Conta conta;
    protected double limite;
    protected double totalDivida = 0;
    protected ArrayList<DividaCartao> parcelasDivida;

    public Cartao(Conta conta) {
        this.conta = conta;
    }

    public boolean debitar(double valor) {
        if (conta.sacar(valor)) {
            return true;
        }

        System.out.println("Não foi possível realizar a transação, saldo insuficiente");
        return false;
    }

    public abstract void credito(double valor, int parcelas);

    public void pagarCartaoMes() {
        for (DividaCartao d : parcelasDivida) {
            if (d.getParcelas() > 0 && this.debitar(d.getValorParcela())) {
                d.pagar();
                totalDivida-= d.getValorParcela();
            }
        }

        for (int i = 0; i < parcelasDivida.size(); i++) {
            if (parcelasDivida.get(i).getParcelas() == 0) {
                parcelasDivida.remove(i);
            }
        }
    }
}
