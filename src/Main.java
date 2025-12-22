import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int um, dois, tres, menor;

		System.out.printf("Primeiro valor: ");
		um = sc.nextInt();

		System.out.println("Segundo valor: ");
		dois = sc.nextInt();

		System.out.println("Terceiro valor:");
		tres = sc.nextInt();

		menor = 0;

		if (um < dois && um < tres) {
			menor = um;
		}

		else if (dois > tres) {
			menor = tres;
		}

		else {
			menor = dois;
		}
		
		
		System.out.printf("MENOR = %d", menor);

		sc.close();

	}

}
