import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double plano, custoExtra, conta;
		int minContrato, minUsado;

		custoExtra = 2.00;
		plano = 50.00;
		minContrato = 100;

		System.out.printf("Digite a quantidade de minutos:");
		minUsado = sc.nextInt();

		if (minUsado < minContrato) {
			conta = plano;
		}

		else {
			conta = (double) plano + ((minUsado - minContrato) * custoExtra);

		}

		System.out.printf("Valor a pagar: %.2f%n", conta);

		sc.close();

	}

}
