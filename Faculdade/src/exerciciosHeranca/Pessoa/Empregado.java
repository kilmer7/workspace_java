package exerciciosHeranca.Pessoa;

public class Empregado extends Pessoa{
	
	//Atributos
	private int codigoSetor;
	private float salarioBase;
	private float imposto;
	
	//Métodos
	
	public Empregado() {
		
		
	}
	
	public Empregado(String nome, String Endereco, String telefone, int codigoSetor, float salarioBase, float imposto) {
		
		super(nome, Endereco, telefone);
		this.codigoSetor = codigoSetor;
		this.salarioBase = salarioBase;
		this.imposto = imposto;
		
	}
	
	public void setCodigoSetor(int codigoSetor) {
		
		this.codigoSetor = codigoSetor;		
	}
	
	public int getCodigoSetor() {
		
		return codigoSetor;
		
	}
	
	public void setSalarioBase(float salarioBase) {
		
		this.salarioBase = salarioBase;
		
	}
	
	public float getSalarioBase() {
		
		return salarioBase;
		
	}
	
	public void setImposto(float imposto) {
		
		this.imposto = imposto;
		
	}
	
	public float getImposto() {
		
		return imposto;
		
	}
	
	public float calcularSalario() {
		
		return salarioBase - (salarioBase*imposto/100);
		
	}
	
}
