package exercicios;
import java.util.Scanner;

public class maiorMenor {
	
	
	public static void main(String[]args) {
		
		Scanner leia = new Scanner(System.in);
		int n1;
		int n2;
		
		System.out.println("Digite um primeiro n�mero: ");
		n1 = leia.nextInt();
		System.out.println("Digite um segundo n�mero: ");
		n2 = leia.nextInt();
		
		if(n1 > n2) {
			
			System.out.println("O primeiro n�mero � maior do que o segundo!");
			
		}else if(n1 < n2) {
			
			System.out.println("O primeiro n�mero � menor do que o segundo!");
			
		}else {
			
			System.out.println("Os n�meros s�o iguais!");
			
		}
		leia.close();
	}

}
