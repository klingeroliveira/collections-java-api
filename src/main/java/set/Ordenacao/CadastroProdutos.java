package main.java.set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {

    Set<Produto> setProduto;

    public CadastroProdutos(){
        setProduto = new HashSet<>();
    }

    public void adicionarProduto(String nome,
                                 long codigo,
                                 double preco,
                                 int quantidade) {
        setProduto.add(new Produto(nome, codigo, preco, quantidade));
    }

    public void exibirProdutosPorNome() {
        Set<Produto> setProdutoNome = new TreeSet<>(setProduto);
        System.out.println(setProdutoNome);
    }

    public void exibirProdutosPorPreco() {
        Set<Produto> setProdutoPreco = new TreeSet<>(new OrdenarProdutoPorPreco());
        setProdutoPreco.addAll(setProduto);
        System.out.println(setProdutoPreco);
    }

    public static void main(String[] args){
        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        cadastroProdutos.adicionarProduto("CARLOS1", 3l, 33.9, 2);
        cadastroProdutos.adicionarProduto("CARLOS2", 4l, 3, 2);
        cadastroProdutos.adicionarProduto("CARLOS3", 6l, 9, 2);
        cadastroProdutos.adicionarProduto("CARLOS4", 3l, 33, 2);

        cadastroProdutos.exibirProdutosPorNome();
        cadastroProdutos.exibirProdutosPorPreco();

    }
}
