package br.com.unifil.format;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;

public class Format3 {
    public static void main(String[] args) {
        //DecimalFormat decimalFormat = new DecimalFormat("R$ #,###.##");
        DecimalFormat decimalFormatCPF = new DecimalFormat("###.###.###-##", DecimalFormatSymbols.getInstance(Locale.ENGLISH));
        Scanner sc = new Scanner(System.in);

       // String valorFormat = decimalFormat.format(12345.6789);

        //System.out.println(valorFormat);

        System.out.println("Digite 11 numeros: ");
        String numero = sc.next();


        System.out.println(decimalFormatCPF.format(numero));

    }
}
