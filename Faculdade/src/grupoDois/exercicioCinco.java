package grupoDois;
import java.util.Scanner;
public class exercicioCinco {
	
	public static void main(String[]args) {
		Scanner leia = new Scanner (System.in);
		
		double [] p = new double[15];
		double [] c = new double[15];
		double media = 0;
		double maiorProduto = 0;
		
		for(int i = 0; i <= 14; i++) {
			
			System.out.println("Digite o código de um produto:");
			c[i] = leia.nextDouble();
			System.out.println("Digite o preço do produto do código anterior:");
			p[i] = leia.nextDouble();
			
		}
		
		for(double cont : p) {
			
			if(cont > maiorProduto) {
				maiorProduto = cont;
			}
			media += cont; 
			
		}
		
		media = media / 15;
		System.out.printf("A média de preço dos produtos é de : %.2f", media);
		
		leia.close();
	}

}
