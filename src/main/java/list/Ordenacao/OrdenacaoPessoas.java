package main.java.list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {

    private List<Pessoa> listPessoa;

    public OrdenacaoPessoas() {
        this.listPessoa = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura) {
        this.listPessoa.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenaPorIdade() {
        List<Pessoa> pessoaPorIdade = new ArrayList<>(listPessoa);
        Collections.sort(pessoaPorIdade);
        return pessoaPorIdade;
    }

    public List<Pessoa> ordenaPodAltura() {
        List<Pessoa> pessoaPorAltura = new ArrayList<>(listPessoa);
        pessoaPorAltura.sort(new OrdenarPorAltura());
        return pessoaPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();

        ordenacaoPessoas.adicionarPessoa("Joao", 23, 1.89);
        ordenacaoPessoas.adicionarPessoa("Maria", 32, 1.60);
        ordenacaoPessoas.adicionarPessoa("Antonio", 33, 1.90);
        ordenacaoPessoas.adicionarPessoa("Marcos", 24, 1.79);
        ordenacaoPessoas.adicionarPessoa("Pedro", 19, 1.67);

        System.out.println(ordenacaoPessoas.listPessoa);
        System.out.println(ordenacaoPessoas.ordenaPorIdade());
        System.out.println(ordenacaoPessoas.ordenaPodAltura());
    }
}
