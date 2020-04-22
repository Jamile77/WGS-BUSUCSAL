package br.ucsal.busucsal.service;

import br.ucsal.busucsal.model.Usuario;
import br.ucsal.busucsal.repository.UsuarioDAO;

public class CadastroService {

private UsuarioDAO dao = new UsuarioDAO();
	
	//LÓGICA DE NEGÓCIO
	public Usuario cadastrarColaborador(Usuario usuario) {
		
		if (usuario.getMatricula() != null && usuario.getSenhaUsuario() != null) {
			dao.create(usuario);
		}
		
		for (Usuario usuario1 : dao.read() ) {
			System.out.println(usuario1);
		};
		
		return usuario;
	}
}
