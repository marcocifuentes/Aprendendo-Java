package com.mac.javabasico.exercicios;

import java.util.Scanner;

/*
 * Altere o programa permitindo ao usuário informar as populações e as taxas de crescimento iniciais. 
 * Valide a entrada e permita repetir a operação.
 * 
 * Supondo que a população de um país A seja da ordem de 80000 habitantes com uma taxa anual de crescimento de 3% e 
 * que a população de B seja 200000 habitantes com uma taxa de crescimento de 1.5%. Faça um programa que calcule e 
 * escreva o número de anos necessários para que a população do país A ultrapasse ou iguale a população do país B, 
 * mantidas as taxas de crescimento.
 * 
 */

public class ExercC005 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner leia = new Scanner(System.in);

		// boas práticas - definindo variaveis antes do laço do/while;
		double popA, popB, taxaPopA, taxaPopB;
		int i = 0;

		// validacao (flag)
		boolean flag = false;

		do {

			System.out.println("Digite populacao A: ");
			popA = leia.nextDouble();

			System.out.println("digite taxa crescimento populacao A: ");
			taxaPopA = leia.nextDouble();

			System.out.println("digite populacao B: ");
			popB = leia.nextDouble();

			System.out.println("digite taxa crescimento populacao B: ");
			taxaPopB = leia.nextDouble();

			do {
				if (popA <= popB) {
					popA += ((popA / 100) * taxaPopA);
					popB += ((popB / 100) * taxaPopB);
					i++;

				} else {
					System.out.println("Prazo até população A ultrapassar população B: " + i + " anos");
					System.out.println("Estimativa da população A: " + (int) popA);
					System.out.println("Estimativa da população B: " + (int) popB);

					flag = true;
				}

			} while (!flag);

			System.out.println("");
			System.out.println("Deseja refazer cálculos? (s/n) ");
			String repete = leia.next();

			if (repete.equalsIgnoreCase("s")) {
				flag = false;

			} else {
				flag = true;

			}

		} while (!flag);
	}
}
