package exerciciosPOO;
import classesExercicio.MinhaClasse;

public class ProgramaOlaMundo {

	public static void main(String[] args) {
		MinhaClasse aluno;
		aluno = new MinhaClasse();
		float nota1 = 0, nota2 = 0;

		aluno.NomeAluno();
		aluno.Media(nota1, nota2);
		
	}

}
