package br.edu.univas.si4.bd1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AreaPesquisaDAO {

	//faz o insert no banco
	public void insertNewAreaPesquisa(
			int codigo, int indice, String nome, String descricao) 
			throws SQLException {
		
		String sentenca = "INSERT INTO AREA_PESQUISA "
				+ " (CODIGO, INDICE_RELEVANCIA, NOME, DESCRICAO)"
				+ " VALUES (?, ?, ?, ?)";
		//iniciar as substrings com um espa�o
		
		Connection conn = null;
		conn = DBUtil.openConnection();
		
		PreparedStatement prepStat = conn.prepareStatement(sentenca);
		
		//configurar os par�metros da senten�a
		//setar os valores para cada sinal de interroga��o
		prepStat.setString(4, descricao);
		prepStat.setInt(1, codigo);//o �ndice da interroga��o come�a no UM!!!
		prepStat.setInt(2, indice);
		prepStat.setString(3, nome);
		
		prepStat.execute();
		conn.close();
	}
}
