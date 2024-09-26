package main.java.set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {

    private Set<Tarefa> setTarefa;

    public ListaTarefas() {
        this.setTarefa = new HashSet<>();
    }

    public void adicionarTarefa(String descricao) {
        setTarefa.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        for (Tarefa tarefa : setTarefa) {
            if (tarefa.getDescricao().equalsIgnoreCase(descricao)) {
                setTarefa.remove(tarefa);
            }
        }
    }

    public void exibirTarefas() {
        System.out.println(setTarefa);
    }

    public void contarTarfas() {
        System.out.println("Numero de tarefas: " + setTarefa.size());
    }

    public void obterTarefasConcluidas() {
        Set<Tarefa> tarefasConcluidas = new HashSet<>();

        for (Tarefa tarefa : setTarefa) {
            if (tarefa.isConcluida()) {
                tarefasConcluidas.add(tarefa);
            }
        }

        System.out.println("Tarefas concluidas: " + tarefasConcluidas);
    }

    public void obterTarefasPendentes() {
        Set<Tarefa> tarefasPendentes = new HashSet<>();

        for (Tarefa tarefa : setTarefa) {
            if (!tarefa.isConcluida()) {
                tarefasPendentes.add(tarefa);
            }
        }

        System.out.println("Tarefas pendentes: " + tarefasPendentes);
    }

    public void marcarTarefaConcluida(String descricao) {
        for (Tarefa tarefa : setTarefa) {
            if (tarefa.getDescricao().equalsIgnoreCase(descricao)) {
                tarefa.setConcluida(true);
            }
        }

        obterTarefasConcluidas();
    }

    public void marcarTarefaPendente(String descricao) {
        for (Tarefa tarefa : setTarefa) {
            if (tarefa.getDescricao().equalsIgnoreCase(descricao)) {
                tarefa.setConcluida(false);
            }
        }

        obterTarefasPendentes();
    }

    public void limparListaTarefas() {
        setTarefa.clear();
        exibirTarefas();
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        listaTarefas.adicionarTarefa("Tarefa 1");
        listaTarefas.adicionarTarefa("Tarefa 3");
        listaTarefas.adicionarTarefa("Tarefa 4");
        listaTarefas.contarTarfas();

        listaTarefas.exibirTarefas();

        listaTarefas.obterTarefasConcluidas();
        listaTarefas.obterTarefasPendentes();

        listaTarefas.marcarTarefaConcluida("tarefa 1");
        listaTarefas.marcarTarefaConcluida("tarefa 3");
        listaTarefas.marcarTarefaPendente("tarefa 1");

        listaTarefas.limparListaTarefas();
    }



}
