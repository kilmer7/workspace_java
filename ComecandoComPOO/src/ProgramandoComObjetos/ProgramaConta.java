package ProgramandoComObjetos;

import javax.swing.JOptionPane;

public class ProgramaConta {

	public static void main(String[] args) {
		
		
		//variáveis
		Conta conta = new Conta();
		int opcao = 1;
		String opcoes = "Programa de Conta Corrente\n" + "1-Criar conta\n" + "2-Depositar Valor\n" + "3-Sacar Valor\n"
				+ "4-Consultar Saldo\n" + "5-Mostrar Histórico\n" + "0-Finalizar\n\n" + "Digite a opção desejada:";
		//looping
		while (opcao != 0) {

			opcao = Integer.parseInt(JOptionPane.showInputDialog(null, opcoes, "Exercício de Conta Corrente",
					JOptionPane.QUESTION_MESSAGE));

			if (opcao == 0) {
				continue;
			}

			switch (opcao) {

			case 1:
				conta.criarConta(conta.numeroConta, conta.nomeCliente);
				break;
			case 2:
				conta.creditar(conta.saldo);
				break;
			case 3:
				conta.debitar(conta.saldo);
				break;
			case 4:
				conta.consultarSaldo();
				break;
			case 5:
				conta.mostrarHistorico();
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opção Inválida.\nSelecione uma opção do Menu", "ERRO!!",
						JOptionPane.ERROR_MESSAGE);

			}

		}

		System.out.println("#Fim do Programa#");
		System.out.println("bye...Adios...hasta luego...tchau...até uma outra vida...");

	}

}
