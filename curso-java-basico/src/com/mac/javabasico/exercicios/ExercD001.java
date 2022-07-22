package com.mac.javabasico.exercicios;

import java.util.Scanner;

/*
 * Criar um vetor A com 5 elementos inteiros. Construir um vetor B de
 * mesmo tipo e tamanho e com os "mesmos" elementos do vetor A, ou seja, B[i] = A[i].
 */

public class ExercD001 {

	public static void main(String[] args) {

		// forma simples
		/*
		int[] vetorA = new int[5];
		int[] vetorB = new int[5];
		
		int[] vetorA = {10,20,30,40,50};
		
		int[] vetorB = vetorA;
		
		for (int i=0; i<vetorB.length; i++) {
			
			System.out.println("vetorB " + vetorB[i]);
		} */
		
		
		// forma mais complexa com entrada de dados
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		System.out.print("Digite o tamanho do Vetor A: ");
		int tamanhoVetorA = scan.nextInt();
		
		System.out.println();
		
		int[] vetorA = new int[tamanhoVetorA];
		int[] vetorB = new int[vetorA.length];
		
		for (int i=0; i<vetorA.length; i++) {
			System.out.print("Digite o valor da posição " + i + " do Vetor A: ");
			vetorA[i]= scan.nextInt();
			vetorB[i]=vetorA[i];
		}
		
		System.out.println();

		System.out.print("Vetor A = ");
		for (int i=0; i<vetorA.length; i++)
		System.out.print(vetorA[i] + " ");
		
		System.out.println();
		
		System.out.print("Vetor B = ");
		for (int i=0; i<vetorB.length; i++)
		System.out.print(vetorB[i] + " ") ;
		
	}

}
