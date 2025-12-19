import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

       double precoUnd, qtC, dinheiro, troco;
       
       System.out.println("Preço unitário do produto");
       precoUnd = sc.nextDouble();
       
       System.out.println("Quantidade comprada");
       qtC = sc.nextDouble();
       
       System.out.println("Dinheiro recebido");
       dinheiro = sc.nextDouble();
       
       troco = dinheiro - (qtC * precoUnd);
       
       System.out.printf("Troco = %.2f%n", troco);
       
       
       

		sc.close();

	}

}
