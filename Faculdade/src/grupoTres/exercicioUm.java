package grupoTres;
import java.util.Scanner;

public class exercicioUm {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		// dados Funcion�rio
		float salarioBruto[] = new float[10];
		float salarioLiquido[] = new float[10];
		int matricula[] = new int[10];
		String nome[] = new String[10];

		// dados Empresas
		float salarioTotal = 0;
		float descont = 0;

		for (int i = 0; i < matricula.length; i++) {

			System.out.println("Digite sua matr�cula: ");
			matricula[i] = leia.nextInt();
			System.out.println("Digite seu nome: ");
			nome[i] = leia.next();
			System.out.println("Digite seu sal�rio bruto: ");
			salarioBruto[i] = leia.nextFloat();
			salarioBruto[i] = (float) salarioBruto[i];

			// calculo Ternario,define qual o desconto de acordo com o valor do sal�rio
			descont = salarioBruto[i] <= 1500 ? 90 : 142.5f;

			salarioLiquido[i] = salarioBruto[i] - descont;
			salarioLiquido[i] = (float) salarioLiquido[i];

		}
		System.out.println("");
		for (int i = 0; i < matricula.length; i++) {

			System.out.printf("A matr�cula do funcion�rio %s � %d%n", nome[i], matricula[i]);
			System.out.printf("O seu sal�rio L�quido � de %.2f%n", salarioLiquido[i]);
			System.out.println("");

			salarioTotal += salarioLiquido[i];
			salarioTotal = (float) salarioTotal;
		}

		System.out.printf("O sal�rio L�quido Total pago pela a empresa � de %.2f", salarioTotal);
		leia.close();
	}
}
