package com.mac.javabasico.exercicios;

import java.util.Scanner;

/*
 * Tendo como dado de entrada a altura (h) de uma pessoa, construa um algoritmo que calcule seu peso ideal, 
 * utilizando as seguintes fórmulas:
 * Para homens: (72.7*h) - 58
 * Para mulheres: (62.1*h) - 44.7
 */

public class ExercA013 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		System.out.print("Digite altura: ");
		double altura = scan.nextDouble();

		double pesoHomem = (72.7 * altura) - 58;
		double pesoMulher = (62.1 * altura) - 44.7;

		System.out.print("Digite o sexo (1)Masc/(2)Fem): ");
		int sexo = scan.nextInt();

		switch (sexo) {

		case 1: System.out.println("Peso ideal  Homem: " + pesoHomem); break;

		default: System.out.println("Peso ideal Mulher: " + pesoMulher); break;
		
		}

	}

}
