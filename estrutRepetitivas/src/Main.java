
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double n, soma;
		System.out.println("Digite um numero inteiro:");
		n = sc.nextDouble();

		while (n != 0) {
			if (n % 2 == 0) {
				soma = n + (n + 2) + (n + 4) + (n + 6) + (n + 8);
			} else {
				n += 1;
				soma = n + (n + 2) + (n + 4) + (n + 6) + (n + 8);
			}

			System.out.printf("SOMA = %.2f%n", soma);
			System.out.println("Digite um numero inteiro ");
			n = sc.nextDouble();

		}

		sc.close();

	}

}
