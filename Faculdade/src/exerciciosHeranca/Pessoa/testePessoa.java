package exerciciosHeranca.Pessoa;

public class testePessoa {

	public static void main(String[]args) {
		
		//Objetos
		Fornecedor f1 = new Fornecedor();
		Empregado e1 = new Empregado();
		Administrador a1 = new Administrador();
		Operario o1 = new Operario();
		Vendedor v1 = new Vendedor();
		//Mensagens
		
		//Fornecedor
		f1.setNome("Kilmer");
		f1.setEndereco("Rua 58, c/324");
		f1.setTelefone("(85)98570-4094");
		f1.setValorCredito(100);
		f1.setValorDivida(80);
		System.out.println("O nome do fornecedor � :" + f1.getNome());
		System.out.println("O seu endere�o � :" + f1.getEndereco());
		System.out.println("O seu n�mero � :" + f1.getTelefone());
		System.out.println("O valor de Cr�dito � : " + f1.getValorCredito());
		System.out.println("O valor da Divida � :" + f1.getValorDivida());
		System.out.println("O seu saldo � :" + f1.obterSaldo());
		
		System.out.println();
		
		//Empregado
		e1.setNome("Margareth");
		e1.setSalarioBase(1000);
		e1.setImposto(100);
		System.out.println("O nome do Empregado � :" + e1.getNome());
		System.out.println("O seu sal�rio � de :" + e1.getSalarioBase());
		System.out.println("E o imposto que a empresa paga sobre seu sal�rio � de :" + e1.getImposto());
		System.out.println("O seu sal�rio depois de pagar impostos � de :" + e1.calcularSalario());
		
		System.out.println();
		
		//Administrador
		a1.setNome("Lucimar");
		System.out.println("O nome do Administrador � :" + a1.getNome());
		System.out.println("O seu sal�rio depois de pagar impostos � de :" + a1.calcularSalario());
		
		System.out.println();
		
		//Operario
		o1.setNome("Fernando");
		o1.setComissao(300);
		System.out.println("O nome do Oper�rio � :" + o1.getNome());
		System.out.println("O seu sal�rio depois de pagar impostos e receber a comiss�o � de :" + o1.calcularSalario());
		
		System.out.println();
		
		//Vendedor
		v1.setNome("Marcos");
		v1.setComissao(200);
		System.out.println("O nome do Vendedor � :" + v1.getNome());
		System.out.println("O seu sal�rio depois de pagar os impostos e receber a comiss�o � de :" + v1.calcularSalario());
		
	}
	
}
