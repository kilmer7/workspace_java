package exercicios;
import java.util.Scanner;
public class exercicioSeis {

	public static void main(String[]args) {
		Scanner leia = new Scanner(System.in);
		
		float sal;
		double descSal;
		
		System.out.println("Digite o seu sal�rio: ");
		sal = leia.nextFloat();
		
		descSal = (sal*11)/100;
		
		if(descSal > 318.20) {
			
			descSal = 318.20;
			System.out.printf("O seu desconto previdenci�rio � de :%.2f", descSal);
			
		}else {
			
			System.out.printf("O seu desconto previdenci�rio � de :%.2f", descSal);
			
		}
		leia.close();
	}
}
