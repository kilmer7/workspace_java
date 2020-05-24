package aulaExceccoes;

import java.util.Scanner;

public class ProgramaException {
	static String alunos[];

	public static void main(String[] args)

	{
		Scanner sc = new Scanner(System.in);

		alunos = new String[10];
		lerNomes();
		int alu = 1;
		while (alu != 0) {
			System.out.print("Numero na turma: ");
			alu = sc.nextInt();
			System.out.println("Aluno > " + alunos[alu - 1]);
		}
		gravarNomes();
	}

	public static void gravarNomes() {
		// BufferedReader arquivo = new BufferedReader(new FileReader("nomes.txt"));
		BufferedWriter arquivo;
		arquivo = new BufferedWriter(new FileWriter("nomes.txt"));
		for (String s : alunos) {
			arquivo.write(s);
			arquivo.newLine();
		}
		arquivo.close();
	}

	public static void lerNomes() {
		BufferedReader arquivo = new BufferedReader(new FileReader("nomes.txt"));
		int cont = 0;
		String s = arquivo.readLine();
		while (s != null) {
			alunos[cont++] = s;
			s = arquivo.readLine();
		}
		arquivo.close();
	}

}