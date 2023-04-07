package lista2;
import java.util.Random;
import java.util.Scanner;

public class Exe3 {
	
	public static void dica (int palpite, int numeroSorteado) {
		
		if(palpite > numeroSorteado) {
			System.out.println("O número sorteado é menor que seu palpite.\n");
		}else if(palpite < numeroSorteado) {
			System.out.println("O número sorteado é maior que seu palpite.\n");
		}else {
			System.out.println("Parabéns! Você acertou.");
			System.out.println("O número sorteado foi o número "+ numeroSorteado);
		}
		
		
	}

	public static void main(String[] args) {
		
		int numeroSorteado, palpite = 0;
		
		Scanner entrada = new Scanner(System.in);
		
		Random numerosAleatorios = new Random();
		numeroSorteado = numerosAleatorios.nextInt(100) + 1;
		System.out.println("Adivinhe o número sorteado entre 1 e 100");
		
		do {
			System.out.println("Digite seu palpite:");
			palpite = entrada.nextInt();
			
			dica(palpite, numeroSorteado);
			
		}while (palpite != numeroSorteado);
		
		entrada.close();
	}

}
