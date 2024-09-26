package main.java.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> setConvidado;

    public ConjuntoConvidados() {
        setConvidado = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite) {
        setConvidado.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite) {
        Convidado convidadoRemover = null;

        for (Convidado convidado : setConvidado) {
            if (convidado.getCodigoConvite() == codigoConvite) {
                convidadoRemover = convidado;
            }
        }

        setConvidado.remove(convidadoRemover);
    }

    public int contarConvidados() {
        return setConvidado.size();
    }

    public void exibirConvidados() {
        System.out.println(setConvidado);
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

        conjuntoConvidados.adicionarConvidado("Maria", 123);
        conjuntoConvidados.adicionarConvidado("Antonio", 123);
        conjuntoConvidados.adicionarConvidado("Marcos", 124);
        conjuntoConvidados.adicionarConvidado("Sara", 125);
        conjuntoConvidados.adicionarConvidado("João", 126);

        conjuntoConvidados.exibirConvidados();
        System.out.println("Numero de convidados: " + conjuntoConvidados.contarConvidados());

        conjuntoConvidados.removerConvidadoPorCodigoConvite(125);

        conjuntoConvidados.exibirConvidados();
        System.out.println("Numero de convidados: " + conjuntoConvidados.contarConvidados());

    }
}
