package com.mac.javabasico.exercicios;
/*
 * Faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:

1-"Telefonou para a vítima?"
2-"Esteve no local do crime?"
3-"Mora perto da vítima?"
4-"Devia para a vítima?"
5-"Já trabalhou com a vítima?"

O programa deve no final emitir uma classificação sobre a participação da pessoa no crime. Se a pessoa responder positivamente a 2 
questões ela deve ser classificada como "Suspeita", entre 3 e 4 como "Cúmplice" e 5 como "Assassino". 

Caso contrário, ele será classificado como "Inocente".

 */

import java.util.Scanner;

public class ExercB020 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		System.out.println("Responda (S/N):");

		System.out.print("1)-Telefonou para a vítima? ");
		String leitura1 = input.next();

		System.out.print("2)-Esteve no local do crime? ");
		String leitura2 = input.next();

		System.out.print("3)-Mora perto da vítima? ");
		String leitura3 = input.next();

		System.out.print("4)-Devia para a vítima? ");
		String leitura4 = input.next();

		System.out.print("5)-Já trabalhou com a vítima? ");
		String leitura5 = input.next();

		System.out.println();

		int contador = 0;

		if (leitura1.equalsIgnoreCase("S")) {
			contador++;
		}

		if (leitura2.equalsIgnoreCase("S")) {
			contador++;
		}

		if (leitura3.equalsIgnoreCase("S")) {
			contador++;
		}

		if (leitura4.equalsIgnoreCase("S")) {
			contador++;
		}

		if (leitura5.equalsIgnoreCase("S")) {
			contador++;
		}

		if (contador == 2) {
			System.out.println("O investigado é: Suspeito");

		} else if (contador >= 3 && contador <= 4) {
			System.out.println("O investigado é: Cúmplice");

		} else if (contador == 5) {
			System.out.println("O investigado é: Assassino");

		} else if (contador <= 1) {
			System.out.println("O investigado é: Inocente");
		}

	}

}
