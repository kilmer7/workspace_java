package grupoDois;

import java.util.Scanner;

public class exercicioDez {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		String candidatos[] = new String[5];
		int candidato = 0;
		int vencedor = 0;
		int cont[] = new int[5];

		for (int i = 0; i <= 4; i++) {
			System.out.println("Digite o nome do candidato: ");
			candidatos[i] = leia.nextLine();
		}
		System.out.println("Hora da votação!");
		for (int i = 5; i != 0; i--) {
			System.out.println("Digite o número do seu candidato:");
			candidato = leia.nextInt();
			switch (candidato) {
			case 1:
				cont[0]++;
				break;
			case 2:
				cont[1]++;
				break;
			case 3:
				cont[2]++;
				break;
			case 4:
				cont[3]++;
				break;
			case 5:
				cont[4]++;
				break;
			default:
			}
		}
		for (int i = 0; i < candidatos.length; i++) {
			System.out.printf("O candidato %s teve %d de votos.\n", candidatos[i], cont[i]);
		}

		for (int apar : cont) {
			if (apar > vencedor) {
				vencedor = apar;
			}
			apar += apar;
		}

		System.out.printf("O vencedor da Eleição foi o candidato %d", vencedor);

		leia.close();
	}

}
