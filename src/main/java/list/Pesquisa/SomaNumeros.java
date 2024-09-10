package main.java.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<Integer> listNumerosInteiros;

    public SomaNumeros(){
        this.listNumerosInteiros = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        this.listNumerosInteiros.add(numero);
    }

    public Integer calcularSoma(){
        int total = 0;

        for(Integer numeroLista : listNumerosInteiros){
            total += numeroLista;
        }

        return total;
    }

    public Integer encontrarMaiorNumero(){
        Integer maiorNumero = null;

        for(Integer numeroLista : listNumerosInteiros){
            if(maiorNumero == null || numeroLista > maiorNumero){
                maiorNumero = numeroLista;
            }
        }
        return maiorNumero;
    }

    public Integer encontrarMenorNumero(){
        Integer menorNumero = null;

        for(Integer numeroLista : listNumerosInteiros){
            if(menorNumero == null || numeroLista < menorNumero){
                menorNumero = numeroLista;
            }
        }
        return menorNumero;
    }

    public void exibirNumeros(){
        System.out.println("Lista de numeros: " + this.listNumerosInteiros);
    }

    public static void main(String[] args){
        SomaNumeros somaNumeros = new SomaNumeros();

        somaNumeros.adicionarNumero(4);
        somaNumeros.adicionarNumero(1);
        somaNumeros.adicionarNumero(2);
        somaNumeros.adicionarNumero(-2);
        somaNumeros.adicionarNumero(0);

        somaNumeros.exibirNumeros();
        System.out.println("Soma da lista: " + somaNumeros.calcularSoma());
        System.out.println("Maior numero da lista: " + somaNumeros.encontrarMaiorNumero());
        System.out.println("Menor numero da lista: " + somaNumeros.encontrarMenorNumero());


    }
}
