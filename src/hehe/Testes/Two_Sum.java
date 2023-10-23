package hehe.Testes;

import java.util.Scanner;

public class Two_Sum {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a,b,acao, operacao;
		
		System.out.println("Insira o primeiro valor: ");
		a = sc.nextInt();
		
		System.out.println("Insira o segundo valor: ");
		b = sc.nextInt();
		
		System.out.println("Insira qual operação deseja realizar: ");
		System.out.println("1 - Soma");
		System.out.println("2 - Subtração");
		System.out.println("3 - Multiplicação");
		System.out.println("4 - Divisão");
		operacao = sc.nextInt();
	
		
		switch (operacao) {
			case 1:
				acao = a + b;
				System.out.println(acao);
			break;
			case 2:
				acao = a - b;
				System.out.println(acao);
			break;
			case 3:
				acao = a * b;
				System.out.println(acao);
			break;
			case 4:
				if (a == 0 || b == 0) {
					System.out.println("Não é possível dividir por 0!");
				} else {
				acao = a / b;
				System.out.println(acao);}
			break;
			default:
				System.out.println("Operação inválida, programa encerrado");
			}	
	
		sc.close();
	}
}
