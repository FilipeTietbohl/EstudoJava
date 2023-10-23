package hehe.Testes;

import java.util.Scanner;

public class Arvore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		int altura;
		
		String folha;
		
		System.out.println("Qual a altura da árvore? ");
		altura = sc.nextInt();
		System.out.println("Qual o desenho da folha? ");
		folha = sc.next();
		sc.close();
		
		for (int i=1; i<= altura; i++) {
			System.out.println("");
			for (int j=1; j<= 2*i - 1; j++){
				System.out.print(folha);
			}
			
		}
	}
}