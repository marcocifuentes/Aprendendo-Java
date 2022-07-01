package com.loiane.exerc.modulo2;

import java.util.Scanner;

/*
 * Faça um Programa que leia três números e mostre o maior deles.
 */

public class Exerc06 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite numero 1: ");
		double numero1 = leia.nextDouble();
		
		System.out.println("Digite numero 2: ");
		double numero2 = leia.nextDouble();
		
		System.out.println("Digite numero 3: ");
		double numero3 = leia.nextDouble();
		
		if ((numero1 > numero2) && (numero1 > numero3)) {
			System.out.println("O maior numero é: " + numero1);
			
		} else if ((numero2 > numero1) && (numero2 > numero3)) {
			System.out.println("O maior numero é: " + numero2);

		} else {
			System.out.println("O maior numero é: " + numero3);
		}
	}

}
