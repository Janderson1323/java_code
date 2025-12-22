import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double salario, newSalary, porcento, aumento;
        int porcentagem;
        
		System.out.println("Digite o salario da pessoa:");
		salario = sc.nextDouble();
		System.out.println("Novo salario = ");
		System.out.println("Aumento = R$ ");
		System.out.println("Porcentagem = ");

		if (salario <= 1000) {
			porcentagem = 20;
			newSalary = salario + (salario * porcentagem / 100);
		}

		else if (salario > 1000 && salario <= 3000) {
			porcentagem = 15;
			newSalary = salario + (salario * porcentagem / 100);
		}

		else if (salario > 3000 && salario <= 8000) {
			porcentagem = 10;
			newSalary = salario + (salario * porcentagem / 100);
		}

		else {

			newSalary = salario + (salario * 5 / 100);
		}
		
        aumento = newSalary - salario;
        
		System.out.printf("Novo salario %.2f%n", newSalary);
		System.out.printf("Aumento %.2f%n", aumento);
		
		System.out.printf("Porcentagem %d", porcentagem);

		sc.close();

	}

}
