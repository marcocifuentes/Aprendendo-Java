package com.mac.javabasico.exercicios;

import java.util.Scanner;

/*
 * Um posto está vendendo combustíveis com a seguinte tabela de descontos:
Álcool:
1-até 20 litros, desconto de 3% por litro
2-acima de 20 litros, desconto de 5% por litro

Gasolina:
1-até 20 litros, desconto de 4% por litro
2-acima de 20 litros, desconto de 6% por litro

Escreva um algoritmo que leia o número de litros vendidos, o tipo de combustível (codificado da seguinte forma: A-álcool, G-gasolina), 
calcule e imprima o valor a ser pago pelo cliente sabendo-se que o preço do litro da gasolina é R$ 2,50 o preço do litro do álcool é R$ 1,90. 
 */

public class ExercB021 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner leia = new Scanner(System.in);

		System.out.print("Informe o combustivel (A/G): ");
		String combustivel = leia.next();

		System.out.print("Informe quantidade de litros: ");
		int litros = leia.nextInt();

		double precoGasolina = 2.5;
		double precoAlcool = 1.9;
		double desconto = 0;
		double total = 0;

		if (combustivel.equalsIgnoreCase("A")) {

			combustivel = "Alcool";

			if (litros <= 20) {
				desconto = 0.03;
			} else {
				desconto = 0.05;
			}

			total = litros * precoAlcool;

		} else if (combustivel.equalsIgnoreCase("G")) {

			combustivel = "Gasolina";

			if (litros <= 20) {
				desconto = 0.04;
			} else {
				desconto = 0.06;
			}

			total = litros * precoGasolina;

		}

		System.out.println("Combustível " + combustivel);
		System.out.println("Litros " + litros);
		System.out.println("Valor total " + total);
		System.out.println("Desconto % " + (desconto * 100));
		System.out.println("Valor a pagar " + (total - (total * desconto)));

		/*
		 * FORMA 2 (repeticao demasiada de prints
		 * 
		 * if (combustivel.equalsIgnoreCase("A")) { double total = litros * alcool;
		 * 
		 * if (litros <= 20) { double desconto = total * 0.03; double valor = total -
		 * desconto; System.out.println("Alcool/litro R$  " + alcool);
		 * System.out.println("Litros           " + litros);
		 * System.out.println("Total R$         " + total );
		 * System.out.println("Desconto (3%) R$ " + desconto);
		 * System.out.println("Valor a pagar R$ " + valor);
		 * 
		 * } else { double desconto = total * 0.05; double valor = total - desconto;
		 * System.out.println("Alcool/litro R$  " + alcool);
		 * System.out.println("Litros           " + litros);
		 * System.out.println("Total R$         " + total );
		 * System.out.println("Desconto (5%) R$ " + desconto);
		 * System.out.println("Valor a pagar R$ " + valor);
		 * 
		 * }
		 * 
		 * }
		 * 
		 * if (combustivel.equalsIgnoreCase("G")) { double total = litros * gasolina;
		 * 
		 * if (litros <= 20) { double desconto = total * 0.04; double valor = total -
		 * desconto; System.out.println("Gasolina/litro R$ " + gasolina);
		 * System.out.println("Litros            " + litros);
		 * System.out.println("Total R$          " + total );
		 * System.out.println("Desconto (4%) R$  " + desconto);
		 * System.out.println("Valor a pagar R$  " + valor);
		 * 
		 * } else { double desconto = total * 0.06; double valor = total - desconto;
		 * System.out.println("Gasolina/litro R$ " + gasolina);
		 * System.out.println("Litros            " + litros);
		 * System.out.println("Total R$          " + total );
		 * System.out.println("Desconto (6%) R$  " + desconto);
		 * System.out.println("Valor a pagar R$  " + valor);
		 * 
		 * }
		 */

	}
}
