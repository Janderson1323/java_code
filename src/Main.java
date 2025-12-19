import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String nome1, nome2;
		int idade1, idade2;
		double media;
		System.out.println("Dados da primeira pessoa");
		System.out.printf("Nome");
		nome1 = sc.nextLine();
		System.out.printf("idade");
		idade1 = sc.nextInt();

		System.out.println("Dados da segunda pessoa:");
		
		System.out.printf("Nome");
		sc.nextLine();
		nome2 = sc.nextLine();
		
		System.out.printf("idade");
		idade2 = sc.nextInt();

		media = (double) (idade1 + idade2) / 2;

		System.out.printf("A idade média de %s e %s é de %.1f anos", nome1, nome2, media);

		sc.close();

	}

}
