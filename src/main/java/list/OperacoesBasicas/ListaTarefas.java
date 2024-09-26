package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    private List<Tarefa> listaTarefas;

    public ListaTarefas() {
        listaTarefas = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        listaTarefas.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        List<Tarefa> listTarefasRemover = new ArrayList<>();

        for (Tarefa tarefa : listaTarefas) {
            if (tarefa.getDescricao().equalsIgnoreCase(descricao)) {
                listTarefasRemover.add(tarefa);
            }
        }

        listaTarefas.removeAll(listTarefasRemover);
    }

    public int obterNumeroTotalTarefa() {

        return listaTarefas.size();
    }

    public void obterDescricaoTarefas() {
        System.out.println(listaTarefas);
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        listaTarefas.adicionarTarefa("Tarefa 1");
        listaTarefas.adicionarTarefa("Tarefa 2");
        listaTarefas.adicionarTarefa("Tarefa 2");
        listaTarefas.adicionarTarefa("Tarefa 3");

        System.out.println("Tarefas adicionadas: ");
        listaTarefas.obterDescricaoTarefas();

        System.out.println("Número total de tarefas: " + listaTarefas.obterNumeroTotalTarefa());

        listaTarefas.removerTarefa("TArefa 2");

        System.out.println("Tarefas adicionadas: ");
        listaTarefas.obterDescricaoTarefas();

        System.out.println("Número total de tarefas: " + listaTarefas.obterNumeroTotalTarefa());

    }


}
