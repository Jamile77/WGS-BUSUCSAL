package br.ucsal.busucsal.model;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Aviso {

	private String titulo;
	private String conteudo;
	private String horaDaPostagem;
	private String horaDaAtualizacao;

	public Aviso() {

	}

	public Aviso(String titulo, String conteudo) {
		super();
		this.titulo = titulo;
		this.conteudo = conteudo;
		String horaAtual = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(Calendar.getInstance().getTime());
		this.horaDaPostagem = horaAtual;

	}

	public String getHoraDaPostagem() {
		return horaDaPostagem;
	}

	public void setHoraDaPostagem(String horaDaPostagem) {
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

	public String getHoraDaAtualizacao() {
		return horaDaAtualizacao;
	}

	public void setHoraDaAtualizacao(String horaDaAtualizacao) {
		this.horaDaAtualizacao = horaDaAtualizacao;
	}

	@Override
	public String toString() {
		if(horaDaAtualizacao == null) {
			return "> " + titulo.toUpperCase() + " <\n" + conteudo.toLowerCase() + "\n[" + horaDaPostagem + "]\n";
		}else {
			return "> " + titulo.toUpperCase() + " <\n" + conteudo.toLowerCase() + "\n[Postado às " + horaDaPostagem + "] [Atualizado às " + horaDaAtualizacao + "]\n";
		}
		
	}

}
