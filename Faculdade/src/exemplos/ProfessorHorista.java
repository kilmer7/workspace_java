package exemplos;

public class ProfessorHorista {
	
	private String nome;
	private int matricula;
	private int idade;
	private float valorHora;
	private float quantHora;
	
	//Métodos
	
	public void setNome(String nome) {
		
		this.nome = nome;
		
	}
	
	public String getNome() {
		
		return nome;
		
	}
	
	public void setMatricula(int matricula) {
		
		this.matricula = matricula;
		
	}
	
	public int getMatricula() {
		
		return matricula;
		
	}

	public void setIdade(int idade) {
		
		this.idade = idade;
		
	}
	
	public int getIdade() {
		
		return idade;
		
	}
	
	public void setValorHora(float valorHora) {
		
		this.valorHora = valorHora;
		
	}
	
	public float getValorHora() {
		
		return valorHora;
		
	}
	
	public void setQuantHora(float quantHora) {
		
		this.quantHora = quantHora;
		
	}
	
	public float getQuantHora() {
		
		return quantHora;
		
	}

	//Construtores
	
	public ProfessorHorista(String nome, int matricula, int idade, float valorHora, float quantHora) {
			
	}
	
	public ProfessorHorista() {
		
	}
	
}
