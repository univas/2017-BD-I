package br.edu.univas.si4.bd1;

public class AreaPesquisaTO {

	private int codigo;
	private int indice;
	private String nome;
	private String descricao;
	
	public AreaPesquisaTO(int codigo, int indice, String nome, String descricao) {
		super();
		this.codigo = codigo;
		this.indice = indice;
		this.nome = nome;
		this.descricao = descricao;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getIndice() {
		return indice;
	}

	public void setIndice(int indice) {
		this.indice = indice;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
}
