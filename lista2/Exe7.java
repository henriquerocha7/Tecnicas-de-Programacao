package lista2;
import java.util.Scanner;

public class Exe7 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in); 
		System.out.println("Digite um número:");
		int numero = entrada.nextInt();
		entrada.close();
		
		int primo = 0; int i = 2;
		
		while(i < numero) {
			boolean resultado = true;
			
				for (int a = 2; a < i ; a++) {
					if (i % a == 0) {
						resultado = false;
					}
				}
			if (resultado)
				primo = i;
			i++;
		}
		System.out.println("O maior número primo menor que " + numero + " é: " + primo);
	}

}
