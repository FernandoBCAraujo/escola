package br.com.escola;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class ScriptDeCriacao {

	public static void main(String[] args) {
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

			pStmt.setInt(1, 1);
			pStmt.setString(2, "TUR001");
			pStmt.setInt(3, 3);

			PreparedStatement pStmt2 = cn
					.prepareStatement("INSERT INTO Turma (idTurma, codigoTurma, quantidadeAluno) VALUES (?, ?, ?)");

			pStmt2.setInt(1, 2);
			pStmt2.setString(2, "TUR002");
			pStmt2.setInt(3, 1);

			PreparedStatement pStmt3 = cn
					.prepareStatement("INSERT INTO Turma (idTurma, codigoTurma, quantidadeAluno) VALUES (?, ?, ?)");

			pStmt3.setInt(1, 3);
			pStmt3.setString(2, "TUR003");
			pStmt3.setInt(3, 2);

			PreparedStatement pStmt4 = cn.prepareStatement(
					"INSERT INTO Disciplina (idDisciplina, nomeDisciplina, valorCredito, Turma_idTurma) "
							+ "VALUES (?, ?, ?, ?)");

			pStmt4.setInt(1, 1);
			pStmt4.setString(2, "Português");
			pStmt4.setInt(3, 2);
			pStmt4.setInt(4, 1);

			PreparedStatement pStmt5 = cn.prepareStatement(
					"INSERT INTO Disciplina (idDisciplina, nomeDisciplina, valorCredito, Turma_idTurma) "
							+ "VALUES (?, ?, ?, ?)");

			pStmt5.setInt(1, 2);
			pStmt5.setString(2, "Matemática");
			pStmt5.setInt(3, 3);
			pStmt5.setInt(4, 3);

			PreparedStatement pStmt6 = cn.prepareStatement(
					"INSERT INTO Disciplina (idDisciplina, nomeDisciplina, valorCredito, Turma_idTurma) "
							+ "VALUES (?, ?, ?, ?)");

			pStmt6.setInt(1, 1);
			pStmt6.setString(2, "Geografia");
			pStmt6.setInt(3, 1);
			pStmt6.setInt(4, 2);
			System.out.println("fim disc");

			PreparedStatement pStmt7 = cn.prepareStatement(
					"INSERT INTO Aluno (idAluno, nomeAluno, quantidadeCredito, endereco, valorMensalidade, Turma_idTurma) VALUES (?, ?, ?, ?, ?, ?)");

			pStmt7.setInt(1, 1);
			pStmt7.setString(2, "Fernando Araujo");
			pStmt7.setInt(3, 5);
			pStmt7.setString(4, "Rua do Hospicio, 111");
			pStmt7.setInt(5, 477);
			pStmt7.setInt(6, 1);

			PreparedStatement pStmt8 = cn
					.prepareStatement("INSERT INTO Aluno (idAluno, nomeAluno, quantidadeCredito, endereco, "
							+ "valorMensalidade, Turma_idTurma) VALUES (?, ?, ?, ?, ?, ?)");

			pStmt8.setInt(1, 2);
			pStmt8.setString(2, "Frederico Maia");
			pStmt8.setInt(3, 2);
			pStmt8.setString(4, "Rua do Mar, 1221");
			pStmt8.setInt(5, 0);
			pStmt8.setInt(6, 1);

			PreparedStatement pStmt9 = cn
					.prepareStatement("INSERT INTO Aluno (idAluno, nomeAluno, quantidadeCredito, endereco, "
							+ "valorMensalidade, Turma_idTurma) VALUES (?, ?, ?, ?, ?, ?)");

			pStmt9.setInt(1, 3);
			pStmt9.setString(2, "Joana Sampaio");
			pStmt9.setInt(3, 5);
			pStmt9.setString(4, "Rua do Rio Largo, 1998");
			pStmt9.setInt(5, 237);
			pStmt9.setInt(6, 1);

			PreparedStatement pStmt10 = cn
					.prepareStatement("INSERT INTO Aluno (idAluno, nomeAluno, quantidadeCredito, endereco, "
							+ "valorMensalidade, Turma_idTurma) VALUES (?, ?, ?, ?, ?, ?)");

			pStmt10.setInt(1, 4);
			pStmt10.setString(2, "Maria da Costa");
			pStmt10.setInt(3, 5);
			pStmt10.setString(4, "Rua Oceanica, 193");
			pStmt10.setInt(5, 477);
			pStmt10.setInt(6, 2);

			PreparedStatement pStmt11 = cn
					.prepareStatement("INSERT INTO Aluno (idAluno, nomeAluno, quantidadeCredito, endereco, "
							+ "valorMensalidade, Turma_idTurma) VALUES (?, ?, ?, ?, ?, ?)");

			pStmt11.setInt(1, 5);
			pStmt11.setString(2, "Lil Peep");
			pStmt11.setInt(3, 5);
			pStmt11.setString(4, "Rua do Beautiful, 669");
			pStmt11.setInt(5, 577);
			pStmt11.setInt(6, 3);

			PreparedStatement pStmt12 = cn.prepareStatement(
					"INSERT INTO Aluno (idAluno, nomeAluno, quantidadeCredito, endereco, valorMensalidade, Turma_idTurma) VALUES (?, ?, ?, ?, ?, ?)");

			pStmt12.setInt(1, 6);
			pStmt12.setString(2, "Ronald McDonalds");
			pStmt12.setInt(3, 5);
			pStmt12.setString(4, "Rua Fast Food, 1001");
			pStmt12.setInt(5, 877);
			pStmt12.setInt(6, 3);

			int rows = pStmt.executeUpdate();
			cn.commit();
			System.out.println(rows + " row(s) added!");

			int rows2 = pStmt2.executeUpdate();
			cn.commit();
			System.out.println(rows2 + " row(s) added!");

			int rows3 = pStmt3.executeUpdate();
			cn.commit();
			System.out.println(rows3 + " row(s) added!");

			int rows4 = pStmt4.executeUpdate();
			cn.commit();
			System.out.println(rows4 + " row(s) added!");

			int rows5 = pStmt5.executeUpdate();
			cn.commit();
			System.out.println(rows5 + " row(s) added!");

			int rows6 = pStmt6.executeUpdate();
			cn.commit();
			System.out.println(rows6 + " row(s) added!");

			int rows7 = pStmt7.executeUpdate();
			cn.commit();
			System.out.println(rows7 + " row(s) added!");

			int rows8 = pStmt8.executeUpdate();
			cn.commit();
			System.out.println(rows8 + " row(s) added!");

			int rows9 = pStmt9.executeUpdate();
			cn.commit();
			System.out.println(rows9 + " row(s) added!");

			int rows10 = pStmt10.executeUpdate();
			cn.commit();
			System.out.println(rows10 + " row(s) added!");

			int rows11 = pStmt11.executeUpdate();
			cn.commit();
			System.out.println(rows11 + " row(s) added!");

			int rows12 = pStmt12.executeUpdate();
			cn.commit();
			System.out.println(rows12 + " row(s) added!");

			cn.close();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}
