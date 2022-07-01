package com.loiane.exerc.modulo1;

import java.util.Scanner;

/*
 * Faça um Programa que converta metros para centímetros.
 */

public class Exerc005 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe o valor do metro: ");
		double metro = scan.nextDouble();

		double centimetro = metro * 100;
		
		System.out.println("");
		System.out.print("O valor do metro corresponde a: " + centimetro + " cm");
		
		
	}

}
