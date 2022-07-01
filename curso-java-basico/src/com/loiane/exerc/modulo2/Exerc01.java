package com.loiane.exerc.modulo2;

import java.util.Scanner;

/*
 * Faça um Programa que peça dois números e imprima o maior deles.
 */
public class Exerc01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número: ");
		int numero1 = scan.nextInt();
		
		System.out.println("Digite o segundo número: ");
		int numero2 = scan.nextInt();
		
		
		if (numero1 > numero2) {
			System.out.println("O maior numero é: "+ numero1);
		} else {
			System.out.println("O maior numero é: " + numero2);
		}
		
		}
		
	}

