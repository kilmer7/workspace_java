package ProgramandoComObjetos;

public class Bola {
	/*
	 * Classes Wrapper estudar dentro do java.lang
		Integer tam = 0;
		String cor = "" ;
		Boolean cheia = true;
	*/	
		
	int tama = 0;
	String cor = "";
	boolean cheia = true;
		
		
	
	void pintar(String c) {
		cor = c;
		
	}
	
	void encher() {
		cheia = true;
		
	}
	void esvaziar() {
		cheia = false;
		
	}
	void definirTamanho(int t) {
		tama = t;
		
	}
	void criarBola(int tam, String c, boolean ch) {
		tama = tam;
		cor = c;
		cheia = ch;
	}
	
	void mostrar() {
		System.out.printf("Cor: %s Tamanho: %d%n", cor, tama);
		if(cheia == true) 
			System.out.println("Bola Cheia");
		else
			System.out.println("Bola Mucha");
	}
	

}
