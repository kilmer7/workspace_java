package grupoDois;
import java.util.Scanner;
public class exercicioDois {
	
	public static void main(String[]args) {
		Scanner leia = new Scanner(System.in);
		
		int timeP = 50;
		int time = 0;
		int cont = 1;
		float minutos;
		float segundos;
		double massaInicial = 0;
		
		System.out.println("Digite a massa inicial(em gramas): ");
		massaInicial = leia.nextDouble();
		
		for(time = 0;time <= timeP;time++) {
			cont = cont + 1;
			if(time == 50 & massaInicial > 0.05) {
				
				massaInicial = massaInicial / 2;
				time = 0;
			}
			
		}
		
		minutos = cont / 60;
		segundos = cont % 60;
		
		System.out.printf("O tempo necessário para diminuir a massa há 0,05 é de %.0f minutos e %.0f segundos", minutos, segundos);
		
		leia.close();
	}

}
