package exerciciosHeranca.Professor;

public class Professor {

	private int matricula;
	private String nome;
	private int idade;

	public Professor() {
	}
	
	public Professor(int matricula, String nome) {
		
		this.matricula = matricula;
		this.nome = nome;
		
	}

	public Professor(int matricula, String nome, int idade) {
		this.matricula = matricula;
		this.nome = nome;
		this.idade = idade;
	}
	
	//Método toString
	public String toString() {
		
		return matricula + " " + nome;
		
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getIdade() {
		
		return idade;
		
	}
	
	public void setIdade(int idade) {
		
		this.idade = idade;
		
	}

	public float getSalario() {
		return 0;
	}

}
