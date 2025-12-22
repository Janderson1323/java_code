import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		String classificacao;
		double nivel;
		
		
		
		
		
		
		
		
		System.out.println("Digite a medida da glicose:");
		nivel = sc.nextDouble();
		
		if (nivel <= 90) {
			classificacao = "Normal";
		}
		
		else if (nivel <= 140) {
				classificacao = "elevado";
			}
		
		else {
			classificacao = "diabetes";
		}

		
		
		
		System.out.printf("Classificacao %s", classificacao );
		sc.close();

	}

}
