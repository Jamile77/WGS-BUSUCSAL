package br.ucsal.busucsal.model;

import java.util.Calendar;
import java.util.Date;

public class Aviso {
	
	private String titulo;
	private String conteudo;
	private Date horaDaPostagem;
	
	
	
	public Aviso(String titulo, String conteudo) {
		super();
		this.titulo = titulo;
		this.conteudo = conteudo;
		this.horaDaPostagem = Calendar.getInstance().getTime();
		
	}
	
	
	public Date getHoraDaPostagem() {
		return horaDaPostagem;
	}
	public void setHoraDaPostagem(Date horaDaPostagem) {
		this.horaDaPostagem = horaDaPostagem;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getConteudo() {
		return conteudo;
	}
	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}


	@Override
	public String toString() {
		return "> " +titulo.toUpperCase() + " <\n" + conteudo.toLowerCase() + "\n\n" + horaDaPostagem;
	}
	
	
	

}
