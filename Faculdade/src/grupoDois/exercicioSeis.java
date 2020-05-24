package grupoDois;

import java.util.Scanner;

public class exercicioSeis {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		// variáveis
		float notaP[] = new float[2];
		float notaB[] = new float[2];
		float media[] = new float[2];
		double mediaGeral = 0;

		// Primeiro eu recolho todas as notas dos alunos com suas médias...
		for (int hep = 0; hep < notaP.length; hep++) {

			System.out.println("Digite a sua primeira nota: ");
			notaP[hep] = leia.nextFloat();
			System.out.println("Digite a sua segunda nota: ");
			notaB[hep] = leia.nextFloat();

			media[hep] = (notaP[hep] + notaB[hep]) / 2;
			System.out.printf("A media do aluno número %d é %.1f\n", hep + 1, media[hep]);
		}

		double maiorMedia = 0;

		// Depois eu faço a soma de todas as médias e defino a média da turma e dentro
		// da váriavel "maiorMedia" eu guardo a media do aluno.
		for (double cont : media) {

			if (cont > maiorMedia) {
				maiorMedia = cont;
			}
			mediaGeral += cont;

		}

		mediaGeral = mediaGeral / 30;
		System.out.printf("A media da classe é de %.2f\n", mediaGeral);
		System.out.printf("O aluno com a maior média é %.2f ", maiorMedia);
		leia.close();
	}
}
