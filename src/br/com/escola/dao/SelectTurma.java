package br.com.escola.dao;
import java.sql.*;

public class SelectTurma {

	public void selecionarTurma() {
		try{
			String url = "jdbc:mysql://localhost/escola";
			String user = "root";
			String pass = "1234";
			
			Connection cn = DriverManager.getConnection(url, user, pass);
			System.out.println("Connection successfully established!");
			
			Statement st = cn.createStatement();
			st.executeQuery("SELECT * FROM turma");
			
			ResultSet rs = st.getResultSet();			
			
			System.out.println("ID\tCódigo Turma\t  Quantidade Alunos");
			while(rs.next()){
				System.out.println(rs.getString(1) + " -   " +
						           rs.getString(2) + " -               " +
						           rs.getString(3));
				}
			
			cn.close();
			
		}catch (Exception e){
			System.out.println(e.getMessage());
		}
		
	}

}
