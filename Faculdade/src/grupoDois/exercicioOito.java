package grupoDois;
import java.util.Scanner;
public class exercicioOito {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		// variáveis
		int mercadorias = 0;
		double valMercadoria = 0;
		double valTotal = 0;

		// Coloquei a entrada de quantos produtos tem e utilizei um array para guardar
		// essa quantidade
		System.out.println("Digite a quantidade de mercadorias em estoque: ");
		mercadorias = leia.nextInt();

		int produtosEstoque[] = new int[mercadorias];

		// Por fim utilizei o tamanho da própria array para ir andando nela e capturando
		// valor de produtos e somando eles
		for (int cont : produtosEstoque) {

			System.out.println("Qual o valor dessa mercadoria?");
			valMercadoria = leia.nextDouble();

			valTotal += valMercadoria;

		}

		System.out.printf("O valor total em estoque é de %.2f\n", valTotal);

		// Tirei o valor médio dos produtos, usando como base para o calculo o número de
		// entrada do tamanho da Array
		valTotal = valTotal / mercadorias;

		System.out.printf("A média de valor dos produtos é de %.2f", valTotal);
		leia.close();
	}

}
