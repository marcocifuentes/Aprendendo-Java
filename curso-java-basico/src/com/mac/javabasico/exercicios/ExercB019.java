package com.mac.javabasico.exercicios;

import java.util.Scanner;

/*
 * Faça um Programa que leia 2 números e em seguida pergunte ao usuário qual operação ele deseja realizar. 
 * O resultado da operação deve ser acompanhado de uma frase que diga se o número é:
   a- par ou ímpar;
   b- positivo ou negativo;
   c- inteiro ou decimal.
 */

public class ExercB019 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		System.out.print("Digite numero 1: ");
		int numero1 = input.nextInt();

		System.out.print("Digite numero 2: ");
		int numero2 = input.nextInt();

		/*
		 * Opção 1 - com menu System.out.println("Digite a operacao:");
		 * 
		 * System.out.println("(1) adicao"); System.out.println("(2) subtracao");
		 * System.out.println("(3) divisao"); System.out.println("(4) multiplicacao");
		 * 
		 * int opcao = input.nextInt();
		 * 
		 * int calc = 0;
		 * 
		 * boolean validacao = true; // interrompe o programa se a opcao for diferente
		 * do menu (1 - 4)
		 * 
		 * switch (opcao) { case (1): calc = numero1 + numero2; break; case (2): calc =
		 * numero1 - numero2; break; case (3): calc = numero1 / numero2; break; case
		 * (4): calc = numero1 * numero2; break; default:
		 * System.out.println("Opção inválida!"); validacao = false; }
		 * 
		 * if (validacao) { System.out.println("Resultado: " + calc ); if (calc >= 0) {
		 * System.out.println("Número positivo"); } else {
		 * System.out.println("Número negativo"); }
		 * 
		 * if (calc % 2 == 0) { System.out.println("Par"); } else {
		 * System.out.println("Impar"); }
		 * 
		 * }
		 */

		// opcao 2 - escolhendo operador matemático
		System.out.print("Digite a operacao ( + - / *) ");

		String opcao = input.next();

		int calc = 0;

		boolean validacao = true;
		// Flag! interrompe o programa se a opcao for diferente do menu (1 - 4)

		switch (opcao) {
		case "+":
			calc = numero1 + numero2;
			break;
		case "-":
			calc = numero1 - numero2;
			break;
		case "/":
			calc = numero1 / numero2;
			break;
		case "*":
			calc = numero1 * numero2;
			break;
		default:
			System.out.println("Opção inválida!");
			validacao = false;
		}

		if (validacao) {
			System.out.println("Resultado: " + calc);
			if (calc >= 0) {
				System.out.println("Número positivo");
			} else {
				System.out.println("Número negativo");
			}

			if (calc % 2 == 0) {
				System.out.println("Par");
			} else {
				System.out.println("Impar");
			}

		}
	}
}
