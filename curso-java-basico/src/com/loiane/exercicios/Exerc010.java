package com.loiane.exercicios;

import java.util.Scanner;

/*
 * Faça um Programa que peça a temperatura em graus Celsius, 
 * transforme e mostre em graus Fahrenheit.
 */

public class Exerc010 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe a temepratura em Celsius: ");
		double tempCels = scan.nextDouble();
		
		//forma de uso com variavel
		//double tempFhar = (tempCels * 1.8) + 32;
		
		//declarando formula direto na saida da tela
		System.out.println("Valor da temperatura em Fharenheit: " + ((tempCels * 1.8) + 32));
		
	}

}
