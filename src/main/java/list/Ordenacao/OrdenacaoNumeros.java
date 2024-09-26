package main.java.list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    private List<Integer> listNumeros;

    public OrdenacaoNumeros() {
        this.listNumeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        this.listNumeros.add(numero);
    }

    public List<Integer> ordenarAscendente() {
        List<Integer> listAscendente = new ArrayList<>(listNumeros);
        Collections.sort(listAscendente);
        return listAscendente;
    }

    public List<Integer> ordenarDescendente() {
        List<Integer> listDescendente = new ArrayList<>(listNumeros);
        listDescendente.sort(Collections.reverseOrder());
        return listDescendente;
    }

    public static void main(String[] args) {
        OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();
        ordenacaoNumeros.adicionarNumero(22);
        ordenacaoNumeros.adicionarNumero(4);
        ordenacaoNumeros.adicionarNumero(-2);
        ordenacaoNumeros.adicionarNumero(23);
        ordenacaoNumeros.adicionarNumero(5);

        System.out.println(ordenacaoNumeros.listNumeros);
        System.out.println(ordenacaoNumeros.ordenarAscendente());
        System.out.println(ordenacaoNumeros.ordenarDescendente());
    }
}

