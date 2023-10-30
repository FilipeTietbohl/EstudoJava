package br.com.filipe.consumo;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Leia o primeiro número: ");
        int numero1 = sc.nextInt();

        System.out.println("Leia o segundo número: ");
        int numero2 = sc.nextInt();

        if (numero1 % numero2 == 0 || numero2 % numero1 == 0) {
            System.out.println("São multiplos");
        } else {
            System.out.println("Não são multiplos");
        }
        sc.close();
    }
}
