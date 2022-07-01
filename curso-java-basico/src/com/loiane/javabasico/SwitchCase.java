package com.loiane.javabasico;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o dia da semana (1/7):");
		int diaSemana = scan.nextInt();
		
		/* exemplo 1
		switch (diaSemana) {
		case 1: System.out.println("1 é Domingo"); break;
		case 2: System.out.println("2 é Segunda"); break;
		case 3: System.out.println("3 é Terça"); break;
		case 4: System.out.println("4 é Quarta"); break;
		case 5: System.out.println("5 é Quinta"); break;
		case 6: System.out.println("6 é Sexta"); break;
		case 7: System.out.println("7 é Sábado"); break;
		default: System.out.println("Número inválido!");
		} */
		
		// exemplo 2
		switch (diaSemana) {
		case 2:
		case 3: 
		case 4: 
		case 5: 
		case 6: System.out.println("Dia útil"); break;
		case 7: 
		case 1: System.out.println("Final de semana"); break;
		default: System.out.println("Número inválido!");
		}
	}

}
