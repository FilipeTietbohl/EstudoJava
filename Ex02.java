package br.com.filipe.consumo;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite um número: ");
        int numero = sc.nextInt();

        if (numero %2 == 0){
            System.out.println("O numero é par");
        } else {
            System.out.println("O numero é impar");
        }

        sc.close();
    }
}
