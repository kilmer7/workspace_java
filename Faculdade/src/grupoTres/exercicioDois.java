package grupoTres;
import java.util.Scanner;

public class exercicioDois {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		// vari�veis Arrays
		String nome[] = new String[10];
		float tempProfi[] = new float[10];

		// vari�veis
		float tempMedio = 0;
		float inter = 0;
		String profVelho = "";
		float profTemp = 0;
		int k = 0;

		for (int i = 0; i < tempProfi.length; i++) {

			System.out.println("Escreva seu nome: ");
			nome[i] = leia.next();
			System.out.println("Digite seu tempo de carreira: ");
			tempProfi[i] = leia.nextFloat();
			tempProfi[i] = (float) tempProfi[i];

		}

		for (float cont : tempProfi) {

			if (cont > inter) {
				k += k;
				inter = cont;
				profVelho = nome[k];
				profTemp = tempProfi[k];
				profTemp = (float) profTemp;
			}
			tempMedio += cont;

		}

		tempMedio = tempMedio / 10;
		System.out.println("");
		System.out.printf("O tempo m�dio de profiss�o desses professores � de %.2f%n anos", tempMedio);
		System.out.printf("o professor mais antigo dessa faculdade � o %s com %.2f anos de servi�o.", profVelho,
				profTemp);
		leia.close();
	}
}
