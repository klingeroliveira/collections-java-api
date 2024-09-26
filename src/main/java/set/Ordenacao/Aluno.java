package main.java.set.Ordenacao;

import java.util.Comparator;
import java.util.Objects;

public class Aluno {

    private String nome;
    private Long matricula;
    private double media;

    public Aluno(String nome, Long matricula, double media) {
        this.nome = nome;
        this.matricula = matricula;
        this.media = media;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return Objects.equals(matricula, aluno.matricula);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(matricula);
    }

    public String getNome() {
        return nome;
    }

    public Long getMatricula() {
        return matricula;
    }

    public double getMedia() {
        return media;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + getNome() + '\'' +
                ", matricula=" + getMatricula() +
                ", media=" + getMedia() +
                '}';
    }
}

class CompareAlunosPorNome implements Comparator<Aluno> {

    @Override
    public int compare(Aluno aluno1, Aluno aluno2) {
        return aluno1.getNome().compareToIgnoreCase(aluno2.getNome());
    }
}

class CompareAlunosPorNota implements Comparator<Aluno> {

    @Override
    public int compare(Aluno aluno1, Aluno aluno2) {
        return Double.compare(aluno1.getMedia(), aluno2.getMedia());
    }
}
