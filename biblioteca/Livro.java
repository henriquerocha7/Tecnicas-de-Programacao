package biblioteca;

public class Livro extends Publicacao {

	public Livro(String titulo, int ano, String autor, int quantidadeDisponivel) {
		super(titulo, ano, autor, quantidadeDisponivel);
		this.tipo = "Livro";
	}

	@Override
	public double darDesconto() {
		// TODO Auto-generated method stub
		return 0;
	}

}
