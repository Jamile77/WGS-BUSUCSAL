package br.ucsal.busucsal.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BancoUtil {
	
	private static Connection connection;
	
	static {
		Statement statement = null;
		try {
			Class.forName("org.hsqldb.jdbc.JDBCDriver");
			
			//MODO MEMORY
			connection = DriverManager.getConnection("jdbc:hsqldb:mem:.", "sa", "");
			
			//MODO STANDALONE
			//connection = DriverManager.getConnection("jdbc:hsqldb:file:C:\\Users\\jaosa\\eclipse-workspace\\Sistema\\banco\\sistema.db", "sa", "");
			//connection = DriverManager.getConnection("jdbc:hsqldb:file:C:/Users/jaosa/eclipse-workspace/Sistema/banco/sistema.db", "sa", "");
			
			//MODO SERVER
			//java -cp ./hsqldb.jar org.hsqldb.server.Server --database.0 file:sistema.db --dbname.0 banco
			//connection = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/banco", "sa", "");
			
			//System.out.println("CONECTOU NO BANCO");
			
			//CRIAR ESTRUTURA DO BANCO
			statement =  connection.createStatement();
			statement.execute("CREATE TABLE USUARIOS (MATRICULA varchar (10), SENHA_USUARIO varchar(50) NOT NULL, NOME_USUARIO varchar(100) NOT NULL,"
					+ "PAPEL_USUARIO varchar(15) NOT NULL)");
			
			statement.execute("INSERT INTO USUARIOS (MATRICULA, SENHA_USUARIO, NOME_USUARIO, PAPEL_USUARIO) "
					+ "VALUES ('200012839', '123456', 'JOSÉ ANTONIO DE OLIVEIRA DOS SANTOS', 'ADMINISTRADOR')");
			statement.execute("INSERT INTO USUARIOS (MATRICULA, SENHA_USUARIO, NOME_USUARIO, PAPEL_USUARIO) "
					+ "VALUES ('200012840', '123456', 'ANTONIO CARLOS CORDEIRO LOPES FILHO', 'ADMINISTRADOR')");
			statement.execute("INSERT INTO USUARIOS (MATRICULA, SENHA_USUARIO, NOME_USUARIO, PAPEL_USUARIO) "
					+ "VALUES ('200012841', '123456', 'BERMAN BENJAMIN FRIEDRICH DOS SANTOS SCHULTZ', 'ADMINISTRADOR')");
			statement.execute("INSERT INTO USUARIOS (MATRICULA, SENHA_USUARIO, NOME_USUARIO, PAPEL_USUARIO) "
					+ "VALUES ('200012842', '123456', 'ITALO IAN CRUZ DOS SANTOS', 'ADMINISTRADOR')");
			statement.execute("INSERT INTO USUARIOS (MATRICULA, SENHA_USUARIO, NOME_USUARIO, PAPEL_USUARIO) "
					+ "VALUES ('200012843', '123456', 'JAMILE SANTOS DA CONCEIÇÃO', 'ADMINISTRADOR')");
			statement.execute("INSERT INTO USUARIOS (MATRICULA, SENHA_USUARIO, NOME_USUARIO, PAPEL_USUARIO) "
					+ "VALUES ('200012844', '123456', 'LUIZ FELIPE VIANA MENEZES NASCIMENTO', 'ADMINISTRADOR')");
			statement.execute("INSERT INTO USUARIOS (MATRICULA, SENHA_USUARIO, NOME_USUARIO, PAPEL_USUARIO) "
					+ "VALUES ('200012845', '123456', 'MARIO JORGE PEREIRA', 'COLABORADOR')");
			statement.execute("INSERT INTO USUARIOS (MATRICULA, SENHA_USUARIO, NOME_USUARIO, PAPEL_USUARIO) "
					+ "VALUES ('200012846', '123456', 'ALUNO ALEATÓRIO', 'ALUNO')");
			
			
			statement.execute("CREATE TABLE AVISOS (TITULO varchar(100), CONTEUDO varchar(500) NOT NULL, HORA_POSTADO varchar(100) NOT NULL, HORA_ATUALIZADO varchar(100))");
			
			
			
			
			statement.close();
			
		} catch (SQLException e) {
			System.out.println("ERRO AO CARREGAR O BANCO: " + e.getMessage()); 
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				statement.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	/**
	 * 
	 * @return
	 */
	public static Connection getConnection() {
		
		return connection;
	}
}