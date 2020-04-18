package br.ucsal.busucsal.model;

public enum RoteiroEnum {
	
	ROTEIRO1 (1, "ROTEIRO 1:\nSaída: UCSAL Pituaçu"
			+ "\n	Única Parada - Av. Paralela (sentido aeroporto) - Ponto do estádio de Pituaçu."), 
	
	ROTEIRO2 (2, "ROTEIRO 2:\nSaída: UCSAL Pituaçu"
			+ "\n	1ª Parada - Av. Pinto de Aguiar (sentido Paralela) - Atrás do primeiro ponto de ônibus;"
			+ "\n	2ª Parada - Av. Pinto de Aguiar (sentido Paralela) - Ponto do Condômínio Greenville;"
			+ "\n	3ª Parada - Terminal Pituaçu - 1º andar, Plataforma E, 17."), 
	
	ROTEIRO3 (3, "ROTEIRO 3:\nSaída: UCSAL Pituaçu"
			+ "\n	1ª Parada - Av. Pinto de Aguiar (sentido Paralela) - Ponto do Greenville;"
			+ "\n	2ª Parada - Av. Pinto de Aguiar (sentido Paralela) - Atrás do primeiro ponto de ônibus;"
			+ "\n	3ª Parada - Av. Paralela (sentido aeroporto) - Ponto Estádio de Pituaçu."), 
	
	ROTEIRO4 (4, "ROTEIRO 4:\nSaída: UCSAL Pituaçu"
			+ "\n	1ª Parada - Av. Pinto de Aguiar (sentido Paralela) - Ponto do Greenville;"
			+ "\n	2ª Parada - Av. Paralela (sentido centro) - Ponto do estádio Pituaçu;"
			+ "\n	3ª Parada - Av. Paralela (sentido centro) - Ponto Extra Paralela;"
			+ "\n	4ª Parada - Av. Paralela (sentido aeroporto) - Ponto Extra Paralela;"
			+ "\n	5ª Parada - Av. Luís Viana Filho (sentido aeroporto) - Ponto estádio de Pituaçu."),

	ROTEIRO5 (5, "ROTEIRO 5:\nSaída: UCSAL Pituaçu"
			+ "\n	1ª Parada - Av. Pinto de Aguiar (sentido orla) - Ponto do Greenville;"
			+ "\n	2ª Parada - Av. Paralela (sentido centro) - Atrás do primeiro ponto de ônibus;"
			+ "\n	3ª Parada - Av. Paralela (sentido aeroporto) - Ponto Wall Stree Empresarial;"
			+ "\n	4ª Parada - Av. Paralela (sentido aeroporto) - Ponto Posto Menor Preço;"
			+ "\n	5ª Parada - Av. Paralela (sentido centro) - Ponto em frente ao Colégio Villa;"
			+ "\n	6ª Parada - Av. Paralela (sentido centro) - Ponto próximo a entrada do Flamboyant;"
			+ "\n	7ª Parada - Av. Paralela (sentido centro) - Ponto em frente ao Condomínio Brisas;"
			+ "\n	8ª Parada - Av. Paralela (sentido centro) - Ponto Estação de Metrô Pituaçu;"
			+ "\n	9ª Parada - Av. Paralela (sentido centro) - Ponto Extra Paralela;"
			+ "\n	10ª Parada - Av. Paralela (sentido aeroporto) - Ponto Extra Paralela;"
			+ "\n	11ª Parada - Av. Paralela (sentido aeroporto) - Ponto Estádio de Pituaçu.");

	private int index;
	private String descricao;
	
	private RoteiroEnum(int index, String descricao) {
		this.index = index;
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}


	public static String getDescricao(int numeroRoteiro) {
		
		for (RoteiroEnum roteiro : values()) {
			
			if(roteiro.index == numeroRoteiro) {
				return roteiro.descricao;
			}
			
		}
		
		return null;
	}
	
	

}
