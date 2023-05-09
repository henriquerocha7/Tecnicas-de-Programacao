package biblioteca;

public abstract class Publicacao implements Desconto {

	protected String titulo;
	protected int ano;
	protected String autor;
	protected int quantidadeDisponivel;
	protected String tipo;
	protected int quantidadeAlugada;
	
	public Publicacao (String titulo, int ano, String autor, int quantidadeDisponivel) {
		this.titulo = titulo;
		this.ano = ano;
		this.autor = autor;
		this.quantidadeDisponivel = quantidadeDisponivel;
		this.quantidadeAlugada = 0;
	}
	
	public String dadosPublicacao () {
		return "Tipo: " +this.tipo+ "- Titulo: " +this.titulo+ "- Ano de lançamento: " +ano+ "- Autor: " +autor+ "- Quantidade disponível: " +quantidadeDisponivel;
		}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo  (String titulo) {
		this.titulo = titulo;
	}
	
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public String autor() {
		return autor;
	}
	public void autor(String autor) {
		this.autor = autor;
	}
	
	public int getQuantidadeDisponivel() {
		return quantidadeDisponivel;
	}
	public void setQuantidadeDisponivel(int quantidadeDisponivel) {
		this.quantidadeDisponivel = quantidadeDisponivel;
	}
	
	public int getQuantidadeALugada() {
		return quantidadeAlugada;
	}
	public void setQuantidadeAlugada(int quantidadeAlugada) {
		this.quantidadeAlugada = quantidadeAlugada;
	}
}
