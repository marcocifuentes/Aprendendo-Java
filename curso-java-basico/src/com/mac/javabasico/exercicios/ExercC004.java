package com.mac.javabasico.exercicios;

/*
 * Supondo que a população de um país A seja da ordem de 80000 habitantes com uma taxa anual de crescimento de 3% e 
 * que a população de B seja 200000 habitantes com uma taxa de crescimento de 1.5%. Faça um programa que calcule e 
 * escreva o número de anos necessários para que a população do país A ultrapasse ou iguale a população do país B, 
 * mantidas as taxas de crescimento.
 */

public class ExercC004 {

	public static void main(String[] args) {

		double popA = 80000, popB = 200000;
		//boolean flag = false;
		int i = 0;

		/* tudo isso pode ser feito apenas com while...
		do {
			if (a <= b) {
				a = a + (a * 0.03);
				b = b + (b * 0.015);
				i = ++i;
			} else {
				flag = true;
			}
		} while (!flag); 
		*/

		// feito epenas com while..
		while ( popA < popB){
			// a = a + (a * 0.03); // isso pode ser feito assim..
			popA += popA * 0.03;
			popB += popB * 0.015;
			// i = ++i; // isso pode ser feito assim..
			i++;
		}
		
		
		System.out.println("População país A: " + popA);

		System.out.println("População país B: " + popB);

		System.out.println("Tempo estimado: " + i + " anos");
	}

}
