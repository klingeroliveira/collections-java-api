package main.java.set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    private Set<Aluno> setAluno;

    public GerenciadorAlunos() {
        this.setAluno = new HashSet<>();
    }

    public void adicionarAluno(String nome, Long matricula, double media) {
        setAluno.add(new Aluno(nome, matricula, media));
    }

    public void removerAluno(long matricula) {
        for (Aluno aluno : setAluno) {
            if (aluno.getMatricula() == matricula) {
                setAluno.remove(aluno);
            }
        }
    }

    public void exibirAlunosPorNome() {
        Set<Aluno> alunosPorNome = new TreeSet<>(new CompareAlunosPorNome());
        alunosPorNome.addAll(setAluno);

        System.out.println(alunosPorNome);
    }

    public void exibirAlunosPorNota() {
        Set<Aluno> alunosPorNota = new TreeSet<>(new CompareAlunosPorNota());
        alunosPorNota.addAll(setAluno);

        System.out.println(alunosPorNota);
    }

    public void exibirAlunos() {
        System.out.println(setAluno);
    }

    public static void main(String[] args) {
        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();

        gerenciadorAlunos.adicionarAluno("Aluno 3", 1234l, 89.8);
        gerenciadorAlunos.adicionarAluno("Aluno 2", 123l, 91.2);
        gerenciadorAlunos.adicionarAluno("Aluno 3", 1234l, 38);
        gerenciadorAlunos.adicionarAluno("Aluno 1", 12l, 45);

        gerenciadorAlunos.exibirAlunos();

        gerenciadorAlunos.removerAluno(12);
        gerenciadorAlunos.exibirAlunos();
        gerenciadorAlunos.exibirAlunosPorNome();
        gerenciadorAlunos.exibirAlunosPorNota();
    }
}
