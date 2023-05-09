package biblioteca;

public class Main {

	public static void main(String[] args) {
		
		Biblioteca b = new Biblioteca ();
		
//		// Clientes
		Cliente c = new Aluno (5455, "Carlos", 0);
		b.addClientes(c);
		Cliente c1 = new Aluno (5489, "Yasmin", 0);
		b.addClientes(c1);
		Cliente c2 = new Professor (3458, "João", 0);
		b.addClientes(c2);
		Cliente c3 = new Servidor (2564, "Mateus", 0);	
		b.addClientes(c3);
		
		// Publicações
		Publicacao p = new Livro ("Curso em Java", 2022, "Augusto", 15);
		b.addAcervo(p);
		Publicacao p1 = new Artigo ("Projeto Indico", 2023, "Cauã", 20);
		b.addAcervo(p1);
		Publicacao p2 = new TCC ("Inteligência Artificial no cotidiano", 2023, "Ismael", 3);
		b.addAcervo(p2);
		Publicacao p3 = new Revista ("Veja", 2021, "Francis", 10);
		b.addAcervo(p3);
		
		//Empréstimos
		Emprestimo e = new Emprestimo (c, p);
		c.addPublicacao(p);
		b.addEmprestimo(e);
		Emprestimo e1 = new Emprestimo (c, p1);
  c.addPublicacao(p1);
		b.addEmprestimo(e1);
		Emprestimo e2 = new Emprestimo (c, p2);
		c.addPublicacao(p2);
		b.addEmprestimo(e2);
		Emprestimo e3 = new Emprestimo (c2, p1);
  c2.addPublicacao(p1);
		b.addEmprestimo(e3);
		Emprestimo e4 = new Emprestimo (c1, p2);
		c1.addPublicacao(p2);
		b.addEmprestimo(e4);
		Emprestimo e5 = new Emprestimo (c3, p3);
		c3.addPublicacao(p3);
		b.addEmprestimo(e5);
		Emprestimo e6 = new Emprestimo (c3, p2);
		c3.addPublicacao(p2);
		b.addEmprestimo(e6);
		Emprestimo e7 = new Emprestimo (c,p1);
		c.addPublicacao(p1);
		b.addEmprestimo(e7);
		
		//Dados
		System.out.println(e.dadosEmprestimo());
		b.acervo();
		b.listaDeClientes();
		System.out.println(b.consultaMatricula(5455));
		System.out.println(b.imprimirListaDeEmprestimos());
		System.out.println(b.buscarPublicacao("Veja"));
	
		
		
		
	}

}
