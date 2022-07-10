package com.mac.javabasico.exercicios;

import java.util.Scanner;

/*
 * Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. 
 * Calcule e mostre o total do seu salário no referido mês.
 */

public class ExercA008 {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o valor da hora trabalhada : ");
		double valorHora = scan.nextDouble();
		
		System.out.print("Número de horas trabalhadas no mês: ");
		double horasTrabalhadas = scan.nextDouble();
		
		System.out.println("Total do salário no mês           : " + valorHora * horasTrabalhadas);
		
	}

}
