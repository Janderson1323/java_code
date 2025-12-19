import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

       String nome;
       double salarioHora, salario;
       int qtHorasTrab;
       
      
       System.out.println("Nome");
       nome = sc.nextLine();
       System.out.println("Valor por hora");
       salarioHora = sc.nextDouble();
       System.out.println("Horas trabalhadas:");
       qtHorasTrab = sc.nextInt();
       salario = salarioHora * qtHorasTrab;
       
       System.out.printf("O pagamento para %s deve ser %.2f%n", nome, salario);
       
       
       
       
       
       
		sc.close();

	}

}
