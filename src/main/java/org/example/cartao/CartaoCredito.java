package org.example.cartao;

import org.example.banco.ContaCorrente;

import java.util.ArrayList;

public class CartaoCredito extends Cartao {
    public CartaoCredito(ContaCorrente conta, double limite) {
        super(conta);
        this.limite = limite;
        this.parcelasDivida = new ArrayList<>();
    }

    @Override
    public void credito(double valor, int parcelas) {
        if (totalDivida + valor <= limite) {
            parcelasDivida.add(new DividaCartao(parcelas, valor/parcelas));
            totalDivida+= valor;
        } else {
            System.out.println("Compra não autorizada, valor excede o limite do cartão");
        }
    }

    public double getLimite() {
        return limite;
    }
}
