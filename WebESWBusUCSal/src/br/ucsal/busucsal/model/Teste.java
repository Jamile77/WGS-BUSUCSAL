package br.ucsal.busucsal.model;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Teste {

	public static void main(String[] args) {

		
		Itinerario itinerario = new Itinerario();

		itinerario.setDiaDaSemana("Segunda-Feira");
		itinerario.setHorarios(new Horario("06:50", 1));
		itinerario.setHorarios(new Horario("07:40", 3));
		itinerario.setHorarios(new Horario("08:50", 5));
		
		System.out.println(itinerario);
		
//		Date time = Calendar.getInstance().getTime();
//		System.out.println(time);
//		String data =  new SimpleDateFormat("EEEE  ,"
//				+ "HH:mm:ss  dd/MM/yyyy ").format(time);
//		System.out.println(data);
		String content = "O Busucsal está em manutenção devido a um estouro no amortecimento e por isso deverá ficar de 6  a 7 dias sem rodar! Grato, a Direção";
		String title = "Manutenção no ônibus";	
		System.out.println(new Aviso(title, content));
		
		

	}

}
