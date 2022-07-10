package com.mac.javabasico.exercicios;

import java.util.Scanner;

/*
 * Faça um Programa que peça um número inteiro e determine se ele é par ou impar. 
 * Dica: utilize o operador módulo (resto da divisão).
 */

public class ExercB018 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite um numero inteiro: ");
		int numero = entrada.nextInt();

		int resto = numero % 2;

		if (resto == 0) {
			System.out.println("O numero " + numero + " é par!");
		} else {
			System.out.println("O numero " + numero + " NÃO é par!");
		}

	}

}
