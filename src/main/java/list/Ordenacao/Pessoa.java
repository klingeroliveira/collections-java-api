package main.java.list.Ordenacao;

import java.util.Comparator;

public class Pessoa implements Comparable<Pessoa>{
    private String nome;
    private int idade;
    private double altura;

    public Pessoa (String nome, int idade, double altura){
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    @Override
    public int compareTo(Pessoa pessoa) {
        return Integer.compare(getIdade(), pessoa.getIdade());
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getAltura() {
        return altura;
    }

    @Override
    public String toString() {
        return "Pessoa{Nome: '"+ getNome()
                + "', Idade: " + getIdade()
                + ", Altura: " + getAltura()
                + "}\n";
    }
}

    class OrdenarPorAltura implements Comparator<Pessoa>{

        @Override
        public int compare(Pessoa pessoa1, Pessoa pessoa2) {
            return Double.compare(pessoa1.getAltura(), pessoa2.getAltura());
        }
    }
