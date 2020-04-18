package br.ucsal.busucsal.model;

import java.util.ArrayList;
import java.util.List;

public class Itinerario {
	
	private String diaDaSemana;
	private List<Horario> horarios = new ArrayList<Horario>();
	
	
	public String getDiaDaSemana() {
		return diaDaSemana;
	}
	public void setDiaDaSemana(String diaDaSemana) {
		this.diaDaSemana = diaDaSemana;
	}
	public List<Horario> getHorarios() {
		return horarios;
	}
	public void setHorarios(Horario horario) {
		horarios.add(horario);
	}
	
	
	@Override
	public String toString() {
		return diaDaSemana.toUpperCase() + "\n\n" + horarios + "\n";
	}
	
	

}
