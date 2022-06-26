package com.loiane.exercicios;

/*
*Faça um Programa que peça dois números e imprima a soma.
* */

import java.util.Scanner;

public class Exerc003 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe o primeiro numero: ");
		int numero1 = scan.nextInt();
		System.out.print("Informe o segundo numero.: ");
		int numero2 = scan.nextInt();
				
		int soma = (numero1 + numero2);
				
		System.out.println("Soma.....................: " + soma);
		
	}

}
