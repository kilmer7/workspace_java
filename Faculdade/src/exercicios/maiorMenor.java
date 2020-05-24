package exercicios;
import java.util.Scanner;

public class maiorMenor {
	
	
	public static void main(String[]args) {
		
		Scanner leia = new Scanner(System.in);
		int n1;
		int n2;
		
		System.out.println("Digite um primeiro número: ");
		n1 = leia.nextInt();
		System.out.println("Digite um segundo número: ");
		n2 = leia.nextInt();
		
		if(n1 > n2) {
			
			System.out.println("O primeiro número é maior do que o segundo!");
			
		}else if(n1 < n2) {
			
			System.out.println("O primeiro número é menor do que o segundo!");
			
		}else {
			
			System.out.println("Os números são iguais!");
			
		}
		leia.close();
	}

}
