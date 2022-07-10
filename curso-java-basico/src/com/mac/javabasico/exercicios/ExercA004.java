package com.mac.javabasico.exercicios;

import java.util.Scanner;

/*
 * Faça um Programa que peça as 4 notas bimestrais e mostre a média.
 */

public class ExercA004 {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe as 4 notas bimestrais:\n");
		
		System.out.print("Digite nota 1: ");
		double nota1 = scan.nextDouble();
		
		System.out.print("Digite nota 2: ");
		double nota2 = scan.nextDouble();
		
		System.out.print("Digite nota 3: ");
		double nota3 = scan.nextDouble();
		
		System.out.print("Digite nota 4: ");
		double nota4 = scan.nextDouble();
		
		double media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		System.out.print("\n" + "Média........: " + media);

	}

}
