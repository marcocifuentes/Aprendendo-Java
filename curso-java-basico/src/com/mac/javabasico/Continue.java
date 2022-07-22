package com.mac.javabasico;

public class Continue {

	public static void main(String[] args) {

		// exemplo Continue
		for (int i = 1; i <= 20; i++) {
			// System.out.println(i);
			if (i == 14) {
				continue; // pula o numero 14 e continua os próximos números
			}
			System.out.println("Valor de i: " + i);

		}

	}

}