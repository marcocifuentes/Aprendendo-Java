package com.loiane.exercicios;

import java.util.Scanner;

/*
 * Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. 
 * Calcule e mostre o total do seu salário no referido mês.
 */

public class Exercicio08 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Valor da hora: ");
		double valorHora = scan.nextDouble();
		
		System.out.print("Numero de horas trabalhadas: ");
		double horasTrabalhadas = scan.nextDouble();
		
		System.out.println("Total salario no mes: " + valorHora * horasTrabalhadas);
		
	}

}
