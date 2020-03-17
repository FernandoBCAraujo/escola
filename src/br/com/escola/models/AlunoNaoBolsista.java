package br.com.escola.models;

public class AlunoNaoBolsista extends Aluno{
	
	private int valorMensalidade;
	
	public AlunoNaoBolsista() {
		
	}

	public AlunoNaoBolsista(int valorMensalidade) {
		super();
		this.valorMensalidade = valorMensalidade;
	}

	public int getValorMensalidade() {
		return valorMensalidade;
	}

	public void setValorMensalidade(int valorMensalidade) {
		this.valorMensalidade = valorMensalidade;
	}

}
