import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double faren, celc;
		char x;

		System.out.println("Voce vai digitar a temperatura em qual escala (C/F)?");
		x = sc.nextLine().charAt(0);

		if (x == 'f') {

			System.out.printf("Digite a temperatura em Fahrenheit ");
			faren = sc.nextDouble();

			celc =  5.0 / 9 * (faren - 32);
			System.out.printf("Temperatura equivalente em Celsius %.2f", celc);

		}
		
		else if (x == 'c') {
			
			System.out.printf("Digite a temperatura em Celsius ");
			celc = sc.nextDouble();

			faren = celc * 9 / 5.0  + 32.0;
			System.out.printf("Temperatura equivalente em Fahrenheit %.2f", faren);
			
		}

		
		

		sc.close();

	}

}
