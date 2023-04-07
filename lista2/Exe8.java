package lista2;
import java.util.Scanner;

public class Exe8 {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite a expressão matemática:");
		String expressao = entrada.next();
		entrada.close();
		
		if (verifica(expressao)) {
			System.out.println("Expressão bem formada.");
		}else {
			System.out.println("Expressão mal formada.");
		}
		
}
	public static boolean verifica(String expressao) {
		
		int parentese = 0;
		int colchete = 0;
		int chave = 0;
		
		for(int i = 0; i < expressao.length(); i++) {
			char caracter = expressao.charAt(i);
			
			if (caracter == '(')
				parentese++;
			else if (caracter == ')')
				parentese--;
			if (caracter == '[')
				colchete++;
			else if(caracter == ']')
				colchete--;
			if (caracter == '{')
				chave++;
			else if (caracter == '}')
				chave--;
		}
		if (parentese == 0 && colchete == 0 && chave == 0)
			return true;
		else {
			return false;
		}
	}
}