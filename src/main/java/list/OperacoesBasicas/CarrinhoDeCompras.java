package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> listaItens;

    public CarrinhoDeCompras() {
        this.listaItens = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        this.listaItens.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        List<Item> listaItemsRemover = new ArrayList<>();

        for (Item item : listaItens) {
            if (item.getNome().equals(nome)) {
                listaItemsRemover.add(item);
            }
        }

        listaItens.removeAll(listaItemsRemover);
    }

    public double calcularValorTotal() {
        double total = 0.0;

        for (Item item : listaItens) {
            total = total + (item.getPreco() * item.getQuantidade());
        }

        return total;
    }

    public void exibirItens() {
        if (listaItens.size() > 0) {
            System.out.println("Itens adicionados ao carrinho: ");
            System.out.println(listaItens);
        } else {
            System.out.println("O carrinho está vazio!");
        }
    }


    public static void main(String[] args) throws Exception {

        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.adicionarItem("Mouse", 28.9, 2);
        carrinhoDeCompras.adicionarItem("Teclado", 70, 1);
        carrinhoDeCompras.adicionarItem("Mouse Pad", 29.9, 1);
        carrinhoDeCompras.adicionarItem("Headset", 100, 1);

        carrinhoDeCompras.exibirItens();
        System.out.println("Valor total do carrinho: " + carrinhoDeCompras.calcularValorTotal());

        carrinhoDeCompras.removerItem("Mouse");

        carrinhoDeCompras.exibirItens();
        System.out.println("Valor total do carrinho: " + carrinhoDeCompras.calcularValorTotal());

    }
}
