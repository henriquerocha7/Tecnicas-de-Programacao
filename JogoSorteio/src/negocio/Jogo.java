package negocio;
import apresentacao.*;
import java.util.Random;

public class Jogo {

	private Jogador jogador;
	private Tela tela;
	private int numeroEscolhido;
	private boolean jogando;

	public Jogo() {
		tela = new Tela();
		jogador = new Jogador();
		Random random = new Random();
		numeroEscolhido = random.nextInt(100);
		jogando = true;
	}

	public void inciarJogoGUI() {
		jogador.setNome(tela.entradaDados("Qual é o seu nome?"));
		tela.mesagem("Seja bem vindo: " + jogador.getNome());
		jogadas();
	}

	public void solicitarNumero() {
		try {
		String numero = tela.entradaDados("Informe um numero:");
		int numero2 = Integer.parseInt(numero);
		jogador.addNumero(numero2);
		verificarAcerto(numero2);
		
		}catch(Exception e) {
			tela.mesagem("Insira um número inteiro.");
			solicitarNumero();
		}
	}

	public void jogadas() {
		do {
			jogador.setNumeroTentativa();
			solicitarNumero();
		} while (jogando);
		
		fimDoJogo();
	}

	private void fimDoJogo() {

		String numeros = "";
		for (Integer numero : jogador.getListaNumeros()) {
			numeros += " - " + numero;
		}
		tela.mesagem("Numeros apostados: " + numeros);

	}

	public boolean verificarMenor(int numero) {
		if (numero < numeroEscolhido)
			return true;

		return false;
	}

	public void verificarAcerto(int numero) {
		if (numero == numeroEscolhido) {
			tela.mesagem("Parabens voce acertou! Número de tentativas: " + jogador.getNumeroTentativa());
			jogando = false;
		} else if(verificarMenor(numero)) {
			tela.mesagem("Deu ruim,  você errou. Tente um número maior. Número de tentativas: " + jogador.getNumeroTentativa());
		   }else {
			   tela.mesagem("Deu ruim,  você errou. Tente um número menor. Número de tentativas: " + jogador.getNumeroTentativa());
		   }    
	 }
	}
