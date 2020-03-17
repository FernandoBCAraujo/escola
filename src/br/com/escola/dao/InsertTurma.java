package br.com.escola.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import br.com.escola.models.Turma;

public class InsertTurma {

	public void insertTurma (Turma turma){
		try {
			String url = "jdbc:mysql://localhost/escola";
			String user = "root";
			String pass = "1234";

			Class.forName("com.mysql.jdbc.Driver");
			Connection cn = DriverManager.getConnection(url, user, pass);
			cn.setAutoCommit(false);
			System.out.println("Connection successfully established!");

			PreparedStatement pStmt = cn
					.prepareStatement("INSERT INTO Turma (idTurma, codigoTurma, quantidadeAluno) VALUES (?, ?, ?)");

			pStmt.setInt(1, turma.getIdTurma());
			pStmt.setString(2, turma.getCodigoTurma());
			pStmt.setInt(3, turma.getQuantidadeAluno());

			int rows = pStmt.executeUpdate();
			cn.commit();
			System.out.println(rows + " row(s) added!");

			cn.close();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}
