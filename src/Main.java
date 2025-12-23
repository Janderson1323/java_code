import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double codigo, valorPagar, vlrProd;
		int qt;

		System.out.printf("Codigo do produto comprado:");
		codigo = sc.nextDouble();

		System.out.printf("Quantidade comprada:");
		qt = sc.nextInt();

		

		vlrProd = 0;
		
		if (codigo == 1) {

			vlrProd = 5.0;

		}

		else if (codigo == 2) {

			vlrProd = 3.5;

		}

		else if (codigo == 3) {

			vlrProd = 4.80;

		}

		else if (codigo == 4) {

			vlrProd = 8.90;

		}

		else if (codigo == 5) {

			vlrProd = 7.32;

		}
		
		valorPagar = vlrProd * qt;
		
		
		System.out.printf("Valor a pagar: %.2f%n", valorPagar);

		sc.close();

	}

}
