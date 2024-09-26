package main.java.set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> contatoSet;

    public AgendaContatos(){
        contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int telefone){
        contatoSet.add(new Contato(nome, telefone));
    }

    public void exibirCotnatos(){
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatoPorNome = new HashSet<>();

        for(Contato contato : contatoSet){
            if(contato.getNome().toUpperCase().contains(nome.toUpperCase())){
                contatoPorNome.add(contato);
            }
        }

        return contatoPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoTelefone){
        Contato contatoAtualizado = null;

        for(Contato contato : contatoSet){
            if(contato.getNome().toUpperCase().contains(nome.toUpperCase())){
                contato.setTelefone(novoTelefone);
                contatoAtualizado = contato;
                break;
            }
        }

        return contatoAtualizado;
    }

    public static void main(String[] args){
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Sara Sabatini", 1235);
        agendaContatos.adicionarContato("Sara", 12356);
        agendaContatos.adicionarContato("Sara", 12356);
        agendaContatos.adicionarContato("Sara2 sabatini", 1232);
        agendaContatos.adicionarContato("Sara3 teodoro", 1233);
        agendaContatos.adicionarContato("Sara4 TEODORO", 1234);

        agendaContatos.exibirCotnatos();

        System.out.println(agendaContatos.pesquisarPorNome("sara"));
        System.out.println(agendaContatos.pesquisarPorNome("sabat"));
        System.out.println(agendaContatos.pesquisarPorNome("teo"));
    }
}
