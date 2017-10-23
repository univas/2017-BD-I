package br.edu.univas.si4.bd1;

public class JDBCRunnerSelect {

	public static void main(String[] args) {
		
		AreaPesquisaDAO areaDAO = new AreaPesquisaDAO();
		try {
			areaDAO.consultaAreaPesquisa();
		} catch (AreaPesquisaException e) {
			System.out.println("Erro consultando �rea de pesquisa.");
			e.printStackTrace();
		}
		System.out.println("Sucesso consultando �rea de pesquisa.");
	}
}
