package exercicios;
import java.util.Scanner;
public class exercicioQuatro {
	
	public static void main(String[]args) {
		Scanner leia = new Scanner (System.in);
		int l = 0;
		int velT;
		int novT;
		int[] idadeH = new int[2];
		int[] idadeM = new int[2];
		
		while(l < 1) {
			
			System.out.println("Digite a idade do Primeiro Homem: ");
			idadeH[0] = leia.nextInt();
			System.out.println("Digite a idade do Segundo Homem: ");
			idadeH[1] = leia.nextInt();
			System.out.println("Digite a idade da Primeira Mulher: ");
			idadeM[0] = leia.nextInt();
			System.out.println("Digite a idade da Segunda Mulher: ");
			idadeM[1] = leia.nextInt();
		
			if(idadeH[0] > idadeH[1] & idadeM[0] > idadeM[1]) {
			
				velT = idadeH[0] + idadeM[1];
				System.out.println("A soma das idades do Homem mais Velho com a Mulher mais nova é: " + velT);
				novT = idadeH[1] * idadeM[0];
				System.out.println("O produto das idades do Homem mais novo com a mulher mais nova é: " + novT);
				break;
			
			}else if(idadeH[1] > idadeM[0] & idadeM[1] > idadeM[0]) {
			
				velT = idadeH[1] + idadeM[0];
				System.out.println("A soma das idades do Homem mais velho com a Mulher mais nova é: " + velT);
				novT = idadeH[0] * idadeM[1];
				System.out.println("O produto das idades do Homem mais novo com a mulher mais nova é: " + novT);
				break;
			
			}else{
			
				System.out.println("Recomece o Programa, pois os valores informados estão impróprios para o que deve ser feito.");
				continue;
			
			}
		
		}
		leia.close();
	}
}
