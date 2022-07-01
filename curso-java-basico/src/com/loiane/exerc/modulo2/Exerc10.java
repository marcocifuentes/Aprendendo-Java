package com.loiane.exerc.modulo2;

import java.util.Scanner;

/*
 * Faça um Programa que pergunte em que turno você estuda. Peça para digitar M-matutino ou V-Vespertino ou N- Noturno. 
 * Imprima a mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou "Valor Inválido!", conforme o caso.
 */

public class Exerc10 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
	
		System.out.print("Em que turno voce estuda (M/V/N): ");
		String turno = entrada.next();
		
		/*
		// Forma 1
		switch (turno) {
		case "M": System.out.println("M = Matutino: Bom dia!"); break;
		case "V": System.out.println("V = Vespertino: Boa tarde!"); break;
		case "N": System.out.println("N = Noturno: Boa noite!"); break;
		case "m": System.out.println("M = Matutino: Bom dia!"); break;
		case "v": System.out.println("V = Vespertino: Boa tarde!"); break;
		case "n": System.out.println("N = Noturno: Boa noite!"); break;
		default: System.out.println("Valor inválido!");
		}*/
		
		/*
		//Forma 2
		switch (turno) {
		case "v":
		case "V": System.out.println("V = Vespertino: Boa tarde!"); break;
		case "m":
		case "M": System.out.println("M = Matutino: Bom dia!"); break;
		case "n":
		case "N": System.out.println("N = Noturno: Boa noite!"); break;
		default: System.out.println("Valor inválido!");
		} */
		
		//Forma 3 
		if (turno.equalsIgnoreCase("V")) {
			System.out.println("V = Vespertino: Boa tarde!");
			
		} else if (turno.equalsIgnoreCase("M")) {
			System.out.println("M = Matutino: Bom dia!");
			
		} else if (turno.equalsIgnoreCase("N")) {
			System.out.println("N = Noturno: Boa noite!");
			
		} else { 
			System.out.println("Valor inválido!");
		}
		
	}
}

