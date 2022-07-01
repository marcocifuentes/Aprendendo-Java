package com.loiane.exerc.modulo2;

/*
 * Faça um programa para a leitura de duas notas parciais de um aluno. 
 * O programa deve calcular a média alcançada por aluno e apresentar:
 *  A mensagem "Aprovado", se a média alcançada for maior ou igual a sete;
 *  A mensagem "Reprovado", se a média for menor do que sete;
 *  A mensagem "Aprovado com Distinção", se a média for igual a dez.
 */

import java.util.Scanner;

public class Exerc05 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite nota 1: ");
		double nota1 = input.nextDouble();
		System.out.println("Digite nota 2: ");
		double nota2 = input.nextDouble();
		
		double media = ((nota1 + nota2) / 2);
		
		/*
		// resolucao 1
		if (media < 10 && media >= 7) {
			System.out.println("Aprovado: " + media );
		} else if (media == 10) {
			System.out.println("Aprovado com Distinção: " + media );
		} else {
			System.out.println("Reprovado: " + media);
		}*/
		
		// resolucao 2
		if (media == 10) {
		System.out.println("Aprovado com Distinção: " + media );
		} else if (media >= 7) {
		System.out.println("Aprovado: " + media );
		} else {
		System.out.println("Reprovado: " + media);
		}
		
			
	
		}
	}

