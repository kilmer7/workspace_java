package aulaExceccoes;

import java.util.Scanner;
import javax.swing.JOptionPane;

/*
 * Escreva um programa que armazene em um vetor os nomes dos meses
 * do ano, em seguida pe�a ao usu�rio que digite um valor inteiro.
 * Ap�s isso, mostrar o nome do m�s correspondente ao n�mero digitado.
 * 
 * O programa deve finalizar quando for digitado o valor zero.
 * 
 * Deve tratar atrav�s de exce��es a digita��o inv�lida e o �ndice 
 * do m�s inv�lido. 
 *
*/
public class Excecao2 {
	public static void main(String[] a) {

		String meses[] = { "Janeiro", "Fevereiro", "Mar�o", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro",
				"Outubro", "Novembro", "Dezembro" };

		int mes = 1;
		while (mes != 0) {
			try {
				mes = Integer.parseInt(JOptionPane.showInputDialog("Numero do m�s (0 para finalizar):"));
			}			
			catch(NumberFormatException nexc){
				JOptionPane.showMessageDialog(null, "Senhor, coloque um n�mero v�lido!!!");
			}
			if (mes <= 0) {
				continue;
			}
			try {
				JOptionPane.showMessageDialog(null, "Nome do m�s = " + meses[mes - 1]);
			}
			
			catch(ArrayIndexOutOfBoundsException nexc){
				JOptionPane.showMessageDialog(null, "N�mero do m�s � INV�LIDO!!");
			}
			
		}
		System.out.println("# fim do programa #");

	}
}
