package hehe.Testes;

//package hehe.Testes;

import java.util.Scanner;

public class Maioridade {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe sua idade: ");
		int idade = scanner.nextInt();		
		scanner.close();
		if (idade > 18 || idade == 18) {
			System.out.println("Você pode dirigir!");
		} else {
			System.out.println("Você não pode dirigir!");
		}
	
	}

}
