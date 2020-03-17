package br.com.escola.models;

public class Turma {
	
	private int idTurma;
	
	private String codigoTurma;
	
	private int quantidadeAluno;
	
	
	public Turma () {
		
	}

	public Turma(int idTurma, String codigoTurma) {
		super();
		this.setIdTurma(idTurma);
		this.setCodigoTurma(codigoTurma);
	}

	public int getIdTurma() {
		return idTurma;
	}

	public void setIdTurma(int idTurma) {
		this.idTurma = idTurma;
	}

	public String getCodigoTurma() {
		return codigoTurma;
	}

	public void setCodigoTurma(String codigoTurma) {
		this.codigoTurma = codigoTurma;
	}
	
	public int getQuantidadeAluno() {
		return quantidadeAluno;
	}

	public void setQuantidadeAluno(int quantidadeAluno) {
		if (quantidadeAluno > 5) {
			System.out.println("Quantidade máxima de alunos por turma é de 5.");
			this.quantidadeAluno = 5;
		}
		this.quantidadeAluno = quantidadeAluno;
	}


}
