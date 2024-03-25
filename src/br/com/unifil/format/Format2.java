package br.com.unifil.format;

public class Format2 {
    public static void main(String[] args) {
        int numero = 2;

        String numeroFormatado = String.format("%05d",numero);
        System.out.println(numeroFormatado);
    }
}
