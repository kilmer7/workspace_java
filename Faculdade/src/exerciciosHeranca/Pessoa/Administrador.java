package exerciciosHeranca.Pessoa;

public class Administrador extends Empregado {

	// Atributos
	private float ajudaDeCusto;

	// Metódos

	public Administrador() {

	}

	public Administrador(String nome, String endereco, String telefone, int codigoSetor, float salarioBase,
			float imposto, float ajudaDeCusto) {

		super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
		this.ajudaDeCusto = ajudaDeCusto;
	}

	public void getAjudaDeCusto(float ajudaDeCusto) {

		this.ajudaDeCusto = ajudaDeCusto;

	}

	public float setAjudaDeCusto() {

		return ajudaDeCusto;

	}

	// Sobrecarga do Metódo calcularSalario que veio de Empregado
	@Override
	public float calcularSalario() {

		return super.calcularSalario() + ajudaDeCusto;

	}
}
