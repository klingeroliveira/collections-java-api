package main.java.set.Ordenacao;

import java.util.Comparator;
import java.util.Objects;

//Comparable - interface para metodo de comparacao/ordenacao padrao da classe
public class Produto implements Comparable<Produto> {

    private String nome;
    private long codigo;
    private double preco;
    private int quantidade;

    public Produto(String nome,
                   long codigo,
                   double preco,
                   int quantidade) {
        this.nome = nome;
        this.codigo = codigo;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    //metodo de comparacao/ordenacao padrao da classe
    @Override
    public int compareTo(Produto produto) {
        return this.nome.compareToIgnoreCase(produto.getNome());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return codigo == produto.codigo;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(codigo);
    }

    public String getNome() {
        return nome;
    }

    public long getCodigo() {
        return codigo;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + getNome() + '\'' +
                ", codigo=" + getCodigo() +
                ", preco=" + getPreco() +
                ", quantidade=" + getQuantidade() +
                "}\n";
    }
}

class OrdenarProdutoPorPreco implements Comparator<Produto> {

    @Override
    public int compare(Produto produto1, Produto produto2) {
        return Double.compare(produto1.getPreco(), produto2.getPreco());
    }
}
