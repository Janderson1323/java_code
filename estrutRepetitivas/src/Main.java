
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		
		double codigo, gas, alcool, diesel;
		

		System.out.println("Informe um codigo (1, 2, 3) ou 4 para parar:");
		codigo = sc.nextDouble();
		
		
		gas = 0;
		alcool = 0;
		diesel = 0;
		while (codigo != 4) {
			
			
			
			System.out.println("Informe um codigo (1, 2, 3) ou 4 para parar:");
			codigo = sc.nextInt();
			
			if (codigo == 1) {  
				alcool += 1;
			}
			
			else if (codigo == 2) {
				gas += 1;
			}
			
			else if (codigo == 3) {
				diesel += 1;
			}
			
			if (codigo == 4) {
				System.out.println("MUITO OBRIGADO");
				System.out.printf("Alcool %.2f%n", alcool);
				System.out.printf("Gasolina %.2f%n", gas);
				System.out.printf("Diesel %.2f%n", diesel);
				
			}
			
			
			
			
			
		}
		
		

		sc.close();

	}

}
