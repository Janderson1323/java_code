import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double senha;

		System.out.println("Digite a senha: ");
		senha = sc.nextDouble();
		
		while (senha != 2002) {
			System.out.printf("Senha Invalida! Tente novamente: ");
			senha = sc.nextDouble();
		}
		
		System.out.println("Acesso permitido");

	}

}
