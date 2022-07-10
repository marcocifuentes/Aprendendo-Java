package com.mac.javabasico.exercicios;

import java.util.Scanner;

/*
 * Faça um programa que pergunte o preço de três produtos e informe qual produto você deve comprar, 
 * sabendo que a decisão é sempre pelo mais barato.
 */

public class ExercB008 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner leia = new Scanner(System.in);

		System.out.println("Informe o preço do item 1: ");
		double preco1 = leia.nextDouble();

		System.out.println("Informe o preço do item 2: ");
		double preco2 = leia.nextDouble();

		System.out.println("Informe o preço do item 3: ");
		double preco3 = leia.nextDouble();

		if (preco1 < preco2 && preco1 < preco3) {
			System.out.println("Compre o item 1 (é o mais barato) " + preco1);

		} else if (preco2 < preco1 && preco2 < preco3) {
			System.out.println("Compre o item 2 (é o mais barato) " + preco2);

		} else {
			System.out.println("Compre o item 3 (é o mais barato) " + preco3);

		}
	}
}
