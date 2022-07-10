package com.mac.javabasico.exercicios;

/*
 * Faça um Programa que peça dois números e imprima a soma. 
 */

import java.util.Scanner;

public class ExercA003 {

	public static void main(String[] args) {

			@SuppressWarnings("resource")
			Scanner scan = new Scanner(System.in);
			
			System.out.print("Informe o primeiro número: ");
			int numero1 = scan.nextInt();
			
			System.out.print("Informe o segundo número.: ");
			int numero2 = scan.nextInt();
					
			int soma = (numero1 + numero2);
					
			System.out.println("\n" + "Soma.....................: " + soma); // "\n" - quebra de linha
			
		}
		
	}