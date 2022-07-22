package com.mac.javabasico.exercicios;

import java.util.Scanner;

/*
 * Criar um vetor A com 15 elementos inteiros. Construir um vetor B de
mesmo tipo e tamanho, sendo que cada elemento do vetor B deverá
ser o quadrado do respectivo elemento de A, ou seja:
B[i] = A[i] * A[I].
 */
public class ExercD003 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner leia = new Scanner(System.in);

		System.out.print("Digite o tamanho do Vetor A: ");
		int tamanhoVetorA = leia.nextInt();

		int[] vetorA = new int[tamanhoVetorA];
		int[] vetorB = new int[vetorA.length];

		for (int i = 0; i < vetorA.length; i++) {
			System.out.print("Digite valor do elemento " + i + " do Vetor A: ");
			vetorA[i] = leia.nextInt();
			vetorB[i] = vetorA[i] * vetorA[i];
		}

		System.out.print("Valores do Vetor A = ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}

		System.out.println();

		System.out.print("Valores do Vetor B = ");
		for (int i = 0; i < vetorB.length; i++) {
			System.out.print(vetorB[i] + " ");
		}
	}

}
