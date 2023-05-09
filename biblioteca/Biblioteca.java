package biblioteca;
import java.util.ArrayList;

public class Biblioteca {

	private ArrayList<Emprestimo> listaDeEmprestimo;
	private ArrayList<Publicacao> acervo;
	private ArrayList<Cliente> clientes;
	public Biblioteca () {
		listaDeEmprestimo = new ArrayList<Emprestimo>();
		acervo = new ArrayList<Publicacao>();
		clientes = new ArrayList<Cliente>();
	}
	
	public void addEmprestimo (Emprestimo e) {
		listaDeEmprestimo.add(e);
	}

	public ArrayList<Emprestimo> getListaDeEmprestimo () {
		return listaDeEmprestimo;
	}

	public void addAcervo(Publicacao p) {
		acervo.add(p);
	}
	
	public void acervo () {
		System.out.println("        ACERVO        ");
		int i = 1;
		System.out.println("Livros");
		for (Publicacao p : acervo) {
			if(p.tipo == "Livro") {
				System.out.println(i +" - "+ p.titulo +"; "+ p.ano +"; "+ p.autor +"; "+ p.quantidadeDisponivel);
				i++;
			}
		}
		int i2 = 1;
		System.out.println("Artigo");
		for (Publicacao p : acervo) {
			if(p.tipo == "Artigo") {
				System.out.println(i2 +" - "+ p.titulo +"; "+ p.ano +"; "+ p.autor +"; "+ p.quantidadeDisponivel);
			i2++;
			}
		}
		int i3 = 1;
		System.out.println("Revista");
		for (Publicacao p : acervo) {
			if(p.tipo == "Revista") {
				System.out.println(i3 +" - "+ p.titulo +"; "+ p.ano +"; "+ p.autor +"; "+ p.quantidadeDisponivel);
			i3++;
			}
		}
		int i4 = 1;
		System.out.println("TCC");
		for (Publicacao p : acervo) {
			if(p.tipo == "TCC") {
				System.out.println(i4 +" - "+ p.titulo +"; "+ p.ano +"; "+ p.autor +"; "+ p.quantidadeDisponivel);
			i4++;
			}
		}
	}
	
	public void addClientes (Cliente c) {
		clientes.add(c);
	}
	
	public void listaDeClientes () {
		System.out.println("        CLIENTES        ");
		int i = 1;
		System.out.println("Professores:");
		for (Cliente c : clientes) {
			if(c.tipo == "Professor") {
				System.out.println(i +" "+ c.matricula +"; "+ c.nome +"; "+ c.tps);
				i++;
			}
		}
		int i1 = 1;
		System.out.println("Alunos:");
		for (Cliente c : clientes) {
			if(c.tipo == "Aluno") {
				System.out.println(i1 +" "+ c.matricula +"; "+ c.nome +"; "+ c.tps);
			i1++;
			}
		}
		int i2 = 1;
		System.out.println("Servidores:");
		for (Cliente c : clientes) {
			if(c.tipo == "Servidor") {
				System.out.println(i2 +" "+ c.matricula +"; "+ c.nome +"; "+ c.tps);
			i++;
			}
		}
	}

	
	public String consultaMatricula (int matricula) {
		String relatorio = "Cliente: ";
		for (Cliente c : clientes) {
			if(c.matricula == matricula) {
				relatorio += c.nome +"\n";
			}
		}
		relatorio += "Publicações:\n";
		for (Emprestimo e : listaDeEmprestimo) {
			if(e.cliente != null && e.cliente.matricula == matricula) {
				relatorio += e.publicacao.titulo +"\n";
			}
		}
		return relatorio;
	} 
		
