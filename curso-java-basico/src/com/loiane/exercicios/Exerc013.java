package com.loiane.exercicios;

import java.util.Scanner;

/*
 * Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. 
 * Calcule e mostre o total do seu salário no referido mês, sabendo-se que são descontados 
 * 11% para o Imposto de Renda, 8% para o INSS e 5% para o sindicato, faça um programa que nos dê:
 * salário bruto.
 * quanto pagou ao INSS.
 * quanto pagou ao sindicato.
 * o salário líquido.
 * calcule os descontos e o salário líquido, conforme a tabela abaixo:
 * + Salário Bruto : R$
 * - IR (11%) : R$
 * - INSS (8%) : R$
 * - Sindicato ( 5%) : R$
 * = Salário Liquido : R$
 * Obs.: Salário Bruto - Descontos = Salário Líquido.
 */

public class Exerc013 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Valor recebido por hora:");
		double valorHora = scan.nextDouble();
		
		System.out.print("Quantidade de horas trabalhadas no mes: ");
		double horasTrabalhadas = scan.nextDouble();
		
		double salarioBruto = horasTrabalhadas * valorHora;
		double inss = salarioBruto * 0.08;
		double impostoRenda = salarioBruto * 0.11;
		double sindicato =  salarioBruto * 0.05;
		double descontos = impostoRenda + sindicato + inss;

		System.out.println("Salario Bruto: " + salarioBruto);
		System.out.println("");
		System.out.println("INSS (8%): " + inss);
		System.out.println("Sindicato (5%): " + sindicato);
		System.out.println("Inposto de Renda (11%): " + impostoRenda);
		System.out.println("Total descontos: "  + descontos);
		System.out.println("");
		System.out.println("Salario liquido: " + (salarioBruto - descontos));
		
		
	}

}
