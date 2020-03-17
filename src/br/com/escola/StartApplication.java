package br.com.escola;

import br.com.escola.dao.InsertDisciplina;
import br.com.escola.dao.InsertTurma;
import br.com.escola.dao.SelectAlunosPorTurma;
import br.com.escola.models.Disciplina;
import br.com.escola.models.Turma;

public class StartApplication {

	public static void main(String[] args) {

		Turma turma = new Turma();
		Disciplina disciplina = new Disciplina();
		InsertTurma insertTurma = new InsertTurma();
		InsertDisciplina insertDisciplina = new InsertDisciplina();
		SelectAlunosPorTurma selectAlunosPorTurma = new SelectAlunosPorTurma();
//		
//		
//		turma.setCodigoTurma("Teste Português 23");
//		turma.setQuantidadeAluno(1);
//		
//		disciplina.setNomeDisciplina("Português 23");
//		disciplina.setValorCredito(3);
//		
//		insertTurma.insertTurma(turma);
//		System.out.println(turma.getIdTurma());
//		insertDisciplina.insertDisciplina(disciplina, 1);
		
		selectAlunosPorTurma.selecionarAlunosPorTurma("1");
		
	}

}