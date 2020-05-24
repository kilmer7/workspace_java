package exercicios;

import java.util.Scanner;

public class exercicioOito {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int codigo;
		int quant;
		double calc;

		System.out.println("O cardápio é:");
		System.out.println("100 - Cachorro quente - $8,10");
		System.out.println("101 - Bauru simples - $12,30");
		System.out.println("102 - Bauru c/ovo - $13,50");
		System.out.println("103 - Hamburguer - $11,10");
		System.out.println("104 - Cheeseburguer - $12,70");
		System.out.println("105 - Refrigerante - $5,00");
		System.out.println("Digite qual o seu pedido em forma de código:");
		codigo = leia.nextInt();
		System.out.println("Digite a quantidade que você deseja:");
		quant = leia.nextInt();

		switch (codigo) {

		case 100:
			calc = quant * 8.10;
			System.out.printf("O seu pedido de Cachorro-Quente deu: $%.2f", calc);
			break;
		case 101:
			calc = quant * 12.30;
			System.out.printf("O seu pedido de Bauru simples deu: $%.2f", calc);
			break;
		case 102:
			calc = quant * 13.50;
			System.out.printf("O seu pedido de Bauru c/ovo deu: $%.2f", calc);
			break;
		case 103:
			calc = quant * 11.10;
			System.out.printf("O seu pedido de Hamburguer deu: $%.2f", calc);
			break;
		case 104:
			calc = quant * 12.70;
			System.out.printf("O seu pedido de Cheeseburguer deu: $%.2f", calc);
			break;
		case 105:
			calc = quant * 5.00;
			System.out.printf("O seu pedido de Refrigerante deu: $%.2f", calc);
			break;
		default:
			System.out.println("Recoloque o código, pois o código está errado!");
		}
		leia.close();
	}
}
