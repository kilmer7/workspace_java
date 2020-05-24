package exerciciosHeranca.Professor;

public class ProgramaProfessores {

	public static void main(String[]args) {
		
		//Professores Fixos
		ProfessorDE prof1 = new ProfessorDE();
		ProfessorDE prof2 = new ProfessorDE();
		ProfessorDE prof3 = new ProfessorDE();
		ProfessorDE prof4 = new ProfessorDE();
		ProfessorDE prof5 = new ProfessorDE();
		
		//Professores Horistas
		ProfessorHorista prof6 = new ProfessorHorista();
		ProfessorHorista prof7 = new ProfessorHorista();
		ProfessorHorista prof8 = new ProfessorHorista();
		ProfessorHorista prof9 = new ProfessorHorista();
		ProfessorHorista prof10 = new ProfessorHorista();
		
		//Professores Bolsistas
		ProfessorBolsista prof11 = new ProfessorBolsista();
		ProfessorBolsista prof12 = new ProfessorBolsista();
		ProfessorBolsista prof13 = new ProfessorBolsista();
		
		//Professores Visitantes
		ProfessorVisitante prof14 = new ProfessorVisitante();
		ProfessorVisitante prof15 = new ProfessorVisitante();
		
		
		//Professores Fixos
		prof1.setNome("Diego");
		prof1.setSalario(3000);
		prof2.setNome("Paulo");
		prof2.setSalario(3000);
		prof3.setNome("Henrique");
		prof3.setSalario(3000);
		prof4.setNome("Diego");
		prof4.setSalario(3000);
		prof5.setNome("Jorge");
		prof5.setSalario(3000);
		
		//Professores Horistas
		prof6.setNome("Diogo");
		prof6.setValorHora(55);
		prof6.setNumeroHoras(10);
		prof7.setNome("Pedro");
		prof7.setValorHora(55);
		prof7.setNumeroHoras(10);
		prof8.setNome("Gabriel");
		prof8.setValorHora(55);
		prof8.setNumeroHoras(10);
		prof9.setNome("Miguel");
		prof9.setValorHora(55);
		prof9.setNumeroHoras(10);
		prof10.setNome("Joao");
		prof10.setValorHora(55);
		prof10.setNumeroHoras(10);
		
		//Professores Bolsistas
		prof11.setNome("Aguiar");
		prof11.setValorBolsa(500);
		prof12.setNome("Rita");
		prof12.setValorBolsa(500);
		prof13.setNome("Bianca");
		prof13.setValorBolsa(500);
		
		//Professores Visitantes
		prof14.setNome("Kilmer");
		prof15.setNome("Barbára");
		
		//Print do Salário com nomes
		
		System.out.println(prof1);
		System.out.println("Salário do prof." + prof2.getNome() + " = " + prof2.getSalario());
		System.out.println("Salário do prof." + prof3.getNome() + " = " + prof3.getSalario());
		System.out.println("Salário do prof." + prof4.getNome() + " = " + prof4.getSalario());
		System.out.println("Salário do prof." + prof5.getNome() + " = " + prof5.getSalario());
		System.out.println("Salário do prof." + prof6.getNome() + " = " + prof6.getSalario());
		System.out.println("Salário do prof." + prof7.getNome() + " = " + prof7.getSalario());
		System.out.println("Salário do prof." + prof8.getNome() + " = " + prof8.getSalario());
		System.out.println("Salário do prof." + prof9.getNome() + " = " + prof9.getSalario());
		System.out.println("Salário do prof." + prof10.getNome() + " = " + prof10.getSalario());
		System.out.println("Salário do prof." + prof11.getNome() + " = " + prof11.getSalario());
		System.out.println("Salário do prof." + prof12.getNome() + " = " + prof12.getSalario());
		System.out.println("Salário do prof." + prof13.getNome() + " = " + prof13.getSalario());
		System.out.println("Salário do prof." + prof14.getNome() + " = " + prof14.getSalario());
		System.out.println("Salário do prof." + prof15.getNome() + " = " + prof15.getSalario());
	}
	
}
