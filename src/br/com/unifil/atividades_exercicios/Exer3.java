package br.com.unifil.atividades_exercicios;

import java.util.Scanner;

public class Exer3 {
    static Scanner sc = new Scanner(System.in);
    static String nome;

    public static void main(String[] args) {

        System.out.println("Escreva um nome qualquer. Se quiser parar de escrever, escreva fim:");

        do {
            nome = sc.next();
            System.out.println(nome);

        } while (!nome.toLowerCase().equals("fim"));

    }
}
