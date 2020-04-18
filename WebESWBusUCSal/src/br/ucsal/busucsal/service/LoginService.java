package br.ucsal.busucsal.service;

import br.ucsal.busucsal.model.Usuario;
import br.ucsal.busucsal.repository.UsuarioDAO;

public class LoginService {
	
	private UsuarioDAO dao = new UsuarioDAO();
	
	//LÓGICA DE NEGÓCIO
	public Usuario login(String matricula, String senhaUsuario) {
		Usuario usuario = null;
		
		if (matricula != null) {
			usuario = dao.autenticate(matricula, senhaUsuario);
		}
		return usuario;
	}
}