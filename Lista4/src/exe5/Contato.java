package exe5;

public class Contato {

	public int codigo;
	public String nome;
	public String endereco;
	public String email;
	public int telefone;
	public String observacao;
	
	
	public Contato (int codigo) {
		boolean validador = true;
		do {
			if(codigo >= 1000 && codigo <= 9999) {
				this.codigo = codigo;
			}else {
				validador = false;
			}
		}while (!validador);
	}
	
	public Contato (int codigo, String nome) {
		boolean validador = true;
		do {
			if(codigo >= 1000 && codigo <= 9999) {
				this.codigo = codigo;
			}else {
				validador = false;
			}
		}while (!validador);
		this.nome = nome;
	}
	
	public Contato (int codigo, String nome, String email) {
		boolean validador = true;
		do {
			if(codigo >= 1000 && codigo <= 9999) {
				this.codigo = codigo;
			}else {
				validador = false;
			}
		}while (!validador);
		this.nome = nome;
		this.email = email;
	}
	
	public Contato (int codigo, String nome, String email, int telefone) {
		boolean validador = true;
		do {
			if(codigo >= 1000 && codigo <= 9999) {
				this.codigo = codigo;
			}else {
				validador = false;
			}
		}while (!validador);
		this.nome = nome;
		this.email = email;
		do {
		if (telefone >= 10000000 && telefone <= 99999999) {
			this.telefone = telefone;
			validador = true;
		}else {
			validador = false;
		  }
	    }while (!validador);
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		if(codigo >= 1000 && codigo <= 9999) {
			this.codigo = codigo;
		}else {
			System.out.println("Código inválido.");
		}
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		if (telefone >= 10000000 && telefone <= 99999999) {
			this.telefone = telefone;
		}else {
			System.out.println("Telefone inválido.");
		}
	}
	
	public String getEmail() {
		return email;
	}
	public String getEndereco() {
		return endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public String getObservacao() {
		return observacao;
	}
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	
	
	public String imprimirInformacoes () {
	return "Código: " +codigo;
	}
	
	public Contato duplicar() {
		Contato copia = this;
	return copia;
	}
	
	public boolean verificacaoPreenchimento() {
		if (codigo == 0 || this.nome == null || this.endereco == null || this.email == null || this.telefone == 0 || this.observacao == null) {
			return false;
		}else {
			return true;
		}
	}
	
	
}
