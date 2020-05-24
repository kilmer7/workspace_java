package exercicios;
import java.util.Scanner;

public class exercicioTres {

	public static void main(String[]args) {
		Scanner leia = new Scanner(System.in);
		
		float fab;
		float fabcor;
		
		System.out.println("Custo de Fábrica do Carro: ");
		fab = leia.nextFloat();
		
		fabcor = ((fab*28)/100) + ((fab*45)/100) + fab;
		
		System.out.printf("O custo do carro novo é de : %.2f\n",fabcor);
		
		leia.close();
	}
	
}
