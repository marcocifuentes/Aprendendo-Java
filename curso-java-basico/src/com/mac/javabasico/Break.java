package com.mac.javabasico;

public class Break {

	public static void main(String[] args) {

		// O break é usado para interromper um loop (for, while e switch)

		// exemplo Break
		for (int i = 8; i <= 30; i++) {
			System.out.println(i);
			if (i % 7 == 0) {
				System.out.println("Valor de i: " + i);
				break; // para a execução, quando encontrar um múltiplo de 7
			}

		}

	}

}
