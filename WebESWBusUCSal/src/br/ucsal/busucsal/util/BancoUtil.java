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
					+ "VALUES ('200008192', '123456', 'ANTONIO CARLOS CORDEIRO LOPES FILHO', 'ADMINISTRADOR')");
			statement.execute("INSERT INTO USUARIOS (MATRICULA, SENHA_USUARIO, NOME_USUARIO, PAPEL_USUARIO) "
					+ "VALUES ('200008193', '123456', 'BERMAN BENJAMIN FRIEDRICH DOS SANTOS SCHULTZ', 'ADMINISTRADOR')");
			statement.execute("INSERT INTO USUARIOS (MATRICULA, SENHA_USUARIO, NOME_USUARIO, PAPEL_USUARIO) "
					+ "VALUES ('200012842', '123456', 'ITALO IAN CRUZ DOS SANTOS', 'ADMINISTRADOR')");
			statement.execute("INSERT INTO USUARIOS (MATRICULA, SENHA_USUARIO, NOME_USUARIO, PAPEL_USUARIO) "
					+ "VALUES ('200012843', '123456', 'JAMILE SANTOS DA CONCEIÇÃO', 'ADMINISTRADOR')");
			statement.execute("INSERT INTO USUARIOS (MATRICULA, SENHA_USUARIO, NOME_USUARIO, PAPEL_USUARIO) "
					+ "VALUES ('200008184', 'luizviana', 'LUIZ FELIPE VIANA MENEZES NASCIMENTO', 'ADMINISTRADOR')");
			statement.execute("INSERT INTO USUARIOS (MATRICULA, SENHA_USUARIO, NOME_USUARIO, PAPEL_USUARIO) "
					+ "VALUES ('200012845', '123456', 'MARIO JORGE PEREIRA', 'COLABORADOR')");
			statement.execute("INSERT INTO USUARIOS (MATRICULA, SENHA_USUARIO, NOME_USUARIO, PAPEL_USUARIO) "
					+ "VALUES ('200012846', '123456', 'ALUNO ALEATÓRIO', 'ALUNO')");
			
			
			/*.execute("CREATE TABLE ROTEIROS (ID_ROTEIRO varchar (10), PONTO_INICIAL varchar(50) NOT NULL, PONTO_INTERM varchar(100),"
					+ "PONTO_FINAL varchar(11) NOT NULL, DIA_SEMANA varchar(10) NOT NULL, ID_HORARIO varchar(10) NOT NULL)");*/
			
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