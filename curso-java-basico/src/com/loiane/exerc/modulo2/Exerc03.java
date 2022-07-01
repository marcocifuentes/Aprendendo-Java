package com.loiane.exerc.modulo2;

/*
 * Faça um Programa que verifique se uma letra digitada é "F" ou "M". 
 * Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inválido.
 */

import java.util.Scanner;

public class Exerc03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("DIgite uma letra (F ou M) : ");
		
		String sexo = scan.next();
		
		// Quando se compara String, as opçoes sao:
		//(sexo.equalsIgnoreCase("F")) --> a letra pode ser maiuscula ou minuscula
		//(sexo.equals("F")) --> só aceita a letra maiscula
		
		if (sexo.equalsIgnoreCase("F")) {
			
			System.out.println("Sexo feminino: " + sexo);
			
		} else if (sexo.equalsIgnoreCase("M")) {
			
			System.out.println("Sexo masculino: " + sexo);
			
		} else {
			
			System.out.println("Sexo invalido");
			
		}
		
	}

}
