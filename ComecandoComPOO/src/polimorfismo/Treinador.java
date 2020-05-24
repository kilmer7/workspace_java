package polimorfismo;

public class Treinador {
	
	public static void main(String[]args) {
		
		Animal t;
		t = new Cachorro();
		t.emitirSom("Auauau");
		/*
		t = new Cavalo();
		t.emitirSom("brurururu");
		
		t = new Preguica();
		t.emitirSom("...");
		*/
	}
}
