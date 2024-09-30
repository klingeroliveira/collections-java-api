package main.java.map.Ordenacao;

import java.util.Set;

public class Evento {

    private String nome;
    private Set<String> atracoes;

    public Evento(String nome, Set<String> atracoes) {
        this.nome = nome;
        this.atracoes = atracoes;
    }

    public String getNome() {
        return nome;
    }

    public Set<String> getAtracoes() {
        return atracoes;
    }

    @Override
    public String toString() {
        return "Evento{" +
                "evento='" + nome + '\'' +
                ", atracoes=" + atracoes +
                '}';
    }
}
