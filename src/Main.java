import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		
		
	double a, b, c, areaQuad, areaTriang, areaTrapez;
	
	
	System.out.println("Digite a medida A: ");
	a = sc.nextDouble();
	
	System.out.println("Digite a medida A: ");
	b = sc.nextDouble();
	
	
	System.out.println("Digite a medida A: ");
	c = sc.nextDouble();
	
	
	areaQuad = a * a;
	areaTriang = a * b / 2;
	areaTrapez = ((a + b) * c) / 2;
	
	System.out.println(areaQuad);
	System.out.println(areaTriang);
	System.out.println(areaTrapez);

	sc.close();

	}

}
