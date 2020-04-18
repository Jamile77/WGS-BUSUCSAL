package br.ucsal.busucsal.repository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.ucsal.busucsal.model.Usuario;
import br.ucsal.busucsal.util.BancoUtil;

public class UsuarioDAO {
	
	public Usuario autenticate(String idMatricula, String senhaUsuario) {
		Usuario usuario = null;
		
			try {
			
			String sql = "SELECT * FROM USUARIOS WHERE MATRICULA=? AND SENHA_USUARIO=?";
			//System.out.println(sql);
			
			PreparedStatement statement =  BancoUtil.getConnection().prepareStatement(sql);
			statement.setString(1, idMatricula);
			statement.setString(2, senhaUsuario);
			//System.out.println(statement);
			ResultSet resultSet =  statement.executeQuery();
			if(resultSet.next()) {
				usuario = new Usuario();
				usuario.setMatricula(resultSet.getString("MATRICULA"));
				usuario.setNomeUsuario(resultSet.getString("NOME_USUARIO"));
				usuario.setPapelUsuario(resultSet.getString("PAPEL_USUARIO"));
				
			}
			resultSet.close();
			statement.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		return usuario;
	}
	
	public Usuario create() {
		/*
		String matricula = request.getParameter("matricula");
		String senha = request.getParameter("pass");
		String nome = request.getParameter("nome");
		Usuario usuario = null;
		
			try {
			
			String sql = "SELECT ID_MATRICULA, SENHA_USUARIO FROM USUARIOS WHERE ID_MATRICULA=? AND SENHA_USUARIO=?";
			//System.out.println(sql);
			
			PreparedStatement statement =  BancoUtil.getConnection().prepareStatement(sql);
			statement.setString(1, idMatricula);
			statement.setString(2, senhaUsuario);
			//System.out.println(statement);
			ResultSet resultSet =  statement.executeQuery();
			if(resultSet.next()) {
				usuario = new Usuario();
				usuario.setIdMatricula(resultSet.getString("ID_MATRICULA"));
				usuario.setSenhaUsuario(resultSet.getString("SENHA_USUARIO"));
			}
			resultSet.close();
			statement.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}		*/
		return null;
	}
	
	public Usuario read(Long id) {
		return null;
	}
	
	public void delete(Usuario usuario) {
	}
	
	public Usuario update(Usuario usuario) {
		return null;
	}
}