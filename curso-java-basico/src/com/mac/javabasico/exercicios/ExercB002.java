package com.mac.javabasico.exercicios;

/*
 * Faça um Programa que peça um valor e mostre na tela se o valor é positivo ou negativo.
 * 
 */
import java.util.Scanner;

public class ExercB002 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite um numero (positivo/negativo):");
		int numero = scan.nextInt();
		
		if (numero < 0) {
			System.out.println("Numero Negativo: " + numero);
		} else {
			System.out.println("Numero Positivo: " + numero);
		}
		
	}

}
