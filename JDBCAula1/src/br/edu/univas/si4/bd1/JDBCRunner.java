package br.edu.univas.si4.bd1;

import java.sql.SQLException;

public class JDBCRunner {

	public static void main(String[] args) {
		
		AreaPesquisaDAO areaDAO = new AreaPesquisaDAO();
		try {
			areaDAO.insertNewAreaPesquisa(102, 3, "Linguagem", "Java");
		} catch (SQLException e) {
			System.out.println("Erro salvando área de pesquisa.");
			e.printStackTrace();
		}
		System.out.println("Sucesso salvando área de pesquisa.");
	}
}
