package exerciciosHeranca.Pessoa;

public class Fornecedor extends Pessoa {

	// Atributos
	private float valorCredito; // crédito máximo
	private float valorDivida; // dívida com o fornecedor

	// Metódos
	public Fornecedor() {

	}

	public Fornecedor(String nome, String endereco, String telefone, float valorCredito, float valorDivida) {
		
		super(nome, endereco, telefone);
		this.valorCredito = valorCredito;
		this.valorDivida = valorDivida;
		
	}
	public float getValorCredito() {

		return valorCredito;

	}

	public void setValorCredito(float valorCredito) {

		this.valorCredito = valorCredito;

	}

	public float getValorDivida() {

		return valorDivida;

	}

	public void setValorDivida(float valorDivida) {

		this.valorDivida = valorDivida;

	}

	public float obterSaldo() {

		return valorCredito - valorDivida;

	}
}
