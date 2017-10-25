package br.edu.univas.si4.bd1;

import java.util.ArrayList;

public class JDBCRunnerSelect {

	public static void main(String[] args) {
		
		AreaPesquisaDAO areaDAO = new AreaPesquisaDAO();
		try {
			ArrayList<AreaPesquisaTO> lista = areaDAO.consultaAreaPesquisa();
			for (AreaPesquisaTO to : lista) {
				System.out.println(to);
			}
		} catch (AreaPesquisaException e) {
			System.out.println("Erro consultando área de pesquisa.");
			e.printStackTrace();
		}
		System.out.println("Sucesso consultando área de pesquisa.");
	}
}
