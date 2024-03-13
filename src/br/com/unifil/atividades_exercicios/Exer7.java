package br.com.unifil.atividades_exercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class Exer7 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        double maior = 0;
        double menor = 0;
        ArrayList<Double> arrayList = new ArrayList<>();
        System.out.println("Escreva 10 números e você será informado qual será o menor " +
                "e o maior numero");

        for (int i = 0; i < 10; i++){
            arrayList.add(sc.nextDouble());
            menor = arrayList.get(0);

            if (arrayList.get(i) > maior){
                maior = arrayList.get(i);
            }

            if(arrayList.get(i) < menor){
                menor = arrayList.get(i);
            }
        }

        System.out.println("Maior numero: "+ maior);
        System.out.println("Menor numero: "+ menor);
    }
}
