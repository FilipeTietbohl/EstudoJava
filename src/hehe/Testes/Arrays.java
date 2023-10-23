package hehe.Testes;

import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int coluna, linha;
		String simbolo = "";
		
		System.out.println("Insira o número de linhas: ");
		linha = sc.nextInt();
		System.out.println("Insira o número de colunas: ");
		coluna = sc.nextInt();
		System.out.println("Insira o símbolo: ");
		simbolo = sc.next();
		sc.close();
		
		for (int i=1; i<=linha; i++) {
			System.out.println();
			for(int j=1; j<=coluna; j++) {
				System.out.print(simbolo);
			}
		}		
	}
}
