package br.com.unifil.class_string;

import java.util.Scanner;

public class Exer1 {
    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        System.out.println("Escreva uma palavra");
        String palavra = sc.next();
        int contA = 0, contE = 0, contI = 0, contO = 0, contU = 0;

        for (int i = 0; i < palavra.toLowerCase().length(); i++) {
            if (palavra.toLowerCase().charAt(i) == 'a') {
                contA++;
            } else if (palavra.toLowerCase().charAt(i) == 'e') {
                contE++;
            } else if (palavra.toLowerCase().charAt(i) == 'i') {
                contI++;
            } else if (palavra.toLowerCase().charAt(i) == 'o') {
                contO++;
            } else if (palavra.toLowerCase().charAt(i) == 'u') {
                contU++;
            }
        }

        System.out.println("Contador:\n" +
                "Quantidade A: " + contA + "\n" +
                "Quantidade E: " + contE + "\n" +
                "Quantidade I: " + contI + "\n" +
                "Quantidade O: " + contO + "\n" +
                "Quantidade U: " + contU + "\n");

    }
}
