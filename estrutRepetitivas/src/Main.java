import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double n1, n2;
		String status;

		System.out.println("Digite dois numeros:");
		n1 = sc.nextDouble();
		n2 = sc.nextDouble();

		while (n1 != n2) {
			
			if (n1 > n2) {
				status = "DECRESCENTE!";
			}

			else {
				status = "CRESCENTE! ";
			}
			
			if (n1 != n2) {
				System.out.println(status);
			}

			System.out.println("Digite outros dois numeros: ");
			n1 = sc.nextDouble();
			n2 = sc.nextDouble();

			
		}

		

		

		

	}

}
