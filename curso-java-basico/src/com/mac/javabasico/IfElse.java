package com.mac.javabasico;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		/*
		 * System.out.println("Entre com sua idade: "); int idade = scan.nextInt();
		 * 
		 * if (idade >= 18) { System.out.println("Maior de idade"); } else {
		 * System.out.println("Menor de idade"); }
		 */

		System.out.println("Digite o preco do produto:");
		double valor = scan.nextDouble();

		if (valor <= 10) {
			System.out.println("Preco barato (comprar)");
		} else if (valor > 10 && valor < 15) {
			System.out.println("Pedir desconto");
		} else if (valor >= 15 && valor < 17) {
			System.out.println("Preco caro (pesquisar mais)");
		} else {
			System.out.println("Muito caro (nao comprar)");
		}

	}

}
