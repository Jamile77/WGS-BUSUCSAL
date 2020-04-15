package br.com.ucsal.busucsal.modelo;

import java.util.Date;

public class Aviso {

	private int idAviso;
	private String descricao;
	private Date data;
	
	public int getIdAviso() {
		return idAviso;
	}
	
	public void setIdAviso(int idAviso) {
		this.idAviso = idAviso;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public Date getData() {
		return data;
	}
	
	public void setData(Date data) {
		this.data = data;
	}
	
}
