package main.java.map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {

    private Map<Long, Produto> produtoMap;

    public EstoqueProdutos() {
        this.produtoMap = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, int quantidade, double preco) {
        produtoMap.put(cod, new Produto(nome, quantidade, preco));
    }

    public void exibirProdutos() {
        System.out.println(produtoMap);
    }

    public double calcularValorTotalEstoque() {
        double valorTotalEstoque = 0;

        if (!produtoMap.isEmpty()) {
            for (Produto produto : produtoMap.values()) {
                valorTotalEstoque += produto.getPreco() * produto.getQuantidade();
            }
        }

        return valorTotalEstoque;
    }

    public Produto obterProdutoMaisCaro() {
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;

        if (!produtoMap.isEmpty()) {
            for (Produto produto : produtoMap.values()) {
                if (produto.getPreco() > maiorPreco) {
                    produtoMaisCaro = produto;
                    maiorPreco = produto.getPreco();
                }
            }
        }

        return produtoMaisCaro;
    }

    public Produto obterProdutoMaisBarato() {
        Produto produtoMaisBarato = null;
        double menorPreco = Double.MAX_VALUE;

        if (!produtoMap.isEmpty()) {
            for (Produto produto : produtoMap.values()) {
                if (produto.getPreco() < menorPreco) {
                    produtoMaisBarato = produto;
                    menorPreco = produto.getPreco();
                }
            }
        }

        return produtoMaisBarato;
    }

    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque() {
        Produto produtoSelecionado = null;
        double maiorTotal = Double.MIN_VALUE;

        if (!produtoMap.isEmpty()) {
            for (Produto produto : produtoMap.values()) {
                double totalProduto = produto.getPreco() * produto.getQuantidade();
                if (totalProduto > maiorTotal) {
                    produtoSelecionado = produto;
                    maiorTotal = totalProduto;
                }
            }
        }

        return produtoSelecionado;
    }

    public static void main(String[] args) {
        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();

        estoqueProdutos.adicionarProduto(1, "Produto 1", 2, 150);
        estoqueProdutos.adicionarProduto(3, "Produto 3", 3, 250);
        estoqueProdutos.adicionarProduto(2, "Produto 2", 2, 350);
        estoqueProdutos.adicionarProduto(5, "Produto 5", 10, 50);

        estoqueProdutos.exibirProdutos();
        System.out.println("Valor total estoque: " + estoqueProdutos.calcularValorTotalEstoque());
        System.out.println("Produto mais caro: " + estoqueProdutos.obterProdutoMaisCaro());
        System.out.println("Produto mais barato: " + estoqueProdutos.obterProdutoMaisBarato());
        System.out.println("Produto de maior valor total: " + estoqueProdutos.obterProdutoMaiorQuantidadeValorTotalNoEstoque());

    }
}
