package main.java.set.OperacoesBasicas;

import java.util.Objects;

public class Convidado {
    private String nome;
    private int codigoConvite;

    public Convidado(String nome, int codigoConvite) {
        this.nome = nome;
        this.codigoConvite = codigoConvite;
    }

    public String getNome() {
        return this.nome;
    }

    public int getCodigoConvite() {
        return this.codigoConvite;
    }

    //region - equals() and hasCode(), método de comparação para inserção, bloqueia duplicidade de dados
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Convidado convidado = (Convidado) o;
        return codigoConvite == convidado.codigoConvite;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(codigoConvite);
    }
    //endregion

    @Override
    public String toString() {
        return "Convidado: {nome: '" + getNome()
                + "', codigoConvidado: " + getCodigoConvite()
                + "}\n";
    }
}
