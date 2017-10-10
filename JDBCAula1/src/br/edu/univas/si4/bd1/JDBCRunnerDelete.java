package br.edu.univas.si4.bd1;

public class JDBCRunnerDelete {

	public static void main(String[] args) {
		
		AreaPesquisaDAO areaDAO = new AreaPesquisaDAO();
		try {
			areaDAO.deleteAreaPesquisa(103);
		} catch (AreaPesquisaException e) {
			System.out.println("Erro excluindo área de pesquisa.");
			e.printStackTrace();
		}
		System.out.println("Sucesso excluindo área de pesquisa.");
	}
}
