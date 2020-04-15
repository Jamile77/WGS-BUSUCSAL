package br.com.ucsal.busucsal.modelo;

import java.util.List;

public class Itinerario {

	private int idItinerario;
	private String diaSemana;
	private List<Horario> horarios;
	
	public int getIdItinerario() {
		return idItinerario;
	}
	
	public void setIdItinerario(int idItinerario) {
		this.idItinerario = idItinerario;
	}
	
	public String getDiaSemana() {
		return diaSemana;
	}
	
	public void setDiaSemana(String diaSemana) {
		this.diaSemana = diaSemana;
	}
	
	public List<Horario> getHorarios() {
		return horarios;
	}

	public void setHorarios(List<Horario> horarios) {
		this.horarios = horarios;
	}
	
}
