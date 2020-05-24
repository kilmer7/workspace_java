package exercicios;
import java.util.Scanner;
public class exercicioUm {
	
	public static void main(String[]args) {
		Scanner leia = new Scanner(System.in);
		
		float n1;
		float n2;
		float soma;
		float prod;
		
		System.out.println("Digite o primeiro número:");
		n1 = leia.nextFloat();
		System.out.println("Digite o segundo número:");
		n2 = leia.nextFloat();
		
		soma = n1 + n2;
		prod = n1 * n2;
		
		System.out.printf("O resultado da soma de %.0f e %.0f é : %.1f.\n",n1,n2,soma );
		System.out.printf("O produto desses números é : %.1f\n", prod);
		if(n1 > n2) {
			
			System.out.println("O primeiro número é maior do que o segundo.");
			
		}else if(n1 < n2){
			
			System.out.println("O segundo número é maior do que o primeiro.");
			
		}else{
			
			System.out.println("Os números são iguais.");
			
		}
		leia.close();
	}

}
