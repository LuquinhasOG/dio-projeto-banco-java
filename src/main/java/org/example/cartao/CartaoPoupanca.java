package org.example.cartao;

import org.example.banco.ContaPoupanca;

public class CartaoPoupanca extends Cartao {
    public CartaoPoupanca(ContaPoupanca conta) {
        super(conta);
    }

    @Override
    public void credito(double valor, int parcelas) {
        throw new UnsupportedOperationException("Operação não suportada para este tipo de conta");
    }
}
