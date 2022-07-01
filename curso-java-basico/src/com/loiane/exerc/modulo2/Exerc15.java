package com.loiane.exerc.modulo2;

import java.util.Scanner;

/*
 * Faça um Programa que peça os 3 lados de um triângulo. O programa deverá informar se os valores podem ser um triângulo. 
 * Indique, caso os lados formem um triângulo, se o mesmo é: equilátero, isósceles ou escaleno.
Dicas:
Três lados formam um triângulo quando a soma de quaisquer dois lados for maior que o terceiro;
Triângulo Equilátero: três lados iguais;
Triângulo Isósceles: quaisquer dois lados iguais;
Triângulo Escaleno: três lados diferentes;
 */

public class Exerc15 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite valor do triangulo, lado 1: ");
		int lado1 = input.nextInt();
		
		System.out.println("Digite valor do triangulo, lado 2: ");
		int lado2 = input.nextInt();
		
		System.out.println("Digite valor do triangulo, lado 3: ");
		int lado3 = input.nextInt();
		
		if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
			
			if (lado1 == lado2 && lado1 == lado3 && lado3 == lado2) {
				System.out.println("Triangulo Equilátero"); 
			} else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
				System.out.println("Triangulo Isóceles"); 
			} else if (lado1 != lado2 && lado1 != lado3 && lado2 != lado3) {
				System.out.println("Triangulo Escaleno"); 
			}
			
		} else System.out.println("Nao é um triangulo");
		
	}

}
