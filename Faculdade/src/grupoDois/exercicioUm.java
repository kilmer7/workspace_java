package grupoDois;
import java.util.Scanner;
public class exercicioUm {
	
	public static void main(String[]args) {
		Scanner leia = new Scanner(System.in);
		
		int numero = 0;
		int soma =  0;
		int subt = 0;
		int mult = 0;
		int div = 0;
		int i = 0;
		
		System.out.println("Digite um número e veja a tabuada das 4 operações com esse número: ");
		numero = leia.nextInt();
		
		System.out.printf("Tabuada de Soma do número %d\n",numero);
		for(i = 0;i < 11;i++) {
			
			soma = numero + i;
			System.out.printf(" %d + %d = %d\n",i,numero,soma);
				
		}
		
		System.out.printf("Tabuada de Subtração do número %d\n",numero);
		for(i = numero;i < soma+1;i++) {
			
			subt = i - numero;
			System.out.printf(" %d - %d = %d\n",i ,numero ,subt);
		}
		
		System.out.printf("Tabuada de Multiplicação do número %d\n",numero);
		for(i = 0;i < 11;i++) {
			
			mult = numero * i;
			System.out.printf(" %d x %d = %d\n",i,numero,mult);
				
		}
		
		System.out.printf("Tabuada de Divisão do número %d\n",numero);
		for(i = 1;i < 11;i++) {
			
			mult = numero * i;
			div = mult / numero;
			System.out.printf(" %d / %d = %d\n",mult ,numero ,div);
				
		}
		leia.close();
	}

}
