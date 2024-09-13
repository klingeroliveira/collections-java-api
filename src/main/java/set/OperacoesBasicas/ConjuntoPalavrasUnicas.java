package main.java.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<String> palavrasUnicas;

    public ConjuntoPalavrasUnicas(){
        palavrasUnicas = new HashSet<>();
    }

    public void adicionarPalavra(String palavra){
        palavrasUnicas.add(palavra);
    }

    public void removerPalavra(String palavra){
        palavrasUnicas.remove(palavra);
    }

    public void vericiarPalavra(String palavra){
        if(palavrasUnicas.contains(palavra)){
           System.out.println("A palavra '" + palavra + "' está na lista.");
        } else {
            System.out.println("A palavra '" + palavra + "' não está na lista.");
        }
    }

    public void exibirPalavrasUnicas(){
        System.out.println(palavrasUnicas);
    }

    public static void main(String[] args){
        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();

        conjuntoPalavrasUnicas.adicionarPalavra("João");
        conjuntoPalavrasUnicas.adicionarPalavra("Antonio");
        conjuntoPalavrasUnicas.adicionarPalavra("Marcos");
        conjuntoPalavrasUnicas.adicionarPalavra("antonio");
        conjuntoPalavrasUnicas.adicionarPalavra("João");
        conjuntoPalavrasUnicas.adicionarPalavra("Rodrigo");

        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

        conjuntoPalavrasUnicas.removerPalavra("antonio");
        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

        conjuntoPalavrasUnicas.vericiarPalavra("antonio");
        conjuntoPalavrasUnicas.vericiarPalavra("Antonio");
    }
}
