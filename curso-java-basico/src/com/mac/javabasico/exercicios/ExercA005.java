package com.mac.javabasico.exercicios;

import java.util.Scanner;

/*
 * Faça um Programa que converta metros para centímetros.
 */

public class ExercA005 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe a quantidade de metro(s): ");
		double metro = scan.nextDouble();

		double centimetro = metro * 100;
		
		System.out.print("\nA quantidade de metro(s) corresponde a: " + centimetro + " cm");
		
	}

}
