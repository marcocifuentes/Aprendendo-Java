package com.mac.javabasico.exercicios;

import java.util.Scanner;

/*
 * Faça um Programa que peça dois números e imprima o maior deles.
 */

public class ExercB001 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o primeiro número: ");
		int numero1 = scan.nextInt();
		
		System.out.print("Digite o segundo número: ");
		int numero2 = scan.nextInt();
		
		
		if (numero1 > numero2) {
			System.out.println("O maior numero é: " + numero1);
		} else {
			System.out.println("O maior numero é: " + numero2);
		}
		
		}
		
	}

