package exercicios;
import java.util.Scanner;
public class exercicioNove {
	
	public static void main(String[]args) {
		Scanner leia = new Scanner (System.in);
		
		String[] corretor = {"Jo�o Paulo", "Guilherme Moreira", "Pedro Aguiar"};
		double venda = 0;
		double comissao;
		int vendCasas;
		
		System.out.println("Quantas casas foram vendidas?");
		vendCasas = leia.nextInt();
		System.out.println("Digite o valor da casa: ");
		venda = leia.nextDouble();
		
		
		if(venda > 50000.00) {
			comissao = (venda*12)/100;
			System.out.printf("O nome do seu vendedor � %s e o valor da venda da propriedade foi de %.2f", corretor[0], venda );
			System.out.printf("A comiss�o dele foi de %.2f", comissao);
			System.out.printf("O n�mero de casas vendidas foi de %d", vendCasas);
			
		}else if(venda <= 50000.00 & venda >= 30000.00) {
			comissao = (venda*9.5)/100;
			System.out.printf("O nome do seu vendedor � %s e o valor da venda da propriedade foi de %.2f\n", corretor[1], venda );
			System.out.printf("A comiss�o dele foi de %.2f\n", comissao);
			System.out.printf("O n�mero de casas vendidas foi de %d", vendCasas);
			
		}else{
			comissao = (venda*7)/100;
			System.out.printf("O nome do seu vendedor � %s e o valor da venda da propriedade foi de %.2f", corretor[2], venda );
			System.out.printf("A comiss�o dele foi de %.2f", comissao);
			System.out.printf("O n�mero de casas vendidas foi de %d", vendCasas);
			
		}
		leia.close();
	}

}
