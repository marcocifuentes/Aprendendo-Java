package com.mac.javabasico;

public class LoopDoWhile {

	public static void main(String[] args) {

		// exemplo 1
		int i = 0;
		
		while ( i <= 5 ) {
			
			System.out.println("while (i) = " + i);
			++i;
		}

		//exemplo 2
		i = 0;
		
		do {
			System.out.println("do while (i) = " + i);
			i++;
			
		} while ( i <= 5);
		
	}

}
