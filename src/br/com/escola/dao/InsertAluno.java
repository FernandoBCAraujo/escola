package br.com.escola.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import br.com.escola.models.AlunoNaoBolsista;

public class InsertAluno {

	public void insertTurma(AlunoNaoBolsista aluno, int idTurma) {
		try {
			String url = "jdbc:mysql://localhost/escola";
			String user = "root";
			String pass = "1234";

			Class.forName("com.mysql.jdbc.Driver");
			Connection cn = DriverManager.getConnection(url, user, pass);
			cn.setAutoCommit(false);
			System.out.println("Connection successfully established!");

			PreparedStatement pStmt = cn.prepareStatement(
					"INSERT INTO Aluno (idAluno, nomeAluno, quantidadeCredito, endereco, valorMensalidade, Turma_idTurma) VALUES (?, ?, ?, ?, ?, ?)");

			pStmt.setInt(1, aluno.getIdAluno());
			pStmt.setString(2, aluno.getNomeAluno());
			pStmt.setInt(3, aluno.getQuantidadeCredito());
			pStmt.setString(4, aluno.getEndereco());
			pStmt.setInt(5, aluno.getValorMensalidade());
			pStmt.setInt(6, idTurma);

			int rows = pStmt.executeUpdate();
			cn.commit();
			System.out.println(rows + " row(s) added!");

			cn.close();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}
