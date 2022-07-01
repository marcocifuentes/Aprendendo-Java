package com.loiane.exerc.modulo1;

import java.util.Scanner;

/*
 * Faça um Programa que peça as 4 notas bimestrais e mostre a média.
 */

public class Exerc004 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe a primeira nota do bimestre: ");
		double nota1 = scan.nextDouble();
		System.out.print("Informe a segunda nota do bimestre.: ");
		double nota2 = scan.nextDouble();
		System.out.print("Informe a terceira nota do bimestre: ");
		double nota3 = scan.nextDouble();
		System.out.print("Informe a quarta nota do bimestre..: ");
		double nota4 = scan.nextDouble();
		
		double media = (nota1+nota2+nota3+nota4)/4;
		
		System.out.println("");
		System.out.print("Media..............................: " + media);

		

	}

}
