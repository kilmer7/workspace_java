package exercicios;
import java.util.Scanner;
public class exercicioDez {
	
	public static void main(String[]args) {
		Scanner leia = new Scanner(System.in);
		
		int mantDom = 13;
		int mantCom = 18;
		int manutencao = 0;
		double pulsoEx = 0.10;
		int desp = 50;
		
		String telCli;
		int tipoAss;
		double pulsoMes;
		double valPul = 0;
		int quantDesp;
		int valDesp = 0;
		double conta;
		
		System.out.println("Número do telefone do Cliente: ");
		telCli = leia.nextLine();
		System.out.println("Digite o tipo do assinante: ");
		tipoAss = leia.nextInt();
		
		switch(tipoAss){
			
			case 1:
				manutencao = mantDom;
				break;
			case 2:
				manutencao = mantCom;
				break;
			default:
				System.out.println("Você digitou um código inválido, tente novamente!!");
				
		}
		
		System.out.println("Digite o número de pulsos registrados no mês: ");
		pulsoMes = leia.nextDouble();
		
		if(pulsoMes > 90 & tipoAss == 1) {
			pulsoMes = pulsoMes - 90;
			valPul = pulsoMes * pulsoEx;
			
		}else if(pulsoMes > 90 & tipoAss == 2) {
			pulsoMes = pulsoMes - 90;
			valPul = pulsoMes * pulsoEx;
			
		}
		
		System.out.println("Digite quantas vezes foi utilizado o despertador: ");
		quantDesp = leia.nextInt();
		
		valDesp = quantDesp * desp;
		
		conta = manutencao + valPul + valDesp;
		
		System.out.printf("O valor da conta de número %s é de %.2f",telCli ,conta);
		
		leia.close();
	}

}
