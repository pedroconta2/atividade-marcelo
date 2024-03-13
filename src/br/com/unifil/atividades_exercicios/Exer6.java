package br.com.unifil.atividades_exercicios;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exer6 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int cont = 0;
        try {
            System.out.println("Insira 10 números diferentes: ");

            for (int i = 0; i < 10; i++) {
                arrayList.add(scanner.nextInt());
            }

            for(Integer numero: arrayList){
                if (numero % 2 ==0)
                    cont++;
            }

            System.out.println("Números pares: "+cont);
            System.out.println("Números Ímpares: " + (arrayList.size()-cont));


        } catch (InputMismatchException e) {
            System.out.println("Insira um valor válido");
        }
    }
}
