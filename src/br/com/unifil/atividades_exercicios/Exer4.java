package br.com.unifil.atividades_exercicios;

public class Exer4 {
    public static void main(String[] args) {
        System.out.println("Sequência de Fibonacci: ");
        int n1 = 0;
        int n2 = 1;
        int c = 0;

        for(int i = 0;i<20;i++){
            c = n1 + n2;
            System.out.println(c);
            n1 = n2;
            n2 = c;
        }
    }
}
