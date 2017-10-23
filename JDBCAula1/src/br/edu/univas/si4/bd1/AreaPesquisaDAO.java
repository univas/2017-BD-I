package br.edu.univas.si4.bd1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AreaPesquisaDAO {

	//faz o insert no banco
	public void insertNewAreaPesquisa(AreaPesquisaTO to) 
			throws AreaPesquisaException {
		
		String sentenca = "INSERT INTO AREA_PESQUISA "
				+ " (CODIGO, INDICE_RELEVANCIA, NOME, DESCRICAO)"
				+ " VALUES (?, ?, ?, ?)";
		//iniciar as substrings com um espa�o
		
		Connection conn = null;
		try {
			conn = DBUtil.openConnection();
			PreparedStatement prepStat = conn.prepareStatement(sentenca);
			
			//configurar os par�metros da senten�a
			//setar os valores para cada sinal de interroga��o
			prepStat.setString(4, to.getDescricao());
			prepStat.setInt(1, to.getCodigo());//o �ndice da interroga��o come�a no UM!!!
			prepStat.setInt(2, to.getIndice());
			prepStat.setString(3, to.getNome());
			
			prepStat.execute();
		} catch (Exception e) {
			throw new AreaPesquisaException(
					"Erro salvando �rea de pesquisa " + to.getNome(), e);
		} finally {
			DBUtil.closeConnection(conn);
		}
	}
	
	//Exerc�cio: implementar um m�todo para excluir um registro do banco
	public void deleteAreaPesquisa(int codigo) throws AreaPesquisaException {
		String sql = "DELETE FROM AREA_PESQUISA WHERE CODIGO = ?";
		Connection conn = null;
		try {
			conn = DBUtil.openConnection();
			PreparedStatement prep = conn.prepareStatement(sql);
			prep.setInt(1, codigo);
			prep.execute();
		} catch (SQLException e) {
			throw new AreaPesquisaException("Erro excluindo a �rea de pesquisa " + codigo);
		} finally {
			DBUtil.closeConnection(conn);
		}
	}
	
	public void consultaAreaPesquisa() throws AreaPesquisaException {
		String sql = "SELECT CODIGO, NOME FROM AREA_PESQUISA";
		Connection conn = null;
		try {
			conn = DBUtil.openConnection();
			PreparedStatement prep = conn.prepareStatement(sql);
			ResultSet rs = prep.executeQuery();
			while(rs.next()) {
				
				int codigo = rs.getInt(1);
				String nome = rs.getString(2);
				
				System.out.println(codigo + " - " + nome);
			}
		} catch (SQLException e) {
			throw new AreaPesquisaException("Erro consultando a �rea de pesquisa");
		} finally {
			DBUtil.closeConnection(conn);
		}
	}
	
	
	
	
	
	
	
	
	
}