package com.loiane.exercicios;

import java.util.Scanner;

/*
 * Tendo como dados de entrada a altura de uma pessoa, construa um algoritmo que calcule seu peso ideal, 
 * usando a seguinte fórmula: (72.7*altura) - 58
 */

public class Exerc012a {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a altura: ");
		double altura = scan.nextDouble();
		
		// declarando uma variavel com a formula
		// double pesoIdeal = (72.7 * altura) - 58;
		// System.out.println("O peso ideal: " + pesoIdeal);
		
		System.out.println("O peso ideal: " + ((72.7 * altura) - 58));
		
	}

}
