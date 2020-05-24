package aulaExceccoes;

import javax.swing.JOptionPane;

/**
 *
 * @author Estácio
 */
public class Excecao1 
{
    public static void main(String a[])
    {
        int num1, num2, resultado;
        
        num1 = 999;
        while (num1 != 0) {
            num1 = Integer.parseInt(
                    JOptionPane.showInputDialog("Primeiro Número: (0 = fim)"));

            num2 = Integer.parseInt(
                    JOptionPane.showInputDialog("Segundo Número:"));

            resultado = num1 + num2;
            JOptionPane.showMessageDialog(null, "Soma = " + resultado);

            resultado = num1 * num2;
            JOptionPane.showMessageDialog(null, "Multiplicação = " + resultado);

            resultado = num1 / num2;
            JOptionPane.showMessageDialog(null, "Divisão = " + resultado);
        }

    }
        
}
}
