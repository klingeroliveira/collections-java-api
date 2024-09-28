package main.java.map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {

    private Map<String, Integer> contatoMap;

    public AgendaContatos() {
        this.contatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone) {
        if (pesquisarPorNome(nome) == null) {
            contatoMap.put(nome, telefone);
            System.out.println("Contato adicionado: " + nome + ' ' + telefone);
        } else {
            System.out.println("Contato '" + nome + "' já existe na lista, não adicionado!");
        }

    }

    public void removerContato(String nome) {
        if (!contatoMap.isEmpty()) {
            if (pesquisarPorNome(nome) != null) {
                contatoMap.remove(nome);
                System.out.println("Contato removido: " + nome);
            } else {
                System.out.println("Contato '" + nome + "' não localizado!");
            }
        } else {
            System.out.println("A lista está vazia!");
        }

    }

    public void exibirContatos() {
        System.out.println(contatoMap);
    }

    public Integer pesquisarPorNome(String nome) {
        return contatoMap.isEmpty() ? null : contatoMap.get(nome);
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.removerContato("sara3");

        agendaContatos.adicionarContato("Sara", 999214968);
        agendaContatos.adicionarContato("Sara", 199214968);
        agendaContatos.adicionarContato("Sara2", 299214968);
        agendaContatos.adicionarContato("Sara3", 399214968);

        agendaContatos.exibirContatos();

        agendaContatos.removerContato("sara3");
        agendaContatos.removerContato("Sara3");

        agendaContatos.exibirContatos();

        System.out.println("Telefone : " + agendaContatos.pesquisarPorNome("Sara2"));
    }

    @Override
    public String toString() {
        return "AgendaContatos{" +
                "contatoMap=" + contatoMap +
                "}\n";
    }
}
