package classeExercicio;

public class CarroCorrida {
	
	//Atributos
	
	private int numeroCarro;
	private String piloto;
	private String equipe;
	private float velocidadeMaxima;
	private float velocidadeAtual;
	private boolean ligado;
	
	//Metódos
	
	public CarroCorrida(int numeroCarro, String piloto, String equipe, float velocidadeMaxima) {
		
		
		
	}
	
	public int getNumeroCarro() {
		
		return numeroCarro;
		
	}
	
	public void setNumeroCarro(int numeroCarro) {
		
		this.numeroCarro = numeroCarro;
		
	}
	
	public String getPiloto() {
		
		return piloto;
		
	}
	
	public void setPiloto(String piloto) {
		
		this.piloto = piloto;
		
	}
	
	public String getEquipe() {
		
		return equipe;
		
	}
	
	public void setEquipe(String equipe) {
		
		this.equipe = equipe;
		
	}
	public float getVelocidadeMaxima() {
		
		return velocidadeMaxima;
		
	}
	
	public void setVelocidadeMaxima(float velocidadeMaxima) {
		
		this.velocidadeMaxima = velocidadeMaxima;
		
	}
	public float getVelocidadeAtual() {
		
		return velocidadeAtual;
		
	}
	
	public void setVelocidadeAtual(float velocidadeAtual) {
		
		this.velocidadeAtual = velocidadeAtual;
		
	}
	
	public boolean getLigado() {
		
		return ligado;
		
	}
	
	public void setLigado(boolean ligado) {
		
		this.ligado = ligado;
		
	}
	
	public float acelerar(float velocidadeAtual) {
		//aumenta unidades em Km/h
		if(ligado == true) {
			return velocidadeAtual;
		}
		return 0;	
	}
	
	public float frear(float velocidadeAtual) {
		//reduz a velocidade em percentual (%) de frenagem
		if(ligado == true) {
			return velocidadeAtual;
		}
		return 0;
	}
	
	public void parar() {
		
		
		
	}
	
	public void ligar() {
		
		
		
	}
	
	public void desligar() {
		
		//carro só desliga se tiver parado, ou seja a sua velocidade atual tem q ser 0.
		if(velocidadeAtual == 0)
			ligado = false;
		
	}

}
