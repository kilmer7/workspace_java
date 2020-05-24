package exerciciosHeranca.Pessoa;

public class Vendedor extends Empregado{

	//Atributos
	private float valorVendas;
	private float comissao;
	
	//Metódos
	
	public Vendedor() {
		
		
		
	}
	
	public void setValorVendas(float valorVendas) {
		
		this.valorVendas = valorVendas;
		
	}
	
	public float getValorVendas() {
		
		return valorVendas;
		
	}
	
	public void setComissao(float comissao) {
		
		this.comissao = comissao;
		
	}
	
	public float getComissao() {
		
		return comissao;
		
	}
	
	public float calcularSalario() {
		
		return getSalarioBase() - getImposto() + getComissao();
	}
}
