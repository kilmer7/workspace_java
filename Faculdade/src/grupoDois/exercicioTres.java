package grupoDois;
import java.util.Scanner;
public class exercicioTres {
	
	public static void main(String[]args) {
		Scanner leia = new Scanner(System.in);
		
			int mes = 0;
			int loop = 1;
			int resposta = 0;
			
			meses(mes);
			while(loop > 0) {
			System.out.println("Deseja executar o programa denovo? Digite 1 se for SIM e Digite 2 se for N�O");
			resposta = leia.nextInt();	
			if(resposta == 1) {
				meses(mes);
			}else if(resposta == 2){
				loop = 0;
			}else {
				System.out.println("Digite um valor poss�vel de entender!");
				continue;
			}
		}
			leia.close();
	}
	static int meses(int mes) {
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite um n�mero de acordo com o m�s do ano: ");
		mes = leia.nextInt();
		if(mes == 1) {
			System.out.println("Janeiro � um m�s de 31 dias");
		}else if(mes == 2) {
			System.out.println("Fevereiro � um m�s de 28 dias");
		}else if(mes == 3) {
			System.out.println("Mar�o � um m�s de 31 dias");
		}else if(mes == 4) {
			System.out.println("Abril � um m�s de 30 dias");
		}else if(mes == 5) {
			System.out.println("Maio � um m�s de 31 dias");
		}else if(mes == 6) {
			System.out.println("Junho � um m�s de 30 dias");
		}else if(mes == 7) {
			System.out.println("Julho � um m�s de 31 dias");
		}else if(mes == 8) {
			System.out.println("Agosto � um m�s de 31 dias");
		}else if(mes == 9) {
			System.out.println("Setembro � um m�s de 30 dias");
		}else if(mes == 10) {
			System.out.println("Outubro � um m�s de 31 dias");
		}else if(mes == 11) {
			System.out.println("Novembro � um m�s de 30 dias");
		}else if(mes == 12) {
			System.out.println("Dezembro � um m�s de 31 dias");
		}else {
			System.out.println("C�digo inv�lido, reinsira um c�digo v�lido!");
		}
		leia.close();
		return(mes);
	}
}
