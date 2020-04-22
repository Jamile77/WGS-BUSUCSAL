package br.ucsal.busucsal.service;

import java.util.List;

import br.ucsal.busucsal.model.Aviso;
import br.ucsal.busucsal.repository.AvisoDAO;

public class AvisoService {
	
	private AvisoDAO dao = new AvisoDAO();
	
	//LÓGICA DE NEGÓCIO
	public List<Aviso> read(String matricula, String senhaUsuario) {
		List<Aviso> avisos = null;
		
		if (matricula != null && senhaUsuario != null) {
			avisos = dao.read();
		}
		return avisos;
	}
}