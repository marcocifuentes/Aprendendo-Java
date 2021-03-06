package com.mac.javabasico.exercicios;

import java.util.Scanner;

/*
 * Faça um programa para uma loja de tintas. O programa deverá pedir o tamanho em metros quadrados da área a ser pintada.
 * Considere que a cobertura da tinta é de 1 litro para cada 3 metros quadrados e que a tinta é vendida em latas 
 * de 18 litros, que custam R$ 80,00. Informe ao usuário a quantidades de latas de tinta a serem compradas e o preço total.
 */

public class ExercA017 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Loja de Tintas informa:");
		System.out.println("A tinta é vendida somente em latas contendo 18 litros;");
		System.out.println("Cada lata rende uma demão de 54 m2; O arredontamento será para cima.");
		System.out.println("O valor da lata custa R$ 80,00.\n");
		//System.out.println("");
		
		System.out.print("Digite a área (m2) a ser pintada: ");
		int area = scan.nextInt();
		
		int lata = 54;
		int tinta = area / lata;

		double valorTotal = ++tinta * 80;
		
		System.out.println("Quantidades de latas: " + tinta);
		System.out.println("Valor total ----- R$: " + valorTotal);
		
	}

}
