package br.com.unifil.format;

import java.util.Scanner;

public class Format {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nome: ");
        String nome = sc.next();
        System.out.println("Idade: ");
        int idade = sc.nextInt();

        System.out.println();
        System.out.format("Nome: |%s|, Idade: %d%n",nome,idade);

        System.out.println("Escreva um número com casas decimais: ");
        double numero = sc.nextDouble();
        System.out.println();
        System.out.format("Numero: %.3f%n", numero);
        System.out.format("Numero em reais: R$%.2f%n", numero);
    }
}
