package br.com.unifil.class_string;

import java.util.Scanner;

public class Exer2 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Escreva uma palavra: ");
        String palavra = sc.next();

        String palavraInvertida = new StringBuilder(palavra).reverse().toString();

        System.out.println(palavraInvertida);
    }
}
