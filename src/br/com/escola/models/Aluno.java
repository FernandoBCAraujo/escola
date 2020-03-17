package br.com.escola.models;

public abstract class Aluno {
	
	private int idAluno;
	
	private String nomeAluno;
	
	private int quantidadeCredito;
	
	private String endereco;
	
	public Aluno() {
		
	}

	public Aluno(int idAluno, String nomeAluno, String endereco) {
		super();
		this.idAluno = idAluno;
		this.nomeAluno = nomeAluno;
		this.endereco = endereco;
	}

	public int getIdAluno() {
		return idAluno;
	}

	public void setIdAluno(int idAluno) {
		this.idAluno = idAluno;
	}

	public String getNomeAluno() {
		return nomeAluno;
	}

	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getQuantidadeCredito() {
		if (quantidadeCredito > 15) {
			System.out.println("número de crédito pode ser de no máximo 15");
		}
		return quantidadeCredito;
	}

	public void setQuantidadeCredito(int quantidadeCredito) {
		this.quantidadeCredito = quantidadeCredito;
	}
	
}
