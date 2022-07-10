package com.mac.javabasico.exercicios;

/*
Uma fruteira está vendendo frutas com a seguinte tabela de preços:
                      Até 5 Kg           Acima de 5 Kg
Morango         R$ 2,50 por Kg          R$ 2,20 por Kg
Maçã            R$ 1,80 por Kg          R$ 1,50 por Kg

Se o cliente comprar mais de 8 Kg em frutas ou o valor total da compra ultrapassar R$ 25,00, receberá ainda um desconto de 10% sobre este total. 
Escreva um algoritmo para ler a quantidade (em Kg) de morangos e a quantidade (em Kg) de maças adquiridas e escreva o valor a ser pago pelo cliente.
 */

import java.util.Scanner;

public class ExercB022 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner leia = new Scanner(System.in);

		System.out.print("Digite a quantidade de Morangos (Kg): ");
		double pesoMorango = leia.nextDouble();

		System.out.print("Digite a quantidade de Maçãs (Kg): ");
		double pesoMaca = leia.nextDouble();

		double pesoTotal = pesoMorango + pesoMaca;
		double precoMorango = 0;
		double precoMaca = 0;
		double desconto = 0.10;
		double precoTotal = 0;

		if (pesoMorango < 5) {
			precoMorango = 2.50;
		} else if (pesoMorango >= 5) {
			precoMorango = 2.20;
		}

		if (pesoMaca < 5) {
			precoMaca = 1.80;
		} else if (pesoMaca >= 5) {
			precoMaca = 1.50;
		}

		double precoTotalMorango = precoMorango * pesoMorango;
		double precoTotalMaca = precoMaca * pesoMaca;
		precoTotal = precoTotalMorango + precoTotalMaca;

		System.out.println("");
		System.out.println("Morango - " + "Peso: " + pesoMorango + "Kg " + " Preço R$ " + precoMorango + " Total R$ "
				+ precoTotalMorango);
		System.out.println(
				"Maça    - " + "Peso: " + pesoMaca + "Kg " + " Preço R$ " + precoMaca + " Total R$ " + precoTotalMaca);

		if (precoTotal >= 25 || pesoTotal >= 8) {
			System.out.println("Desconto (10%) R$ " + (precoTotal * desconto));
			System.out.println("Total a pagar  R$ " + (precoTotal - (precoTotal * desconto)));
		} else {
			System.out.println("Total a pagar R$  " + precoTotal);

		}

	}

}
