package polimorfismo;

public class Preguica extends Animal{
	
	//Atributos
	private boolean subirArvore;
	
	//Met�dos
	
	public Preguica() {
		
		
	}
	
	public Preguica(String nome, int idade, boolean subirArvore) {
		
		super(nome, idade);
		this.subirArvore = subirArvore;
		
	}
	
	public void setSubirArvore(boolean subirArvore) {
		
		this.subirArvore = subirArvore;
		
	}
	
	public boolean getSubirArvore() {
		
		return subirArvore;
		
	}
}
