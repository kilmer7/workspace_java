package exerciciosHeranca.Professor;

public class ProfessorDE extends Professor {

	private float salario;

	public ProfessorDE() {
	}

	/*
	 * public ProfessorDE(int matricula, String nome, float salario) {
	 * 
	 * setMatricula(matricula); setNome(nome); this.salario = salario;
	 * 
	 * }
	 */

	public ProfessorDE(int matricula, String nome, int idade, float salario) {

		super( matricula, nome, idade);
		this.salario = salario;

	}

	public ProfessorDE(float salario) {
		this.salario = salario;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

}
