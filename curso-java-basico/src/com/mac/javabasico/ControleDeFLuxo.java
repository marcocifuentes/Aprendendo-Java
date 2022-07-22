package com.mac.javabasico;

import java.util.Scanner;

/*
 * Exercicio:
 * 1- usando switch: utilize uma String para exibir o numero do dia da semana.
 * 2- usando switch:  se uma variavel inteira for entre 1 e 3, exibir o texto "Certo";
 * Se for 4, exibir "Errado", se for 5 "Talvez"; demais valores exibir "Valor indefinido"
 */

public class ControleDeFLuxo {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner leia = new Scanner(System.in);

		boolean valida = false;

		do {
			System.out.print("Digite um numero ");
			int numero = leia.nextInt();

			switch (numero) {
			case (1):
				System.out.println(numero + " certo ");
				break;
			case (2):
				System.out.println(numero + " certo ");
				break;
			case (3):
				System.out.println(numero + " certo ");
				break;
			case (4):
				System.out.println(numero + " errado ");
				break;
			case (5):
				System.out.println(numero + " talvez ");
				break;
			default:
				System.out.println("Valor indefinido!");
			}
			
			System.out.println(" ");
			System.out.println("Deseja continua? (s/n) ");
			String continua = leia.next();

			if (continua.equalsIgnoreCase("n")) {
				valida = true;

			} else {

			}

		} while (!valida);

	}

}
