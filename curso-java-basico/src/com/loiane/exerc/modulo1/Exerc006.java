package com.loiane.exerc.modulo1;

import java.util.Scanner;

/*
 * Faça um Programa que peça o raio de um círculo, calcule e mostre sua área.
 */
public class Exerc006 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		/* forma que eu realizei
		double pi = 3.14159f;
		
		System.out.print("Informe o raio do circulo: ");
		double raio = scan.nextDouble();

		double raioAoQuadrado = raio * raio;
		double area = pi * raioAoQuadrado;
		
		System.out.print("O valor da area..........: " + area);
		*/
		
		// forma apresentada na aula, usando classes utilitarias
		System.out.print("Informe o raio do circulo: ");
		double raio = scan.nextDouble();
		
		double area = Math.PI * Math.pow(raio, 2);
		
		System.out.print("O valor da area..........: " + area);

		
		
	}

}
