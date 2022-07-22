package com.mac.projetos;

import java.util.Scanner;

// Faça um programa que leia 5 números e informe o maior número.

public class LeituraDeCincoNumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite numero primeiro ńumero: ");
		int num1 = leia.nextInt();
		
		// os demais numeros vou declarar sem input
		
		int num2 = 3, num3 = 8, num4 = 12, num5 = 33;
		
		if (num1 > num2 && num1 > num3 && num1 > num4 && num1 > num5) {
			System.out.println("O maior número é: " + num1);
			
			
			
		}
		
		
		
		
		
		
	}

}
