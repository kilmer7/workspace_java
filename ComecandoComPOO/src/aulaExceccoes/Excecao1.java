package aulaExceccoes;

import javax.swing.JOptionPane;

/**
 *
 * @author Est�cio
 */
public class Excecao1 
{
    public static void main(String a[])
    {
        int num1, num2, resultado;
        
        num1 = 999;
        while (num1 != 0) {
            num1 = Integer.parseInt(
                    JOptionPane.showInputDialog("Primeiro N�mero: (0 = fim)"));

            num2 = Integer.parseInt(
                    JOptionPane.showInputDialog("Segundo N�mero:"));

            resultado = num1 + num2;
            JOptionPane.showMessageDialog(null, "Soma = " + resultado);

            resultado = num1 * num2;
            JOptionPane.showMessageDialog(null, "Multiplica��o = " + resultado);

            resultado = num1 / num2;
            JOptionPane.showMessageDialog(null, "Divis�o = " + resultado);
        }

    }
        
}
}
