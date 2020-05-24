package exemplos;

public class ContaCorrente {
	
	String nome;
	int numero;
	float saldo;
	
	void depositar(float valor){
		
		saldo += valor;
	}
	
	void sacar(float valor){
		
		if (valor <= saldo){
			
			saldo -= valor;
		
		}else{
			//???
		}
	}
	
	void abrirConta(String nom, int num){
		
		nome = nom;
		numero = num;
		saldo = 0;
	}
	
}
