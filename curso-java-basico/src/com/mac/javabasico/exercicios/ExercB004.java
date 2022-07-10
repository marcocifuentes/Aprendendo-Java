package com.mac.javabasico.exercicios;

/*
 * Faça um Programa que verifique se uma letra digitada é vogal ou consoante.
 */

import java.util.Scanner;

public class ExercB004 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		System.out.println("Informe uma vogal: ");

		String letra = input.next();

		/*
		 * uma forma de resolver (letra.equalsIgnoreCase("a") --> ignora se maisc ou
		 * minusculo
		 * 
		 * if (letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") ||
		 * letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o") ||
		 * letra.equalsIgnoreCase("u")) { System.out.println("é uma vogal"); } else {
		 * System.out.println("é uma consoante"); }
		 */

		/*
		 * Outra forma de fazer; (letra.length() > 1) --> verifica tamanho da string O
		 * switch case nao tem equals
		 */
		if (letra.length() > 1) {
			System.out.println("Nao é uma letra!!");
		} else {
			switch (letra) {
			case "a":
			case "e":
			case "i":
			case "o":
			case "u":
			case "A":
			case "E":
			case "I":
			case "O":
			case "U":
				System.out.println("é uma vogal");
				break;
			default:
				System.out.println("é uma consoante");

			}
		}
	}
}
