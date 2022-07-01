package com.loiane.exerc.modulo2;

/*
 * Faça um Programa que peça um valor e mostre na tela se o valor é positivo ou negativo.
 */
import java.util.Scanner;

public class Exerc02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um numero (positivo/negativo):");
		int numero = scan.nextInt();
		
		if (numero < 0) {
			System.out.println("Numero Negativo:" + numero);
		} else {
			System.out.println("Numero Positivo: " + numero);
		}
		
	}

}
