package ProgramandoComObjetos;

public class Calculadora {
	
	public double somar(double a, double b) {
		
		return a+b;
	}
	
	public double subtrair(double a, double b) {
		
		return a-b;
	}
	
	public double multiplicar(double a, double b) {
		
		return a*b;
	}
	
	public double dividir(double a, double b) {
		
		return a/b;
	}
	
	public double potencia(int a, int b) {
		int pot = a;
		for(int i = 0;i < b - 1;i++) {
			pot = pot*a;
		}
		a = pot;
		return (int)a;
	}
	
	public double raizQuadrada(double a) {
		double b = 2;
		
		
		
		return a;
	}

}
