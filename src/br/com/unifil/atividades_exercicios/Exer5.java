package br.com.unifil.atividades_exercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exer5 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        double stop;

        try {
            System.out.println("Escreva vários numeros, quando quiser parar escreva 0 e" +
                    "será mostrado a soma e quantos numeros foi inserido");

            double soma = 0;
            int count = 0;
            do{
                double entrada = sc.nextDouble();
                soma += entrada;
                count++;
                stop = entrada;
            }while(stop != 0);

            System.out.println("Soma: "+soma);
            System.out.println("Contagem: "+count);

        } catch (InputMismatchException e) {
            System.out.println("Insira um valor válido");
        }
    }
}
