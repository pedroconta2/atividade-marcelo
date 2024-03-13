package br.com.unifil.atividades_exercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exer1 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        try{
            System.out.println("Escreva um numero qualquer(pode inserir numeros reais)");
            double n = sc.nextDouble();

            for(int i = 1;i<=10;i++){
                System.out.println(n + " * " + i +" = "+(n*i));
            }

        }catch (InputMismatchException e){
            System.out.println("Insira um valor válido");
        }
    }

}
