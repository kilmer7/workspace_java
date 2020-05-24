package exercicios;
import java.util.Scanner;

public class exercicioDois {
	
	public static void main(String[]args) {
		Scanner leia = new Scanner (System.in);
		
		float n1;
		float n2;
		float n3;
		float media;
		String nome;
		
		System.out.println("Digite o seu nome:");
		nome = leia.nextLine();
		System.out.println("Digite a sua primeira nota: ");
		n1 = leia.nextFloat();
		System.out.println("Digite a sua segunda nota: ");
		n2 = leia.nextFloat();
		System.out.println("Digite a sua terceira nota: ");
		n3 = leia.nextFloat();
		
		media = (n1 + n2 + n3)/3;
		
		if(media >= 6) {
			
			System.out.println(nome);
			System.out.printf("A sua media é: %.0f\n", media);
			System.out.println("Você foi aprovado!!!");
			
		}else {
			
			System.out.println(nome);
			System.out.printf("A sua media é: %.0f\n", media);
			System.out.println("Desculpe, você foi reprovado!!!");
			
		}
		leia.close();
	}

}
