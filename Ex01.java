package br.com.filipe.consumo;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira um número: ");
        int numero = sc.nextInt();
        
        if (numero < 0 ){
            System.out.println("O número é negativo");
        } else {
            System.out.println("O número é positivo");
        }
        
        sc.close();
    }

}
