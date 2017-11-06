package br.edu.univas.si4.bd1;

public class MainEvento {

	public static void main(String[] args) {
		try {
			//new EventoDAO().insertNewEvento();
			new EventoDAO().consultaEvento();
		} catch (DBException e) {
			e.printStackTrace();
		}
	}
}
