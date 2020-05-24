package exercicios;
import java.util.Scanner;

public class media {

	public static void main(String[]args) {
		Scanner leia = new Scanner(System.in);
		float n1;
		float n2;
		
		System.out.println("Digite a primeira nota:");
		n1 = leia.nextFloat();
		System.out.println("Digite a segunda nota: ");
		n2 = leia.nextFloat();
		
		float media;
		
		media = (n1+n2)/2;
		
		if (media < 7) {
			System.out.println("Reprovado jovem!!!");
			
		}else {
			System.out.println("AEEEE! PASSOU SEU ARROMBADO!!!");
			
		}
		leia.close();	
	}

}
