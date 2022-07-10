package com.mac.javabasico.exercicios;

/*
 * Faça um programa para o cálculo de uma folha de pagamento, sabendo que os descontos são do Imposto de Renda, que depende do salário bruto 
 * (conforme tabela abaixo) e 3% para o Sindicato e que o FGTS corresponde a 11% do Salário Bruto, mas não é descontado (é a empresa que deposita). 
 * O Salário Líquido corresponde ao Salário Bruto menos os descontos. O programa deverá pedir ao usuário o valor da sua hora e a quantidade 
 * de horas trabalhadas no mês.
 * Salário Bruto até 900 (inclusive) - isento
 * Salário Bruto até 1500 (inclusive) - desconto de 5%
 * Salário Bruto até 2500 (inclusive) - desconto de 10%
 * Salário Bruto acima de 2500 - desconto de 20%
 */

import java.util.Scanner;

public class ExercB012 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);

		System.out.print("Informe o valor recebido por hora: ");
		double horaValor = entrada.nextDouble();

		System.out.print("Informe quantidade de horas trabalhadas no mês: ");
		int horaTrabalhadas = entrada.nextInt();

		double salarioBruto = horaValor * horaTrabalhadas;
		double tabelaImpostoRenda = 0;

		if (salarioBruto > 900 && salarioBruto <= 1500) {
			tabelaImpostoRenda = 0.05;
		} else if (salarioBruto > 1500 && salarioBruto <= 2500) {
			tabelaImpostoRenda = 0.10;
		} else if (salarioBruto > 2500) {
			tabelaImpostoRenda = 0.20;
		} else
			tabelaImpostoRenda = 0;

		double inss = salarioBruto * 0.10;
		double sind = salarioBruto * 0.03;
		double ir = salarioBruto * tabelaImpostoRenda;

		System.out.printf("Salario Bruto        R$ %.2f \n", salarioBruto);
		System.out.println("FGTS (11%)           R$ " + salarioBruto * 0.11);
		System.out.println("(-) IR " + "(" + (tabelaImpostoRenda * 100) + "%)" + "        R$ " + ir);
		System.out.println("(-) INSS (10%)       R$ " + inss);
		System.out.println("(-) Sindicato (3.0%) R$ " + sind);
		System.out.println("Total de descontos   R$ " + (ir + inss + sind));
		System.out.println("Salário líquido      R$ " + (salarioBruto - (ir + inss + sind)));

	}

}
