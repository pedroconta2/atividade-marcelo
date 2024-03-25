package br.com.unifil.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercicio1 {
    public static void main(String[] args) {
        //Criando a lista
        List<String> frutas = new ArrayList<>();

        //Adicionando frutas
        frutas.add("Banana");
        frutas.add("Morango");
        frutas.add("Melão");
        frutas.add("Manga");
        frutas.add("Uva");

        //Exibindo a fruta na segunda posição
        System.out.println(frutas.get(1));

        //Trocando a primeira fruta
        frutas.set(0,"Perâ");

        //Removendo a terceira fruta
        frutas.remove(2);

        //Mostrando tamanho da lista
        System.out.println("Tamanho atual: "+ frutas.size());

        //Mostrar se a lista está vazia
        if (!frutas.isEmpty()) {
            System.out.println("A lista não está vazia");
        } else {
            System.out.println("A lista está vazia: "+ frutas.toString());
        }

        //Verificando se tem banana na lista
        for (String fruta: frutas) {
            if(frutas.equals("Banana")){
                System.out.println("Banana está na lista");
            } else {
                System.out.println("Banana não está na lista");
            }
        }
        //Ordenando em ordem alfabética
        Collections.sort(frutas);
        System.out.println("Ordenando lista em ordem alfabética: " + frutas.toString());

        //Mostrando frutas com a Letra M
        List<String> frutasComM = new ArrayList<>();
        for (String fruta: frutas) {
            if(fruta.charAt(0) == 'M'){
                frutasComM.add(fruta);
            }
        }
        System.out.println("Frutas com a letra M: " + frutasComM.toString());

        //Removendo todas as frutas
        for (int i = 0; i < frutas.size(); i++) {
            frutas.remove(i);
        }

    }
}
