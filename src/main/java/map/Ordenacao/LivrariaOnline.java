package main.java.map.Ordenacao;

import java.util.*;

public class LivrariaOnline {

    private Map<String, Livro> livrosMap;

    public LivrariaOnline() {
        this.livrosMap = new HashMap<>();
    }

    public void adicionarLivro(String link, String titulo, String autor, double preco) {
        livrosMap.put(link, new Livro(titulo, autor, preco));
    }

    public void removerLivro(String tituloRemover) {
        String chaveRemover = null;

        for (Map.Entry<String, Livro> livroEntry : livrosMap.entrySet()) {
            if (livroEntry.getValue().getTitulo().equalsIgnoreCase(tituloRemover)) {
                chaveRemover = livroEntry.getKey();
            }
        }

        livrosMap.remove(chaveRemover);
    }

    public Map<String, Livro> exibirLivrosOrdenadosPorPreco() {
        List<Map.Entry<String, Livro>> livrosParaOrdenarPorPreco = new ArrayList<>(this.livrosMap.entrySet());

        //ordena a lista com o comparator criado
        livrosParaOrdenarPorPreco.sort(new CompareLivrosPorPreco());

        //LinkedHashMap mantém a ordem de inserção
        //criado para manter o padrão do tipo de objeto
        Map<String, Livro> livrosOrdenadosPorPreco = new LinkedHashMap<>();

        for (Map.Entry<String, Livro> entry : livrosParaOrdenarPorPreco) {
            livrosOrdenadosPorPreco.put(entry.getKey(), entry.getValue());
        }

        return livrosOrdenadosPorPreco;
    }

    public Map<String, Livro> pesquisarLivrosPorAutor(String autor) {
        Map<String, Livro> livrosPorAutor = new HashMap<>();

        for (Map.Entry<String, Livro> livroEntry : livrosMap.entrySet()) {
            if (livroEntry.getValue().getAutor().equalsIgnoreCase(autor)) {
                livrosPorAutor.put(livroEntry.getKey(), livroEntry.getValue());
            }
        }

        return livrosPorAutor;
    }

    public Livro obterLivroMaisCaro() {
        double maiorValor = Double.MIN_VALUE;
        String linkLivroMaiorValor = null;

        for (Map.Entry<String, Livro> livroEntry : livrosMap.entrySet()) {
            if (livroEntry.getValue().getPreco() > maiorValor) {
                maiorValor = livroEntry.getValue().getPreco();
                linkLivroMaiorValor = livroEntry.getKey();
            }
        }

        return livrosMap.get(linkLivroMaiorValor);
    }

    public Livro exibirLivroMaisBarato() {
        double menorValor = Double.MAX_VALUE;
        String linkLivroMaiorValor = null;

        for (Map.Entry<String, Livro> livroEntry : livrosMap.entrySet()) {
            if (livroEntry.getValue().getPreco() < menorValor) {
                menorValor = livroEntry.getValue().getPreco();
                linkLivroMaiorValor = livroEntry.getKey();
            }
        }

        return livrosMap.get(linkLivroMaiorValor);
    }


    public static void main(String[] args) {
        LivrariaOnline livrariaOnline = new LivrariaOnline();

        livrariaOnline.adicionarLivro("link 1", "titulo 1", "autor 1", 110);
        livrariaOnline.adicionarLivro("link 2", "titulo 2", "autor 2", 210);
        livrariaOnline.adicionarLivro("link 3", "titulo 3", "autor 1", 120);
        livrariaOnline.adicionarLivro("link 4", "titulo 4", "autor 2", 200);

        System.out.println(livrariaOnline.exibirLivrosOrdenadosPorPreco());

        livrariaOnline.removerLivro("Titulo 4");

        System.out.println(livrariaOnline.exibirLivrosOrdenadosPorPreco());

        System.out.println(livrariaOnline.pesquisarLivrosPorAutor("autor 1"));
        System.out.println(livrariaOnline.obterLivroMaisCaro());
        System.out.println(livrariaOnline.exibirLivroMaisBarato());

    }
}
