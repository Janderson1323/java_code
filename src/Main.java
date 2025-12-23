import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		
		double n1, n2; 
		
		

		System.out.println("Digite dois numeros: ");
		
		n1 = sc.nextDouble();
		
		n2 = sc.nextDouble();
		
		if (n1 % n2 == 0) {
			
			System.out.println("São multiplos");
			
		}
		
		else {
			System.out.println("Não são multiplos");
		}

		
		
		sc.close();

	}

}
