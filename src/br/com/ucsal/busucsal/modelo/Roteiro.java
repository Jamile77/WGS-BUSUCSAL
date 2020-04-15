package br.com.ucsal.busucsal.modelo;

import java.util.List;

public class Roteiro {

	private int idRoteiro;
	private String nome;
	private List<String> paradas;
	
	public int getIdRoteiro() {
		return idRoteiro;
	}
	
	public void setIdRoteiro(int idRoteiro) {
		this.idRoteiro = idRoteiro;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public List<String> getParadas() {
		return paradas;
	}
	
	public void setParadas(List<String> paradas) {
		this.paradas = paradas;
	}
}
