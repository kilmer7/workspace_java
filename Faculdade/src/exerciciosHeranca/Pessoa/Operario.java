package exerciciosHeranca.Pessoa;

public class Operario extends Empregado{

	//Atributos
	private int valorProducao;
	private float comissao;
	
	
	//Metódos
	
	public Operario() {
		
		
		
	}
	
	public void setValorProducao(int valorProducao) {
		
		this.valorProducao = valorProducao;
		
	}
	
	public int getValorProducao() {
		
		return valorProducao;
		
	}
	
	public void setComissao(float comissao) {
		
		this.comissao = comissao;
		
	}
	
	public float getComissao() {
		
		return comissao;
		
	}
	
	public float calcularSalario() {
		
		return getSalarioBase() + comissao - getImposto();
		
	}
}
