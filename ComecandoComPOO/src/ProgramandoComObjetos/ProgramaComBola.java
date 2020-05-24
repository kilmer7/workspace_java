package ProgramandoComObjetos;

public class ProgramaComBola {

	public static void main(String[]args) {
		
		Bola bola = new Bola();
		Bola bola2 = new Bola();
		Bola bola3 = new Bola();
		
		bola.criarBola(15, "Vermelho", true);
		bola.mostrar();
		bola2.criarBola(5, "Amarelo", true);
		bola2.mostrar();
		bola3.criarBola(7, "Azul", true);
		bola3.mostrar();
		
		
		
	}
}
