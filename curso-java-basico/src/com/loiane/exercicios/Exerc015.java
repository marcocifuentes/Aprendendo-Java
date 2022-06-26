package com.loiane.exercicios;

import java.util.Scanner;

/*
 * João Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o rendimento diário de seu trabalho. 
 * Toda vez que ele traz um peso de peixes maior que o estabelecido pelo regulamento de pesca do estado 
 * de São Paulo (50 quilos) deve pagar uma multa de R$ 4,00 por quilo excedente. João precisa que você 
 * faça um programa que leia a variável peso (peso de peixes) e calcule o excesso. 
 * Gravar na variável excesso a quantidade de quilos além do limite e na variável multa o valor da multa 
 * que João deverá pagar. Imprima os dados do programa com as mensagens adequadas.
 */

public class Exerc015 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		//variaveis pra uso
		double multa = 4.00;
		double cota = 50.00;

		System.out.print("Informe Kg pescado: ");
		double peso = scan.nextDouble();
				
		double excesso = peso - cota;
		System.out.println("Peso excedente: " + excesso);
		System.out.println("Cota maxima (50,Kg) - Multa R$: " + (multa = excesso * multa));
		
		
	}

}
