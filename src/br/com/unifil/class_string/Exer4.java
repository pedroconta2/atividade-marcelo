package br.com.unifil.class_string;

import java.util.Scanner;

public class Exer4 {
    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        System.out.println("Escreva uma palavra");
        String palavra = sc.next();

        System.out.println("Escreva um caracter para verificar quantas vezes ele aparece: ");
        String c = sc.next();

        int contString = 0;

        for (int i = 0; i < palavra.toLowerCase().length(); i++) {
            if (palavra.toLowerCase().charAt(i) == c.charAt(0)) {
                contString++;
            }
        }

        System.out.println("Contador:\n" +
                "Quantidade "+c+": " + contString);

    }
}
