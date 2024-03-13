package br.com.unifil.atividades_exercicios;

import java.util.Scanner;

public class Exer10 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Escolha um ano qualquer: ");
        int ano = sc.nextInt();
        int anoQueVem = ano+1;
        int anoPassado= ano-1;

        System.out.println("O ano passado foi "+anoPassado+", sendo que o ano que vem será "+anoQueVem+", este ano é "+ano+"\n"+
                "O ano que vem será "+anoQueVem+", o ano passado foi "+anoPassado+" e este ano foi "+ano+".\n"+
                "Este ano é "+ano+", o ano passado foi "+anoPassado+" e ano que vem será "+anoQueVem+".");
    }
}
