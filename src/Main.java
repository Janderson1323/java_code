import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Hello Word");

		int x, y;
		double soma;

		

		System.out.println("Digite o valor de X: ");
		x = sc.nextInt();
		
		System.out.println("Digite o valor de Y: ");
		y = sc.nextInt();

		soma = (double) x + y;

		System.out.printf("SOMA %.2f%n", soma);

		sc.close();
		
	}

}
