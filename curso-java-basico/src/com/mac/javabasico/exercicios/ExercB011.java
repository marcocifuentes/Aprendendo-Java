package com.mac.javabasico.exercicios;

import java.util.Scanner;

/*
   As Organizações Tabajara resolveram dar um aumento de salário aos seus colaboradores e lhe contraram para desenvolver 
   o programa que calculará os reajustes.
   Faça um programa que recebe o salário de um colaborador e o reajuste segundo o seguinte critério, baseado no salário atual:
   salários até R$ 280,00 (incluindo) : aumento de 20%
   salários entre R$ 280,00 e R$ 700,00 : aumento de 15%
   salários entre R$ 700,00 e R$ 1500,00 : aumento de 10%
   salários de R$ 1500,00 em diante : aumento de 5% 
   Após o aumento ser realizado, informe na tela:
   o salário antes do reajuste;
   o percentual de aumento aplicado;
   o valor do aumento;
   o novo salário, após o aumento.
 */

public class ExercB011 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		System.out.println("Digite o salario atual do colaborador: ");
		double salario = input.nextDouble();

		/*
		 * codigo enorme if (salario <= 280) { double aumento = salario * 0.2;
		 * System.out.println("Salario atual: " + salario);
		 * System.out.println("Percentual de aumento: " + "20%");
		 * System.out.println("Valor do aumento: " + aumento);
		 * System.out.println("Salario reajustado: " + (salario + aumento));
		 * 
		 * } else if (salario > 280 && salario < 700) { double aumento = salario * 0.15;
		 * System.out.println("Salario atual: " + salario);
		 * System.out.println("Percentual de aumento: " + "15%");
		 * System.out.println("Valor do aumento: " + aumento);
		 * System.out.println("Salario reajustado: " + (salario + aumento));
		 * 
		 * } else if (salario >= 700 && salario < 1500) { double aumento = salario *
		 * 0.10; System.out.println("Salario atual: " + salario);
		 * System.out.println("Percentual de aumento: " + "10%");
		 * System.out.println("Valor do aumento: " + aumento);
		 * System.out.println("Salario reajustado: " + (salario + aumento)); } else {
		 * double aumento = salario * 0.05; System.out.println("Salario atual: " +
		 * salario); System.out.println("Percentual de aumento: " + "5%");
		 * System.out.println("Valor do aumento: " + aumento);
		 * System.out.println("Salario reajustado: " + (salario + aumento)); }
		 */

		// codigo mais limpo
		//
		double percentualAumento;

		if (salario <= 280) {
			percentualAumento = 0.2;
		} else if (salario > 280 && salario < 700) {
			percentualAumento = 0.15;
		} else if (salario >= 700 && salario < 1500) {
			percentualAumento = 0.10;
		} else {
			percentualAumento = 0.05;
		}

		double aumento = salario * percentualAumento;

		System.out.println("Salario atual: " + salario);
		System.out.println("Percentual de aumento: " + percentualAumento * 100);
		System.out.println("Valor do aumento: " + aumento);
		System.out.println("Salario reajustado: " + (salario + aumento));

	}

}
