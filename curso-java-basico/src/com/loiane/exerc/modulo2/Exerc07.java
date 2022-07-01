package com.loiane.exerc.modulo2;

import java.util.Scanner;

/*
 * Faça um Programa que leia três números e mostre o maior e o menor deles.
 */

public class Exerc07 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite numero 1: ");
		int numero1 = leia.nextInt();
		
		System.out.println("Digite numero 2: ");
		int numero2 = leia.nextInt();
		
		System.out.println("Digite numero 3: ");
		int numero3 = leia.nextInt();
		
		if (numero1 > numero2 && numero1 > numero3) {
			System.out.println("O maior numero é: " + numero1);
			
		} else if (numero2 > numero1 && numero2 > numero3) {
			System.out.println("O maior numero é: " + numero2);

		} else {
			System.out.println("O maior numero é: " + numero3);
		}
		
		
		if (numero1 < numero2 && numero1 < numero3) {
			System.out.println("O menor numero é: " + numero1);
			
		} else if (numero2 < numero1 && numero2 < numero3) {
			System.out.println("O menor numero é: " + numero2);

		} else {
			System.out.println("O menor numero é: " + numero3);
		}
	}

}
