package grupoDois;
import java.util.Scanner;
import java.util.Random;
public class exercicioQuatro {
	
	public static void main(String[]args) {
		Scanner leia = new Scanner(System.in);
		Random gerador = new Random();
		
		int ale;
		int tent = 0;
		int cont = 0;
		
		ale = gerador.nextInt(101) + 1;
		
		System.out.println("Vamos Jogar um jogo!");
		System.out.println("um n�mero foi gerado entre 1 e 100");
		System.out.println("Seu Objetivo � descobrir q n�mero � esse.");
		System.out.println("Boa Sorte!");
			while(ale != tent) {
			System.out.println("Digite o seu chute: ");
			tent = leia.nextInt();
			cont = cont + 1;
			
			if(tent < ale) {
				
				System.out.println("O seu n�mero � menor!");
				System.out.println("Tente denovo.");
				
			}else if(tent > ale) {
				
				System.out.println("o seu n�mero � maior!");
				System.out.println("Tente denovo.");
				
			}else {
				
				System.out.println("PARAB�NS VOC� ACERTOU!!!!");
				
			}
		}
		System.out.printf("Voc� tentou %d vezes para acertar!", cont);
		leia.close();
	}

}
