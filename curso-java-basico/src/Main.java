
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		int i = 0;
		int idade = 0;
		double soma = 0;
		boolean valida = false;

		do {
			System.out.println("Digite uma idade: ");
			idade = scan.nextInt();

			if (idade >= 0) {
				soma += idade;
				i++;
			} else {
				valida = true;
			}

		} while (!valida);

		System.out.printf("Média de idades: %.2f ", (soma / i));

	}
}