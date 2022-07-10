package com.mac.javabasico.exercicios;

import java.util.Scanner;

/*
 * Faça um Programa que leia três números e mostre-os em ordem decrescente.
 */

public class ExercB009 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner leia = new Scanner(System.in);

		System.out.print("Digite primeiro numero: ");
		int numero1 = leia.nextInt();

		System.out.print("Digite primeiro numero: ");
		int numero2 = leia.nextInt();

		System.out.print("Digite primeiro numero: ");
		int numero3 = leia.nextInt();

		if (numero1 <= numero2 && numero1 <= numero3 && numero2 <= numero3) {
			System.out.println(numero3 + ", " + numero2 + ", " + numero1);

		} else if (numero1 <= numero2 && numero1 <= numero3 && numero3 <= numero2) {
			System.out.println(numero2 + ", " + numero3 + ", " + numero1);

		} else if (numero2 <= numero1 && numero2 <= numero3 && numero1 <= numero3) {
			System.out.println(numero3 + ", " + numero1 + ", " + numero2);

		} else if (numero2 <= numero1 && numero2 <= numero3 && numero3 <= numero1) {
			System.out.println(numero1 + ", " + numero3 + ", " + numero2);

		} else if (numero3 <= numero1 && numero3 <= numero2 && numero1 <= numero2) {
			System.out.println(numero2 + ", " + numero1 + ", " + numero3);

		} else if (numero3 <= numero1 && numero3 <= numero2 && numero2 <= numero1) {
			System.out.println(numero1 + ", " + numero2 + ", " + numero3);
		}
	}

}
