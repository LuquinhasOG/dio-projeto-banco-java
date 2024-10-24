package org.example;

import org.example.banco.Banco;
import org.example.banco.Cliente;
import org.example.banco.ContaCorrente;
import org.example.banco.ContaPoupanca;
import org.example.cartao.CartaoCredito;
import org.example.cartao.CartaoPoupanca;

public class Main {
    public static void main(String[] args) {
        // exemplo
        Cliente cliente = new Cliente("Lucas");
        Banco bancoBrasil = new Banco(1, "Banco do Brasil");
        ContaCorrente contaCorrente = new ContaCorrente(bancoBrasil, 1000, cliente);
        ContaPoupanca contaPoupanca = new ContaPoupanca(bancoBrasil, 0, cliente);
        CartaoCredito cartaoCredito = new CartaoCredito(contaCorrente, 2500);
        CartaoPoupanca cartaoPoupanca = new CartaoPoupanca(contaPoupanca);

        // testa tranferencia entre contas
        contaCorrente.transferir(400, contaPoupanca);
        contaCorrente.imprimirInformacoes();
        contaPoupanca.imprimirInformacoes();

        // testa rendimento na conta poupança
        contaPoupanca.render(0.05);
        contaPoupanca.render(0.05);
        contaCorrente.imprimirInformacoes();
        contaPoupanca.imprimirInformacoes();

        // testa função de débito nos cartões das contas
        cartaoPoupanca.debitar(100);
        cartaoCredito.debitar(100);
        contaCorrente.imprimirInformacoes();
        contaPoupanca.imprimirInformacoes();

        // teste a função de crédito
        cartaoCredito.credito(3000, 5);
        cartaoCredito.credito(1000, 10);
        cartaoCredito.pagarCartaoMes();
        cartaoCredito.pagarCartaoMes();
        cartaoCredito.pagarCartaoMes();
        contaCorrente.imprimirInformacoes();
        contaPoupanca.imprimirInformacoes();
    }
}