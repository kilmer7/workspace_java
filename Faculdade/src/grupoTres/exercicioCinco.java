package grupoTres;
import java.util.Scanner;

public class exercicioCinco {
	
	public static void main(String[]args) {
		Scanner leia = new Scanner(System.in);
		
		String nome;
		
		System.out.println("Digite seu nome e sobrenome: ");
		nome = leia.nextLine();
		System.out.printf("%s%n", nome.toLowerCase());
		
	}
}
