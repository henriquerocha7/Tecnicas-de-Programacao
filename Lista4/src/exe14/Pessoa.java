package exe14;

import java.time.LocalDate;
import java.time.Period;

public class Pessoa {
 
	protected int idade;
	protected int diaDoNascimento;
	protected int mesDoNascimento;
	protected int anoDoNascimento;
	protected String nome;

	public Pessoa(int idade, int diaDoNascimento, int mesDoNascimento, int anoDoNascimento, String nome) {
		super();
		this.idade = idade;
		this.diaDoNascimento = diaDoNascimento;
		this.mesDoNascimento = mesDoNascimento;
		this.anoDoNascimento = anoDoNascimento;
		this.nome = nome;
	}

	public void calcularIdade () {
		LocalDate dataDeNascimento = LocalDate.of(anoDoNascimento, mesDoNascimento, diaDoNascimento);
		LocalDate dataAtual = LocalDate.now();
		Period periodo = Period.between(dataDeNascimento, dataAtual);
		this.idade = periodo.getYears();
	}
	
	public int informaIdade() {
		return this.idade;
	}

	public String informaNome() {
		return this.nome;
	}

	public void ajustaDataDeNascimento(int diaDoNascimento, int mesDoNascimento, int anoDoNascimento) {
		this.diaDoNascimento = diaDoNascimento;
		this.mesDoNascimento = mesDoNascimento;
		this.anoDoNascimento = anoDoNascimento;
	}






}
