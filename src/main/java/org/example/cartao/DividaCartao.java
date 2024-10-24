package org.example.cartao;

public class DividaCartao {
    private int parcelas;
    private double valorParcela;

    public DividaCartao(int parcelas, double valorParcela) {
        this.parcelas = parcelas;
        this.valorParcela = valorParcela;
    }

    public int getParcelas() {
        return parcelas;
    }

    public void pagar() {
        parcelas--;
    }

    public double getValorParcela() {
        return valorParcela;
    }
}
