package br.ucsal.busucsal.model;

import br.ucsal.busucsal.repository.AvisoDAO;
import br.ucsal.busucsal.repository.UsuarioDAO;

public class Teste {

	public static void main(String[] args) {

		
		AvisoDAO dao = new AvisoDAO();
		
		
//		UsuarioDAO usuarioDao = new UsuarioDAO();
//		Usuario usuario = new Usuario("200012847", "123456", "ALEATORIO", "ALUNO");
//		usuarioDao.create(usuario);
//		System.out.println(usuarioDao.autenticate("200012847", "123456").getNomeUsuario());
//		Usuario usuarioNovo = new Usuario("200012847", "123456", "Luiz Felipe Viana", "ALUNO");
//		usuarioDao.update(usuario, usuarioNovo);
//		System.out.println(usuarioDao.autenticate("200012847", "123456").getNomeUsuario());
//		usuarioDao.delete(usuarioNovo);
//		System.out.println(usuarioDao.autenticate("200012847", "123456"));
//		for (Usuario usuario1 : usuarioDao.read()) {
//			System.out.println(usuario1);
//			
//		}
		
		dao.create(new Aviso("Manutenção", "Ônibus quebrado!"));
		dao.create(new Aviso("Roteiros disponíveis!", "Liberados na página inicial."));
		dao.create(new Aviso("Olá", "Tudo bem ?"));
		dao.create(new Aviso("Olár", "Tudo bem ?"));
		dao.update(new Aviso("Olá", "Tudo bem ?"), new Aviso("FALA TU", "Tudo bem ?"));
		for (Aviso aviso2 : dao.read()) {
			System.out.println(aviso2);
		}
		
		
	}

}
