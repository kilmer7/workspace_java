package grupoDois;

import java.util.Scanner;

public class exercicioNove {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		//Vari�veis
		int inder = 0;
		int num = 0;
		int contP = 0;
		int contI = 0;
		
		//Fiz o "Sentinela", onde inder fica validando o looping enquanto o usuario n�o colocar 9999
		//e quando colocar 9999, sa� do looping e imprimo quantos impares e pares foram adicionados.
		while (inder != 9999) {
			System.out.println("Digite um n�mero inteiro ou se quiser parar digite 9999: ");
			num = leia.nextInt();

			if (num == 9999) {
				inder = num;
			}
			if (num % 2 == 0) {
				contP++;
			}
			if (num % 2 != 0) {
				contI++;
			}

		}
		System.out.printf("A quantidade de n�meros pares foi de %d\n", contP);
		System.out.printf("A quantidade de n�meros �mpares foi de %d\n", contI);
		
		leia.close();
	}

}
