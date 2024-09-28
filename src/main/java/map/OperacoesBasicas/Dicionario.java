package main.java.map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {

    private Map<String, String> dicionarioMap;

    public Dicionario() {
        this.dicionarioMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao) {
        adicionarPalavra(palavra, definicao, false);
    }

    public void adicionarPalavra(String palavra, String definicao, boolean atualizaDefinicao) {

        boolean palavraExiste = pesquisarPorPalavra(palavra) != null;

        if (!palavraExiste || atualizaDefinicao) {
            dicionarioMap.put(palavra, definicao);
            System.out.println("Palavra '" + palavra + "' adicionada/atualizada!");
        } else {
            System.out.println("Palavra já existe!");
        }
    }

    public void removerPalavra(String palavra) {
        if (!dicionarioMap.isEmpty()) {
            if (pesquisarPorPalavra(palavra) != null) {
                dicionarioMap.remove(palavra);
                System.out.println("Palavra '" + palavra + "' removida!");
            } else {
                System.out.println("Palavra '" + palavra + "' não localizada!");
            }
        } else {
            System.out.println("Lista vazia!");
        }
    }

    public void exibirPalavras() {
        System.out.println(dicionarioMap);
    }

    public String pesquisarPorPalavra(String palavra) {
        return dicionarioMap.isEmpty() ? null : dicionarioMap.get(palavra);
    }

    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();

        dicionario.removerPalavra("Mouse");

        dicionario.adicionarPalavra("MouseInfo", "dispositivo de entrada dotado de um a três botões, que repousa em uma superfície plana sobre a qual pode ser deslocado, e que, ao ser movimentado, provoca deslocamento análogo de um cursor na tela");
        dicionario.adicionarPalavra("Mouse", "tradução do inglês: Rato");
        dicionario.adicionarPalavra("MouseInfo", "O mouse permite ao usuário comandar a execução de determinadas ações, quer movendo o cursor até ícones, regiões da tela ou entradas de menus que correspondam às ações desejadas, quer clicando um dos botões.");

        System.out.println("Definição: " + dicionario.pesquisarPorPalavra("Mouse"));

        dicionario.exibirPalavras();

        dicionario.adicionarPalavra("MouseInfo", "O mouse permite ao usuário comandar a execução de determinadas ações, quer movendo o cursor até ícones, regiões da tela ou entradas de menus que correspondam às ações desejadas, quer clicando um dos botões.", true);

        dicionario.removerPalavra("mouse");
        dicionario.removerPalavra("Mouse");

        dicionario.exibirPalavras();


    }

    @Override
    public String toString() {
        return "Dicionario{" +
                "dicionarioMap=" + dicionarioMap +
                "}\n";
    }
}
