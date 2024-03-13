package br.com.unifil.atividades_exercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exer2 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        try{
            System.out.println("Insira um número de início: ");
            int nIncio = scanner.nextInt();
            System.out.println("Insira um número para o fim: ");
            int nFim = scanner.nextInt();

            System.out.println("Contagem: ");
            while (nIncio<= nFim){
                System.out.println(nIncio);
                nIncio++;
            }

        }catch (InputMismatchException e){
            System.out.println("Insira um valor válido");
        }

    }
}
