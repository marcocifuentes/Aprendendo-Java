package com.loiane.exerc.modulo2;

import java.util.Scanner;

/*
 * Faça um programa que calcule as raízes de uma equação do segundo grau, na forma ax2 + bx + c. 
 * O programa deverá pedir os valores de a, b e c e fazer as consistências, informando ao usuário nas seguintes situações:
   a) Se o usuário informar o valor de A igual a zero, a equação não é do segundo grau e o programa não deve pedir os demais valores, sendo encerrado;
   b) Se o delta calculado for negativo, a equação não possui raizes reais. Informe ao usuário e encerre o programa;
   c) Se o delta calculado for igual a zero a equação possui apenas uma raiz real; informe-a ao usuário;
   d) Se o delta for positivo, a equação possui duas raiz reais; informe-as ao usuário;
 */

public class Exerc16 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		// ax2 + bx + c // ex: a=2, b=-3, c=-5
		
		System.out.print("Digite o valor de a: ");
		int valorA = input.nextInt();
		
		System.out.print("Digite o valor de b: ");
		int valorB = input.nextInt();
		System.out.print("Digite o valor de c: ");
		int valorC = input.nextInt();
		
		//calculando delta (b² -4.a.c) // ex: a=2, b=-3, c=-5
		double delta = (valorB * valorB) - 4 * valorA * valorC;

		if (valorA == 0) {
		
		//} else if (delta > 0) {
			
		} else 
			System.out.println("a equacao nao é de segundo grau");
		
		
	}
}

	
