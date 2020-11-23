package projeto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BD {

	public Connection con = null;
	public PreparedStatement st = null;
	public ResultSet rs = null;
	private final String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	private final String banco = "db_Mobral";
	private final String URL = "jdbc:sqlserver://localhost:1433;databaseName="+banco+";integratedSecurity=true";
	
	//copiar o arquivo sqljdbc_auth.dll na pasta bin do JRE
	//private final String URL = "jdbc:sqlserver://localhost:1433;databaseName="+banco;
	//private final String login = "sa";
	//private final String senha = "1234";
	
	public boolean getConnection() {	
		//carregar o driver
		try {
			Class.forName(driver);
			//System.out.println("Driver carregado com sucesso!");
			con = DriverManager.getConnection(URL);
			//con = DriverManager.getConnection(URL,login,senha);
			System.out.println("Conectou!");
			return true;
		}
		catch(ClassNotFoundException erro) {
			System.out.println("Driver não encontrado!");
		}
		catch(SQLException erro) {
			System.out.println("Falha na conexão: "+erro.getMessage());
		}
		return false;
	}
	
	public void closeConnection() {
		try {
			if(rs != null) rs.close();
		}
		catch(SQLException erro) {
		}
		
		try {
			if(st != null) rs.close();
		}
		catch(SQLException erro) {
		}
		
		try {
			if(con != null) {
				rs.close();
				System.out.println("Desconectou!");
			}
		}
		catch(SQLException erro) {
		}
	}
	
	public static void main(String[] args) {
		BD bd = new BD();
		bd.getConnection();
		//executar a operação
		bd.closeConnection();
	}
}
