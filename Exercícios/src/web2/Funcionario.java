package web2;

public class Funcionario {
	//atributos do Funcionário
	private String nome = new String("");
	private int idade;
	private float salario;
	private float horasMes;	
	
	//Getters e Setters de cada Atributo
	public String getNome() {
		return nome;
	}

	public int getIdade(){
		return idade;
	}
		
	public float getSalario(){
		return salario;
	}
	
	public void setSalario(float salario){
		this.salario = salario;
	}
	
	public float getHorasMes(){
		return horasMes;
	}
	
	public void setHorasMes(float horasMes){
		this.horasMes = horasMes;
	}

	void mostrarDados(){
		
	}
	
	int calcularSalario(int salario){
		return salario;
	}
	
	Funcionario (String nome, int idade){
		
	}
	
	Funcionario (String nome){
		
		this.idade = 18;
			
		
		
	}
	
}
