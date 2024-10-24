package org.example.banco;

public class Banco {
    private int agencia;
    private String nome;

    public Banco(int agencia, String nome) {
        this.agencia = agencia;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public int getAgencia() {
        return agencia;
    }
}
