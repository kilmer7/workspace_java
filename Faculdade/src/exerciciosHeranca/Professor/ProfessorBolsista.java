package exerciciosHeranca.Professor;

public class ProfessorBolsista extends Professor{

	private float valorBolsa;

	public ProfessorBolsista() {
	}

	public ProfessorBolsista(float valorBolsa) {
		this.valorBolsa = valorBolsa;
	}
	
	public ProfessorBolsista(int matricula, String nome, int idade, float valorBolsa) {
		
		super( matricula, nome, idade);
		this.valorBolsa = valorBolsa;
		
	}

	public float getValorBolsa() {
		return valorBolsa;
	}

	public void setValorBolsa(float valorBolsa) {
		this.valorBolsa = valorBolsa;
	}

	public float getSalario() {
		return this.getValorBolsa();
	}

}
