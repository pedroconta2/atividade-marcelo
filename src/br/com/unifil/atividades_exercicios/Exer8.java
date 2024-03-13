package br.com.unifil.atividades_exercicios;

import java.util.Scanner;

public class Exer8 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Escreva um número para calcular o fatorial: ");
        int n = sc.nextInt();
        int fatorial = n;

        for(int i = n-1; i>0;i--){
            n *= i;
        }
        System.out.println(fatorial + "! = " + n);
    }
}
