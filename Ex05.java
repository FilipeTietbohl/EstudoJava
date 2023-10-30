package br.com.filipe.consumo;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int coluna, linha, i, j;

        System.out.println("Informe o número de colunas: ");
        coluna = sc.nextInt();
        coluna = coluna + 1;

        System.out.println("Informe o número de linhas: ");
        linha = sc.nextInt();

        sc.close();

        for (i = 0; i <= coluna; i++){
            System.out.print("Insira o primeiro campo da tabela");

            for(j = 0; j <= linha; j++){
                System.out.println("(())");
            };
        };


        //System.out.println("Total: R$ ");

        
    }
}
