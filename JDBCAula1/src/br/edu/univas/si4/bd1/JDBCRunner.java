package br.edu.univas.si4.bd1;

public class JDBCRunner {

	public static void main(String[] args) {
		
		AreaPesquisaDAO areaDAO = new AreaPesquisaDAO();
		AreaPesquisaTO to = new AreaPesquisaTO(103, 1, "Modelagem", "Engenharia de Software");
		try {
			areaDAO.insertNewAreaPesquisa(to);
		} catch (AreaPesquisaException e) {
			System.out.println("Erro salvando área de pesquisa.");
			e.printStackTrace();
		}
		System.out.println("Sucesso salvando área de pesquisa.");
	}
}
