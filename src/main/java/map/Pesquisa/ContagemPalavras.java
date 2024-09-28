package main.java.map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {

    private Map<String, Integer> palavrasMap;

    public ContagemPalavras() {
        this.palavrasMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, Integer contagem) {
        palavrasMap.put(palavra, contagem);
    }

    public void removerPalavra(String palavra) {
        if (!palavrasMap.isEmpty()) {
            palavrasMap.remove(palavra);
        }
    }

    public void exibirContagemPalavras() {
        System.out.println(palavrasMap);
    }

    public Map<String, Integer> encontrarPalavraMaisFrequente() {
        Map<String, Integer> palavraMaisFrequente = new HashMap<>();
        Integer contagem = Integer.MIN_VALUE;
        String palavra = null;

        if (!palavrasMap.isEmpty()) {
            for (Map.Entry<String, Integer> i : palavrasMap.entrySet()) {
                if (i.getValue() > contagem) {
                    contagem = i.getValue();
                    palavra = i.getKey();
                }
            }
        }

        palavraMaisFrequente.put(palavra, contagem);

        return palavraMaisFrequente;
    }

    public static void main(String[] args) {
        ContagemPalavras contagemPalavras = new ContagemPalavras();

        contagemPalavras.adicionarPalavra("P 1", 26);
        contagemPalavras.adicionarPalavra("P 2", 14);
        contagemPalavras.adicionarPalavra("P 3", 62);
        contagemPalavras.adicionarPalavra("P 4", 213);

        contagemPalavras.exibirContagemPalavras();
        contagemPalavras.removerPalavra("P 1");
        contagemPalavras.exibirContagemPalavras();
        System.out.println(contagemPalavras.encontrarPalavraMaisFrequente());

    }
}
