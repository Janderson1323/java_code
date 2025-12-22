import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double precoUnd, dinheiroRec, troco, total;
		int qtComp;

		System.out.println("Preço unitário do produto:");
		precoUnd = sc.nextDouble();

		System.out.println("Quantidade comprada:");
		qtComp = sc.nextInt();

		System.out.println("Dinheiro recebido");
		dinheiroRec = sc.nextDouble();

		total = (double) precoUnd * qtComp;

		if (total > dinheiroRec) {
			troco = dinheiroRec - total;
			System.out.printf("DINHEIRO INSUFICIENTE. FALTAM %.2f REAIS", Math.abs(troco));
		}

		else {

			troco = dinheiroRec - total;
			System.out.printf("TROCO %.2f%n", troco);
		}

		sc.close();

	}

}
