package ProgramandoComObjetos;
import javax.swing.JOptionPane;

public class Conta {
	
	//atributos - ESTADO
	int numeroConta;
	String nomeCliente;
	double saldo;
	String[] historico;
	int contador = 0;
	
	//metódos - COMPORTAMENTO
	
	void movimentar(double valor, char tipo) {
		
		if(tipo == 'C' || tipo == 'c') {
			creditar(valor);
		}else {
			if(tipo == 'D' || tipo == 'd')
				debitar(valor);
		}
		
	}
	
	void creditar(double valor) {
		
		valor = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o valor:","Depositar",JOptionPane.PLAIN_MESSAGE));
		
		if(valor > 0) {
			saldo += valor;
			if(contador < 1000)
				historico[contador++] = "Creditou R$ "+valor;
			
		}
	}
	
	void debitar(double valor) {
		
		valor = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o valor:","Sacar",JOptionPane.PLAIN_MESSAGE));
		
		if(saldo >= valor && valor > 0) {
			saldo -= valor;
			if(contador < 1000)
				historico[contador++] = "Debitou R$ "+valor;
		}
		
	}
	
	double consultarSaldo() {
		return saldo;
	}
	
	void criarConta(int conta, String cliente) {
		numeroConta = conta;
		nomeCliente = cliente;
		saldo = 0;
		historico = new String[1000];
		
		numeroConta = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o número da conta:","Criar Conta",JOptionPane.PLAIN_MESSAGE));
		nomeCliente = JOptionPane.showInputDialog("Digite o seu nome:");
		
	}
	
	void alterarNome(String nome) {
		nomeCliente = nome;
		
		nomeCliente = JOptionPane.showInputDialog("Digite o seu nome:");
	}
	
	void mostrarHistorico() {
		
		for(int i = 0;i < contador ;i++) {
			System.out.println(historico[i]);
		}
		
	}
	

}
