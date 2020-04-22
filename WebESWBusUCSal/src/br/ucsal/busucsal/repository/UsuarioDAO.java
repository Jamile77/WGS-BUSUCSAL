package br.ucsal.busucsal.repository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.ucsal.busucsal.model.Usuario;
import br.ucsal.busucsal.util.BancoUtil;

public class UsuarioDAO {

	public Usuario autenticate(String matricula, String senhaUsuario) {
		Usuario usuario = null;

		try {

			String sql = "SELECT * FROM USUARIOS WHERE MATRICULA=? AND SENHA_USUARIO =?";
			// System.out.println(sql);

			PreparedStatement statement = BancoUtil.getConnection().prepareStatement(sql);
			statement.setString(1, matricula);
			statement.setString(2, senhaUsuario);

			ResultSet resultSet = statement.executeQuery();
			if (resultSet.next()) {
				usuario = new Usuario();
				usuario.setMatricula(resultSet.getString("MATRICULA"));
				usuario.setSenhaUsuario(resultSet.getString("SENHA_USUARIO"));
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

	public void create(Usuario usuario) {

		try {

			String sql = "INSERT INTO USUARIOS (MATRICULA, SENHA_USUARIO, NOME_USUARIO, PAPEL_USUARIO)"
					+ "VALUES (?, ?, ?, ?)";
			// System.out.println(sql);

			PreparedStatement statement = BancoUtil.getConnection().prepareStatement(sql);
			statement.setString(1, usuario.getMatricula());
			statement.setString(2, usuario.getSenhaUsuario());
			statement.setString(3, usuario.getNomeUsuario());
			statement.setString(4, usuario.getPapelUsuario());

			statement.executeUpdate();
			statement.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public List<Usuario> read() {
		List<Usuario> usuarios = new ArrayList<Usuario>();
		try {

			String sql = "SELECT * FROM USUARIOS";
			PreparedStatement statement = BancoUtil.getConnection().prepareStatement(sql);
			
			ResultSet resultSet = statement.executeQuery();
			while (resultSet.next()) {
				Usuario usuario = new Usuario();
				usuario.setMatricula(resultSet.getString("MATRICULA"));
				usuario.setSenhaUsuario(resultSet.getString("SENHA_USUARIO"));
				usuario.setNomeUsuario(resultSet.getString("NOME_USUARIO"));
				usuario.setPapelUsuario(resultSet.getString("PAPEL_USUARIO"));
				usuarios.add(usuario);

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return usuarios;
	}

	public void delete(Usuario usuario) {

		try {

			String sql = "DELETE FROM USUARIOS WHERE MATRICULA =? AND SENHA_USUARIO =?";
			PreparedStatement statement = BancoUtil.getConnection().prepareStatement(sql);
			statement.setString(1, usuario.getMatricula());
			statement.setString(2, usuario.getSenhaUsuario());
			
			statement.executeUpdate();
			statement.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public boolean update(Usuario usuarioAntigo, Usuario usuarioNovo) {
		
		try {

			String sql = "UPDATE USUARIOS SET MATRICULA =?, SENHA_USUARIO =?, NOME_USUARIO =?, PAPEL_USUARIO =? WHERE MATRICULA =?";
			PreparedStatement statement = BancoUtil.getConnection().prepareStatement(sql);
			statement.setString(1, usuarioNovo.getMatricula());
			statement.setString(2, usuarioNovo.getSenhaUsuario());
			statement.setString(3, usuarioNovo.getNomeUsuario());
			statement.setString(4, usuarioNovo.getPapelUsuario());
			statement.setString(5, usuarioAntigo.getMatricula());
			statement.executeUpdate();
			
			statement.close();
			return true;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
}