package com.mac.javabasico.exercicios;

import java.util.Scanner;

/*
 * Faça um Programa que calcule a área de um quadrado, em seguida mostre o dobro desta área para o usuário.
 */

public class ExercA007 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe o lado de um quadrado: ");
		double lado = scan.nextDouble();
		
		// como utilizei
		//double area = lado * lado;
		
		// forma apresentada na aula, usando classes utilitarias
		double area = Math.pow(lado, 2);
				
		System.out.println("A área do quadrado           : " + area);
		System.out.println("O dobro da área do quadrado  : " + area * 2);

	}

}
