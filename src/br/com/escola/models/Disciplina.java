package br.com.escola.models;

public class Disciplina {
	
	private int idDisciplina;
	
	private String nomeDisciplina;
	
	private int valorCredito;
	
	public Disciplina () {
		
	}

	public Disciplina(int idDisciplina, String nomeDisciplina, int valorCredito) {
		super();
		this.idDisciplina = idDisciplina;
		this.nomeDisciplina = nomeDisciplina;
		this.valorCredito = valorCredito;
	}

	public int getIdDisciplina() {
		return idDisciplina;
	}

	public void setIdDisciplina(int idDisciplina) {
		this.idDisciplina = idDisciplina;
	}

	public String getNomeDisciplina() {
		return nomeDisciplina;
	}

	public void setNomeDisciplina(String nomeDisciplina) {
		this.nomeDisciplina = nomeDisciplina;
	}

	public int getValorCredito() {
		return valorCredito;
	}

	public void setValorCredito(int valorCredito) {
		this.valorCredito = valorCredito;
	}
	
}
