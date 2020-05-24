package exemplos;

public class Bola {
	
	String cor;
	int tamanho;
	String material;
	boolean estado;
	
	void criar(String c, int t, String m){
		
		cor = c;
		tamanho = t;
		material = m;
		estado = false;
	}
	
	void pintar(String c){
		
		cor = c;
	}
	
	void esvaziar(){
		
		estado = false;
	}
	
	void encher(){
		
		estado = true;
	}
	
	void definirTamanho(int tam){
		
		tamanho = tam;
	}

	void definirMaterial(String mat){
		
		material = mat;
	}
	
	void mostrarEstado(){
		
		System.out.println("Estado da Bola:");
		System.out.println("Cor: " + cor);
		System.out.println("Tamanho: " + tamanho);
		System.out.println("Material: " + material);
		System.out.println("Está: " + (estado==true?"Cheia":"Vazia"));
	}

}
