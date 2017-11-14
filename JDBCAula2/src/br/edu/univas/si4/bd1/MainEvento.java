package br.edu.univas.si4.bd1;

import java.util.Calendar;
import java.util.Date;

public class MainEvento {

	public static void main(String[] args) {
		try {
//			new EventoDAO().insertNewEvento();
			
			Calendar cal = Calendar.getInstance();
			cal.set(Calendar.YEAR, 2017);
			cal.set(Calendar.MONTH, Calendar.NOVEMBER);
			cal.set(Calendar.DAY_OF_MONTH, 5);
			
			Date dataInicio = cal.getTime();//05/11/2017
			
			//cal.set(Calendar.DAY_OF_MONTH, 25);
			cal.add(Calendar.DAY_OF_MONTH, 20);
			
			Date dataFim = cal.getTime();//25/11/2017
			
			new EventoDAO().consultaEvento(dataInicio, dataFim);

			int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
			
			System.out.println(dayOfWeek);
			
			if(dayOfWeek == Calendar.SUNDAY || dayOfWeek == Calendar.SATURDAY) {
				System.out.println("caiu no fim de semana");
				
			}
			
		} catch (DBException e) {
			e.printStackTrace();
		}
	}
}
