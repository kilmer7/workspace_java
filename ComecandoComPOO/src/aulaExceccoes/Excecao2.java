package aulaExceccoes;

import java.util.Scanner;
import javax.swing.JOptionPane;

/*
 * Escreva um programa que armazene em um vetor os nomes dos meses
 * do ano, em seguida peça ao usuário que digite um valor inteiro.
 * Após isso, mostrar o nome do mês correspondente ao número digitado.
 * 
 * O programa deve finalizar quando for digitado o valor zero.
 * 
 * Deve tratar através de exceções a digitação inválida e o índice 
 * do mês inválido. 
 *
*/
public class Excecao2 {
	public static void main(String[] a) {

		String meses[] = { "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro",
				"Outubro", "Novembro", "Dezembro" };

		int mes = 1;
		while (mes != 0) {
			try {
				mes = Integer.parseInt(JOptionPane.showInputDialog("Numero do mês (0 para finalizar):"));
			}			
			catch(NumberFormatException nexc){
				JOptionPane.showMessageDialog(null, "Senhor, coloque um número válido!!!");
			}
			if (mes <= 0) {
				continue;
			}
			try {
				JOptionPane.showMessageDialog(null, "Nome do mês = " + meses[mes - 1]);
			}
			
			catch(ArrayIndexOutOfBoundsException nexc){
				JOptionPane.showMessageDialog(null, "Número do mês é INVÁLIDO!!");
			}
			
		}
		System.out.println("# fim do programa #");

	}
}