	public String imprimirListaDeEmprestimos() {
		int totalLivros = 0; int totalArtigos = 0; int totalTCC = 0; int totalRevista = 0;
		
	System.out.println("        EMPRÉSTIMOS        ");
	
		for (Emprestimo e : listaDeEmprestimo) {
			if(e.publicacao.tipo == "Livro") {
				totalLivros++;
			}else if(e.publicacao.tipo == "Artigo") {
				totalArtigos++;
			}else if(e.publicacao.tipo =="TCC") {
				totalTCC++;
			}else if(e.publicacao.tipo == "Revista") {
				totalRevista++;
			}
		}
	String livros = "Livros: Total "+ totalLivros +" - Professores:";
		for(Emprestimo e : listaDeEmprestimo) {
			if(e.cliente.tipo == "Professor" && e.publicacao.tipo == "Livro") {
				livros += " "+ e.cliente.nome;
			}
		}
		livros += "; Alunos:";
		for(Emprestimo e : listaDeEmprestimo) {
			if(e.cliente.tipo == "Aluno" && e.publicacao.tipo == "Livro") {
				livros += " "+ e.cliente.nome;
			}
		}
		livros += "; Servidores:";
		for(Emprestimo e : listaDeEmprestimo) {
			if(e.cliente.tipo == "Servidor" && e.publicacao.tipo == "Livro") {
				livros += " "+ e.cliente.nome;
			}
		}
	
		String artigos = "\n\nArtigos: Total "+ totalArtigos +" - Professores:";
		for(Emprestimo e : listaDeEmprestimo) {
			if(e.cliente.tipo == "Professor" && e.publicacao.tipo == "Artigo") {
				artigos += " "+ e.cliente.nome;
			}
		}
		artigos += "; Alunos:";
		for(Emprestimo e : listaDeEmprestimo) {
			if(e.cliente.tipo == "Aluno" && e.publicacao.tipo == "Artigo") {
				artigos += " "+ e.cliente.nome;
			}
		}
		artigos += "; Servidores:";
		for(Emprestimo e : listaDeEmprestimo) {
			if(e.cliente.tipo == "Servidor" && e.publicacao.tipo == "Artigo") {
				artigos += " "+ e.cliente.nome;
			}
		}
		String tcc = "\n\nTCC: Total "+ totalTCC +" - Professores:";
		for(Emprestimo e : listaDeEmprestimo) {
			if(e.cliente.tipo == "Professor" && e.publicacao.tipo == "TCC") {
				tcc += " "+ e.cliente.nome;
			}
		}
		tcc += "; Alunos:";
		for(Emprestimo e : listaDeEmprestimo) {
			if(e.cliente.tipo == "Aluno" && e.publicacao.tipo == "TCC") {
				tcc += " "+ e.cliente.nome;
			}
		}
		tcc += "; Servidores:";
		for(Emprestimo e : listaDeEmprestimo) {
			if(e.cliente.tipo == "Servidor" && e.publicacao.tipo == "TCC") {
				tcc += " "+ e.cliente.nome +"\n";
				}
		}
		String revista = "Revistas: Total "+ totalRevista +" - Professores:";
		for(Emprestimo e : listaDeEmprestimo) {
			if(e.cliente.tipo == "Professor" && e.publicacao.tipo == "Revista") {
				revista += " "+ e.cliente.nome;
			}
		}
		revista += "; Alunos:";
		for(Emprestimo e : listaDeEmprestimo) {
			if(e.cliente.tipo == "Aluno" && e.publicacao.tipo == "Revista") {
				revista += " "+ e.cliente.nome;
			}
		}
		revista += "; Servidores:";
		for(Emprestimo e : listaDeEmprestimo) {
			if(e.cliente.tipo == "Servidor" && e.publicacao.tipo == "Revista") {
				revista += " "+ e.cliente.nome;
			}
		}
		
		return livros + artigos + tcc + revista;
	}
	
	public String buscarPublicacao (String nome) {
		String publicacao = "";
		for (Publicacao p : acervo) {
			if(nome == p.titulo) {
			publicacao = p.tipo +": "+ p.titulo +" - "+ p.quantidadeDisponivel +" Exemplares disponíveis.";
			}
		}
		return publicacao;
	}
	
}