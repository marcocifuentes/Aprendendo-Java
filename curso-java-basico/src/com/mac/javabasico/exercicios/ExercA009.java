package com.mac.javabasico.exercicios;

import java.util.Scanner;

/*
 * Faça um Programa que peça a temperatura em graus Fahrenheit, 
 * transforme e mostre a temperatura em graus Celsius.
 */

public class ExercA009 {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner (System.in);
		
		System.out.print("Informe temperatura em Fahrenheit: ");
		double tempFahren = scan.nextDouble();
		
		/*poderia ser assim...
		 * double tempCel = (tempFahren-32) / 1.8;
		System.out.print("Temperatura em Celsius: " + tempCel);
		*/

		//ou, simplificando assim...
		System.out.print("A temperatura em Celsius é       : " + ((tempFahren-32) / 1.8));
		
	}

}
