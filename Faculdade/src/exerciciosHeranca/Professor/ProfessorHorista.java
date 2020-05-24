package exerciciosHeranca.Professor;

public class ProfessorHorista extends Professor{

	private float valorHora;
	private float numeroHoras;

	public ProfessorHorista() {
	}

	public ProfessorHorista(float valorHora, float numeroHoras) {
		this.valorHora = valorHora;
		this.numeroHoras = numeroHoras;
	}
	
	public ProfessorHorista(int matricula, String nome, int idade, float valorHora, float numeroHoras) {
		
		super(matricula, nome, idade);
		this.valorHora = valorHora;
		this.numeroHoras = numeroHoras;
		
	}

	public float getValorHora() {
		return valorHora;
	}

	public void setValorHora(float valorHora) {
		this.valorHora = valorHora;
	}

	public float getNumeroHoras() {
		return numeroHoras;
	}

	public void setNumeroHoras(float numHoras) {
		this.numeroHoras = numHoras;
	}

	public float getSalario() {
		return this.valorHora * this.numeroHoras;
	}

}
