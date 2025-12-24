import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double x, soma, media;
		int i;

		System.out.println("Digite as idades: ");
		x = sc.nextDouble();
		

		if (x < 0) {
			
			System.out.println("IMPOSSIVEL CALCULAR");
		}

		else {
			soma = 0;
			i = 0;
			
			
			
			while (x >= 0) {
				i++;
				soma = soma + x;
				x = sc.nextDouble();

			}
			
			media = soma / i;
			System.out.printf("MEDIA = %.2f%n", media);

		}

		

		

	}

}
