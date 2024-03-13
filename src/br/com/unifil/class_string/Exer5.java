package br.com.unifil.class_string;

import java.util.Scanner;

public class Exer5 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Escreva uma palavra: ");
        String palavra = sc.next();

        System.out.println("Substring que deseja verificar: ");
        String s = sc.next();

        boolean contemJava = palavra.contains(s);

        if(contemJava){
            System.out.println("A palavra :"+palavra+" contém "+s);
        } else {
            System.out.println("A palavra :"+palavra+" não contém "+s);
        }


    }
}
