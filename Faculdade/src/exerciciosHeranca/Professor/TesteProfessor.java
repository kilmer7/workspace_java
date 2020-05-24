package exerciciosHeranca.Professor;

public class TesteProfessor {

	public static void main(String[] args) {
		ProfessorDE prof1 = new ProfessorDE();

		ProfessorHorista prof2 = new ProfessorHorista();

		ProfessorBolsista prof3 = new ProfessorBolsista();
		
		ProfessorVisitante prof4 = new ProfessorVisitante();

		prof1.setMatricula(1);
		prof1.setNome("Alberto");
		prof1.setIdade(40);
		prof1.setSalario(3000);

		prof2.setMatricula(2);
		prof2.setNome("Bianca");
		prof2.setIdade(30);
		prof2.setValorHora(50);
		prof2.setNumeroHoras(20);

		prof3.setMatricula(3);
		prof3.setNome("Joana");
		prof3.setIdade(21);
		prof3.setValorBolsa(100);
		
		prof4.setMatricula(4);
		prof4.setNome("Paulo");
		prof4.setIdade(24);
		prof4.setInstituicao("Estácio");
		prof4.setPaisOrigem("Brasil");

		System.out.println("Salario Prof 1 = " + prof1.getSalario());
		System.out.println("Salario Prof 2 = " + prof2.getSalario());
		System.out.println("Salario Prof 3 = " + prof3.getSalario());
		System.out.println("Salario Prof 4 = " + prof4.getSalario());
	}

}
