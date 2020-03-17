package br.com.escola.dao;
import java.sql.*;

public class SelectAluno {

	public void selecionarAluno() {
		try{
			String url = "jdbc:mysql://localhost/escola";
			String user = "root";
			String pass = "1234";
			
			Connection cn = DriverManager.getConnection(url, user, pass);
			System.out.println("Connection successfully established!");
			
			Statement st = cn.createStatement();
			st.executeQuery("SELECT * FROM Aluno");
			
			ResultSet rs = st.getResultSet();			
			
			System.out.println("ID\tNome Aluno\t  Quantidade Credito \t Endereço \tValor Mensalidade \tID Turma");
			while(rs.next()){
				System.out.println(rs.getString(1) + " -   " +
						           rs.getString(2) + " -               " +
						           rs.getString(3) + " - " +
								   rs.getString(4) + " - " +
								   rs.getString(5) + " - " +
				                   rs.getString(6));
				}
			
			cn.close();
			
		}catch (Exception e){
			System.out.println(e.getMessage());
		}
		
	}

}
