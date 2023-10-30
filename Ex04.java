package br.com.filipe.consumo;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira a hora inicial: ");
        int hora_inicial = sc.nextInt();

        System.out.println("Insira a hora final: ");
        int hora_final = sc.nextInt();

        int duracao;

        if (hora_final > hora_inicial){
            duracao = hora_final - hora_inicial;

        } else {
            duracao = 24 - hora_inicial + hora_final;
        }

        System.out.println("O jogo durou " + duracao + " horas");

        sc.close();
    }
}
