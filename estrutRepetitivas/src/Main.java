
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		
		
		double valor, soma;
		int i;
		
		
		System.out.println("Deseja a tabuada para qual valor? ");
		valor = sc.nextDouble();
		soma = 0;
		for(  i = 1; i <= 10; i++ ) {
			
			soma = valor * i;
			System.out.printf("%.2f X %d = %.2f%n",valor, i, soma);
			
		}
		
		
	}

}
