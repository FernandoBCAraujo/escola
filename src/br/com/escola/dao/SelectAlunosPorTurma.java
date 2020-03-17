package br.com.escola.dao;
import java.sql.*;

public class SelectAlunosPorTurma {

	private PreparedStatement st;
	
	public void selecionarAlunosPorTurma(String turma_idTurma) {
		try{
			String url = "jdbc:mysql://localhost/escola";
			String user = "root";
			String pass = "1234";
			
			Connection cn = DriverManager.getConnection(url, user, pass);
			System.out.println("Connection successfully established!");
			
//			Statement st = cn.createStatement();
			st = cn.prepareStatement("SELECT nomeAluno, Turma_idTurma FROM aluno WHERE Turma_idTurma = ?");
			st.setString(1, turma_idTurma);
			
			
     		ResultSet rs = st.executeQuery();			
			
			System.out.println("Nome Aluno\tCódigo Turma\t");
			while(rs.next()){
				System.out.println(rs.getString(1) + " -   " +
						           rs.getString(2));
				}
			
			cn.close();
			
		}catch (Exception e){
			System.out.println(e.getMessage());
		}
		
	}

}
