package hehe.Testes;

import java.util.Scanner;

public class Repeticao {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numeros, resposta;
		
		System.out.println("Quantas linhas desejas?");
		resposta = sc.nextInt();
		
		switch(resposta) {
				case 0: System.out.println("Escreve direito ai, para pô!");
					break;
				case 1: System.out.println("Insira o número e aperte Enter");
					break;
				default: System.out.println("Insira " + resposta + " números e aperte Enter a cada número digitado");
		}
		//sc.close();
		
		System.out.println("Insira números e aperte Enter a cada número digitado");
		numeros = sc.nextInt();
		sc.close();
		
		System.out.println(numeros);
		
		/*for(i = 0, ) {
			
		};*/
	
}
}
