package com.mac.javabasico.exercicios;

/*
 * Faça um Programa que peça um número e então mostre a mensagem: o número informado foi [número].
 * 
 */

import java.util.Scanner;

public class ExercA002 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		System.out.println("Informe um número:");
		int numero = scan.nextInt();
		
		System.out.println("O número informado é: " + numero);
	}

}