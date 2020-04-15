package br.com.ucsal.busucsal.modelo;

import java.util.Calendar;
import java.util.List;

public class Calendario {

	private int idCalendario;
	private Calendar calendario;
	private List<Aviso> avisos;
	private List<Itinerario> itinerarios;

	public int getIdCalendario() {
		return idCalendario;
	}
	
	public void setIdCalendario(int idCalendario) {
		this.idCalendario = idCalendario;
	}
	
	public Calendar getCalendario() {
		return calendario;
	}
	
	public void setCalendario(Calendar calendario) {
		this.calendario = calendario;
	}
	
	public List<Aviso> getAvisos() {
		return avisos;
	}
	
	public void setAvisos(List<Aviso> avisos) {
		this.avisos = avisos;
	}
	
	public List<Itinerario> getItinerarios() {
		return itinerarios;
	}
	
	public void setItinerarios(List<Itinerario> itinerarios) {
		this.itinerarios = itinerarios;
	}
	
}
