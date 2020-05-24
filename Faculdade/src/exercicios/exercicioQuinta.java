package exercicios;
import java.util.Scanner;
public class exercicioQuinta {
	
	public static void main(String[]args) {
		Scanner leia = new Scanner (System.in);
		
		double salFix;
		float carVen;
		float comVen = 50;
		double TolVen = 0.05;
		
		System.out.println("Digite o seu salário Mínimo: ");
		salFix = leia.nextDouble();
		System.out.println("Digite quantos carros foram vendidos: ");
		carVen = leia.nextFloat();
		
		float valVen = carVen*comVen;
		TolVen = ((2*salFix) + valVen) + ((valVen*5)/100);
		
		System.out.printf("O salário do Vendedor é de : %.2f", TolVen);
		
		leia.close();
	}
}
