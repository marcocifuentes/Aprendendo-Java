package com.mac.javabasico;

public class LoopDoWhile {

	public static void main(String[] args) {

		int i = 0;
		//int max = 5;
		
		while ( i <= 5 ) {
			
			System.out.println("while - i = " + i);
			++i;
		}

		i = 0;
		
		do {
			System.out.println("do while - i = " + i);
			i++;
			
		} while ( i <= 5);
		
	}

}
