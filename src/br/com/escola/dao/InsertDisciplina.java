package br.com.escola.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import br.com.escola.models.Disciplina;

public class InsertDisciplina {

	public void insertDisciplina(Disciplina disciplina, int idTurma) {
		try {
			String url = "jdbc:mysql://localhost/escola";
			String user = "root";
			String pass = "1234";

			Class.forName("com.mysql.jdbc.Driver");
			Connection cn = DriverManager.getConnection(url, user, pass);
			cn.setAutoCommit(false);
			System.out.println("Connection successfully established!");

			PreparedStatement pStmt = cn.prepareStatement(
					"INSERT INTO Disciplina (idDisciplina, nomeDisciplina, valorCredito, Turma_idTurma) "
							+ "values (?, ?, ?, ?)");

			pStmt.setInt(1, disciplina.getIdDisciplina());
			pStmt.setString(2, disciplina.getNomeDisciplina());
			pStmt.setInt(3, disciplina.getValorCredito());
			pStmt.setInt(4, idTurma);

			int rows = pStmt.executeUpdate();
			cn.commit();
			System.out.println(rows + " row(s) added!");

			cn.close();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}
