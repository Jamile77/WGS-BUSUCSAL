package br.ucsal.busucsal.model;

public class Horario {

	private String horarioDeSaida;
	private String roteiro;
	
	public Horario(String horarioDeSaida, int numeroDoRoteiro) {
		this.horarioDeSaida = horarioDeSaida;
		this.roteiro = setRoteiroPorNumero(numeroDoRoteiro);
		
	}
	
	public String getHorarioDeSaida() {
		return horarioDeSaida;
	}
	
	public void setHorarioDeSaida(String horarioDeSaida) {
		this.horarioDeSaida = horarioDeSaida;
	}
	
	public String getRoteiro() {
		return roteiro;
	}
	
	public void setRoteiro(String roteiro) {
		this.roteiro = roteiro;
	}
	
	public String setRoteiroPorNumero(int numeroDoRoteiro) {
		return RoteiroEnum.getDescricao(numeroDoRoteiro);
	}

	
	@Override
	public String toString() {
		return "\n(" + horarioDeSaida + ") " + roteiro + "\n\n";
	}
	
	
}
