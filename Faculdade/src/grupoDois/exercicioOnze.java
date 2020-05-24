package grupoDois;
import java.util.Scanner;
public class exercicioOnze {
	
	public static void main(String[]args) {
		Scanner leia = new Scanner (System.in);
		
		int idade = 1;
		char sexo = 'M';
		double salario = 0;
		
		while (idade != 0 ) {
			
			System.out.println("Escreva sua idade:");
			idade = leia.nextInt();
			System.out.println("Escreva seu sexo:");
			sexo = leia.next().charAt(0);
			System.out.println("Diga quanto vc ganha:");
			salario = leia.nextDouble();
			
		}
		leia.close();		
	}

}
