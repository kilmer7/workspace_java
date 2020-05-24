
public class questao4 {

	public static void main(String[]args ) {
		float invest = 5000.00f;
		float juros = 0.01f;
		float time = 12;
		float montante = 0;
		
		montante = invest *((1 + juros)*time);
		
		System.out.println(montante);
		
	}
}
