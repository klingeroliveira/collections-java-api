package main.java.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> listaLivros;

    public CatalogoLivros(){
        this.listaLivros = new ArrayList<>();
    }

    public void adicionarLivros(String titulo, String autor, int anoPublicacao){
        this.listaLivros.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> listaLivroAutor = new ArrayList<>();

        for(Livro livro : listaLivros){
            if (livro.getAutor().equalsIgnoreCase(autor)){
                listaLivroAutor.add(livro);
            }
        }

        return listaLivroAutor;
    }

    public List<Livro> pesuisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> listaLivroAno = new ArrayList<>();

        for(Livro livro : listaLivros){
            if(livro.getAnoPublicacao() >= anoInicial
                && livro.getAnoPublicacao() <= anoFinal){
                listaLivroAno.add(livro);
            }
        }

        return listaLivroAno;
    }

    public Livro pesquisarLivroPorTitulo(String titulo){
        for(Livro livro : listaLivros){
            if(livro.getTitulo().equalsIgnoreCase(titulo)){
                return livro;
            }
        }
        return null;
    }

    public static void main(String[] args){
        CatalogoLivros catalogoLivros = new CatalogoLivros();

        catalogoLivros.adicionarLivros("Livro 1", "Autor 1", 2000);
        catalogoLivros.adicionarLivros("Livro 2", "Autor 2", 2001);
        catalogoLivros.adicionarLivros("Livro 1", "Autor 2", 2000);
        catalogoLivros.adicionarLivros("Livro 3", "Autor 3", 2003);
        catalogoLivros.adicionarLivros("Livro 4", "Autor 4", 2004);

        System.out.println(catalogoLivros.listaLivros);
        System.out.println(catalogoLivros.pesquisarPorAutor("Autor 2"));
        System.out.println(catalogoLivros.pesuisarPorIntervaloAnos(2000, 2002));
        System.out.println(catalogoLivros.pesquisarLivroPorTitulo("Livro 1"));
        System.out.println(catalogoLivros.pesquisarLivroPorTitulo("Livro 3"));
    }
}
