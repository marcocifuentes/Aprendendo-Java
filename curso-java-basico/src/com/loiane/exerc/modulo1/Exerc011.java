package com.loiane.exerc.modulo1;

import java.util.Scanner;

/*
 * Faça um Programa que peça 2 números inteiros e um número real. Calcule e mostre:
 * a. o produto do dobro do primeiro com metade do segundo .
 * b. a soma do triplo do primeiro com o terceiro.
 * c. o terceiro elevado ao cubo.
 */

public class Exerc011 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe primeiro numero inteiro: ");
		int numero1 = scan.nextInt();
		
		System.out.print("Informe segundo numero inteiro:" );
		int numero2 = scan.nextInt();
		
		System.out.print("Informe um numero real: ");
		double numero3 = scan.nextDouble();
		
		int formula1 = (2 * numero1 ) * ( numero2 / 2);
		double formula2 = ( 3 * numero1 ) + numero3;
		double formula3 = Math.pow (numero3, 3);
		
		System.out.println("Resposta a: " + formula1);	
		System.out.println("Resposta b: " + formula2);
		System.out.println("Resposta c: " + formula3);
		
	}

}
