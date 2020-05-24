package exercicios;
import java.util.Scanner;
public class exercicioSete {

	public static void main(String[]args) {
		Scanner leia = new Scanner(System.in);
		
		float diaria = 120;
		double taxServ;
		float diasDiaria;
		double conta;
		String nome;
		
		System.out.println("Digite o seu Nome e Sobrenome: ");
		nome = leia.nextLine();
		System.out.println("Digite o número de dias que você irá ficar hospedado: ");
		diasDiaria = leia.nextInt();
		
		if(diasDiaria > 15 ) {
			taxServ = 9.50;
			conta = diasDiaria * taxServ + diaria;
			System.out.println("A sua conta Senhor " + nome + " é de " + conta);
			
		}else if(diasDiaria == 15) {
			taxServ = 13.00;
			conta = diasDiaria * taxServ + diaria;
			System.out.println("A sua conta Senhor " + nome + " é de " + conta);
			
		}else if(diasDiaria < 15) {
			taxServ = 17.00;
			conta = diasDiaria * taxServ + diaria;
			System.out.println("A sua conta Senhor " + nome + " é de " + conta);
			
		}
		leia.close();
	}	
}
