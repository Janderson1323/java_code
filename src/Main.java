import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		
	double duracao, min, seg, resto;
	int horas;
	System.out.println("Digite a duracao em segundos: ");
	duracao = sc.nextInt();
	
	resto = duracao % 3600;
	
	horas = (int)duracao / 3600;
	min = resto / 60;
	seg = resto % 60;
	
	System.out.println(horas);
	
	System.out.println(min);
	System.out.println(seg);

	System.out.printf("%d horas %.0f minutos %.0f segundos %n", horas, min, seg);

	sc.close();

	}

}
