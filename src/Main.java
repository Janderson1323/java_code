import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

       double precoUnd, qtC, dinheiro, troco;
       
      
       double r, area;
       
       System.out.println("Digite o valor do raio do circulo");
       r = sc.nextDouble();
       
       area = Math.PI * (r * r);
       
       System.out.println(area);

		sc.close();

	}

}
