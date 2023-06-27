package br.com.jcarlos.reflections;

public class Produto {
	private Long codigo;
	private String descricacao;
	private Double valor;
	
	public Produto() {
		
	}
	public Long getCodigo(){
		return codigo;
	}
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
		
	}
	public String getDescricacao() {
		return descricacao;
	}
	public void setDescricacao(String descricacao) {
		this.descricacao = descricacao;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	
}
