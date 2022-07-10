package com.mac.javabasico.exercicios;

import java.util.Scanner;

/*
 * Faça um programa que peça uma nota, entre zero e dez. 
 * Mostre uma mensagem caso o valor seja inválido e continue pedindo até que o usuário informe um valor válido.
 */

public class ExercC001 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner leia = new Scanner(System.in);

		// isso é chamado de flag
		boolean validandoNota = false;

		do {

			System.out.print("Digite uma nota entre 0 e 10: ");

			int nota = leia.nextInt();

			if (nota >= 0 && nota <= 10) {

				System.out.println("Valor digitado: " + nota);

				validandoNota = true;

			} else {

				System.out.println("Valor inválido!");
			}

		} while (!validandoNota);

	}

}
