package com.mac.javabasico.exercicios;

/*
 * Faça um Programa que verifique se uma letra digitada é "F" ou "M". 
 * Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inválido.
 */

import java.util.Scanner;

public class ExercB003 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite uma letra (F ou M) : ");
		
		String letra = scan.next();
		
		// Quando se compara String, as opçoes sao:
		//(sexo.equalsIgnoreCase("F")) --> a letra pode ser maiuscula ou minuscula
		//(sexo.equals("F")) --> só aceita a letra maiscula
		
		if (letra.equalsIgnoreCase("F")) {
			
			System.out.println("Valor informado: " + letra);
			
		} else if (letra.equalsIgnoreCase("M")) {
			
			System.out.println("Valor informado: " + letra);
			
		} else {
			
			System.out.println("Valor inválido!!");
			
		}
		
	}

}
