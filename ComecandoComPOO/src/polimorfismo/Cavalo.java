package polimorfismo;

public class Cavalo extends Animal{
	
	//Atributos
	private boolean correr;
	
	//Metódos
	
	public Cavalo() {
		
	}
	
	public Cavalo(String nome, int idade, boolean correr) {
		
		super(nome,idade);
		this.correr = correr;
		
	}
	
	public void setCorrer(boolean correr) {
		
		this.correr = correr;
		
	}
	
	public boolean getCorrer() {
		
		return correr;
		
	}

}
