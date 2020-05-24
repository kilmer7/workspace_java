package exerciciosHeranca.Professor;

public class ProfessorVisitante extends Professor{

	private String instituicao;
	private String paisOrigem;
	
	public ProfessorVisitante() {
		
	}
	
	public ProfessorVisitante(String instituicao, String paisOrigem) {
		
		this.instituicao = instituicao;
		this.paisOrigem = paisOrigem;
		
	}
	
	public ProfessorVisitante(int matricula, String nome, int idade, String instituicao, String paisOrigem) {
		
		super( matricula, nome, idade);
		this.instituicao = instituicao;
		this.paisOrigem = paisOrigem;
		
	}
	
	public String getInstituicao(){
		
		return instituicao;
		
	}
	
	public void setInstituicao(String instituicao) {
		
		this.instituicao = instituicao;
		
	}
	
	public String getPaisOrigem() {
		
		return paisOrigem;
		
	}
	
	public void setPaisOrigem(String paisOrigem) {
		
		this.paisOrigem = paisOrigem;
		
	}
	
}
