import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double distancia, combustivel, consumo;

		System.out.println("Distancia percorrida");
		distancia = sc.nextDouble();
		System.out.println("Combustível gasto");
		combustivel = sc.nextDouble();

		consumo = distancia / combustivel;

		System.out.printf("Consumo medio %.3f%n", consumo);

		sc.close();

	}

}
