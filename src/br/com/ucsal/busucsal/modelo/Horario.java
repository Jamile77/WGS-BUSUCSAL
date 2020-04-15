package br.com.ucsal.busucsal.modelo;

import java.util.Date;

public class Horario {

	private int idHorario;
	private Date hora;
	private Roteiro roteiro;
	
	public int getIdHorario() {
		return idHorario;
	}
	
	public void setIdHorario(int idHorario) {
		this.idHorario = idHorario;
	}
	
	public Date getHora() {
		return hora;
	}
	
	public void setHora(Date hora) {
		this.hora = hora;
	}
	
	public Roteiro getRoteiro() {
		return roteiro;
	}

	public void setRoteiro(Roteiro roteiro) {
		this.roteiro = roteiro;
	}

}
