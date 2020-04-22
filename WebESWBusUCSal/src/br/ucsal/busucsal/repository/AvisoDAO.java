package br.ucsal.busucsal.repository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.ucsal.busucsal.model.Aviso;
import br.ucsal.busucsal.util.BancoUtil;

public class AvisoDAO {

	public List<Aviso> read() {
		List<Aviso> avisos = new ArrayList<Aviso>();
		Aviso aviso = null;

		try {

			String sql = "SELECT * FROM AVISOS";
			// System.out.println(sql);

			PreparedStatement statement = BancoUtil.getConnection().prepareStatement(sql);
			// System.out.println(statement);
			ResultSet resultSet = statement.executeQuery();
			while (resultSet.next() != false) {

				aviso = new Aviso();
				aviso.setTitulo((resultSet.getString("TITULO")));
				aviso.setConteudo((resultSet.getString("CONTEUDO")));
				aviso.setHoraDaPostagem(resultSet.getString("HORA_POSTADO"));
				aviso.setHoraDaAtualizacao(resultSet.getString("HORA_ATUALIZADO"));
				avisos.add(aviso);

			}
			resultSet.close();
			statement.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return avisos;
	}

	public void create(Aviso aviso) {

		try {

			String sql = ("INSERT INTO AVISOS (TITULO, CONTEUDO, HORA_POSTADO) " + "VALUES (?, ?, ?)");

			// System.out.println(sql);

			PreparedStatement statement = BancoUtil.getConnection().prepareStatement(sql);
			statement.setString(1, aviso.getTitulo());
			statement.setString(2, aviso.getConteudo());
			statement.setString(3, aviso.getHoraDaPostagem());

			statement.executeUpdate();
			statement.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void delete(Aviso aviso) {

		try {

			String sql = "DELETE FROM AVISOS WHERE TITULO =?";
			PreparedStatement statement = BancoUtil.getConnection().prepareStatement(sql);
			statement.setString(1, aviso.getTitulo());

			statement.executeUpdate();
			statement.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public boolean update(Aviso avisoAntigo, Aviso avisoNovo) {

		try {

			String sql = "UPDATE AVISOS SET TITULO =?, CONTEUDO =?, HORA_ATUALIZADO =? WHERE TITULO =? AND CONTEUDO =?";
			PreparedStatement statement = BancoUtil.getConnection().prepareStatement(sql);
			statement.setString(1, avisoNovo.getTitulo());
			statement.setString(2, avisoNovo.getConteudo());
			statement.setString(3, avisoNovo.getHoraDaPostagem());
			statement.setString(4, avisoAntigo.getTitulo());
			statement.setString(5, avisoAntigo.getConteudo());


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