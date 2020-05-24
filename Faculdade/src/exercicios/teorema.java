package exercicios;
import java.util.Scanner;
import java.lang.Math;

public class teorema {

	public static void main(String[]args) {
		Scanner leia = new Scanner(System.in);
		
		double hip;
		float catO;
		float catA;
		
		System.out.println("Digite o Cateto Oposto: ");
		catO = leia.nextFloat();
		System.out.println("Digite o Cateto Adjacente");
		catA = leia.nextFloat();
		
		hip = Math.sqrt(Math.pow(catO,2) + Math.pow(catA, 2));
		
		System.out.println("O comprimento da rampa é de : " + hip );
		
		leia.close();
	}
}
