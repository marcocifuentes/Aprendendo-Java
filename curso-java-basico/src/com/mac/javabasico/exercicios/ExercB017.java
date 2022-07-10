package com.mac.javabasico.exercicios;

import java.util.Scanner;
import java.time.Year;

/*
 * Faça um Programa que peça um número correspondente a um determinado ano e em seguida informe 
 * se este ano é ou não bissexto.
 */

public class ExercB017 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		System.out.println("Digite um ano (ex.1970): ");
		int ano = input.nextInt();

		// forma 1
		if (Year.isLeap(ano) == true) {
			System.out.println("Ano: " + ano + " é bissexto");

		} else {
			System.out.println("Ano: " + ano + " não é bissexto");

		}

		// forma 2
		// 1-São bissextos todos os anos múltiplos de 400, p.ex.: 1600, 2000, 2400,
		// 2800...
		// 2-São bissextos todos os múltiplos de 4, exceto se for múltiplo de 100 mas
		// não de 400, p.ex.: 1996, 2000, 2004.
		// 3-Não são bissextos todos os demais anos.
		if ((ano % 400 == 0) || ((ano % 4 == 0) && (ano % 100 != 0))) {
			System.out.println(ano + " é um ano Bissexto!");
		} else {
			System.out.println(ano + " não é um ano Bissexto!");
		}
	}
}
