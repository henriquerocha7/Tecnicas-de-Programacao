package biblioteca;

public class Emprestimo {

	public Cliente cliente;
	public Publicacao publicacao;
	
	public Emprestimo (Cliente cliente, Publicacao publicacao) {
		this.cliente = cliente;
		this.publicacao = publicacao;
		
		if (cliente.getPublicacoesSimultaneas() > 0 && publicacao.getQuantidadeDisponivel() > 0) {
			cliente.tps = cliente.divida();
			double tpFinal = desconto();
			cliente.tps = tpFinal;
		} 
		this.cliente.setPublicacoesSimultaneas(this.cliente.getPublicacoesSimultaneas() - 1);
		this.publicacao.setQuantidadeDisponivel(this.publicacao.getQuantidadeDisponivel() - 1);
		this.publicacao.setQuantidadeAlugada(this.publicacao.getQuantidadeALugada() + 1);
		
	}
	
	public Cliente getCliente () {
		return cliente;
	}
	
	public Publicacao getPublicacao () {
		return publicacao;
	}
	
	public double desconto() {
//    Não consegui implementar o desconto :(
		
		if(cliente.darDesconto() == 1 && publicacao.tipo == "Livro") {
			return cliente.tps - (cliente.tps * 0.1);
		}else if(cliente.darDesconto() == 1 && publicacao.tipo == "Artigo") {
			return cliente.tps - (cliente.tps * 0.5);
		}else if (cliente.darDesconto() == 1 && publicacao.tipo == "Revista") {
			return cliente.tps - (cliente.tps * 0.01);
		}else if (cliente.darDesconto() == 0) {
			return cliente.tps;
		}else {
			return 1;
			}
		}
	
	public String dadosEmprestimo () {
		String dados = "";
		if (cliente.publicacoesSimultaneas > 0 && publicacao.quantidadeDisponivel > 0) {
			dados = this.cliente.tipo +": "+ this.cliente.nome +" - "+ 
					this.publicacao.tipo +": "+ this.publicacao.titulo +
					" - Dias de empréstimo: "+ cliente.verificarDias() +" - Tps: "+ cliente.tps;
		}else if (publicacao.quantidadeDisponivel <= 0) {
			dados = "Publicação indisponível.";
		}else if (cliente.publicacoesSimultaneas <= 0) {
			dados = this.cliente.tipo +" "+ this.cliente.nome +
					" Atingiu o número máximo de publicações simultâneas.";
		}
	return dados;
	}

}
