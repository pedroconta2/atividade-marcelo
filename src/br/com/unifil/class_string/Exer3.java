package br.com.unifil.class_string;

import java.util.Scanner;


public class Exer3 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Escreva uma palavra: ");
        String palavra = sc.nextLine();
        System.out.println("Escreva o caracter para substituir por N: ");
        String n = sc.next();
        String palavraNova = "";

        for (int i = 0; i < palavra.length();i++){
            if (palavra.toLowerCase().charAt(i) == n.charAt(0)){
                palavraNova = palavra.replace(palavra.charAt(i),'n');
            }
        }


        System.out.println("Nova palavra: "+ palavraNova);
    }
}
