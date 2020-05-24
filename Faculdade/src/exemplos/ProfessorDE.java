package exemplos;

public class ProfessorDE {
	
	private String nome;
	private int matricula;
	private int idade;
	private double salario;
	
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
	
	public void setSalario(double salario) {
		
		this.salario = salario;
		
	}
	
	public double getSalario() {
		
		return salario;
		
	}

	//Construtores
	
	public ProfessorDE(String nome, int matricula, int idade, double salario) {
		
	}
	
	public ProfessorDE() {
		
	}
	
}
