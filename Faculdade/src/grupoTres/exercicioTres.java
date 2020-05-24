package grupoTres;

import java.util.Scanner;
import java.util.Random;

public class exercicioTres {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Random aleat = new Random();

		// variaveis
		int preci = 0;
		int preciDia[] = new int[365];
		int preciMes[] = new int[12];
		String nomeMes[] = { "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro",
				"Outubro", "Novembro", "Dezembro" };
		// meses
		int janeiro[] = new int[31];
		int fevereiro[] = new int[28];
		int marco[] = new int[31];
		int abril[] = new int[30];
		int maio[] = new int[31];
		int junho[] = new int[30];
		int julho[] = new int[31];
		int agosto[] = new int[31];
		int setembro[] = new int[30];
		int outubro[] = new int[31];
		int novembro[] = new int[30];
		int dezembro[] = new int[31];

		int mes = 0;
		int cont = 0;

		for (int i = 0; i <= janeiro.length; i++) {

			preci = aleat.nextInt(100);
			janeiro[i] = preci;
			cont += janeiro[i];
			if(i == janeiro.length) {
				System.out.println(cont);
			}

		}

	/*	for (int i = 0; i < fevereiro.length; i++) {

			preci = aleat.nextInt(10000);
			fevereiro[i] = preci;
			cont += fevereiro[i];
			if(i == fevereiro.length) {
				System.out.println(cont);
			}

		}
		for (int i = 0; i < marco.length; i++) {

			preci = aleat.nextInt(10000);
			marco[i] = preci;
			cont += marco[i];
			System.out.println(cont);

		}
		for (int i = 0; i < abril.length; i++) {

			preci = aleat.nextInt(10000);
			abril[i] = preci;
			cont += abril[i];
			System.out.println(cont);

		}
		for (int i = 0; i < maio.length; i++) {

			preci = aleat.nextInt(10000);
			maio[i] = preci;
			cont += maio[i];
			System.out.println(cont);

		}
		for (int i = 0; i < junho.length; i++) {

			preci = aleat.nextInt(10000);
			junho[i] = preci;
			cont += junho[i];
			System.out.println(cont);

		}
		for (int i = 0; i < julho.length; i++) {

			preci = aleat.nextInt(10000);
			julho[i] = preci;
			cont += julho[i];
			System.out.println(cont);

		}
		for (int i = 0; i < agosto.length; i++) {

			preci = aleat.nextInt(10000);
			agosto[i] = preci;
			cont += agosto[i];
			System.out.println(cont);

		}
		for (int i = 0; i < setembro.length; i++) {

			preci = aleat.nextInt(10000);
			setembro[i] = preci;
			cont += setembro[i];
			System.out.println(cont);

		}
		for (int i = 0; i < outubro.length; i++) {

			preci = aleat.nextInt(10000);
			outubro[i] = preci;
			cont += outubro[i];
			System.out.println(cont);

		}
		for (int i = 0; i < novembro.length; i++) {

			preci = aleat.nextInt(10000);
			novembro[i] = preci;
			cont += novembro[i];
			System.out.println(cont);

		}
		for (int i = 0; i < dezembro.length; i++) {

			preci = aleat.nextInt(10000);
			dezembro[i] = preci;
			cont += dezembro[i];
			System.out.println(cont);

		}*/
	}
}